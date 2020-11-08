package com.project.chat_app_tracker.connection;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.project.chat_app_tracker.models.UserModel;

import java.util.ArrayList;

public class Connection {
    public static FirebaseDatabase firebaseDatabase;
    public static DatabaseReference databaseReference;
    private static Connection connection;

    private Connection() {}

    public static DatabaseReference getFirebaseReference(String ref) {
        if (connection == null) {
            connection = new Connection();
            firebaseDatabase = FirebaseDatabase.getInstance();
        }
        return databaseReference = firebaseDatabase.getReference().child(ref);
    }
}
