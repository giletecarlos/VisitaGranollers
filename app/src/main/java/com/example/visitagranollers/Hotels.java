package com.example.visitagranollers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class Hotels extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    private Intent cridaHotels4, cridaHotels3, cridaHotels2;
    Spinner spinnerEstrelles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        spinnerEstrelles = findViewById(R.id.spinnerNom);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.filtrarPerEstrelles, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_activated_1);
        spinnerEstrelles.setAdapter(adapter);
        spinnerEstrelles.setOnItemSelectedListener(this);

        cridaHotels4 = new Intent(this,Hotels4.class);
        cridaHotels3 = new Intent(this,Hotels3.class);
        cridaHotels2 = new Intent(this,Hotels2.class);
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Log.d("hola","position: " + position);
        switch (position) {
            case 1:  startActivityForResult(cridaHotels4,1);
                break;
            case 2:  startActivityForResult(cridaHotels3,2);
                break;
            case 3:  startActivityForResult(cridaHotels2,3);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}