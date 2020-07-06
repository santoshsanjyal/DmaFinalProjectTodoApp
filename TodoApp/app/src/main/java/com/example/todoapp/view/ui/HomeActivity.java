package com.example.todoapp.view.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.todoapp.R;
import com.example.todoapp.model.User;

public class HomeActivity extends AppCompatActivity {
    private TextView tvUser;

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);

        Intent intent = new Intent(this, TodoActivity.class);
        startActivity(intent);
    }
}
