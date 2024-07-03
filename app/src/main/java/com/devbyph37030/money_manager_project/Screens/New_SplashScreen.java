package com.devbyph37030.money_manager_project.Screens;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.devbyph37030.money_manager_project.MainActivity;
import com.devbyph37030.money_manager_project.R;

public class New_SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_splash_screen);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(New_SplashScreen.this, MainActivity.class);
                    startActivity(intent);
                }
            },3000);



    }
}