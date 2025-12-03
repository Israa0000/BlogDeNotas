package com.example.blogdenotas.View;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.blogdenotas.R;

public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_landing);

        permisoVibracion();

        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);

    }
    int pedirPermisoVibracion = 1;
    void permisoVibracion(){
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.VIBRATE) != PackageManager.PERMISSION_GRANTED) {
            //explicación al usuario
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.VIBRATE)) {
            } else {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.VIBRATE}, pedirPermisoVibracion);
            }
        } else {
            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(500);
        }
    }


}