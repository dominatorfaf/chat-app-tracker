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

        Intent intent = getIntent();
        Bundle bundleFromIntent = intent.getBundleExtra("Package");
        String firstname = bundleFromIntent.getString("first_name").toString();
        String lastname = bundleFromIntent.getString("last_name").toString();
        String username = bundleFromIntent.getString("username").toString();
        String gender = bundleFromIntent.getString("gender").toString();
        String dateBirth = bundleFromIntent.getString("date_birth").toString();

        password = (EditText) findViewById(R.id.password);
        confirm_password = (EditText) findViewById(R.id.confirm_password);
        email = (EditText) findViewById(R.id.email);

        submit = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FinalStepRegistration.class);
                Bundle bundle = new Bundle();
                bundle.putString("password", password.getText().toString());
                bundle.putString("confirm_password", confirm_password.getText().toString());
                bundle.putString("email", email.getText().toString());
                bundle.putString("first_name", firstname);
                bundle.putString("last_name", lastname);
                bundle.putString("username", username);
                bundle.putString("gender", gender);
                bundle.putString("date_birth", dateBirth);
                intent.putExtra("Package", bundle);
                startActivity(intent);
            }
        });

    }
}