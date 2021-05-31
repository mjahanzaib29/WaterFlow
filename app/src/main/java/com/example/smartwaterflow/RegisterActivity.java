package com.example.smartwaterflow;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class RegisterActivity extends AppCompatActivity {
    TextView GotoSignin;
    TextInputEditText R_Name, R_Email, R_Password;
    TextInputLayout Name_input, Email_input, Password_input;
    Button Register;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);
        Name_input = (TextInputLayout) findViewById(R.id.register_nameInput) ;
        Email_input = (TextInputLayout) findViewById(R.id.register_emailInput) ;
        Password_input = (TextInputLayout) findViewById(R.id.register_passwordInput) ;
        ///
        GotoSignin = (TextView) findViewById(R.id.r_signin);
        R_Name = (TextInputEditText) findViewById(R.id.register_name);
        R_Email = (TextInputEditText) findViewById(R.id.register_email);
        R_Password = (TextInputEditText) findViewById(R.id.register_password);
        Register = (Button) findViewById(R.id.btn_register);

        GotoSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = R_Name.getText().toString();
                if (!isName(name)) {
                    Name_input.setError(getString(R.string.namerror));
                } else {
                    Name_input.setError(null);
                }
                String email = R_Email.getText().toString();
                if (!isValidEmail(email)) {
                    Email_input.setError(getString(R.string.emailerror));
                } else {
                    Email_input.setError(null);
                }
                String password = R_Password.getText().toString();
                if (!isPasswordValid(password)) {
                    Password_input.setError(getString(R.string.passerror));
                } else {
                    Password_input.setError(null);
                }
                Log.v("adasd", name);
            }
        });
    }

    private boolean isPasswordValid(@Nullable String text) {
        return text != null && text.length() >= 6;
    }

    private boolean isName(@Nullable String text) {
        return text != null && text.length() >= 1;
    }

    public static boolean isValidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }
}
