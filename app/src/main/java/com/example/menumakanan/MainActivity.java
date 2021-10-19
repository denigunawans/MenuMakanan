package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recMenu;
    private ArrayList<Makanan> listMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recMenu = findViewById(R.id.rec_menu);
        setData();

        recMenu.setAdapter(new MakananAdapter(listMenu));
        recMenu.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setData(){
        listMenu = new ArrayList<>();
        listMenu.add(new Makanan(getString(R.string.menu_tahu), getString(R.string.desc_tahu),Integer.parseInt(getString(R.string.harga_tahu)), R.drawable.tahu));
        listMenu.add(new Makanan(getString(R.string.menu_bakso), getString(R.string.desc_bakso),Integer.parseInt(getString(R.string.harga_bakso)), R.drawable.bakso));
        listMenu.add(new Makanan(getString(R.string.menu_geprek), getString(R.string.desc_geprek),Integer.parseInt(getString(R.string.harga_geprek)), R.drawable.ayam_geprek));
        listMenu.add(new Makanan(getString(R.string.menu_taichan), getString(R.string.desc_taichan),Integer.parseInt(getString(R.string.harga_taichan)), R.drawable.sate_taichan));
        listMenu.add(new Makanan(getString(R.string.menu_pecel), getString(R.string.desc_pecel),Integer.parseInt(getString(R.string.harga_pecel)), R.drawable.pecel));
        listMenu.add(new Makanan(getString(R.string.menu_nasgor), getString(R.string.desc_nasgor),Integer.parseInt(getString(R.string.harga_nasgor)), R.drawable.nasgor));
        listMenu.add(new Makanan(getString(R.string.menu_kari), getString(R.string.desc_kari),Integer.parseInt(getString(R.string.harga_kari)), R.drawable.kari_ayam));
    }
}