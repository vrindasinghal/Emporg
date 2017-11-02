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

public class EmployerSignUpActivity extends AppCompatActivity {

    private TextView employerLoginLink;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employer_signup);

        employerLoginLink= (TextView) findViewById(R.id.employer_login_link);
        employerLoginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(EmployerSignUpActivity.this,EmployerLoginActivity.class);
                startActivity(i);
            }
        });
    }
}
