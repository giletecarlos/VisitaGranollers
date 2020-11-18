package com.example.visitagranollers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    // DEFINICIÓN DE ATRIBUTOS
    private ImageView movies, concesionaris, transport, parking, events, education, sports;
    private ImageView weather, knowledge, business, currency, hotels, restaurants, cargaelectrica, infocovid, image;
    private Intent cridaMovies,cridaEvents,cridaHotels,cridaRestaurants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movies = findViewById(R.id.movies);
        movies.setOnClickListener(this);
        concesionaris = findViewById(R.id.concesionaris);
        concesionaris.setOnClickListener(this);
        transport = findViewById(R.id.transport);
        transport.setOnClickListener(this);
        parking = findViewById(R.id.parking);
        parking.setOnClickListener(this);
        events = findViewById(R.id.events);
        events.setOnClickListener(this);
        education = findViewById(R.id.education);
        education.setOnClickListener(this);
        sports = findViewById(R.id.sports);
        sports.setOnClickListener(this);
        weather = findViewById(R.id.weather);
        weather.setOnClickListener(this);
        knowledge = findViewById(R.id.knowledge);
        knowledge.setOnClickListener(this);
        business = findViewById(R.id.business);
        business.setOnClickListener(this);
        currency = findViewById(R.id.currency);
        currency.setOnClickListener(this);
        hotels = findViewById(R.id.hotels);
        hotels.setOnClickListener(this);
        restaurants = findViewById(R.id.restaurants);
        restaurants.setOnClickListener(this);
        cargaelectrica = findViewById(R.id.cargaelectrica);
        cargaelectrica.setOnClickListener(this);
        infocovid = findViewById(R.id.infocovid);
        infocovid.setOnClickListener(this);
        cridaMovies = new Intent(this,Movies.class);
        cridaEvents = new Intent(this,Events.class);
        cridaHotels = new Intent(this,Hotels.class);
        cridaRestaurants = new Intent(this,Restaurants.class);
    }

    @Override
    public void onClick(View view) {
        image = (ImageView) view;


        anarSeccio(view,image);
    }

    private void anarSeccio(View view, ImageView image) {

        //SECCIONS QUE NO S'UTILITZEN I QUÈ ÉS PODRIEN POSAR EN FUNCIONAMENT MÉS ENDAVANT
        if (image.getId() == currency.getId() || image.getId() == transport.getId() || image.getId() == parking.getId() ||
                image.getId() == education.getId() || image.getId() == sports.getId() || image.getId() ==weather.getId() ||
                image.getId() == knowledge.getId() || image.getId() == business.getId() || image.getId() == concesionaris.getId() ||
                image.getId() == cargaelectrica.getId() || image.getId() == infocovid.getId())
        {
            Snackbar.make(view, "Secció en desenvolupament. Disculpi les molesties", Snackbar.LENGTH_SHORT).show();
        }
        else{
            switch (image.getId())
            {
                case R.id.movies:
                        startActivityForResult(cridaMovies,1);
                    break;
                case R.id.events:
                        startActivityForResult(cridaEvents,2);
                    break;
                case R.id.hotels:
                        startActivityForResult(cridaHotels,3);
                    break;
                case R.id.restaurants:
                        startActivityForResult(cridaRestaurants,4);
                    break;
            }
        }
    }
}