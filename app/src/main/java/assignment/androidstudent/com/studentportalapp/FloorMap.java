package assignment.androidstudent.com.studentportalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.github.chrisbanes.photoview.PhotoView;

public class FloorMap extends AppCompatActivity {

    Button lg2floor, lg1floor, groundfloor, firstfloor,secondfloor,thirdfloor;
    PhotoView map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floor_map);

        map = findViewById(R.id.id5_map_img);
        map.setImageResource(R.drawable.ground_floor);


        lg2floor = findViewById(R.id.id5_map_btn_lg2);
        lg1floor = findViewById(R.id.id5_map_btn_lg1);
        groundfloor = findViewById(R.id.id5_map_btn_g);
        firstfloor = findViewById(R.id.id5_map_btn_f1);
        secondfloor = findViewById(R.id.id5_map_btn_f2);
        thirdfloor = findViewById(R.id.id5_map_btn_f3);


        lg2floor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FloorMap.this, "Lower Ground Floor 2", Toast.LENGTH_SHORT).show();
                map.setImageResource(R.drawable.lowertwofloor);
            }
        });

        lg1floor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FloorMap.this, "Lower Ground Floor 1", Toast.LENGTH_SHORT).show();
                map.setImageResource(R.drawable.lower_floor);
            }
        });

        groundfloor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FloorMap.this, "Ground Floor", Toast.LENGTH_SHORT).show();
                map.setImageResource(R.drawable.ground_floor);
            }
        });

        firstfloor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FloorMap.this, "First Floor", Toast.LENGTH_SHORT).show();
                map.setImageResource(R.drawable.first_floor);
            }
        });

        secondfloor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FloorMap.this, "Second Floor", Toast.LENGTH_SHORT).show();
                map.setImageResource(R.drawable.second_floor);
            }
        });

        thirdfloor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FloorMap.this, "Third Floor", Toast.LENGTH_SHORT).show();
                map.setImageResource(R.drawable.third_floor);
            }
        });


    }
}
