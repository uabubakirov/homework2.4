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
    boolean isGame = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnChange = findViewById(R.id.button);



        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                 if (isGame){
                      transaction.replace(R.id.fragment_container, FirstFragment.newInstance("ajja", "port"));
                      isGame = false;
                      transaction.addToBackStack("First");
                 }
                   else {
                       transaction.replace(R.id.fragment_container, SecondFragment.newInstance("ahah", "poui"));
                       isGame = true;
                       transaction.addToBackStack("First");
                 }

                   transaction.commit();

            }
        });

    }
}