package com.world.sayhelloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // it is a kind of check point where if we found it false it means the "hello world" text is invisible.
    // and if we found it true it means the text is visible on screen
    Boolean isVisible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.start);
        TextView txt = findViewById(R.id.textView);
        btn.setOnClickListener(view -> {


            // checking condition
            if (!isVisible) { // in the if condition

                // seting the text Visibility visible form invisible
                txt.setVisibility(View.VISIBLE);

                // changing the value
                isVisible = true;

            } else { // in the else condition

                // seting the text Visibility visible form invisible
                txt.setVisibility(View.GONE);

                // changing the value
                isVisible = false;
            }
        });
    }
}