package com.ets.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int goalGirlsScore = 0;
    int goalBoysScore = 0;
    int foulGirlsScore = 0;
    int foulBoysScore = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addOneForGirls(View v) {
        goalGirlsScore = goalGirlsScore + 1;
        displayForGirls(goalGirlsScore);
    }

    public void addOneForBoys(View v) {
        goalBoysScore = goalBoysScore + 1;
        displayForBoys(goalBoysScore);
    }

    public void addOneForGirlss(View v) {
        foulGirlsScore = foulGirlsScore + 1;
        displayForGirlss(foulGirlsScore);
    }

    public void addOneForBoyss(View v) {
        foulBoysScore = foulBoysScore + 1;
        displayForBoyss(foulBoysScore);
    }

    public void resetAll(View v) {
        goalGirlsScore = 0;
        goalBoysScore = 0;
        foulGirlsScore = 0;
        foulBoysScore = 0;
        displayForGirls(goalGirlsScore);
        displayForBoys(goalBoysScore);
        displayForGirlss(foulGirlsScore);
        displayForBoyss(foulBoysScore);
    }

    public void displayForGirls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goal_girls_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForBoys(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goal_boys_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForGirlss(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foul_girls_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForBoyss(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foul_boys_score);
        scoreView.setText(String.valueOf(score));
    }
}

