package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnLoginM,btnSingupM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connectComponents();
    }

    private void connectComponents() {
        btnSingupM= findViewById(R.id.btnSignupMain);
        btnLoginM= findViewById(R.id.btnLoginMain);

    }

    public void LOGIN(View view) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FramlayoutMain, new LoginFragment());
        ft.commit();
    }

    public void SingUp(View view) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FramlayoutMain, new FragmentSignup());
        ft.commit();
    }
}