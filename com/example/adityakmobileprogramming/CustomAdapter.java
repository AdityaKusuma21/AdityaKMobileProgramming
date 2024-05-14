package com.example.adityakmobileprogramming;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    String[] context;
    String pemainList[];
    int pemain[];
    LayoutInflater inflater;

    public CustomAdapter(Context applicationContext, String[] pemainList, int[] pemain) {
        this.context = context;
        this.context = pemainList;
        this.pemain = pemain;
        inflater = (LayoutInflater.from(applicationContext)) ;

    }

    @Override
    public int getCount() {
        return pemainList.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view = inflater.inflate(R.layout.activity_pemain, null);
        TextView namaPemain = view.findViewById(R.id.textView);
        ImageView icon = view.findViewById(R.id.icon);
        namaPemain.setText(pemainList[position]);
        icon.setImageResource(pemain[position]);

        return view;
    }
}
