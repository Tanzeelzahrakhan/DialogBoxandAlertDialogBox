package com.example.dialogboxandalterdialogbox;

import static com.example.dialogboxandalterdialogbox.R.id.tvOne;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.dialogboxandalterdialogbox.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {
TextView textViewone,textViewtwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textViewone=findViewById(tvOne);
        textViewtwo=findViewById(R.id.tvtwo);
        String valueone=getIntent().getStringExtra("keyone");
        String valuetwo=getIntent().getStringExtra("keytwo");
        textViewone.setText(valueone);
        textViewtwo.setText(valuetwo);


    }
}