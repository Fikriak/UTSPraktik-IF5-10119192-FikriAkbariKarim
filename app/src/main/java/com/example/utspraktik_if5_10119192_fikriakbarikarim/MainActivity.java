/*
 *     Tanggal Pengerjaan : 2/6/2022
 *     Nim : 10119192
 *     Nama : Fikri Akbari Karim
 */

package com.example.utspraktik_if5_10119192_fikriakbarikarim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void pindah(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }
}