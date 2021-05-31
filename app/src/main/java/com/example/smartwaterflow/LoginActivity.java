package com.example.smartwaterflow;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {
    TextInputEditText login_email,login_pass;
    TextInputLayout email_input,pass_input;
    Button btn_login;
    TextView Signup,forgotpass;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        email_input = (TextInputLayout) findViewById(R.id.login_emailInput);
        pass_input = (TextInputLayout) findViewById(R.id.login_passwordInput);
        ///
        login_email = (TextInputEditText) findViewById(R.id.login_email);
        login_pass = (TextInputEditText) findViewById(R.id.login_password);
        btn_login = (Button) findViewById(R.id.btn_login);
        Signup = (TextView) findViewById(R.id.L_Signup);
        forgotpass =(TextView) findViewById(R.id.L_forgot);

        forgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),HomePage.class);
                startActivity(intent);
            }
        });

        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(in);
                finish();
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = login_email.getText().toString();
                if (TextUtils.isEmpty(email)) {
                    email_input.setError(getString(R.string.emailerror));
                } else {
                    email_input.setError(null);
                }
                String pass = login_pass.getText().toString();
                if (TextUtils.isEmpty(pass)) {
                    pass_input.setError(getString(R.string.passerror));
                } else {
                    pass_input.setError(null);
                }
            }
        });

    }
}
