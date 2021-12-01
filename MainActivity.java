package com.example.daus;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView mDau1, mDau2;
    private Button mTirarDaus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDau1=findViewById(R.id.Dau1);
        mDau2=findViewById(R.id.Dau2);
        mTirarDaus=findViewById(R.id.BTN_TirarDaus);




        int[] arrayDados=new int[]{
                R.drawable.costat1,
                R.drawable.costat2,
                R.drawable.costat3,
                R.drawable.costat4,
                R.drawable.costat5,
                R.drawable.costat6,

        };
        mTirarDaus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int randNum = rand.nextInt(6)+1;
                mDau2.setImageResource(arrayDados[randNum]);

                randNum= rand.nextInt(6);
                mDau1.setImageResource(arrayDados[randNum]);

                randNum= rand.nextInt(6);

            }

        });


    }
}