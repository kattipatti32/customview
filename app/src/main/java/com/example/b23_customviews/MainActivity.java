package com.example.b23_customviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.b23_customviews.views.HeaderView;

public class MainActivity extends AppCompatActivity {

    private HeaderView hView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        hView = (HeaderView) findViewById(R.id.header_bar);

        hView.setTitle("Home screen");
        hView.setOnLoginListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Login clicked", Toast.LENGTH_LONG).show();
            }
        });
    }
}
