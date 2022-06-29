package com.example.counterappreprise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sayBooToast(View view) {
        Toast.makeText(this, "BOO!", Toast.LENGTH_SHORT).show();
    }

    public void updateCount(View view) {
        TextView counterTV = findViewById(R.id.counterText);
        String counterCurrent = counterTV.getText().toString();
        int counterAsInt = Integer.parseInt(counterCurrent);
        counterAsInt++;
        counterTV.setText(counterAsInt+"");
    }
}