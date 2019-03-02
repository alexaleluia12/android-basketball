package com.example.android.basketballcount;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

class TeamScore implements View.OnClickListener {

    private TextView target = null;
    private int score = 0;
    private int score3ID = -1;
    private int score2ID = -1;
    private int score1ID = -1;

    TeamScore(int score, TextView target) {
        this.score = score;
        this.target = target;

    }

    private void increase3() {
        score += 3;
    }

    private void increase2() {
        score += 2;
    }

    private void increase1() {
        score += 1;
    }

    private void updateTarget() {
        target.setText(String.valueOf(score));
    }

    public void clearAndDisplay() {
        score = 0;
        updateTarget();
    }

    public void setPlus3Button(Button button) {
        score3ID = button.getId();
        button.setOnClickListener(this);
    }

    public void setPlus2Button(Button button) {
        score2ID = button.getId();
        button.setOnClickListener(this);
    }

    public void setPlus1Button(Button button) {
        score1ID = button.getId();
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int currentID = view.getId();
        if (currentID == score3ID) {
            increase3();
        } else if (currentID == score2ID) {
            increase2();
        } else if (currentID == score1ID) {
            increase1();
        } else {
            throw new RuntimeException(String.format("ID for %d not found", currentID));
        }

        updateTarget();
    }
}