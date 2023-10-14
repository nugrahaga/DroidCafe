package com.example.driodcafe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private FloatingActionButton fab;

    private ImageView donutImageView;
    private ImageView iceCreamImageView;
    private ImageView froyoImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        fab = findViewById(R.id.fab);
        donutImageView = findViewById(R.id.donut);
        iceCreamImageView = findViewById(R.id.ice_cream);
        froyoImageView = findViewById(R.id.froyo);

        setSupportActionBar(toolbar);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "FAB", Toast.LENGTH_SHORT).show();
            }
        });

        donutImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "SHOW DONUT ORDER", Toast.LENGTH_SHORT).show();
            }
        });

        iceCreamImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "SHOW ICE CREAM ORDER", Toast.LENGTH_SHORT).show();
            }
        });

        froyoImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "SHOW FROYO ORDER", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if (R.id.action_orders == itemId) {
            Toast.makeText(MainActivity.this, "SHOW ORDERS", Toast.LENGTH_SHORT).show();
        } else if (R.id.action_status == itemId) {
            Toast.makeText(MainActivity.this, "SHOW STATUS", Toast.LENGTH_SHORT).show();
        } else if (R.id.action_favorites == itemId) {
            Toast.makeText(MainActivity.this, "SHOW FAVORITES", Toast.LENGTH_SHORT).show();
        } else if (R.id.action_contact == itemId) {
            Toast.makeText(MainActivity.this, "SHOW CONTACT", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}