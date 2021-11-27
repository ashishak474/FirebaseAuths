package com.example.firebase.Auth.launchApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.firebase.R;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
    }

    public void youtube(View view) {
        Intent intent = getPackageManager().getLaunchIntentForPackage("com.google.android.gm");
        if (intent != null) {
            startActivity(intent);
        }
    }
}