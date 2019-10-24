package com.example.tugasrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tugasrecycler.adapters.BeritaAdapter;
import com.example.tugasrecycler.model.Berita;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvBerita;
    List<Berita> listBerita = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //menyambungkan rvSuperHero ke layout
        rvBerita = findViewById(R.id.txtor);
        //Membuat object hero
        Berita berita = new Berita("Dome", this.getResources().getDrawable(R.drawable.dome));
        //menambahkan hero ke listSuperHero
        listBerita.add(berita);
        //membuat object hero baru
        berita = new Berita("Auper", this.getResources().getDrawable(R.drawable.poltek));
        //menambahkan hero baru ke listSuperhero
        listBerita.add(berita);
        //Instansiasi Adapter
        BeritaAdapter superHeroAdapter = new BeritaAdapter(listBerita);
        //set adapter dan layoutmanager
        rvBerita.setAdapter(superHeroAdapter);
        rvBerita.setLayoutManager(new LinearLayoutManager(this));
    }
}
