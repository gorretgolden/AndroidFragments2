package com.example.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.app.Fragment;

public class ThirdFragment extends Fragment {

    View view;
    Button btn1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        /// Inflate the layout for this fragment
        view = inflater.inflate(R.layout.third_fragment, container, false);
        btn1 = (Button) view.findViewById(R.id.thirdButton);
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getActivity(), "Third Fragment", Toast.LENGTH_LONG).show();
//            }
//        });
        return  view;
    }
}
