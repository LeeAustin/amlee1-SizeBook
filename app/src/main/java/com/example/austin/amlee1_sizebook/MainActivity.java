package com.example.austin.amlee1_sizebook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.amlee1-SizeBook.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user clicks the Add button */

    public void toAdd(View view) {
        Intent intent = new Intent(this, AddActivity.class);
        startActivity(intent);
    }


    /** Called when the user clicks the Send button */
    /*
    public void sendMessage(View view) {
        Intent intent = new Intent(this, AddActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    */
}

