package com.example.app05;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class VegetablesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_vegetables);

        String[] vegetables = getResources().getStringArray(R.array.vegetables);

        ListView listView = findViewById(R.id.vegetables);

        ArrayAdapter<String> vegetablesAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, vegetables);

        listView.setAdapter(vegetablesAdapter);
    }
}