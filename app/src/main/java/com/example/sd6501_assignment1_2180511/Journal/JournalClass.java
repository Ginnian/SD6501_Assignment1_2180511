package com.example.sd6501_assignment1_2180511.Journal;

import com.example.sd6501_assignment1_2180511.LoginRegister.UserClass;
import com.example.sd6501_assignment1_2180511.R;

public class JournalClass {
    private long id;
    private int imageResource;
    private String entry;
    private String subject;
    private String date;
    private String title;

    //Storege info
    public static final String TABLE_JOURNAL = "journal_table";
    //Columns
    public static final String KEY_JOURNAL_ID = "id";
    public static final String KEY_JOURNAL_ENTRY = "entry";
    public static final String KEY_JOURNAL_SUBJECT = "subject";
    public static final String KEY_JOURNAL_TIMESTAMP = "timestamp";
    public static final String KEY_JOURNAL_TITLE = "title";
    public static final String KEY_USER_ID = "accountID";

    public static final String CREATE_TABLE = "CREATE TABLE "
            + TABLE_JOURNAL + "("
            + KEY_JOURNAL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + KEY_JOURNAL_ENTRY + " TEXT,"
            + KEY_JOURNAL_SUBJECT + " TEXT,"
            + KEY_JOURNAL_TIMESTAMP + " TEXT,"
            + KEY_JOURNAL_TITLE + " TEXT,"
            + KEY_USER_ID + " INTEGER" + ")";
//            + "FOREIGN KEY(" + UserClass.KEY_USER_ID
//            + ") REFERENCES " + UserClass.TABLE_USERS + "(" + KEY_JOURNAL_ID +"))";

    public JournalClass() {
        this.imageResource = R.drawable.rdr2;
        this.entry = "Default entry";
        this.subject = "Unclassified Subject";
        this.date = "Today";
        this.title = "Default title";
    }

    public JournalClass(long id, String entry, String subject, String date, String title) {
        this.id = id;
        this.imageResource = R.drawable.ic_schedule;
        this.entry = entry;
        this.subject = subject;
        this.date = date;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
