package com.example.dialogboxandalterdialogbox;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.dialogboxandalterdialogbox.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
 ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog=new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.dialogbox);
                EditText editName=dialog.findViewById(R.id.etname);
                EditText editDept=dialog.findViewById(R.id.etdept);
                Button btnAlert=dialog.findViewById(R.id.btnAlter);


                btnAlert.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        AlertDialog.Builder alertdialog=new AlertDialog.Builder(MainActivity.this).
                                setTitle("Alert Message").
                                setMessage("Are You sure to send Data").
                                setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                                         intent.putExtra("keyone",editName.getText().toString());
                                         intent.putExtra("keytwo",editDept.getText().toString());

                                     startActivity(intent);
                                    }
                                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {

                                    }
                                });
                        alertdialog.show();
                    }
                });





                dialog.show();
            }
        });
    }
}