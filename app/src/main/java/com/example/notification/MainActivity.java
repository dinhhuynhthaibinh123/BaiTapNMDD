package com.example.notification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button loginButton;
    EditText usernameEdt;
    EditText passwordEdt;
    ArrayList<User> listUser = new ArrayList<User>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginButton = findViewById(R.id.loginButton);
        usernameEdt = findViewById(R.id.username);
        passwordEdt = findViewById(R.id.password);
        listUser.add(new User("Dinh Huynh Thai Binh", "thaibinh123", "123", "23-07-2001", "Study at UIT"));
        listUser.add(new User("Do Cong Vu", "congvu123", "123", "12-05-1990", "Working at KMS"));
        listUser.add(new User("Vo Hoang Duc Khoa", "duckhoa123", "123", "29-09-2005", "Study at UEL"));
        listUser.add(new User("Ta Thien Huy", "thienhuy123", "123", "16-01-2001", "Working at google"));
        listUser.add(new User("Bach Tieu Thuan", "tieuthuan123", "123", "26-12-2001", "Freelancer"));


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = usernameEdt.getText().toString();
                String password = passwordEdt.getText().toString();

                Log.d("DDD", username);
                Log.d("DDD", password);
                boolean isSucceeded = false;
                User userLogin = new User();
                for (User user :
                        listUser) {
                    if (username.compareTo(user.getUsername()) == 0 && password.compareTo(user.getPassword()) == 0) {
                        isSucceeded = true;
                        userLogin = user;
                        break;
                    }
                }
                Log.d("DDD", userLogin.getDateOfBirth());

                String message = isSucceeded ? "Login is successfully" : "Login is failed";

                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                if (isSucceeded) {
                    Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                    intent.putExtra("username", userLogin.getUsername());
                    intent.putExtra("fullname", userLogin.getFullName());
                    intent.putExtra("dateOfBirth", userLogin.getDateOfBirth());
                    intent.putExtra("describe", userLogin.getDescribe());
                    startActivity(intent);
                }
            }
        });


    }
}