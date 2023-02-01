package com.example.android3_lesson1_hw1_perizat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.example.android3_lesson1_hw1_perizat.activities.FirstActivity;

import java.nio.file.FileStore;

public class MainActivity extends AppCompatActivity {
    AppCompatButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setOnClickListener();
    }

    private void findViews() {
        button=findViewById(R.id.button_view);

    }
    private void setOnClickListener() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToFirstActivity();

            }
        });
    }

    private void navigateToFirstActivity() {
        Intent intent=new Intent(MainActivity.this, FirstActivity.class);
        startActivity(intent);
    }
}