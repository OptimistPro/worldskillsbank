package com.test.worldskilsbank;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class otdel_fragment extends Fragment {
    public static otdel_fragment newInstance(String someInt) {
        otdel_fragment catFragment = new otdel_fragment();
        Bundle args = new Bundle();
        args.putString("someInt", someInt);
        catFragment.setArguments(args);
        return catFragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_otdel_fragment, container, false);

        TextView t = view.findViewById(R.id.bank);
        t.setText(getArguments().getString("someInt", "Банкомат"));

        return view;
    }
}