package assignment.androidstudent.com.studentportalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;



import java.util.ArrayList;




public class Library extends AppCompatActivity {

    ArrayList<BookItem> books;
    RecyclerView rv;
    RVAdapter adapter;
    LinearLayoutManager manager;
//    Button libreg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        books = new ArrayList<>();
        books.add(new BookItem("Tudor", "3134652", "Android Studio", "Computing"));
        books.add(new BookItem("Tendai", "3135552", "Object oriented Programing", "Computing"));
        books.add(new BookItem("Piotr", "3134652", "Mathematics", "Finance"));
        rv = findViewById(R.id.id8_recycle_view);
        manager = new LinearLayoutManager(this);
        adapter = new RVAdapter(books);
        rv.setLayoutManager(manager);
        rv.setAdapter(adapter);

//        libreg = findViewById(R.id.id8_btn_libreg);
//
//        libreg.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                UniSQL con = new UniSQL(Library.this);
//                con.regAuthor();
//                con.regCategory();
//                con.regBooks();
//                Log.i("Info", "data inserted");
//                con.close();
//            }
//        });
    }
}
