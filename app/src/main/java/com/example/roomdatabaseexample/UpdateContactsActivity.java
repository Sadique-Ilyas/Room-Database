package com.example.roomdatabaseexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateContactsActivity extends AppCompatActivity {
    EditText Id, Name, ContactNumber, Email;
    int id;
    String name, contactNumber, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_contacts);

        Id = findViewById(R.id.update_contact_id);
        Name = findViewById(R.id.update_contact_name);
        ContactNumber = findViewById(R.id.update_contact_number);
        Email = findViewById(R.id.update_contact_email);
    }

    public void updateContact(View view)
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

        MainActivity.database.daoContacts().updateContacts(entityContacts);
        Toast.makeText(this,"Contact Updated Successfully !!!",Toast.LENGTH_SHORT).show();
        finish();
    }
}
