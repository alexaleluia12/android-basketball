package com.example.android.basketballcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int mpointsTeamA = 0;
    int mpointsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plus1TeamB(View view) {
        mpointsTeamB += 1;
        displayTeamB(mpointsTeamB);
    }

    public void plus2TeamB(View view) {
        mpointsTeamB += 2;
        displayTeamB(mpointsTeamB);
    }

    public void plus3TeamB(View view) {
        mpointsTeamB += 3;
        displayTeamB(mpointsTeamB);
    }

    public void plus1TeamA(View view) {
        mpointsTeamA += 1;
        displayTeamA(mpointsTeamA);
    }

    public void plus2TeamA(View view) {
        mpointsTeamA += 2;
        displayTeamA(mpointsTeamA);
    }

    public void plus3TeamA(View view) {
        mpointsTeamA += 3;
        displayTeamA(mpointsTeamA);
    }

    public void clear(View view) {
        mpointsTeamA = 0;
        mpointsTeamB = 0;
        displayTeamA(mpointsTeamA);
        displayTeamB(mpointsTeamB);
    }

    private void displayTeamA(int points) {
        TextView counterTeamA = findViewById(R.id.points_team_a);
        counterTeamA.setText(String.valueOf(points));
    }

    private void displayTeamB(int points) {
        TextView counterTeamB = findViewById(R.id.points_team_b);
        counterTeamB.setText(String.valueOf(points));
    }

}
