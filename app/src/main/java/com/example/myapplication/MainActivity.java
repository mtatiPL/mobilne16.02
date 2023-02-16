package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<widok> wszystkieWidoki;

    private void przygotujWidoki(){
        wszystkieWidoki=new ArrayList<>();
        wszystkieWidoki.add(new widok(R.drawable.kwiat1,"zwiastun wiosny"));
        wszystkieWidoki.add(new widok(R.drawable.kwiat2,"pełnia lata"));
        wszystkieWidoki.add(new widok(R.drawable.kwiat3,"oznaka jesieni"));
        wszystkieWidoki.add(new widok(R.drawable.kwiat4,"cudny zapach"));
        wszystkieWidoki.add(new widok(R.drawable.kwiat5,"niebiesko"));
        wszystkieWidoki.add(new widok(R.drawable.kwiat6,"pełnia lata"));
        wszystkieWidoki.add(new widok(R.drawable.kwiat7,"zwiastun wiosny"));
        wszystkieWidoki.add(new widok(R.drawable.kwiat8,"zwiastun wiosny"));
        wszystkieWidoki.add(new widok(R.drawable.kwiat1,"zwiastun wiosny"));
        wszystkieWidoki.add(new widok(R.drawable.kwiat2,"pełnia lata"));
        wszystkieWidoki.add(new widok(R.drawable.kwiat3,"oznaka jesieni"));
        wszystkieWidoki.add(new widok(R.drawable.kwiat4,"cudny zapach"));
        wszystkieWidoki.add(new widok(R.drawable.kwiat5,"niebiesko"));
        wszystkieWidoki.add(new widok(R.drawable.kwiat6,"pełnia lata"));
        wszystkieWidoki.add(new widok(R.drawable.kwiat7,"zwiastun wiosny"));
        wszystkieWidoki.add(new widok(R.drawable.kwiat8,"zwiastun wiosny"));
        wszystkieWidoki.add(new widok(R.drawable.kwiat1,"zwiastun wiosny"));
        wszystkieWidoki.add(new widok(R.drawable.kwiat2,"pełnia lata"));
        wszystkieWidoki.add(new widok(R.drawable.kwiat3,"oznaka jesieni"));
        wszystkieWidoki.add(new widok(R.drawable.kwiat4,"cudny zapach"));
        wszystkieWidoki.add(new widok(R.drawable.kwiat5,"niebiesko"));
        wszystkieWidoki.add(new widok(R.drawable.kwiat6,"pełnia lata"));
        wszystkieWidoki.add(new widok(R.drawable.kwiat7,"zwiastun wiosny"));
        wszystkieWidoki.add(new widok(R.drawable.kwiat8,"zwiastun wiosny"));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        przygotujWidoki();
    }
}