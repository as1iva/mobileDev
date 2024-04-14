package com.example.app05;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.app05.databinding.ActivityRecyclerBinding;

import java.util.Arrays;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {
    private ActivityRecyclerBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        ActivityRecyclerBinding binding = ActivityRecyclerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.list.setLayoutManager(new LinearLayoutManager(this));

        List<Item> items = Arrays.asList(
                new Item(R.drawable.cat, "Моя кошка"),
                new Item(R.drawable.capys, "Не мои капибары"),
                new Item(R.drawable.beercat, "Пивные кошки"),
                new Item(R.drawable.japan, "Япония")
        );

        SimpleAdapter adapter = new SimpleAdapter(items);
        binding.list.setAdapter(adapter);
    }
}