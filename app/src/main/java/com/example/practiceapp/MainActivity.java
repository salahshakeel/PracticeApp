package com.example.practiceapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn,btn2;
    EditText editText;
    TextView textView;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ActionBar actionBar;
        actionBar = getSupportActionBar();

        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#FF0000"));
        actionBar.setBackgroundDrawable(colorDrawable);
//        actionBar.setTitle("New Application");
//        actionBar.setSubtitle("this is an app");
        actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        actionBar.setCustomView(R.layout.custom_appbar_layout);


        btn = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.show_text);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast _toast = Toast.makeText(getApplicationContext(),editText.getText(),Toast.LENGTH_SHORT);
//                _toast.show();

//                Intent _intent = new Intent(getApplicationContext(),MainActivity2.class);
//                startActivity(_intent);

                String count = String.valueOf(counter++);
               textView.setText(count);



            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String clear = String.valueOf( counter = 0);
                textView.setText(clear);
            }
        });
    }

}