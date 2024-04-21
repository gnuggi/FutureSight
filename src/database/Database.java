package database;

import events.Entry;

import java.util.ArrayList;
import java.util.List;

public final class Database {
    private static Database INSTANCE;

    List<Entry> entries = new ArrayList<Entry>();

    public static Database getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Database();
        }

        return INSTANCE;
    }

    public void add(Entry entry) {
        entries.add(entry);
    }
    public void remove(Entry entry) {
        entries.remove(entry);
    }
}
