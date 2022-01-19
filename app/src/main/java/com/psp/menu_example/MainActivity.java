package com.psp.menu_example;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();

        if(itemId == R.id.itemHome) {
            Toast.makeText(this, "Home item click", Toast.LENGTH_SHORT).show();
        }

        if(itemId == R.id.itemSearch) {
            Toast.makeText(this, "Search item click", Toast.LENGTH_SHORT).show();
        }

        if(itemId == R.id.itemSettings) {
            Toast.makeText(this, "Settings item click", Toast.LENGTH_SHORT).show();
        }

        if(itemId == R.id.itemInfo) {
            Toast.makeText(this, "Info item click", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}