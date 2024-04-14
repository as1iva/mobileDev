package com.example.app05;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


import java.util.ArrayList;
import java.util.Collections;

public class SweetsActivity extends AppCompatActivity {

    ArrayAdapter<String> sweetsAdapter;
    ArrayList<String> selectedItems = new ArrayList<String>();
    ArrayList<String> items = new ArrayList<String>();
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sweets);

        listView = findViewById(R.id.sweetsList);
        String[] sweets = getResources().getStringArray(R.array.sweets);
        Collections.addAll(items, sweets);

        sweetsAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_multiple_choice, items);

        listView.setAdapter(sweetsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = sweetsAdapter.getItem(position);
                if (listView.isItemChecked(position)) {
                    selectedItems.add(item);
                }
                else {
                    selectedItems.remove(item);
                }
            }
        });
    }
    public void add(View view) {
        EditText editText = findViewById(R.id.editText);
        String newItem = editText.getText().toString();
        if (!newItem.isEmpty()) {
            sweetsAdapter.add(newItem);
            editText.setText("");
            sweetsAdapter.notifyDataSetChanged();
        }
    }
    public void remove(View view) {
        for (int i = 0; i < selectedItems.size(); i++) {
            sweetsAdapter.remove(selectedItems.get(i));
        }
        listView.clearChoices();
        selectedItems.clear();
        sweetsAdapter.notifyDataSetChanged();
    }
}