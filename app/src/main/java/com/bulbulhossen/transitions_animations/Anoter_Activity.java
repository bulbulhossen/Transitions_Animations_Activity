package com.bulbulhossen.transitions_animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Anoter_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anoter_);
        getWindow().getAttributes().windowAnimations = R.style.Slide_Transition;
    }
}
