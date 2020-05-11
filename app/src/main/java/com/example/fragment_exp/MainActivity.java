package com.example.fragment_exp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    boolean status = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager manager =getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();

                if(!status){
                    FirstFragment fragmentOne = new FirstFragment();
                    transaction.replace(R.id.fragment_place,fragmentOne);
                    transaction.commit();
                    button.setText("Hug");
                    status= true;
                }else {
                    SecondFragment fragmentTwo = new SecondFragment();
                    transaction.replace(R.id.fragment_place,fragmentTwo);
                    transaction.commit();
                    button.setText("Smile");
                    status= false;

                }
            }
        });


    }

    /*public void ChangeFragment(View view){

        Fragment fragment;

        if(view == findViewById(R.id.button1)){

            fragment = new FirstFragment();

            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft =fm.beginTransaction();
            ft.replace(R.id.fragment_place,fragment);
            ft.commit();

        }
        if(view == findViewById(R.id.button2)){
            fragment = new SecondFragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft =fm.beginTransaction();
            ft.replace(R.id.fragment_place,fragment);
            ft.commit();

        }

    }*/
}
