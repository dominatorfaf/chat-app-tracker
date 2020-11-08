package com.project.chat_app_tracker.connection;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Connection {
    private static FirebaseDatabase firebaseDatabase;
    private static DatabaseReference databaseReference;

    public static FirebaseDatabase getFirebaseDatabaseInstance() {
        firebaseDatabase = FirebaseDatabase.getInstance();
        return firebaseDatabase;
    }

    public static DatabaseReference getDatabaseReferenceChild(String child) {
        databaseReference = firebaseDatabase.getReference();
        return databaseReference.child(child);
    }
}
