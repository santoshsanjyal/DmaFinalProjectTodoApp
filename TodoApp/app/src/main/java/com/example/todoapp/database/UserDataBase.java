package com.example.todoapp.database;


import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.todoapp.model.User;
import com.example.todoapp.database.dao.UserDao;


@Database(entities = {User.class}, version = 1, exportSchema = false)
public abstract class UserDataBase extends RoomDatabase {

    public abstract UserDao getUserDao();

}

