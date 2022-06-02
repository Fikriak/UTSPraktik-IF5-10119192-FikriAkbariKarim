/*
 *     Tanggal Pengerjaan : 2/6/2022
 *     Nim : 10119192
 *     Nama : Fikri Akbari Karim
 */

package com.example.utspraktik_if5_10119192_fikriakbarikarim;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void pindah2(View view) {
        Intent intent = new Intent(MainActivity2.this,MainActivity2.class);
        startActivity(intent);
    }
}
