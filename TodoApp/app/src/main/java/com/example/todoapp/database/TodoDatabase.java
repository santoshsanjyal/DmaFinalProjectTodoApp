package com.example.todoapp.database;

import android.content.Context;

import com.example.todoapp.database.dao.TodoDao;
import com.example.todoapp.model.TodoModel;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

//annotation for getting model class ,setting version and exportSchema
@Database(entities = TodoModel.class, version = 1, exportSchema = false)
public abstract class TodoDatabase extends RoomDatabase {
    //instanse of given class
    private static TodoDatabase instanse;

    //difine an abstract method of return type NoteDoa
    public abstract TodoDao todoDao();

    //method to create instanse of database named todo_list
    public static synchronized TodoDatabase getInstance(Context context)
    { if (instanse==null)
    {
        instanse= Room.databaseBuilder(context.getApplicationContext()
                ,TodoDatabase.class,"todo_list")
                .fallbackToDestructiveMigration().build();
    }
        return instanse;
    }
}
