package assignment.androidstudent.com.studentportalapp.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

//import static assignment.androidstudent.com.studentportalapp.Database.ContractSQL.User.EMAIL;


public class UniSQL extends SQLiteOpenHelper {
    private static final String DB_NAME = "st_portal_db";
    private static int VERSION = 1;
    SQLiteDatabase database;

    public UniSQL(Context context) {
        super(context, DB_NAME, null, VERSION);
        database = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        final String CREATEUSERTABLE = "CREATE TABLE IF NOT EXISTS "+
                ContractSQL.User.TABLE_NAME+" ("+
                ContractSQL.User.SID+" INTEGER PRIMARY KEY autoincrement, "+
                ContractSQL.User.FN+" varchar(45) NOT NULL, "+
                ContractSQL.User.SN+" varchar(45) NOT NULL, "+
                ContractSQL.User.EMAIL+" varchar(45) NOT NULL, "+
                ContractSQL.User.PW+" varchar(45) NOT NULL, "+
                ContractSQL.User.GROUP+" varchar(45) NOT NULL,"+
                " FOREIGN KEY ("+ContractSQL.User.GROUP+") REFERENCES _group_ (_group_));";

        final String CREATEGROUPSTABLE = "CREATE TABLE IF NOT EXISTS "+
                ContractSQL.Groups.TABLE_NAME+" ("+
                ContractSQL.Groups.GROUP_ID+" varchar(45) PRIMARY KEY);";

        final String CREATECLASSESTABLE = "CREATE TABLE IF NOT EXISTS "+
                ContractSQL.Classes.TABLE_NAME+" ("+
                ContractSQL.Classes.GROUP_ID+" varchar(45) NOT NULL, "+
                ContractSQL.Classes.DATE+" date NOT NULL, "+
                ContractSQL.Classes.MODULE_CODE+" int(11) NOT NULL, "+
                ContractSQL.Classes.TIME+" time NOT NULL,"+
                " FOREIGN KEY ("+ContractSQL.Classes.GROUP_ID+") REFERENCES _groups_ (_group_id_),"+
                " FOREIGN KEY ("+ContractSQL.Classes.MODULE_CODE+") REFERENCES _module_ (_module_code_));";

        final String CREATEMODULETABLE = "CREATE TABLE IF NOT EXISTS "+
                ContractSQL.Module.TABLE_NAME+" ("+
                ContractSQL.Module.MODULE_CODE+" INTEGER PRIMARY KEY, "+
                ContractSQL.Module.MODULE_NAME+" varchar(45) NOT NULL);";

        final String CREATEREVIEWTABLE = "CREATE TABLE IF NOT EXISTS "+
                ContractSQL.Reviews.TABLE_NAME+" ("+
                ContractSQL.Reviews.REVIEW_ID+" INTEGER PRIMARY KEY, "+
                ContractSQL.Reviews.USER_ID+" int(11) NOT NULL, "+
                ContractSQL.Reviews.REVIEW+" varchar(200) NOT NULL, "+
                ContractSQL.Reviews.BOOK_ID+" varchar(45) NOT NULL,"+
                " FOREIGN KEY ("+ContractSQL.Reviews.BOOK_ID+") REFERENCES _book_ (_book_id_),"+
                " FOREIGN KEY ("+ContractSQL.Reviews.USER_ID+") REFERENCES _user_ (_user_id_));";

        final String CREATEBOOKTABLE = "CREATE TABLE IF NOT EXISTS "+
                ContractSQL.Book.TABLE_NAME+" ("+
                ContractSQL.Book.ISBN+" varchar(45) PRIMARY KEY, "+
                ContractSQL.Book.TITLE+" varchar(45) NOT NULL, "+
                ContractSQL.Book.EDITION+" INT(11) NOT NULL, "+
                ContractSQL.Book.CATEGORY+" varchar(45) NOT NULL,"+
                " FOREIGN KEY ("+ContractSQL.Book.CATEGORY+") REFERENCES _category_ (_category_type_));";

        final String CREATECATEGORYTABLE = "CREATE TABLE IF NOT EXISTS "+
                ContractSQL.Category.TABLE_NAME+" ("+
                ContractSQL.Category.CATEGORY+" varchar(45) PRIMARY KEY);";

        final String CREATEHASWRITTENTABLE = "CREATE TABLE IF NOT EXISTS "+
                ContractSQL.HasWritten.TABLE_NAME+" ("+
                ContractSQL.HasWritten.BOOK_ID+" varchar(45) PRIMARY KEY, "+
                ContractSQL.HasWritten.AUTHOR_ID+" int(11) NOT NULL,"+
                " FOREIGN KEY ("+ContractSQL.HasWritten.AUTHOR_ID+") REFERENCES _author_ (_author_id_),"+
                " FOREIGN KEY ("+ContractSQL.HasWritten.BOOK_ID+") REFERENCES _book_ (_book_id_));";

        final String CREATEAUTHORTABLE = "CREATE TABLE IF NOT EXISTS "+
                ContractSQL.Author.TABLE_NAME+" ("+
                ContractSQL.Author.AUTHOR_ID+" INTEGER PRIMARY KEY autoincrement, "+
                ContractSQL.Author.FN+" varchar(45) NOT NULL, "+
                ContractSQL.Author.SN+" varchar(45) NOT NULL);";

        db.execSQL(CREATEUSERTABLE);
        db.execSQL(CREATEGROUPSTABLE);
        db.execSQL(CREATECLASSESTABLE);
        db.execSQL(CREATEMODULETABLE);
        db.execSQL(CREATEBOOKTABLE);
        db.execSQL(CREATEREVIEWTABLE);
        db.execSQL(CREATECATEGORYTABLE);
        db.execSQL(CREATEHASWRITTENTABLE);
        db.execSQL(CREATEAUTHORTABLE);

    }




    public void register(String fn, String sn, String em, String pw, String group){

        ContentValues cv = new ContentValues();
        cv.put(ContractSQL.User.FN, fn);
        cv.put(ContractSQL.User.SN, sn);
        cv.put(ContractSQL.User.EMAIL, em);
        cv.put(ContractSQL.User.PW, pw);
        cv.put(ContractSQL.User.GROUP, group);
        SQLiteDatabase db = getWritableDatabase();
        db.insert(ContractSQL.User.TABLE_NAME, null, cv);
        db.close();
    }


    public void regBooks(){
        ContentValues cv = new ContentValues();
        cv.put(ContractSQL.Book.ISBN, "ISBN1491974052");
        cv.put(ContractSQL.Book.TITLE, "Head first Android development");
        cv.put(ContractSQL.Book.EDITION, 2);
        cv.put(ContractSQL.Book.CATEGORY, "Computers");

        SQLiteDatabase db = getWritableDatabase();
        db.insert(ContractSQL.Book.TABLE_NAME, null, cv);
        db.close();
    }

    public void regCategory(){
        ContentValues cv = new ContentValues();
        cv.put(ContractSQL.Category.CATEGORY, "Computers");
        SQLiteDatabase db = getWritableDatabase();
        db.insert(ContractSQL.Category.TABLE_NAME, null, cv);
        db.close();
    }

    public void regAuthor(){
        ContentValues cv = new ContentValues();
        cv.put(ContractSQL.Author.FN, "Dawn");
        cv.put(ContractSQL.Author.SN, "Griffiths");
        SQLiteDatabase db = getWritableDatabase();
        db.insert(ContractSQL.Author.TABLE_NAME, null, cv);
        db.close();
    }

    public void leaveReview(String  revId, String userId, String review, String bookId ){
        ContentValues cv = new ContentValues();
        cv.put(ContractSQL.Reviews.REVIEW_ID, revId);
        cv.put(ContractSQL.Reviews.USER_ID, userId);
        cv.put(ContractSQL.Reviews.REVIEW, review);
        cv.put(ContractSQL.Reviews.BOOK_ID, bookId);
        SQLiteDatabase db = getWritableDatabase();
        db.insert(ContractSQL.Reviews.TABLE_NAME, null, cv);
        db.close();
    }

    /*public Cursor ifEmailExist(SQLiteDatabase db, String [] em){
        String[] emailCols = {ContractSQL.User.EMAIL};
        Cursor cursor = db.query(ContractSQL.User.TABLE_NAME, emailCols, ContractSQL.User.EMAIL, em, null, null, null);
        return cursor;
    }*/

    public Cursor authenticate(SQLiteDatabase db){
        String [] loginCols = {ContractSQL.User.EMAIL, ContractSQL.User.PW};
        Cursor cursor = db.query(ContractSQL.User.TABLE_NAME, loginCols, null, null, null, null, null);
        return cursor;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
