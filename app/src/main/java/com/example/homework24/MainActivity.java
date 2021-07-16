package com.example.homework24;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btnChange;
    int id = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnChange = findViewById(R.id.button);



        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                switch (id) {
                    case 1:
                        transaction.replace(R.id.fragment_container,FirstFragment.class, null);
                        transaction.addToBackStack("FirstFragment");
                        id++;
                        break;
                    case 2:
                        transaction.replace(R.id.fragment_container,SecondFragment.class,null);
                        transaction.addToBackStack("SecondFragment");
                        id++;
                        break;
                    case 3:
                        transaction.replace(R.id.fragment_container,ThirdFragment.class,null);
                        transaction.addToBackStack("TrirdFragment");
                        id=1;
                        break;

                }




                   transaction.commit();

            }
        });

    }
}