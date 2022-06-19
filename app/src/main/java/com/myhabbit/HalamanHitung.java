package com.myhabbit;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HalamanHitung extends AppCompatActivity {

    int count = 0;
    private Button btnKurang, btnTambah, btnReset, btnUbah;
    private TextView hasilHitung, textUbah, txtper;
    int i = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_hitung);

        btnKurang = findViewById(R.id.btnKurang);
        btnTambah = findViewById(R.id.btnTambah);
        hasilHitung = findViewById(R.id.hasil);
        btnReset = findViewById(R.id.btnReset);
        textUbah = findViewById(R.id.perberapa);
        btnUbah = findViewById(R.id.btnUbah);
        txtper = findViewById(R.id.per);

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                if (count < 0) {
                    count = 0;
                }
                hasilHitung.setText(Integer.toString(count));
            }
        });

        btnTambah.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                count++;

                if ( count > 33 && textUbah.equals("33"))
                {
                    count=33;
                    Toast.makeText(getApplicationContext(), "Sudah 33", Toast.LENGTH_LONG).show();
                }
                else if (count > 99 && i == 1) {
                    count = 99;
                    Toast.makeText(getApplicationContext(), "Sudah 99", Toast.LENGTH_LONG).show();
                }

                hasilHitung.setText(Integer.toString(count));
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                hasilHitung.setText(Integer.toString(count));

            }
        });

        btnUbah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i == 0) {
                    textUbah.setText("33");
                    btnUbah.setText(Integer.toString(33));
                    txtper.setText("/");
                    hasilHitung.setText("0");
                    count=0;
                    i++;
                } else if (i == 1) {
                    textUbah.setText(Integer.toString(99));
                    btnUbah.setText(Integer.toString(99));
                    txtper.setText("/");
                    hasilHitung.setText("0");
                    count=0;
                    i = 2;
                } else if (i == 2) {
                    textUbah.setText("");
                    btnUbah.setText("~");
                    txtper.setText("");
                    hasilHitung.setText("0");
                    count=0;
                    i = 0;

                }
            }
        });

    }

    public static Intent getActIntent(Activity activity) {
        return new Intent(activity, HalamanHitung.class);
    }
}