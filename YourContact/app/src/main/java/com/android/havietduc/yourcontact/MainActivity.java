package com.android.havietduc.yourcontact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TabHost;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText txtName, txtPhone, txtEmail, txtAddress;
    private Button btnAdd;


    private ContactAdapter adapter;
    private List<Contact> list;
    private ListView lstView;
    private int id = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();

    }

    private void addEvents() {
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addContactProcess();
            }
        });
    }

    private void addContactProcess() {

           Contact contact = new Contact();
           contact.setId(id++);
           contact.setFname(txtName.getText().toString());
           contact.setPhone(txtPhone.getText().toString());
           contact.setEmail(txtEmail.getText().toString());
           contact.setAddr(txtAddress.getText().toString());

           list.add(contact);
           adapter.notifyDataSetChanged();


    }

    private void addControls() {
        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();

        //tab 1
        TabHost.TabSpec tab1  = tabHost.newTabSpec("Tab1");
        tab1.setIndicator("Contacts");
        tab1.setContent(R.id.tab1);
        tabHost.addTab(tab1);

        //tab 1
        TabHost.TabSpec tab2  = tabHost.newTabSpec("Tab2");
        tab2.setIndicator("New Contact");
        tab2.setContent(R.id.tab2);
        tabHost.addTab(tab2);

        //Init controls
        txtName = (EditText) findViewById(R.id.txtName);
        txtPhone = (EditText) findViewById(R.id.txtPhone);
        txtEmail = (EditText) findViewById(R.id.txtEmail);
        txtAddress = (EditText) findViewById(R.id.txtAddress);
        lstView = (ListView) findViewById(R.id.listView);
        btnAdd = (Button) findViewById(R.id.btnAddContact);

        //init data to ListView
        loadDatatoListView();

    }

    private void loadDatatoListView() {
        list = new ArrayList<>();
        adapter = new ContactAdapter(
                MainActivity.this,
                R.layout.contact_tem,
                list
        );
        lstView.setAdapter(adapter);
    }
}
