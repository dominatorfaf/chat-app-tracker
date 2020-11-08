package com.project.chat_app_tracker.ui.register;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.project.chat_app_tracker.R;
import com.project.chat_app_tracker.connection.Connection;
import com.project.chat_app_tracker.models.UserModel;
import com.project.chat_app_tracker.models.enums.Gender;
import com.project.chat_app_tracker.ui.quiz.QuizChildActivity;
import com.project.chat_app_tracker.ui.quiz.QuizParentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class FinalStepRegistration extends AppCompatActivity {
    Button parentButton;
    Button youngButton;

    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_step_registration);

        Intent intent = getIntent();
        Bundle bundleFromIntent = intent.getBundleExtra("Package");

        UserModel user = new UserModel();

        user.setFirstName(bundleFromIntent.getString("first_name").toString());
        user.setLastName(bundleFromIntent.getString("last_name").toString());
        user.setUsername(bundleFromIntent.getString("username").toString());

        Log.i("userInfo",user.getFirstName() + user.getLastName() + user.getUsername());

        switch(bundleFromIntent.getString("gender").toString()){
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
            dateOfBirth = new SimpleDateFormat("DD/MM/YYYY").parse(bundleFromIntent.getString("date_birth").toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        user.setDateBirth(dateOfBirth);
        user.setPassword(bundleFromIntent.getString("password").toString());
        user.setEmail(bundleFromIntent.getString("email").toString());
        user.setTimeCreated(new Date());

        parentButton = (Button) findViewById(R.id.parent);
        youngButton = (Button) findViewById(R.id.child);

        databaseReference = Connection.getFirebaseReference("Users");

        parentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.setIsParent(true);
                float f = (float) (Math.random() * (100 - 0)) + 0;
                ArrayList<Float> sentiment = new ArrayList<>();
                sentiment.add(f);
                user.setSentiments(sentiment);
                databaseReference.push().setValue(user);
                Intent intent = new Intent(FinalStepRegistration.this, QuizParentActivity.class);
                startActivity(intent);
            }
        });

        youngButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.setIsParent(false);
                float f = (float) (Math.random() * (100 - 0)) + 0;
                ArrayList<Float> sentiment = new ArrayList<>();
                sentiment.add(f);
                user.setSentiments(sentiment);
                databaseReference.push().setValue(user);
                Intent intent = new Intent(FinalStepRegistration.this, QuizChildActivity.class);
                startActivity(intent);
            }
        });

    }
}