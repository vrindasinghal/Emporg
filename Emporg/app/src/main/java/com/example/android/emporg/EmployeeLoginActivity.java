package com.example.android.emporg;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by vrinda on 26-10-2017.
 */

public class EmployeeLoginActivity extends AppCompatActivity {

    private TextView employeeSignUp;

    private Button employeeLogin, loginCancel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_login);

        employeeSignUp = (TextView) findViewById(R.id.employee_sign_up_link);

        employeeLogin= (Button) findViewById(R.id.employee_login_button);
        loginCancel= (Button) findViewById(R.id.e_login_cancel_button);

        employeeLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EmployeeLoginActivity.this, EmployeeMainActivity.class);
                startActivity(i);
            }
        });

        loginCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EmployeeLoginActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        employeeSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EmployeeLoginActivity.this, EmployeeSignUpActivity.class);
                startActivity(i);
            }
        });
    }
}
