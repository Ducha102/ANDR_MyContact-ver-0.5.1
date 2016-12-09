package com.android.havietduc.yourcontact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        //addEvents();
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

    }
}
