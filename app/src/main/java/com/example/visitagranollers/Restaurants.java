package com.example.visitagranollers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ResourceCursorAdapter;
import android.widget.Spinner;

import com.google.android.material.snackbar.Snackbar;

public class Restaurants extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener{

    private Intent cridaItalia, cridaJapones, cridaMediterrani;
    Spinner spinnerTipus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        spinnerTipus = findViewById(R.id.spinnerNom);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.filtrarPerTipus, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_activated_1);
        spinnerTipus.setAdapter(adapter);
        spinnerTipus.setOnItemSelectedListener(this);

        cridaItalia = new Intent(this,RestaurantItalia.class);
        cridaJapones = new Intent(this,RestaurantJapones.class);
        cridaMediterrani = new Intent(this, RestaurantMediterrani.class);
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (position == 1)
        {
            Snackbar.make(view, "Secció en desenvolupament. Disculpi les molesties", Snackbar.LENGTH_SHORT).show();
        }
        else {
            switch (position) {
                case 2:  startActivityForResult(cridaItalia,1);
                    break;
                case 3:  startActivityForResult(cridaJapones,2);
                    break;
                case 4:  startActivityForResult(cridaMediterrani,3);
                    break;
            }
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}