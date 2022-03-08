package com.example.notification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private TextView usernameTxt, fullnameTxt, dateOfBirthTxt, describeTxt;
    private Button logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        usernameTxt = findViewById(R.id.usernameDetail);
        fullnameTxt = findViewById(R.id.fullnameDetail);
        dateOfBirthTxt = findViewById(R.id.dateOfBirth);
        describeTxt = findViewById(R.id.currentAffair);
        logoutButton = findViewById(R.id.logoutButton);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        String fullname = intent.getStringExtra("fullname");
        String dateOfBirth = intent.getStringExtra("dateOfBirth");
        String describe = intent.getStringExtra("describe");
        Log.d("DDD", username);
        Log.d("DDD", fullname);
        Log.d("DDD", dateOfBirth);
        Log.d("DDD", describe);

        usernameTxt.setText("Username: " + username);
        fullnameTxt.setText("Fullname: " + fullname);
        dateOfBirthTxt.setText("DateOfBirth: " + dateOfBirth);
        describeTxt.setText("Describe: " + describe);

        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}