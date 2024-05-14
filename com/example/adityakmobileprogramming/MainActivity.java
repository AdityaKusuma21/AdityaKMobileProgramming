package com.example.adityakmobileprogramming;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public abstract class MainActivity extends AppCompatActivity {


ListView listPemain = (ListView) findViewById(R.id.listView);
String pemainList[] = {"aadit", "Inzaghi", "Kaka", "Maldini", "Pirlo"};
int pemain[] = {R.drawable.aadit, R.drawable.inzaghi, R.drawable.kaka, R.drawable.maldini, R.drawable.pirlo};

   @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       setTitle("Pemain Bola");

       listPemain = (ListView) findViewById(R.id.listView);
       CustomAdapter adapter = new CustomAdapter(getApplicationContext(), pemainList, pemain);
       listPemain.setAdapter(adapter);
   }
}