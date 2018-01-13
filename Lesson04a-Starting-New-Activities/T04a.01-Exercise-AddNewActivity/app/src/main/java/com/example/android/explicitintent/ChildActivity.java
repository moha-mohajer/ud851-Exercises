package com.example.android.explicitintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

// Do steps 6 & 7 in ChildActivity.java
// X TODO (6) Create a TextView field to display your message
// X TODO (7) Get a reference to your TextView in Java
public class ChildActivity extends AppCompatActivity {
    private TextView mChildActivityTextView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        mChildActivityTextView=(TextView) findViewById(R.id.tv_display);
    }
}
