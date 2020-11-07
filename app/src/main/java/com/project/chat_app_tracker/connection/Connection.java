package com.project.chat_app_tracker.connection;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Connection {
    private static FirebaseDatabase firebaseDatabase;
    private static DatabaseReference databaseReference;

    public static FirebaseDatabase getFirebaseDatabase() {
        firebaseDatabase = FirebaseDatabase.getInstance();
        return firebaseDatabase;
    }

    public static DatabaseReference getDatabaseReference() {
        databaseReference = firebaseDatabase.getReference();
        return databaseReference;
    }
}
