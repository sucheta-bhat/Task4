package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu,menu);
        return(true);


        //return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem menuitem){

        ConstraintLayout Cl= findViewById(R.id.Clayout);
        switch(menuitem.getItemId()){

            case R.id.red:
                Cl.setBackgroundColor(Color.RED);
                break;
            case R.id.green:
                Cl.setBackgroundColor(Color.GREEN);
                break;
            case R.id.blue:
                Cl.setBackgroundColor(Color.BLUE);
                break;
            case R.id.next:
                Intent i = new Intent(getApplicationContext(),nextActivity.class);
                startActivity(i);
                setContentView(R.layout.avtivity_next);


        }

        return(true);
    }
}
