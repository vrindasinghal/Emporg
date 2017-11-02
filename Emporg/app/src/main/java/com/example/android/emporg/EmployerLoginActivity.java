package com.example.android.emporg;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by vrinda on 26-10-2017.
 */

public class EmployerLoginActivity extends AppCompatActivity {

    private TextView employerSignUp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employer_login);

        employerSignUp = (TextView) findViewById(R.id.employer_sign_up_link);

        employerSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EmployerLoginActivity.this, EmployerSignUpActivity.class);
                startActivity(intent);
            }
        });
    }
}
