package com.example.rizkyrahmadianto.tanamanobat;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvCategory;
    private ArrayList<Tanaman>list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvCategory = (RecyclerView)findViewById(R.id.r_view);
        rvCategory.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(TanamanData.getListData());

        showRecyclerList();
    }

    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        RecyclerAdapter listRecyclerAdapter = new RecyclerAdapter(this);
        listRecyclerAdapter.setListTanaman(list);
        rvCategory.setAdapter(listRecyclerAdapter);
    }

    private void setActionBarTitle(String title){
        getSupportActionBar().setTitle(title);
    }
    private void showSelectedTanaman(Tanaman tanaman) {
        Toast.makeText(this, "Kamu memilih " + tanaman.getName(), Toast.LENGTH_SHORT).show();
    }
}
