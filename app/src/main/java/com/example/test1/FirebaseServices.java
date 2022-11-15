package com.example.test1;

import com.google.firebase.auth.FirebaseAuth;

public class FirebaseServices {
    private static FirebaseServices instance;
    private FirebaseAuth auth;



    public static FirebaseServices getInstance() {
        return instance;
    }

    public FirebaseAuth getAuth() {
        return auth;
    }
}
