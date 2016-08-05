package com.bulbulhossen.transitions_animations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().getAttributes().windowAnimations = R.style.Slide_Transition;


        textView = (TextView) findViewById(R.id.txButton);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Thanks for clicking", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this,Anoter_Activity.class);
                startActivity(intent);

            }
        });
    }
}
