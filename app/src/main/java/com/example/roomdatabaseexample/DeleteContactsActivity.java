package com.example.roomdatabaseexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DeleteContactsActivity extends AppCompatActivity {
    EditText deleteContactId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_contacts);

        deleteContactId = findViewById(R.id.delete_contact_id);
    }

    public void deleteID(View view)
    {
        int id = Integer.parseInt(deleteContactId.getText().toString());
        Entity_Contacts entityContacts = new Entity_Contacts();
        entityContacts.setId(id);
        MainActivity.database.daoContacts().deleteContacts(entityContacts);

        Toast.makeText(this,"Contact Deleted Successfully !!!",Toast.LENGTH_SHORT).show();
        finish();
    }
}
