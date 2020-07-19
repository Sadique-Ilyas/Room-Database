package com.example.roomdatabaseexample;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddContactsActivity extends AppCompatActivity {
    EditText Id, Name, ContactNumber, Email;
    int id;
    String name, contactNumber, email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contacts);

        Id = findViewById(R.id.txt_contact_id);
        Name = findViewById(R.id.txt_contact_name);
        ContactNumber = findViewById(R.id.txt_contact_number);
        Email = findViewById(R.id.txt_contact_email);
    }

    public void saveContacts(View view)
    {
        id = Integer.parseInt(Id.getText().toString());
        name = Name.getText().toString();
        contactNumber = ContactNumber.getText().toString();
        email = Email.getText().toString();

        Entity_Contacts entityContacts = new Entity_Contacts();
        entityContacts.setId(id);
        entityContacts.setName(name);
        entityContacts.setNumber(contactNumber);
        entityContacts.setEmail(email);

        MainActivity.database.daoContacts().addContacts(entityContacts);
        Toast.makeText(this,"Contact Added Successfully !!!",Toast.LENGTH_SHORT).show();
        finish();
    }
}
