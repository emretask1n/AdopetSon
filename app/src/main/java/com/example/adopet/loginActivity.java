package com.example.adopet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.adopet.Model.Users;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class loginActivity extends AppCompatActivity {

    private EditText InputMail,InputPassword;
    private Button LoginButton;
    private ProgressDialog loadingBar;
    Context context = this;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        LoginButton = (Button) findViewById(R.id.login_btn);
        InputMail = (EditText) findViewById(R.id.login_mail_input);
        InputPassword = (EditText) findViewById(R.id.login_pwd_input);
        loadingBar = new ProgressDialog(this);

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ıntent = new Intent(context, HomeActivity.class);
                startActivity(ıntent);

            }
        });


        LoginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                loginUser();

            }

        });
    }
    private void loginUser() {
        String mail = InputMail.getText().toString();
        String password = InputPassword.getText().toString();

        if (TextUtils.isEmpty(mail))
        {
            Toast.makeText(this, "Please write your e-mail address...", Toast.LENGTH_SHORT ).show();
        }
        else if(TextUtils.isEmpty(password))
        {
            Toast.makeText(this, "Please write your e-mail address...", Toast.LENGTH_SHORT ).show();

        }
        else{
            loadingBar.setTitle("Login Account");
            loadingBar.setMessage("Please wait, we are checking the credentials.");
            loadingBar.setCanceledOnTouchOutside(false);
            loadingBar.show();

            Intent intent = new Intent(loginActivity.this, HomeActivity.class);
                            startActivity(intent);
                        }
    }
}