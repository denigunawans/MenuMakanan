package com.example.menumakanan;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.ViewHolder> {

    private ArrayList<Makanan> listKuliner;

    public MakananAdapter(ArrayList<Makanan> listKuliner) {
        this.listKuliner = listKuliner;
    }

    @NonNull
    @Override
    public MakananAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        ViewHolder holder = new ViewHolder(layoutInflater.inflate(R.layout.menu_makanan, parent, false));

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MakananAdapter.ViewHolder holder, int position) {
        Makanan makanan = listKuliner.get(position);
        holder.txtNama.setText(makanan.getNama());
        holder.txtHarga.setText("Rp. "+makanan.getHarga().toString());
        holder.imgFoto.setImageResource(makanan.getFoto());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Context context = holder.itemView.getContext();
                    Intent intent = new Intent(context, DescActivity.class);
                    intent.putExtra("keyNama", makanan.getNama());
                    intent.putExtra("keyDesc", makanan.getDesc());
                    intent.putExtra("keyHarga", makanan.getHarga().toString());
                    intent.putExtra("keyFoto", makanan.getFoto());
                    context.startActivity(intent);
                }catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(view.getContext(), "gagal",Toast.LENGTH_SHORT);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return listKuliner.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView txtNama,txtHarga;
        public ImageView imgFoto;
        public ConstraintLayout view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNama = itemView.findViewById(R.id.txtNama);
            txtHarga = itemView.findViewById(R.id.txtHarga);
            imgFoto = itemView.findViewById(R.id.imgFoto);
            this.view = itemView.findViewById(R.id.menuLayout);
        }
    }
}
