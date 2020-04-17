package com.example.user.tea;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class todo extends AppCompatActivity {

    Button advice_button;
    Button search_button;
    Button timer_button;
    Button todo_button;
    Button homeButton;
//declaring the variable names for the buttons so that they can be used to link the activity to the other activities)

    private ArrayList<String> items;
//An array is created to read items from the file after activities are added by the user.
    private ArrayAdapter<String> itemsAdapter;
//An array used to view the items on the list view.
    private ListView lvItems;
//A variable that allows the items to display a scrollable list.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        advice_button=(Button)findViewById(R.id.advice_button);
        //finds the button within the activity’s layout and assigns the variable name to it.
        advice_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(todo.this, advice.class);
                startActivity(i);
            }
            //The first line - when the button is clicked the following code will run.
            //An Intent is used to connect the activities together and allows the application to display the activity that the button is connected to.
        });
        search_button=(Button)findViewById(R.id.search_button);
        //finds the button within the activity’s layout and assigns the variable name to it.
        search_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(todo.this, Search.class);
                startActivity(i);
                //The first line - when the button is clicked the following code will run.
                //An Intent is used to connect the activities together and allows the application to display the activity that the button is connected to.

            }
        });
        timer_button=(Button)findViewById(R.id.timer_button);
        //finds the button within the activity’s layout and assigns the variable name to it.
        timer_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(todo.this, pomodoro.class);
                startActivity(i);
                //The first line - when the button is clicked the following code will run.
                //An Intent is used to connect the activities together and allows the application to display the activity that the button is connected to.
            }
        });
        todo_button=(Button)findViewById(R.id.todo_button);
        //finds the button within the activity’s layout and assigns the variable name to it.
        todo_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(todo.this, todo.class);
                startActivity(i);
                //The first line - when the button is clicked the following code will run.
                //An Intent is used to connect the activities together and allows the application to display the activity that the button is connected to.
            }
        });
        ImageButton homeButton=(ImageButton)findViewById(R.id.homeButton);
        //finds the image button within the activity’s layout and assigns the variable name to it.
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(todo.this, homepage.class);
                startActivity(i);
                //The first line - when the button is clicked the following code will run.
                //An Intent is used to connect the activities together and allows the application to display the activity that the button is connected to.

            }
        });
        lvItems = (ListView) findViewById(R.id.lvItems);
        //finds the listview within the activity’s layout and assigns the variable name to it.
        readItems();
        //calls for the readItems class
        itemsAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, items);
        //Using a simple list layout, the items are displayed.
        lvItems.setAdapter(itemsAdapter);
        //This will adapt the object within the array to the display.
        setupListViewListener();
        //Calling the setupListViewListener class
    }


    private void setupListViewListener() {
        lvItems.setOnItemLongClickListener(
                //If a task on the list view is clicked for a long time…
                new AdapterView.OnItemLongClickListener() {
                    @Override
                    public boolean onItemLongClick(AdapterView<?> adapter,
                                                   View item, int pos, long id) {
                //Store the items position and id
                        items.remove(pos);
                        //Remove the position stored from the array called list
                        itemsAdapter.notifyDataSetChanged();
                        writeItems();
                        //Update the list view
                        return true;
                        //Return the Boolean true to indicate that the list has been edited
                    }

                });
    }

    public void onAddItem(View v) {
        EditText etNewItem = (EditText) findViewById(R.id.etNewItem);
        //The text within the EditText is assigned to the variable etNewItem
        String itemText = etNewItem.getText().toString();
        //Take the text from the edit text as a string and store it in itemText
        itemsAdapter.add(itemText);
        //Stores the text within the itemsAdapter
        etNewItem.setText("");
        //Empties the edit text
        writeItems();
        //Calls the function writeItems
    }

    private void readItems() {
        File filesDir = getFilesDir();
        File todoFile = new File(filesDir, "todo.txt");
        //Assign the to-do file to the variable todoFile.
        try {
            items = new ArrayList<String>(FileUtils.readLines(todoFile));
            //Reads each line of the to-do file into the listview.
        } catch (IOException e) {
            items = new ArrayList<String>();
            //If text file is empty then do not read any lines to the list view
        }
    }

    private void writeItems() {
        File filesDir = getFilesDir();
        File todoFile = new File(filesDir, "todo.txt");
        //Assign the to-do file to the variable todoFile.
        try {
            FileUtils.writeLines(todoFile, items);
        } catch (IOException e) {
            e.printStackTrace();
        //Write each item from the file into the list view until the file is empty
        }
    }
}
