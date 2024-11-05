package com.example.ujicobaan;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnLogin;
    EditText etUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String scope = "onCreate";
        Log.v(scope,"Masuk");

        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);
        etUsername = findViewById(R.id.etUsername);
    }

    @Override
    protected void onStart() {
        super.onStart();
        String scope = "onStart";
        Log.v(scope,"Masuk");
    }

    @Override
    protected void onResume() {
        super.onResume();
        String scope = "onResume";
        Log.v(scope,"Masuk");
    }

    @Override
    protected void onPause() {
        super.onPause();
        String scope = "onPause";
        Log.v(scope,"Masuk");
    }

    @Override
    protected void onStop() {
        super.onStop();
        String scope = "onStop";
        Log.v(scope,"Masuk");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        String scope = "onDestroy";
        Log.v(scope,"Masuk");
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Login", Toast.LENGTH_SHORT).show();
        String strUsername = " ";

        strUsername = etUsername.getText().toString();

        //Pindah Halaman
        Intent nPindahHal = new Intent(this, UjiCobaan2.class);
        nPindahHal.putExtra("keyUsername", strUsername);
        startActivity(nPindahHal);
    }
}