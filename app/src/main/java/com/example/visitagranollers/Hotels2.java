package com.example.visitagranollers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Hotels2 extends AppCompatActivity implements View.OnClickListener{

    ImageView telefono1, telefono2, telefono3, web1, web2, web3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels2);

        telefono1 = findViewById(R.id.tfH21);
        telefono1.setOnClickListener(this);
        telefono2 = findViewById(R.id.tfH22);
        telefono2.setOnClickListener(this);
        telefono3 = findViewById(R.id.tfH23);
        telefono3.setOnClickListener(this);

        web1 = findViewById(R.id.wH21);
        web1.setOnClickListener(this);
        web2 = findViewById(R.id.wH21);
        web2.setOnClickListener(this);
        web3 = findViewById(R.id.wH21);
        web3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        ImageView image = (ImageView) v;

        switch (image.getId())
        {
            case R.id.tfH21:
                Uri numero1 = Uri.parse("tel:938615558");
                Intent telefono1 = new Intent(Intent.ACTION_DIAL, numero1);
                startActivity(telefono1);
                break;
            case R.id.wH21:
                Uri webpage1 = Uri.parse("http://www.hotelverti.com/?lang=es\n");
                Intent irWeb1 = new Intent(Intent.ACTION_VIEW, webpage1);
                startActivity(irWeb1);
                break;
            case R.id.tfH22:
                Uri numero2 = Uri.parse("tel:935689060\n\n");
                Intent telefono2 = new Intent(Intent.ACTION_DIAL, numero2);
                startActivity(telefono2);
                break;
            case R.id.wH22:
                Uri webpage2 = Uri.parse("http://ibis-barcelona-montmelo.costadebarcelona.net/es/\n\n");
                Intent irWeb2 = new Intent(Intent.ACTION_VIEW, webpage2);
                startActivity(irWeb2);
                break;
            case R.id.tfH23:
                Uri numero3 = Uri.parse("tel:938407132\n\n");
                Intent telefono3 = new Intent(Intent.ACTION_DIAL, numero3);
                startActivity(telefono3);
                break;
            case R.id.wH23:
                Uri webpage3 = Uri.parse("https://www.hotel-bb.com/es/hotel/barcelona-granollers\n\n\n");
                Intent irWeb3 = new Intent(Intent.ACTION_VIEW, webpage3);
                startActivity(irWeb3);
                break;
        }
    }
}