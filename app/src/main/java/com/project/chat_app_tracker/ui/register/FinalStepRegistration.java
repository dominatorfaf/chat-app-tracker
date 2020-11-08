package com.project.chat_app_tracker.ui.register;

import androidx.appcompat.app.AppCompatActivity;
import com.project.chat_app_tracker.R;
import com.project.chat_app_tracker.models.UserModel;
import com.project.chat_app_tracker.models.enums.Gender;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FinalStepRegistration extends AppCompatActivity {
    Button parentButton;
    Button youngButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_step_registration);

        Intent intent = getIntent();

        UserModel user = new UserModel();

        user.setFirstName(intent.getStringExtra("firstName"));
        user.setLastName(intent.getStringExtra("lastName"));
        user.setUsername(intent.getStringExtra("username"));

        switch(intent.getStringExtra("gender")){
            case "Male":
                user.setGender(Gender.MALE);
                break;
            case "Female":
                user.setGender(Gender.FEMALE);
                break;
            case "Other":
                user.setGender(Gender.OTHER);
                break;
        }
        Date dateOfBirth = new Date();
        try {
            dateOfBirth = new SimpleDateFormat("DD/MM/YYYY").parse(intent.getStringExtra("dateBirth"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        user.setDateBirth(dateOfBirth);
        user.setPassword(intent.getStringExtra("password"));
        user.setEmail(intent.getStringExtra("email"));
        user.setTimeCreated(new Date());

        parentButton = (Button) findViewById(R.id.parent);
        youngButton = (Button) findViewById(R.id.child);

        parentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FinalStepRegistration.this, QuizParent.class);
            }
        });

        youngButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FinalStepRegistration.this, QuizChild.class);
            }
        });
    }
}