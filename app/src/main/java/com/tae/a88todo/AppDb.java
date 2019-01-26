package com.tae.a88todo;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Task.class}, version = 1)
public abstract class AppDb extends RoomDatabase {
    public abstract TaskDao taskDao();
}
