package com.example.visitagranollers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.snackbar.Snackbar;

public class RestaurantMediterrani extends AppCompatActivity implements View.OnClickListener {

    ImageView telefono1, telefono2, telefono3, web1, web2, web3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_mediterrani);

        telefono1 = findViewById(R.id.telefono1);
        telefono1.setOnClickListener(this);
        telefono2 = findViewById(R.id.telefono2);
        telefono2.setOnClickListener(this);
        telefono3 = findViewById(R.id.telefono3);
        telefono3.setOnClickListener(this);


        web1 = findViewById(R.id.web1);
        web1.setOnClickListener(this);
        web2 = findViewById(R.id.web2);
        web2.setOnClickListener(this);
        web3 = findViewById(R.id.web3);
        web3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        ImageView image = (ImageView) view;

        switch (image.getId())
        {
            case R.id.telefono1:
                Uri numero1 = Uri.parse("tel:+34688677584");
                Intent telefono1 = new Intent(Intent.ACTION_DIAL, numero1);
                startActivity(telefono1);
                Snackbar.make(view, "Secció en desenvolupament. Disculpi les molesties", Snackbar.LENGTH_SHORT).show();
                break;
            case R.id.web1:
                Uri webpage1 = Uri.parse("http://corsega.mariscco.com/?lang=es");
                Intent irWeb1 = new Intent(Intent.ACTION_VIEW, webpage1);
                startActivity(irWeb1);
                break;
            case R.id.telefono2:
                Uri numero2 = Uri.parse("tel:+34612012045");
                Intent telefono2 = new Intent(Intent.ACTION_DIAL, numero2);
                startActivity(telefono2);
                break;
            case R.id.web2:
                Uri webpage2 = Uri.parse("https://www.facebook.com/pg/Restaurant9Nine/about/?entry_point=page_nav_about_item&tab=overview");
                Intent irWeb2 = new Intent(Intent.ACTION_VIEW, webpage2);
                startActivity(irWeb2);
                break;
            case R.id.telefono3:
                Uri numero3 = Uri.parse("tel:+34677848294");
                Intent telefono3 = new Intent(Intent.ACTION_DIAL, numero3);
                startActivity(telefono3);
                break;
            case R.id.web3:
                Uri webpage3 = Uri.parse("https://raobcn.com/");
                Intent irWeb3 = new Intent(Intent.ACTION_VIEW, webpage3);
                startActivity(irWeb3);
                break;
        }
    }
}