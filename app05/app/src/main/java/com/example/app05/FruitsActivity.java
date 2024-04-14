package com.example.app05;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FruitsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fruits);

        String[] fruits = getResources().getStringArray(R.array.fruits);
        ListView listView = findViewById(R.id.fruits);

        ArrayAdapter<String> fruitsAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, fruits);

        listView.setAdapter(fruitsAdapter);
    }
}