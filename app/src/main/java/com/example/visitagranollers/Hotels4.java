package com.example.visitagranollers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Hotels4 extends AppCompatActivity implements View.OnClickListener{

    ImageView telefono1, telefono2, telefono3, web1, web2, web3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels4);

        telefono1 = findViewById(R.id.tfH41);
        telefono1.setOnClickListener(this);
        telefono2 = findViewById(R.id.tfH42);
        telefono2.setOnClickListener(this);
        telefono3 = findViewById(R.id.tfH43);
        telefono3.setOnClickListener(this);

        web1 = findViewById(R.id.wH41);
        web1.setOnClickListener(this);
        web2 = findViewById(R.id.wH42);
        web2.setOnClickListener(this);
        web3 = findViewById(R.id.wH43);
        web3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        ImageView image = (ImageView) v;

        switch (image.getId())
        {
            case R.id.tfH41:
                Uri numero1 = Uri.parse("tel:938794820");
                Intent telefono1 = new Intent(Intent.ACTION_DIAL, numero1);
                startActivity(telefono1);
                break;
            case R.id.wH41:
                Uri webpage1 = Uri.parse("https://www.aparthotelateneavalles.com/es");
                Intent irWeb1 = new Intent(Intent.ACTION_VIEW, webpage1);
                startActivity(irWeb1);
                break;
            case R.id.tfH42:
                Uri numero2 = Uri.parse("tel:938456050\n");
                Intent telefono2 = new Intent(Intent.ACTION_DIAL, numero2);
                startActivity(telefono2);
                break;
            case R.id.wH42:
                Uri webpage2 = Uri.parse("https://www.hotelaugustavalles.com/\n");
                Intent irWeb2 = new Intent(Intent.ACTION_VIEW, webpage2);
                startActivity(irWeb2);
                break;
            case R.id.tfH43:
                Uri numero3 = Uri.parse("tel:938796220\n");
                Intent telefono3 = new Intent(Intent.ACTION_DIAL, numero3);
                startActivity(telefono3);
                break;
            case R.id.wH43:
                Uri webpage3 = Uri.parse("https://www.hotelciutatgranollers.com/\n");
                Intent irWeb3 = new Intent(Intent.ACTION_VIEW, webpage3);
                startActivity(irWeb3);
                break;
        }
    }
}