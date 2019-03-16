package assignment.androidstudent.com.studentportalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Dashboard extends AppCompatActivity {


    int backButtonCount = 0;

    Button floormap, timetable, library, web;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        floormap = findViewById(R.id.id4_dash_map);
        timetable = findViewById(R.id.id4_dash_timetable);
        library = findViewById(R.id.id4_dash_library);
        web = findViewById(R.id.id4_dash_web);

        floormap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Dashboard.this, "Floor Map", Toast.LENGTH_SHORT).show();
                navToMap();
            }
        });

        timetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Dashboard.this, "Time Table", Toast.LENGTH_SHORT).show();
                navToTimeTable();
            }
        });

        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Dashboard.this, "Library", Toast.LENGTH_SHORT).show();
                navToLibrary();
            }
        });

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Dashboard.this, "Roehampton Moodle", Toast.LENGTH_SHORT).show();
                navToSettings();
            }
        });
    }

    private void navToTimeTable(){
        Intent intent = new Intent(this, TimeTable.class);
        startActivity(intent);

    }

    private void navToMap(){
        Intent intent = new Intent(this, FloorMap.class);
        startActivity(intent);
    }

    private void navToLibrary(){
        Intent intent = new Intent(this, Library.class);
        startActivity(intent);
    }

    private void navToSettings(){
        Intent intent = new Intent(this, WebBrowser.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed(){
            if (backButtonCount >= 1) {
                backButtonCount = 0;
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);

            } else {
                Toast.makeText(this, "Press the back button once again to close the application.", Toast.LENGTH_SHORT).show();
                backButtonCount++;
            }
    }
}
