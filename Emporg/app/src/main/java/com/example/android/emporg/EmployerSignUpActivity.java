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

public class EmployerSignUpActivity extends AppCompatActivity {

    private TextView employerLoginLink;
    private Button employerSignUp;
    private Button rCancel;

    DataHelp dataHelpEmployer;

    private EditText editTextMobileNumber, editTextName, editTextEmailId, editTextPassword, editTextCompanyName, editTextCompanyId;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employer_signup);

        dataHelpEmployer = new DataHelp(this);

        employerLoginLink = (TextView) findViewById(R.id.employer_login_link);

        editTextMobileNumber = (EditText) findViewById(R.id.input_employer_mobile_number);
        editTextName = (EditText) findViewById(R.id.input_employer_name);
        editTextEmailId = (EditText) findViewById(R.id.input_employer_email_id);
        editTextCompanyName = (EditText) findViewById(R.id.input_employer_company_name);
        editTextCompanyId = (EditText) findViewById(R.id.input_employer_company_id);
        editTextPassword = (EditText) findViewById(R.id.input_employer_password);

        employerSignUp = (Button) findViewById(R.id.employer_sign_up_button);
        rCancel = (Button) findViewById(R.id.rCancel_button);

        employerSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer isEmployerInserted = dataHelpEmployer.insertNewRecordInR(editTextMobileNumber.getText().toString(),
                        editTextName.getText().toString(),
                        editTextEmailId.getText().toString(),
                        editTextCompanyName.getText().toString(),
                        editTextCompanyId.getText().toString(),
                        editTextPassword.getText().toString());
                if (isEmployerInserted == 1) {
                    Toast.makeText(EmployerSignUpActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(EmployerSignUpActivity.this, "Registration Unsuccessful", Toast.LENGTH_SHORT).show();
                }
            }
        });

        employerLoginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EmployerSignUpActivity.this, EmployerLoginActivity.class);
                startActivity(i);
            }
        });

        rCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EmployerSignUpActivity.this, EmployerLoginActivity.class);
                startActivity(i);
            }
        });
    }
}
