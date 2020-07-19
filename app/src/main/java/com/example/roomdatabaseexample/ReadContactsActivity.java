package com.example.roomdatabaseexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class ReadContactsActivity extends AppCompatActivity {
    private TextView contactsInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_contacts);

        contactsInfo = findViewById(R.id.txt_display);

        List<Entity_Contacts> entityContacts = MainActivity.database.daoContacts().readContacts();

        String info = "";

        for (Entity_Contacts contacts:entityContacts)
        {
            int id = contacts.getId();
            String name = contacts.getName();
            String number = contacts.getNumber();
            String email = contacts.getEmail();
            info = info + "\n\n"+"Id: "+id+"\nName: "+name+"\nPhone Number: "+number+"\nEmail: "+email;
        }

        contactsInfo.setText(info);
    }
}
