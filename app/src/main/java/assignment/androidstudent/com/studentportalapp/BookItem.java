package assignment.androidstudent.com.studentportalapp;


public class BookItem {

    private String author, title, ISBN, category;


    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getCategory() {
        return category;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setCategory(String category) {
        this.category = category;
    }




    public BookItem(String author, String title, String ISBN, String category) {
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
        this.category = category;
    }
}
