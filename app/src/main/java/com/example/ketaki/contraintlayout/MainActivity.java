package com.example.ketaki.contraintlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=((EditText)findViewById(R.id.textView)).getText().toString();

                ((EditText)findViewById(R.id.textView)).setText(str.toUpperCase());
            }
        });
    }
}
