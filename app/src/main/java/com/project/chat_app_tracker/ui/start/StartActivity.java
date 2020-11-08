package com.project.chat_app_tracker.ui.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.project.chat_app_tracker.R;
import com.project.chat_app_tracker.ui.chat.ChatActivity;
import com.project.chat_app_tracker.ui.register.RegisterActivity;

public class StartActivity extends AppCompatActivity {
    Button loginViewReference;
    TextView registerViewReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        loginViewReference = (Button) findViewById(R.id.login_page);
        registerViewReference = (TextView) findViewById(R.id.register_view_reference);

        loginViewReference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StartActivity.this, ChatActivity.class));
            }
        });

        registerViewReference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StartActivity.this, RegisterActivity.class));
            }
        });
    }

}