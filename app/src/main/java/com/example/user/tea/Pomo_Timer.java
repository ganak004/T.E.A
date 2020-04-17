package com.example.user.tea;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

@TargetApi(Build.VERSION_CODES.GINGERBREAD)
@SuppressLint("NewApi")

public class Pomo_Timer extends AppCompatActivity {
    Button advice_button;
    Button search_button;
    Button timer_button;
    Button todo_button;
    Button Startbutton;
    Button Stopbutton;
    TextView TimertextView;
//declaring the variable names for the buttons and textview so that they can be used to link the activity to the other activities)


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pomo__timer);
        advice_button=(Button)findViewById(R.id.advice_button);
        //finds the button within the activity’s layout and assigns the variable name to it.
        advice_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Pomo_Timer.this, advice.class);
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
                Intent i=new Intent(Pomo_Timer.this, Search.class);
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
                Intent i=new Intent(Pomo_Timer.this, pomodoro.class);
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
                Intent i=new Intent(Pomo_Timer.this, todo.class);
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
                Intent i=new Intent(Pomo_Timer.this, homepage.class);
                startActivity(i);
                //The first line - when the button is clicked the following code will run.
                //An Intent is used to connect the activities together and allows the application to display the activity that the button is connected to.

            }
        });
        Startbutton=(Button)findViewById(R.id.Startbutton);
        Stopbutton=(Button)findViewById(R.id.Stopbutton);
        //finds the buttons within the activity’s layout and assigns the variable name to it.
        TimertextView=(TextView) findViewById(R.id.TimertextView);
        //finds the textview within the activity’s layout and assigns the variable name to it.

        TimertextView.setText("00:25:00");
        //Displays 25minutes on the text view when teh activity starts up

        final CounterClass timer = new CounterClass(1500000, 1000);
        //The number of miliseconds in 25 minutes is assigned to the CounterClass class.
        Startbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TimertextView.setTextSize(55);
                timer.start();
                //When the start button is clicked, start the timer and teh size of the text is 55dp
            }

        });
        Stopbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timer.cancel();
                //When the stop button is clicked, stop the timer.
            }
        });

    }

    @TargetApi(Build.VERSION_CODES.GINGERBREAD)
    @SuppressLint("NewApi")
    public class CounterClass extends CountDownTimer {

        public CounterClass(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
            //Variables storing the number of millisecond the timer will run and the length of each tick.
        }

        @SuppressLint("NewApi")
        @TargetApi(Build.VERSION_CODES.GINGERBREAD)
        @Override
        public void onTick(long millisUntilFinished) {
            long millis = millisUntilFinished;
            String hms = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(millis),
                    TimeUnit.MILLISECONDS.toMinutes(millis) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)),
                    TimeUnit.MILLISECONDS.toSeconds(millis) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));
            //The code that should run when the timer ticks.
            System.out.println(hms);
            //Displays the timer in the text view.
            TimertextView.setText(hms);
            //Displays the timer in the text view.
        }

        @Override
        public void onFinish() {
            TimertextView.setTextSize(15);
            TimertextView.setText("Session completed! Remember to take a break!");
            //When timer is finished display this text in size 15
        }

    }
    @Override
    public void onStop(){
        super.onStop();
        finish();
        //if user exits app stop timer
    }
}
