package assignment.androidstudent.com.studentportalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView welcome;
    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcome = findViewById(R.id.id1_tx_welcome);
        start = findViewById(R.id.id1_btn_start);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nav();
            }
        });
    }

    private void nav(){
        Intent intent = new Intent(this, LoginView.class);
        startActivity(intent);
    }

}
