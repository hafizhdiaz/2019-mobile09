package com.example.tugasrecycler2.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugasrecycler2.R;
import com.example.tugasrecycler2.model.Berita;

import java.util.List;

public class BeritaAdapter extends RecyclerView.Adapter<BeritaAdapter.MyViewHolder> {

    List<Berita> beritaList;
    public BeritaAdapter(List<Berita> beritaList) {
        this.beritaList = beritaList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        //object context digunakan untuk membuat object layoutInflater
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        //object layoutInflater digunakan untuk membuat object view yang merupakan hasil inflate  layout ( mengubungkan adapter degnan layout)
        View beritaView = layoutInflater.inflate(R.layout.item_list,parent,false);
        //object superHeroView digunakan untuk membuat object viewHolder
        MyViewHolder viewHolder = new MyViewHolder(beritaView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //ambil satu item hero
        Berita berita = beritaList.get(position);
        //set text heroName berdasarkan data dari model hero
        holder.beritaName.setText(berita.getJudul());
        holder.gambarName.setImageDrawable(berita.getImage());
    }

    @Override
    public int getItemCount() {
        return (beritaList != null) ? beritaList.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView beritaName;
        public ImageView gambarName;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            beritaName = itemView.findViewById(R.id.txt_card);
            gambarName = itemView.findViewById(R.id.img_card);
        }
    }
}
