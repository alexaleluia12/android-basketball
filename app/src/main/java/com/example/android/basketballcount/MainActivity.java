package com.example.android.basketballcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    private TeamScore teamA;
    private TeamScore teamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView targetTeamA = findViewById(R.id.points_team_a);
        TextView targetTeamB = findViewById(R.id.points_team_b);

        teamA = new TeamScore(0, targetTeamA);
        teamB = new TeamScore(0, targetTeamB);

        // bind each button to team manager
        teamA.setPlus1Button((Button) findViewById(R.id.points_ft_team_a));
        teamA.setPlus2Button((Button) findViewById(R.id.points_2_team_a));
        teamA.setPlus3Button((Button) findViewById(R.id.points_3_team_a));

        teamB.setPlus1Button((Button) findViewById(R.id.points_ft_team_b));
        teamB.setPlus2Button((Button) findViewById(R.id.points_2_team_b));
        teamB.setPlus3Button((Button) findViewById(R.id.points_3_team_b));

        Button clear = findViewById(R.id.clear_btn);
        clear.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        teamA.clearAndDisplay();
        teamB.clearAndDisplay();
    }

}
