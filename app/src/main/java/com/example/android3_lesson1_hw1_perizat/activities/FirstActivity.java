package com.example.android3_lesson1_hw1_perizat.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.android3_lesson1_hw1_perizat.R;

public class FirstActivity extends AppCompatActivity {
    AppCompatButton first_button;
    EditText first_editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        findViews();
        setOnClickListener();
    }


    private void findViews() {
        first_button=findViewById(R.id.button_view_first);
        first_editText=findViewById(R.id.edit_text_name);
    }

    private void setOnClickListener() {
        first_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToSecondActivity();
            }
        });
    }

    private void navigateToSecondActivity() {
        Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
        intent.putExtra("name",first_editText.getText().toString());
        startActivity(intent);
    }
}