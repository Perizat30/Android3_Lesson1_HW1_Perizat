package com.example.android3_lesson1_hw1_perizat.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

import com.example.android3_lesson1_hw1_perizat.R;

public class ThirdActivity extends AppCompatActivity {
    AppCompatButton third_button;
    EditText third_edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        findViews();
        setOnClick();
    }


    private void findViews() {
        third_button=findViewById(R.id.button_view_third);
        third_edittext=findViewById(R.id.edit_text_gender);
    }

    private void setOnClick() {
        third_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToFourthActivity();
            }
        });

    }

    private void navigateToFourthActivity() {
        Intent intent=new Intent(ThirdActivity.this,FourthActivity.class);

        String nameFromFirstActivity=getIntent().getStringExtra("name");
        intent.putExtra("name",nameFromFirstActivity);
        System.out.println(nameFromFirstActivity);

        Integer ageFromSecondActivity=getIntent().getIntExtra("age",0);
        intent.putExtra("age",ageFromSecondActivity);
        System.out.println(ageFromSecondActivity);

        intent.putExtra("gender",third_edittext.getText().toString());

        startActivity(intent);
    }
}