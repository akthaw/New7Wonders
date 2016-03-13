package com.example.android.new7wonders.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

import com.example.android.new7wonders.R;

public class EventListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_event_list, menu);
        return true;
    }

}
