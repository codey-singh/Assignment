package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView candidateVotes1;
    TextView candidateVotes2;
    TextView candidateVotes3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        candidateVotes1 = findViewById(R.id.val_vote_can1);
        candidateVotes2 = findViewById(R.id.val_vote_can2);
        candidateVotes3 = findViewById(R.id.val_vote_can3);

        candidateVotes1.setText(""+ VoteCounter.getVotesForCandidate(1));
        candidateVotes2.setText(""+ VoteCounter.getVotesForCandidate(2));
        candidateVotes3.setText(""+ VoteCounter.getVotesForCandidate(3));
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        candidateVotes1.setText(""+ VoteCounter.getVotesForCandidate(1));
        candidateVotes2.setText(""+ VoteCounter.getVotesForCandidate(2));
        candidateVotes3.setText(""+ VoteCounter.getVotesForCandidate(3));
    }

    public void vote(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
