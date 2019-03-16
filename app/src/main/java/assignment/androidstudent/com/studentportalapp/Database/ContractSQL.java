package assignment.androidstudent.com.studentportalapp.Database;

public class ContractSQL {
    private ContractSQL(){}

    public static class User{

        public static final String TABLE_NAME = "_user_";
        public static final String SID = "_sid_";
        public static final String FN = "_fn_";
        public static final String SN = "_sn_";
        public static final String EMAIL = "_email_";
        public static final String PW = "_pw_";
        public static final String GROUP = "_group_";
    }

    public static class Groups{
        public static final String TABLE_NAME = "_groups_";
        public static final String GROUP_ID = "_group_id_";
    }

    public static class Classes{
        public static final String TABLE_NAME = "_classes_";
        public static final String GROUP_ID = "_group_id_";
        public static final String DATE = "_date_";
        public static final String MODULE_CODE = "_module_code_";
        public static final String TIME = "_time_";
    }

    public static class Module{
        public static final String TABLE_NAME = "_module_";
        public static final String MODULE_CODE = "_module_code_";
        public static final String MODULE_NAME = "_module_name_";
    }

    public static class Reviews{
        public static final String TABLE_NAME = "_reviews_";
        public static final String REVIEW_ID = "_review_id_";
        public static final String USER_ID = "_user_id_";
        public static final String REVIEW = "_review_";
        public static final String BOOK_ID = "_book_id_";
    }

    public static class Book{
        public static final String TABLE_NAME = "_book_";
        public static final String ISBN = "_ISBN_";
        public static final String TITLE = "_title_";
        public static final String EDITION = "_edition_";
        public static final String CATEGORY = "_category_type_";
    }

    public static class Category{
        public static final String TABLE_NAME = "_category_";
        public static final String CATEGORY = "_category_type_";
    }

    public static class HasWritten{
        public static final String TABLE_NAME = "_has_written_";
        public static final String BOOK_ID = "_book_id_";
        public static final String AUTHOR_ID = "_author_id_";
    }

    public static class Author{
        public static final String TABLE_NAME = "_author_";
        public static final String AUTHOR_ID = "_author_id_";
        public static final String FN = "_fn_";
        public static final String SN = "_sn_";
    }
}

