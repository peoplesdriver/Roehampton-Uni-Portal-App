package assignment.androidstudent.com.studentportalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import assignment.androidstudent.com.studentportalapp.Database.UniSQL;

public class Register extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText fn, sn, em, pw, pw_verify;
    Button register, cancel;
    Spinner spinner;
    String selected_group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        spinner = findViewById(R.id.id3_reg_spinner);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(Register.this,R.array.groups, android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


        fn = findViewById(R.id.id3_reg_fn);
        sn = findViewById(R.id.id3_reg_sn);
        em = findViewById(R.id.id3_reg_email);
        pw = findViewById(R.id.id3_reg_pw);
        pw_verify = findViewById(R.id.id3_reg_pw_verify);
        final String emptyline = "";


        register = findViewById(R.id.id3_reg_btn_register);
        cancel = findViewById(R.id.id3_reg_btn_cancel);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!fn.getText().toString().equals(emptyline) && !sn.getText().toString().equals(emptyline) && !em.getText().toString().equals(emptyline) && !pw.getText().toString().equals(emptyline) && !pw_verify.getText().toString().equals(emptyline) && !selected_group.equals(emptyline)) {
                    if (pw.getText().toString().equals(pw_verify.getText().toString())){
                        UniSQL con = new UniSQL(Register.this);
                        con.register(fn.getText().toString(), sn.getText().toString(), em.getText().toString(), pw.getText().toString(), selected_group);
                        Toast.makeText(Register.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                        Log.i("select_group", "value of selected group is " + selected_group);
                        con.close();
                        navToLogin();
                    } else {
                        Toast.makeText(Register.this, "Password no match", Toast.LENGTH_SHORT).show();
                    }

                } else {
                    Toast.makeText(getApplicationContext(), "Please complete all fields!", Toast.LENGTH_LONG).show();
                }
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navToLogin();
            }
        });
    }


    private void navToLogin(){
        Intent intent = new Intent(this, LoginView.class);
        startActivity(intent);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        selected_group = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}