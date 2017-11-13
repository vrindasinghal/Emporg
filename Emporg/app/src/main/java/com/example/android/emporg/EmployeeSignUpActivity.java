package com.example.android.emporg;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by vrinda on 26-10-2017.
 */

public class EmployeeSignUpActivity extends AppCompatActivity {

    private TextView employeeLoginLink;

    private Button employeeSignUp;
    private Button eCancel;
    DataHelp dataHelpEmployee;

    private EditText editTextMobileNumber, editTextName, editTextEmailId, editTextPassword, editTextCompanyId, editTextDesignation, editTextDOB, editTextAddress, editTextGender;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_signup);

        employeeLoginLink = (TextView) findViewById(R.id.employee_login_link);

        dataHelpEmployee = new DataHelp(this);

        employeeSignUp = (Button) findViewById(R.id.eSignUpButton);
        eCancel = (Button) findViewById(R.id.eCancel_button);

        editTextMobileNumber = (EditText) findViewById(R.id.input_employee_mobile_number);
        editTextName = (EditText) findViewById(R.id.input_employee_name);
        editTextEmailId = (EditText) findViewById(R.id.input_employee_email_id);
        editTextGender = (EditText) findViewById(R.id.input_employeee_gender);
        editTextCompanyId = (EditText) findViewById(R.id.input_employee_company_id);
        editTextPassword = (EditText) findViewById(R.id.input_employee_password);
        editTextAddress = (EditText) findViewById(R.id.input_employee_address);
        editTextDesignation = (EditText) findViewById(R.id.input_employee_designation);
        editTextDOB = (EditText) findViewById(R.id.input_employeee_dob);

        employeeSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer isEmployeeInserted = dataHelpEmployee.insertNewRecordInE(editTextMobileNumber.getText().toString(),
                        editTextName.getText().toString(),
                        editTextEmailId.getText().toString(),
                        editTextDesignation.getText().toString(),
                        editTextDOB.getText().toString(),
                        editTextGender.getText().toString(),
                        editTextAddress.getText().toString(),
                        editTextCompanyId.getText().toString(),
                        editTextPassword.getText().toString());

                if (isEmployeeInserted == 1) {
                    Toast.makeText(EmployeeSignUpActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(EmployeeSignUpActivity.this, "Registration Unsuccessful", Toast.LENGTH_SHORT).show();
                }
            }
        });

        eCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EmployeeSignUpActivity.this, EmployeeLoginActivity.class);
                startActivity(i);
            }
        });

        employeeLoginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EmployeeSignUpActivity.this, EmployeeLoginActivity.class);
                startActivity(i);
            }
        });
    }
}
