package com.project.chat_app_tracker.ui.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.project.chat_app_tracker.R;

public class RegisterConfActivity extends AppCompatActivity {

    EditText password, confirm_password, email;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_conf);


        password = (EditText) findViewById(R.id.password);
        confirm_password = (EditText) findViewById(R.id.confirm_password);
        email = (EditText) findViewById(R.id.email);

        submit = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterConfActivity.this, RegisterConfActivity.class);
                intent.putExtra("password", password.getText());
                intent.putExtra("confirm_password", confirm_password.getText());
                intent.putExtra("email", email.getText());

                startActivity(intent);
            }
        });

    }
}