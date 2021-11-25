package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);

       // perform setOnClickListener event on First Button
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            // load First Fragment
                loadFragment(new FirstFragment());
            }
        });

        //perform setOnClickListener event on Second Button
        btn2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        loadFragment(new SecondFragment());
                                    }
                                });
          // load Second Fragment


          // perform setOnClickListener event on third Button
                btn3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
         // load Third Fragment
                        loadFragment(new ThirdFragment());
                    }
                });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // load Third Fragment
                loadFragment(new FourthFragment());
            }
        });

    }


        private void loadFragment(Fragment fragment) {
// create a FragmentManager to interact with all fragments
            FragmentManager fm = getFragmentManager();
// create a FragmentTransaction to begin the transaction
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.frameLayout, fragment);
            fragmentTransaction.commit();

    }
}