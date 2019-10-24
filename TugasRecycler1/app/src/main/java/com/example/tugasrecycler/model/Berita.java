package com.example.tugasrecycler.model;

import android.graphics.drawable.Drawable;

public class Berita {

    public String judul;
    public Drawable image;

    public Berita(String judul, Drawable image) {
        this.judul = judul;
        this.image = image;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }
}
