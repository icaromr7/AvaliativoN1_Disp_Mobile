package com.example.avaliativon1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TextoAdapter extends RecyclerView.Adapter<TextoAdapter.ViewHolder> {
    private List<String> mTextos;

    public TextoAdapter(List<String> textos) {
        mTextos = textos;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String texto = mTextos.get(position);
        holder.mTextView.setText(texto);
    }

    @Override
    public int getItemCount() {
        return mTextos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;

        public ViewHolder(View view) {
            super(view);
            mTextView = (TextView) view.findViewById(android.R.id.text1);
        }
    }
}

