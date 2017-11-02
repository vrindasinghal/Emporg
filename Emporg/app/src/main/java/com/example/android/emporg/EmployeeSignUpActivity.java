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

public class EmployeeSignUpActivity extends AppCompatActivity {

    private TextView employeeLoginLink;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_signup);

        employeeLoginLink = (TextView) findViewById(R.id.employee_login_link);

        employeeLoginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(EmployeeSignUpActivity.this,EmployeeLoginActivity.class);
                startActivity(i);
            }
        });
    }
}
