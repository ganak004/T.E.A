package com.example.user.tea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class advice extends AppCompatActivity {

    Button advice_button;
    Button search_button;
    Button timer_button;
    Button todo_button;
    Button homeButton;
    Button gcse_button;
    Button alevel_button;
//declaring the variable names for the buttons so that they can be used to link the activity to the other activities)



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advice);
        advice_button=(Button)findViewById(R.id.advice_button);
        //finds the button within the activity’s layout and assigns the variable name to it.
        advice_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(advice.this, advice.class);
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
                Intent i=new Intent(advice.this, Search.class);
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
                Intent i=new Intent(advice.this, pomodoro.class);
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
                Intent i=new Intent(advice.this, todo.class);
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
                Intent i=new Intent(advice.this, homepage.class);
                startActivity(i);
                //The first line - when the button is clicked the following code will run.
                //An Intent is used to connect the activities together and allows the application to display the activity that the button is connected to.

            }
        });
        gcse_button=(Button)findViewById(R.id.gcse_button);
        //finds the button within the activity’s layout and assigns the variable name to it.
        gcse_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(advice.this, gcse_advice.class);
                startActivity(i);
                //The first line - when the button is clicked the following code will run.
                //An Intent is used to connect the activities together and allows the application to display the activity that the button is connected to.
            }
        });
        alevel_button=(Button)findViewById(R.id.alevel_button);
        //finds the button within the activity’s layout and assigns the variable name to it.
        alevel_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(advice.this, alevel_advice.class);
                startActivity(i);
                //The first line - when the button is clicked the following code will run.
                //An Intent is used to connect the activities together and allows the application to display the activity that the button is connected to.

            }
        });
    }
}
