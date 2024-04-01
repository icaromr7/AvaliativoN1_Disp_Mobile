package com.example.avaliativon1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class JogadaAdapter extends RecyclerView.Adapter<JogadaAdapter.ViewHolder> {
    private List<String> mJogadas;

    public JogadaAdapter(List<String> jogadas) {
        mJogadas = jogadas;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String jogada = mJogadas.get(position);
        holder.mTextView.setText(jogada);
    }

    @Override
    public int getItemCount() {
        return mJogadas.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;

        public ViewHolder(View view) {
            super(view);
            mTextView = (TextView) view.findViewById(android.R.id.text1);
        }
    }
}

