package com.to.fragmentapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class SecondFragment extends Fragment {
    TextView textView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);
        textView = view.findViewById(R.id.text);
        textView.setText("Second");
        return view;
    }
}
