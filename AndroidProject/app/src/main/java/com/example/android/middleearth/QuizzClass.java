package com.example.android.middleearth;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * Created by ARN on 2/3/2018.
 */

public class QuizzClass extends AppCompatActivity {

    private int overallScore;
    private final int totalScore = 10;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quizz);
    }

    public void checkIfCorrect(View view) {
        if (((RadioButton) findViewById(R.id.q1_radio_answer_1)).isChecked()) {
            overallScore = overallScore + 1;

        }
        if (((RadioButton) findViewById(R.id.q2_radio_answer_3)).isChecked()) {
            overallScore = overallScore + 1;
        }
        if (((RadioButton) findViewById(R.id.q3_radio_answer_4)).isChecked()) {
            overallScore = overallScore + 1;
        }
        if (((RadioButton) findViewById(R.id.q4_radio_answer_4)).isChecked()) {
            overallScore = overallScore + 1;
        }
        if (((RadioButton) findViewById(R.id.q6_radio_answer_2)).isChecked()) {
            overallScore = overallScore + 1;
        }
        if (((RadioButton) findViewById(R.id.q7_radio_answer_3)).isChecked()) {
            overallScore = overallScore + 1;
        }
        if (((RadioButton) findViewById(R.id.q8_radio_answer_2)).isChecked()) {
            overallScore = overallScore + 1;
        }
        if (((RadioButton) findViewById(R.id.q9_radio_answer_1)).isChecked()) {
            overallScore = overallScore + 1;
        }
        if (((RadioButton) findViewById(R.id.q10_radio_answer_4)).isChecked()) {
            overallScore = overallScore + 1;
        }
        if (checkIfCorrectBox(view)) {
            overallScore = overallScore + 1;
        }
        toastMessage(makeMessage());
        overallScore =0;
    }



    private boolean checkIfCorrectBox(View view) {
        CheckBox box1 = (CheckBox) findViewById(R.id.q5_check_answer_1);
        CheckBox box2 = (CheckBox) findViewById(R.id.q5_check_answer_2);
        CheckBox box3 = (CheckBox) findViewById(R.id.q5_check_answer_3);
        CheckBox box4 = (CheckBox) findViewById(R.id.q5_check_answer_4);

        if (box1.isChecked() && box2.isChecked() && box4.isChecked() && !box3.isChecked()) {

            return true;
        }

        return false;
    }


    public void toastMessage(String message) {
        Toast toast = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG);
        toast.show();

    }

    private String makeMessage() {
        String message;
        if (overallScore == totalScore) {
            message = getString(R.string.winner);
        } else {
            message =  overallScore+" out of "+ totalScore +"." + getString(R.string.looser);
        }
        return message;
    }


}
