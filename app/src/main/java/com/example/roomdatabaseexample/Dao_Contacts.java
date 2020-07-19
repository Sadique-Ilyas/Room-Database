package com.example.roomdatabaseexample;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface Dao_Contacts
{
    @Insert
    public void addContacts(Entity_Contacts entityContacts);

    @Query("select * from contacts")
    public List<Entity_Contacts> readContacts();

    @Delete
    public void deleteContacts(Entity_Contacts entityContacts);

    @Update
    public void updateContacts(Entity_Contacts entityContacts);
}
