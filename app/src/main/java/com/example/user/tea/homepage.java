package com.example.user.tea;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homepage extends AppCompatActivity {

    Button advice_button;
    Button search_button;
    Button timer_button;
    Button todo_button;
//declaring the variable names for the buttons so that they can be used to link the activity to the other activities)



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        advice_button=(Button)findViewById(R.id.advice_button);
        //finds the button within the activity’s layout and assigns the variable name to it.
        advice_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(homepage.this, advice.class);
                startActivity(i);
        //The first line - when the button is clicked the following code will run.
        //An Intent is used to connect the activities together and allows the application to display the activity that the button is connected to.

            }
        });
        search_button=(Button)findViewById(R.id.search_button);
        //finds the button within the activity’s layout and assigns the variable name to it.
        search_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(homepage.this, Search.class);
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
                Intent i=new Intent(homepage.this, pomodoro.class);
                startActivity(i);
            }
            //The first line - when the button is clicked the following code will run.
            //An Intent is used to connect the activities together and allows the application to display the activity that the button is connected to.

        });
        todo_button=(Button)findViewById(R.id.todo_button);
        //finds the button within the activity’s layout and assigns the variable name to it.
        todo_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(homepage.this, todo.class);
                startActivity(i);
                //The first line - when the button is clicked the following code will run.
                //An Intent is used to connect the activities together and allows the application to display the activity that the button is connected to.

            }
        });


    }



}
