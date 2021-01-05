package com.example.adopet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import android.os.Bundle;
import android.widget.Toast;

public class registerActivity extends AppCompatActivity{

    private Button CreateAccountButton;
    private EditText InputName, InputMail, InputPassword;
    private ProgressDialog loadingBar;
    Context context = this;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        CreateAccountButton = (Button) findViewById(R.id.register_btn);
        InputMail = (EditText) findViewById(R.id.register_email_input);
        InputPassword = (EditText) findViewById(R.id.register_password_input);
        InputName = (EditText) findViewById(R.id.register_username_input);
        loadingBar = new ProgressDialog(this);


        CreateAccountButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ıntent = new Intent(context, loginActivity.class);
                startActivity(ıntent);

            }
        });


        CreateAccountButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){

                CreateAccount();
            }

        });

    }

    private void CreateAccount() {

        String name = InputName.getText().toString();
        String mail = InputMail.getText().toString();
        String password = InputPassword.getText().toString();



        if (TextUtils.isEmpty(name))
        {
            Toast.makeText(this," Please write your name ...", Toast.LENGTH_SHORT ).show();
        }
        else if (TextUtils.isEmpty(mail))
        {
            Toast.makeText(this," Please write your e-mail address ...", Toast.LENGTH_SHORT ).show();
        }
        else if (TextUtils.isEmpty(password))
        {
            Toast.makeText(this," Please write your password ...", Toast.LENGTH_SHORT ).show();
        }
        else{
            loadingBar.setTitle("Create Account");
            loadingBar.setMessage("Please wait, we are checking the credentials.");
            loadingBar.setCanceledOnTouchOutside(false);
            loadingBar.show();



                    Intent intent = new Intent(registerActivity.this, loginActivity.class);
                    startActivity(intent);

                }


            }





    }
