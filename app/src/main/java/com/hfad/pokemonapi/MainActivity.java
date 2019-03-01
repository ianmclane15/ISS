package com.hfad.pokemonapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.maps.MapView;

public class MainActivity extends AppCompatActivity {

    private TextView latitude;
    private TextView longitude;
    private MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       wireWidgets();
       getCoordinates();
    }

    private void getCoordinates() {

    }

    private void wireWidgets() {
        latitude = findViewById(R.id.textView_maps_latitude);
        longitude = findViewById(R.id.textView_maps_longitude);
        mapView = findViewById(R.id.mapView_map);
    }
}
