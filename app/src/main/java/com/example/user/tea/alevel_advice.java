package com.example.user.tea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class alevel_advice extends AppCompatActivity {
    Button advice_button;
    Button search_button;
    Button timer_button;
    Button todo_button;
    Button homeButton;
    Button to_advicebtn;
//declaring the variable names for the buttons so that they can be used to link the activity to the other activities)


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alevel_advice);
        advice_button=(Button)findViewById(R.id.advice_button);
        //finds the button within the activity’s layout and assigns the variable name to it.
        advice_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(alevel_advice.this, advice.class);
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
                Intent i=new Intent(alevel_advice.this, Search.class);
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
                Intent i=new Intent(alevel_advice.this, pomodoro.class);
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
                Intent i=new Intent(alevel_advice.this, todo.class);
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
                Intent i=new Intent(alevel_advice.this, homepage.class);
                startActivity(i);
                //The first line - when the button is clicked the following code will run.
                //An Intent is used to connect the activities together and allows the application to display the activity that the button is connected to.

            }
        });
        ImageButton to_advicebtn=(ImageButton)findViewById(R.id.to_advicebtn);
        //finds the image button within the activity’s layout and assigns the variable name to it.
        to_advicebtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent i=new Intent(alevel_advice.this, advice.class);
                startActivity(i);
                //The first line - when the button is clicked the following code will run.
                //An Intent is used to connect the activities together and allows the application to display the activity that the button is connected to.
            }
        });
    }
}
