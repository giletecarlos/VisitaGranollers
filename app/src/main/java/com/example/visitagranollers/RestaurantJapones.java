package com.example.visitagranollers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class RestaurantJapones extends AppCompatActivity implements View.OnClickListener {

    ImageView telefono1, telefono2, telefono3, web1, web2, web3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_japones);

        telefono1 = findViewById(R.id.telefono1);
        telefono2 = findViewById(R.id.telefono2);
        telefono3 = findViewById(R.id.telefono3);

        web1 = findViewById(R.id.web1);
        web2 = findViewById(R.id.web2);
        web3 = findViewById(R.id.web3);
    }

    @Override
    public void onClick(View view) {
        ImageView image = (ImageView) view;

        switch (image.getId())
        {
            case R.id.telefono1:
                Uri numero1 = Uri.parse("tel:93456667");
                Intent telefono1 = new Intent(Intent.ACTION_DIAL, numero1);
                startActivity(telefono1);
                break;
            case R.id.web1:
                Uri webpage1 = Uri.parse("http://www.ogura.es/");
                Intent irWeb1 = new Intent(Intent.ACTION_DIAL, webpage1);
                startActivity(irWeb1);
                break;
            case R.id.telefono2:
                Uri numero2 = Uri.parse("tel:666003453");
                Intent telefono2 = new Intent(Intent.ACTION_DIAL, numero2);
                startActivity(telefono2);
                break;
            case R.id.web2:
                Uri webpage2 = Uri.parse("https://www.tripadvisor.es/Restaurant_Review-g187497-d2362423-Reviews-Yen-Barcelona_Catalonia.html");
                Intent irWeb2 = new Intent(Intent.ACTION_DIAL, webpage2);
                startActivity(irWeb2);
                break;
            case R.id.telefono3:
                Uri numero3 = Uri.parse("tel:65938496");
                Intent telefono3 = new Intent(Intent.ACTION_DIAL, numero3);
                startActivity(telefono3);
                break;
            case R.id.web3:
                Uri webpage3 = Uri.parse("https://grupotragaluz.com/restaurante/elj-apo-nes/");
                Intent irWeb3 = new Intent(Intent.ACTION_DIAL, webpage3);
                startActivity(irWeb3);
                break;
        }
    }
}