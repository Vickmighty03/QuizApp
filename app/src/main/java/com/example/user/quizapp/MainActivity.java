package com.example.user.quizapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    String answerString = "";
    String questionOneUserSelection, questionTwoUserSelection, questionThreeUserSelection, questionFourUserSelection, questionFiveUserSelection, questionSixUserSelection;
    String questionOneAnswer = "Bogota";
    String questionTwoAnswer = "Ocean";
    String questionThreeAnswer = "Queen Elizabeth 11";
    String questionFourAnswer = "Europe";
    String questionFiveAnswer = "English and French";
    String questionSixAnswer = "Belgium,Luxermburg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        questionOneUserSelection = "";
        questionTwoUserSelection = "";
        questionThreeUserSelection = "";
        questionFourUserSelection = "";
        questionFiveUserSelection = "";

    }

    public void questionOneOptionClicked(View view) {
        if (view.getId() == R.id.radio_tehran) {
            questionOneUserSelection = ((RadioButton)view).getText().toString();
        }
        if (view.getId() == R.id.radio_city) {
            questionOneUserSelection = ((RadioButton)view).getText().toString();
        }
        if (view.getId() == R.id.radio_dongguan) {
            questionOneUserSelection = ((RadioButton)view).getText().toString();
        }
        if (view.getId() == R.id.radio_boggota) {
            questionOneUserSelection = ((RadioButton)view).getText().toString();
        }
    }

    public void questionTwoOptionClicked(View view) {
        if (view.getId() == R.id.radio_goats) {
            questionTwoUserSelection = ((RadioButton)view).getText().toString();
        }
        if (view.getId() == R.id.radio_rivers) {
            questionTwoUserSelection = ((RadioButton)view).getText().toString();
        }
        if (view.getId() == R.id.radio_oceans) {
            questionTwoUserSelection = ((RadioButton)view).getText().toString();
        }
        if (view.getId() == R.id.radio_trees) {
            questionTwoUserSelection = ((RadioButton)view).getText().toString();
        }
    }


    public void questionThreeOptionClicked(View view) {
        if (view.getId() == R.id.radio_tony) {
            questionThreeUserSelection = ((RadioButton)view).getText().toString();
        }
        if (view.getId() == R.id.radio_margaret) {
            questionThreeUserSelection = ((RadioButton)view).getText().toString();
        }
        if (view.getId() == R.id.radio_queen) {
            questionThreeUserSelection = ((RadioButton)view).getText().toString();
        }
        if (view.getId() == R.id.radio_king) {
            questionThreeUserSelection = ((RadioButton)view).getText().toString();
        }
    }


    public void questionFourOptionClicked(View view) {
        if (view.getId() == R.id.radio_south) {
            questionFourUserSelection = ((RadioButton)view).getText().toString();
        }
        if (view.getId() == R.id.radio_africa) {
            questionFourUserSelection = ((RadioButton)view).getText().toString();
        }
        if (view.getId() == R.id.radio_europe) {
            questionFourUserSelection = ((RadioButton)view).getText().toString();
        }
        if (view.getId() == R.id.radio_asia) {
            questionFourUserSelection = ((RadioButton)view).getText().toString();
        }
    }

    public void questionFiveOptionClicked(View view) {
        if (view.getId() == R.id.radio_english) {
            questionFiveUserSelection = ((RadioButton)view).getText().toString();
        }
        if (view.getId() == R.id.radio_portuguese) {
            questionFiveUserSelection = ((RadioButton)view).getText().toString();
        }
        if (view.getId() == R.id.radio_french) {
            questionFiveUserSelection = ((RadioButton)view).getText().toString();
        }
        if (view.getId() == R.id.radio_lnuit) {
            questionFiveUserSelection = ((RadioButton)view).getText().toString();
        }
    }



    void checkAnswers () {

        if (questionOneUserSelection.equals(questionOneAnswer)) {
            answerString += "Question one CORRECT \n";
        } else {
            answerString += "Question one FAILED \n";
        }

        if (questionTwoUserSelection.equals(questionTwoAnswer)) {
            answerString += "Question two CORRECT \n";
        } else {
            answerString += "Question two FAILED \n";
        }

        if (questionThreeUserSelection.equals(questionThreeAnswer)) {
            answerString += "Question three CORRECT \n";
        } else {
            answerString += "Question three FAILED \n";
        }

        if (questionFourUserSelection.equals(questionFourAnswer)) {
            answerString += "Question four CORRECT \n";
        } else {
            answerString += "Question four FAILED \n";
        }

        if (questionFiveUserSelection.equals(questionFiveAnswer)) {
            answerString += "Question five CORRECT \n";
        } else {
            answerString += "Question five FAILED \n";
        }

        if (questionSixUserSelection.equals(questionSixAnswer)) {
            answerString += "Question five CORRECT \n";
        } else {
            answerString += "Question five FAILED \n";
        }

    }


    public void submit(View view) {
        checkAnswers();
        new AlertDialog.Builder(this)
                .setTitle("Quiz Results")
                .setMessage(answerString)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        finish();
                        startActivity(new Intent(MainActivity.this, MainActivity.class));
                    }
                }).show();
    }

}
