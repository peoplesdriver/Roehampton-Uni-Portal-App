package assignment.androidstudent.com.studentportalapp;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import assignment.androidstudent.com.studentportalapp.Database.ContractSQL;
import assignment.androidstudent.com.studentportalapp.Database.UniSQL;

public class LoginView extends AppCompatActivity {

    Button login, reg, cancel;
    EditText email, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_view);

        email = findViewById(R.id.id2_et_email);
        pass = findViewById(R.id.id2_et_pass);

        login = findViewById(R.id.id2_btn_login);
        reg = findViewById(R.id.id2_btn_register);
        cancel = findViewById(R.id.id2_btn_cancel);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!email.getText().toString().equals("") && !pass.getText().toString().equals("")) {
                    UniSQL connection = new UniSQL(LoginView.this);
                    SQLiteDatabase db = connection.getReadableDatabase();
//                    String _em[] = {email.getText().toString(), pass.getText().toString()};

                    Cursor _cursor = connection.authenticate(db);
                    if (_cursor.moveToFirst()) {
                        _cursor.moveToFirst();
                        String emailToValidate = _cursor.getString(_cursor.getColumnIndex(ContractSQL.User.EMAIL));
                        String passwordToValidate = _cursor.getString(_cursor.getColumnIndex(ContractSQL.User.PW));
                        if (emailToValidate.compareToIgnoreCase(email.getText().toString()) == 0 && passwordToValidate.compareToIgnoreCase(pass.getText().toString()) == 0) {
                            Log.i("Info", "Login successful!");
                            Toast.makeText(LoginView.this, "Login successful", Toast.LENGTH_SHORT).show();
                            navToDash();
                        } else {
                            Log.i("Info", "No such user!");
                            Toast.makeText(LoginView.this, "No such user!", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    Toast.makeText(LoginView.this, "Please enter a valid email to Login or Register", Toast.LENGTH_SHORT).show();
                }
            }
        });


        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navToReg();
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navToStart();
            }
        });
    }

    private void navToDash(){
        Intent intent = new Intent(this, Dashboard.class);
        startActivity(intent);
    }

    private void navToReg(){
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }

    private void navToStart(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
