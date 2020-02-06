package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Main2Activity extends AppCompatActivity {
    ToggleButton toggle ;
    Button btn;
    Spinner spinner;
    EditText id_txt;
    EditText name_txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        toggle = findViewById(R.id.toggle_btn);
        btn = findViewById(R.id.vote_btn);
        spinner = findViewById(R.id.candidate);
        id_txt = findViewById(R.id.id_txt);
        name_txt = findViewById(R.id.name_txt);
        btn.setEnabled(false);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Log.d("LOL", "onCheckedChanged: hello");
                    btn.setEnabled(true);
                } else {
                    Log.d("LOL", "onCheckedChanged: hello1");
                    btn.setEnabled(false);
                }
            }
        });
    }


    public void addVote(View view) {
        if(spinner.getSelectedItemPosition() == 0) {
            Toast.makeText(getApplicationContext(), R.string.error_msg,Toast. LENGTH_SHORT).show();
        }
        else {


            if (spinner.getSelectedItemPosition() > 0 && !VoteCounter.checkIfRegistered(name_txt.getText().toString() + id_txt.getText().toString())) {
                VoteCounter.setVotesForCandidate(spinner.getSelectedItemPosition());
                Toast.makeText(getApplicationContext(), "Your vote for " + spinner.getSelectedItem().toString() + " is registered. ", Toast.LENGTH_SHORT).show();
            } else
                Toast.makeText(getApplicationContext(), R.string.choose_error_msg, Toast.LENGTH_SHORT).show();
        }
    }
}
