package com.mandeep.slidingtabs.Fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mandeep.slidingtabs.R;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragment5#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment5 extends Fragment {


    public BlankFragment5() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_blank, container, false);
        TextView textView = view.findViewById(R.id.fragTv);
        textView.setText("Tab 5");
        return view;
    }

}
