package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterWidok extends RecyclerView.Adapter<AdapterWidok.WidokViewHolder> {
private LayoutInflater inflater;
private ArrayList<widok> listaWidokow;

    public AdapterWidok(Context context, ArrayList<widok> listaWidokow) {
        inflater=LayoutInflater.from(context);
        this.listaWidokow = listaWidokow;

    }

    @NonNull
    @Override
    public WidokViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemWidok=inflater.inflate(R.layout.item_widok,parent,false);


        return new WidokViewHolder(itemWidok,this);
    }

    @Override
    public void onBindViewHolder(@NonNull WidokViewHolder holder, int position) {

        holder.textView.setText(listaWidokow.get(position).getOpisObrazka());
        holder.imageView.setImageResource(listaWidokow.get(position).getIdObrazka());
        holder.imageView.setContentDescription(listaWidokow.get(position).getOpisObrazka());

    }

    @Override
    public int getItemCount() {

        return listaWidokow.size();
    }

    // Super tworzymy po przez nacisiniecie na widokviewHolder i zarowke
    public class WidokViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public ImageView imageView;
        final AdapterWidok adapterWidok;


        public WidokViewHolder(@NonNull View itemView, AdapterWidok adapter) {
            super(itemView);
            adapterWidok=adapter;
            textView=itemView.findViewById(R.id.textView);
            imageView=itemView.findViewById(R.id.imageView);

        }
    }
}
