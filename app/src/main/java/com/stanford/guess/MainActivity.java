package com.stanford.guess;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Random;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;




public class MainActivity extends AppCompatActivity {

    int secret = new Random().nextInt(10)+1;
    private TextView number ;
    private EditText guess;

    int counter;
    private TextView counter1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        number = findViewById(R.id.result);
        guess = findViewById(R.id.gg);
        counter1 = findViewById(R.id.frequency);
        counter1.setText(counter + "");

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

public  void button(View view){
    int count =Integer.parseInt(guess.getText().toString());
    counter++;
    counter1.setText(counter+"");
    if(count > secret) {
      new AlertDialog.Builder(MainActivity.this)
              .setTitle("hahaha")
              .setMessage("Smaller")
              .setPositiveButton("OK",null)
              .show();

    }
    else if ( count < secret){
       new AlertDialog.Builder(MainActivity.this)
               .setTitle("hahaha")
               .setMessage("Bigger")
               .setPositiveButton("OK",null)
               .show();

    }
    else if ( count == secret){
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("hahaha")
                .setMessage("Bingo")
                .setPositiveButton("OK",null)
                .show();
}
}

        @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
