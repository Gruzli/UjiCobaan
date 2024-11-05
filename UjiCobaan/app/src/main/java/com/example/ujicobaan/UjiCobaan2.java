package com.example.ujicobaan;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UjiCobaan2 extends AppCompatActivity {
    TextView tvGreetings;
    RecyclerView rvMain;
    ArrayList<Song> songs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uji_cobaan2);

        rvMain = findViewById(R.id.rvMain);
        songs = new ArrayList<Song>();

        for(int i=0;i<20;i++){
            songs.add(new Song("title"+i,"artist"));
        }

        rvMain.setAdapter(new com.example.ujicobaan.SongAdapter(this,songs));
        rvMain.setLayoutManager(new LinearLayoutManager(this));

        String scope = "onCreate2";
        Log.v(scope,"Masuk");

        tvGreetings = findViewById(R.id.tvGreetings);
        String greetings = "Welcome to Music " +this.getIntent().getStringExtra("keyUsername");
        tvGreetings.setText(greetings);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.option_settings){
            Toast.makeText(this,"settings is clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if(item.getItemId()==R.id.option_logout){
            Toast.makeText(this,"Logout is clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart() {
        super.onStart();
        String scope = "onStart2";
        Log.v(scope,"Masuk");
    }

    @Override
    protected void onResume() {
        super.onResume();
        String scope = "onResume2";
        Log.v(scope,"Masuk");
    }

    @Override
    protected void onPause() {
        super.onPause();
        String scope = "onPause2";
        Log.v(scope,"Masuk");
    }

    @Override
    protected void onStop() {
        super.onStop();
        String scope = "onStop2";
        Log.v(scope,"Masuk");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        String scope = "onDestroy2";
        Log.v(scope,"Masuk");
    }
}