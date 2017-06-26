package com.example.ayush.menupractiseapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem computer_item = menu.add(0,100,1,"Computer");
        MenuItem gamePad_item = menu.add(0,101,2,"Game Pad");
        MenuItem camera_item = menu.add(0,102,3,"Camera");
        MenuItem video_item = menu.add(0,103,4,"Video");
        MenuItem email_item = menu.add(0,104,5,"Email");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case 100:
                Toast.makeText(getApplicationContext(), "Computer", Toast.LENGTH_SHORT).show();
                return true;
            case 101:
                Toast.makeText(getApplicationContext(), "Game Pad", Toast.LENGTH_SHORT).show();
                return true;
            case 102:
                Toast.makeText(getApplicationContext(), "Camera", Toast.LENGTH_SHORT).show();
                return true;
            case 103:
                Toast.makeText(getApplicationContext(), "Video", Toast.LENGTH_SHORT).show();
                return true;
            case 104:
                Toast.makeText(getApplicationContext(), "Email", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
