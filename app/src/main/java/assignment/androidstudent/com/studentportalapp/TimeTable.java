package assignment.androidstudent.com.studentportalapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.github.chrisbanes.photoview.PhotoView;

public class TimeTable extends AppCompatActivity {

    Button id6_btn_mon01, id6_btn_mon02, id6_btn_mon03, id6_btn_mon04, id6_btn_mon05;
    Button id6_btn_tue01, id6_btn_tue02, id6_btn_tue03, id6_btn_tue04, id6_btn_tue05;
    Button id6_btn_wed01, id6_btn_wed02, id6_btn_wed03, id6_btn_wed04, id6_btn_wed05;
    Button id6_btn_thu01, id6_btn_thu02, id6_btn_thu03, id6_btn_thu04, id6_btn_thu05;
    Button id6_btn_fri01, id6_btn_fri02, id6_btn_fri03, id6_btn_fri04, id6_btn_fri05;
    Button id6_btn_sat01, id6_btn_sat02, id6_btn_sat03, id6_btn_sat04, id6_btn_sat05;
    PhotoView imgPlan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table);

        imgPlan = findViewById(R.id.id6_imgPlan);
        imgPlan.setImageResource(R.drawable.gf);

        id6_btn_mon01 = findViewById(R.id.id6_btn_mon01);
        id6_btn_mon02 = findViewById(R.id.id6_btn_mon02);
        id6_btn_mon03 = findViewById(R.id.id6_btn_mon03);
        id6_btn_mon04 = findViewById(R.id.id6_btn_mon04);
        id6_btn_mon05 = findViewById(R.id.id6_btn_mon05);

        id6_btn_tue01 = findViewById(R.id.id6_btn_tue01);
        id6_btn_tue02 = findViewById(R.id.id6_btn_tue02);
        id6_btn_tue03 = findViewById(R.id.id6_btn_tue03);
        id6_btn_tue04 = findViewById(R.id.id6_btn_tue04);
        id6_btn_tue05 = findViewById(R.id.id6_btn_tue05);

        id6_btn_wed01 = findViewById(R.id.id6_btn_wed01);
        id6_btn_wed02 = findViewById(R.id.id6_btn_wed02);
        id6_btn_wed03 = findViewById(R.id.id6_btn_wed03);
        id6_btn_wed04 = findViewById(R.id.id6_btn_wed04);
        id6_btn_wed05 = findViewById(R.id.id6_btn_wed05);

        id6_btn_thu01 = findViewById(R.id.id6_btn_thu01);
        id6_btn_thu02 = findViewById(R.id.id6_btn_thu02);
        id6_btn_thu03 = findViewById(R.id.id6_btn_thu03);
        id6_btn_thu04 = findViewById(R.id.id6_btn_thu04);
        id6_btn_thu05 = findViewById(R.id.id6_btn_thu05);

        id6_btn_fri01 = findViewById(R.id.id6_btn_fri01);
        id6_btn_fri02 = findViewById(R.id.id6_btn_fri02);
        id6_btn_fri03 = findViewById(R.id.id6_btn_fri03);
        id6_btn_fri04 = findViewById(R.id.id6_btn_fri04);
        id6_btn_fri05 = findViewById(R.id.id6_btn_fri05);

        id6_btn_sat01 = findViewById(R.id.id6_btn_sat01);
        id6_btn_sat02 = findViewById(R.id.id6_btn_sat02);
        id6_btn_sat03 = findViewById(R.id.id6_btn_sat03);
        id6_btn_sat04 = findViewById(R.id.id6_btn_sat04);
        id6_btn_sat05 = findViewById(R.id.id6_btn_sat05);

        

        id6_btn_mon01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPlan.setImageResource(R.drawable.lg1_01);
            }
        });

        id6_btn_mon02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPlan.setImageResource(R.drawable.lg1_01);
            }
        });

        id6_btn_mon03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPlan.setImageResource(R.drawable.lg1_02);
            }
        });

        id6_btn_mon04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPlan.setImageResource(R.drawable.lg1_02);
            }
        });

        id6_btn_mon05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPlan.setImageResource(R.drawable.lg1_02);
            }
        });

        id6_btn_tue01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPlan.setImageResource(R.drawable.lg1_05);
            }
        });

        id6_btn_tue02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPlan.setImageResource(R.drawable.lg1_05);
            }
        });

        id6_btn_tue03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPlan.setImageResource(R.drawable.lg1_05);
            }
        });

        id6_btn_tue04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPlan.setImageResource(R.drawable.lg1_04);
            }
        });

        id6_btn_tue05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPlan.setImageResource(R.drawable.lg1_04);
            }
        });

        id6_btn_wed01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPlan.setImageResource(R.drawable.room101);
            }
        });

        id6_btn_wed02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPlan.setImageResource(R.drawable.room101);
            }
        });

        id6_btn_wed03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPlan.setImageResource(R.drawable.room203);
            }
        });

        id6_btn_wed04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPlan.setImageResource(R.drawable.room203);
            }
        });

        id6_btn_wed05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPlan.setImageResource(R.drawable.room203);
            }
        });

        id6_btn_thu01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPlan.setImageResource(R.drawable.lg1_04);
            }
        });

        id6_btn_thu02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPlan.setImageResource(R.drawable.lg1_04);
            }
        });

        id6_btn_thu03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPlan.setImageResource(R.drawable.lg1_04);
            }
        });

        id6_btn_thu04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPlan.setImageResource(R.drawable.lg1_04);
            }
        });

        id6_btn_thu05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPlan.setImageResource(R.drawable.lg1_04);
            }
        });

        id6_btn_fri01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPlan.setImageResource(R.drawable.room102);
            }
        });

        id6_btn_fri02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPlan.setImageResource(R.drawable.room102);
            }
        });

        id6_btn_fri03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPlan.setImageResource(R.drawable.room202);
            }
        });

        id6_btn_fri04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPlan.setImageResource(R.drawable.room202);
            }
        });

        id6_btn_fri05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPlan.setImageResource(R.drawable.room202);
            }
        });

        id6_btn_sat01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPlan.setImageResource(R.drawable.room204);
            }
        });

        id6_btn_sat02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPlan.setImageResource(R.drawable.room204);
            }
        });

        id6_btn_sat03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPlan.setImageResource(R.drawable.room204);
            }
        });

        id6_btn_sat04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPlan.setImageResource(R.drawable.room204);
            }
        });

        id6_btn_sat05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPlan.setImageResource(R.drawable.room204);
            }
        });
    }

}
