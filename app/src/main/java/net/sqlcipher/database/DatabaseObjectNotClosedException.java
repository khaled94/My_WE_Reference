package net.sqlcipher.database;

/* loaded from: classes2.dex */
public class DatabaseObjectNotClosedException extends RuntimeException {
    private static final String s = "Application did not close the cursor or database object that was opened here";

    public DatabaseObjectNotClosedException() {
        super(s);
    }
}
