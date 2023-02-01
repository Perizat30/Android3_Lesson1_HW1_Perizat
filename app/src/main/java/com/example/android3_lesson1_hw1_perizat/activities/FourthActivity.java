package com.example.android3_lesson1_hw1_perizat.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android3_lesson1_hw1_perizat.R;

import java.util.concurrent.TimeoutException;

public class FourthActivity extends AppCompatActivity {
    TextView first_textview;
    TextView second_textview;
    TextView  third_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        findViews();
        getTextFromIntent();
    }

    private void findViews() {
       first_textview =findViewById(R.id.text_view_first);
       second_textview=findViewById(R.id.text_view_second);
       third_textview=findViewById(R.id.text_view_third);
    }

    private void getTextFromIntent() {
        String nameFromFirstActivity=getIntent().getStringExtra("name");
        System.out.println(nameFromFirstActivity);
        first_textview.setText(nameFromFirstActivity);

        Integer ageFromSecondActivity= getIntent().getIntExtra("age",0);
        System.out.println(ageFromSecondActivity);
        //second_textview.setText(ageFromSecondActivity);
        second_textview.setText(ageFromSecondActivity);

        String genderFromThirdActivity=getIntent().getStringExtra("gender");
        System.out.println(genderFromThirdActivity);
        third_textview.setText(genderFromThirdActivity);
    }

}