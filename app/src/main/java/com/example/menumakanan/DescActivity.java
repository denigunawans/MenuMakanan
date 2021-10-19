package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DescActivity extends AppCompatActivity {

    TextView txNama, txDesc, txHarga;
    ImageView imFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc);
        setaData();
    }

    private void setaData(){
        txNama = (TextView) findViewById(R.id.txtDescNama);
        txDesc = findViewById(R.id.txtDescDesc);
        txHarga = findViewById(R.id.txtDescHarga);
        imFoto = findViewById(R.id.imgDescFoto);

        String nama,desc,harga;
        int foto;
        Bundle eks = getIntent().getExtras();

        nama = eks.getString("keyNama", "null");
        desc = eks.getString("keyDesc", "null");
        harga = eks.getString("keyHarga", "null");
        foto = eks.getInt("keyFoto", 0);

        try {
            txNama.setText(nama);
            txDesc.setText(desc);
            txHarga.setText("Rp. "+harga);
            imFoto.setImageResource(foto);
        }catch (Exception e){
            e.printStackTrace();
            Toast.makeText(this, "gagal", Toast.LENGTH_SHORT);
        }
    }

}