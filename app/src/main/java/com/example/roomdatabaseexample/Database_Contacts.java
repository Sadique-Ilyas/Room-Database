package com.example.roomdatabaseexample;


import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Entity_Contacts.class},version = 1)
public abstract class Database_Contacts extends RoomDatabase
{
    public abstract Dao_Contacts daoContacts();
}
