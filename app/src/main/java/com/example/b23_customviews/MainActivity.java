package com.example.b23_customviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.b23_customviews.views.HeaderView;

public class MainActivity extends AppCompatActivity {

    private HeaderView headerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        headerView = (HeaderView) findViewById(R.id.header_bar);

        headerView.setTitle("Home screen");
        headerView.setOnLoginListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Login clicked", Toast.LENGTH_LONG).show();
            }
        });
    }
}
