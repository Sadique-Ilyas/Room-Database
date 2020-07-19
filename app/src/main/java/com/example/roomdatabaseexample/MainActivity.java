package com.example.roomdatabaseexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static Database_Contacts database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        database = Room.databaseBuilder(this,Database_Contacts.class,"contactsDB").allowMainThreadQueries().build();
    }

    public void addContact(View view)
    {
        startActivity(new Intent(this,AddContactsActivity.class));
        class AddContactsAsyncTask extends AsyncTask<Entity_Contacts, Void, Void>
        {

            @Override
            protected Void doInBackground(Entity_Contacts... entity_contacts) {
                return null;
            }
        }
    }

    public void readContact(View view)
    {
        startActivity(new Intent(this,ReadContactsActivity.class));
    }

    public void editContact(View view)
    {
        startActivity(new Intent(this,UpdateContactsActivity.class));
    }

    public void deleteContact(View view)
    {
        startActivity(new Intent(this,DeleteContactsActivity.class));
    }
}
