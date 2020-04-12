package com.studiomasteguh.androiddeveloperfundamental2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private final LinkedList<String> list = new LinkedList<>();
    private RecyclerView rc;
    private WordAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // add data for loop
        for (int i= 0; i < 20; i++){
            list.addLast("Word" + i);
        }

        // add recyclerview
        rc = findViewById(R.id.rc_word);
        // init a adapter from word adapter
        mAdapter = new WordAdapter(this , list);
        // set adapter
        rc.setAdapter(mAdapter);
        // set layut manager
        rc.setLayoutManager(new LinearLayoutManager(this));
    }
}
