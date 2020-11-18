package com.example.visitagranollers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Hotels extends AppCompatActivity implements View.OnClickListener {

    Spinner spinnerEstrelles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        spinnerEstrelles = findViewById(R.id.spinnerNom);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.filtrarPerEstrelles, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_activated_1);
        spinnerEstrelles.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {

    }
}