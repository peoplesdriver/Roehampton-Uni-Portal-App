package assignment.androidstudent.com.studentportalapp;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.Holder> {

    private ArrayList<BookItem> books;

    RVAdapter(ArrayList<BookItem> _books){
        books = _books;
    }

    static class Holder extends RecyclerView.ViewHolder {
        TextView author, title, isbn, category;
        ImageView imgBook;


        Holder(@NonNull View itemView) {
            super(itemView);
            author = itemView.findViewById(R.id.id9_tx_author);
            title = itemView.findViewById(R.id.id9_tx_title);
            isbn = itemView.findViewById(R.id.id9_tx_isbn);
            category = itemView.findViewById(R.id.id9_tx_category);
            imgBook = itemView.findViewById(R.id.id9_img);
        }
    }


    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bookitem, viewGroup, false);
        Holder holder = new Holder(v);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull Holder viewHolder, int i) {
        BookItem currentBook = books.get(i);
        viewHolder.author.setText(currentBook.getAuthor());
        viewHolder.category.setText(currentBook.getCategory());
        viewHolder.isbn.setText(currentBook.getISBN());
        viewHolder.title.setText(currentBook.getTitle());
    }



    @Override
    public int getItemCount() {
        return books.size();
    }
}
