package com.example.android3_lesson1_hw1_perizat.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

import com.example.android3_lesson1_hw1_perizat.R;

public class SecondActivity extends AppCompatActivity {
    AppCompatButton second_button;
    EditText second_edittext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        findViews();
        setOnClickListener();

    }

    private void findViews() {
        second_button=findViewById(R.id.button_view_second);
        second_edittext=findViewById(R.id.edit_text_age);
    }

    private void setOnClickListener() {
        second_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getTextFromIntent();
                navigateToThirdActivity();
            }
        });
    }

    private void getTextFromIntent() {

    }

    private void navigateToThirdActivity() {
        Intent intent=new Intent(SecondActivity.this,ThirdActivity.class);

        String nameFromFirstActivity=getIntent().getStringExtra("name");
        intent.putExtra("name",nameFromFirstActivity);
        System.out.println(nameFromFirstActivity);

        intent.putExtra("age",second_edittext.getText().toString());
        startActivity(intent);
    }

}