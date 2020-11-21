package com.test.worldskilsbank;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class otdel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otdel);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        otdel_fragment catFragment = otdel_fragment.newInstance("Банкомат");
        ft.add(R.id.one, catFragment);
        otdel_fragment catFragment2 = otdel_fragment.newInstance("Банкомат");
        ft.add(R.id.two, catFragment2);
        otdel_fragment catFragment3 = otdel_fragment.newInstance("Отдел");
        ft.add(R.id.three, catFragment3);
        otdel_fragment catFragment4 = otdel_fragment.newInstance("Банкомат");
        ft.add(R.id.four, catFragment4);
        otdel_fragment catFragment5 = otdel_fragment.newInstance("Банкомат");
        ft.add(R.id.five, catFragment5);
        otdel_fragment catFragment6 = otdel_fragment.newInstance("Отдел");
        ft.add(R.id.six, catFragment6);
        otdel_fragment catFragment7 = otdel_fragment.newInstance("Банкомат");
        ft.add(R.id.seven, catFragment7);
        otdel_fragment catFragment8 = otdel_fragment.newInstance("Банкомат");
        ft.add(R.id.eidt, catFragment8);
        ft.commit();
    }
}