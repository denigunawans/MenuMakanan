package com.example.menumakanan;

public class Makanan {
    String nama, desc;
    int harga,foto;

    public Makanan(String nama, String desc, int harga, int foto) {
        this.nama = nama;
        this.desc = desc;
        this.harga = harga;
        this.foto = foto;
    }

    public Makanan() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
