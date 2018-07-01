package com.example.echomax.myquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // this method checks for the right answers and store in a count variable

    public int submit(View view) {


        EditText answerQuestion1 = findViewById(R.id.answerQuestion1_edit_text);
        String imputAnswer1 = answerQuestion1.getText().toString();


        EditText answerQuestion2 = findViewById(R.id.answerQuestion2_edit_text);
        String imputAnswer2 = answerQuestion2.getText().toString();


        EditText answerQuestion3 = findViewById(R.id.answerQuestion3_edit_text);
        String imputAnswer3 = answerQuestion3.getText().toString();

        EditText answerQuestion4 = findViewById(R.id.answerQuestion4_edit_text);
        String imputAnswer4 = answerQuestion4.getText().toString();


        //sets the RadioButton in RadioGroup5 which should be  checked for a right answer

        RadioButton radioButton5D = findViewById(R.id.radioButton5D);
        Boolean answer_Question5 = radioButton5D.isChecked();

        //sets the RadioButton in RadioGroup6 which should be  checked for a right answer

        RadioButton radioButton6C = findViewById(R.id.radioButton6C);
        Boolean answer_Question6 = radioButton6C.isChecked();


        //sets the CheckBox in Question 7 which should be  checked for a right answer

        CheckBox checkBox7A = findViewById(R.id.CheckBox7A);
        Boolean answer1_Question7 = checkBox7A.isChecked();

        //sets the CheckBox in Question 7 which should be  checked for a right answer

        CheckBox checkBox7B = findViewById(R.id.CheckBox7B);
        Boolean answer2_Question7 = checkBox7B.isChecked();


        //sets the RadioButton in RadioGroup8 which should be  checked for a right answer

        RadioButton radioButton8B = findViewById(R.id.radioButton8B);
        Boolean answer_Question8 = radioButton8B.isChecked();


        //sets the CheckBox in Question 9 which should be  checked for a right answer

        CheckBox checkBox9C = findViewById(R.id.CheckBox9C);
        Boolean answer1_Question9 = checkBox9C.isChecked();

        //sets the CheckBox in Question 9 which should be  checked for a right answer

        CheckBox checkBox9D = findViewById(R.id.CheckBox9D);
        Boolean answer2_Question9 = checkBox9D.isChecked();

        //sets the RadioButton in RadioGroup10 which should be  checked for a right answer

        RadioButton radioButton10B = findViewById(R.id.radioButton10B);
        Boolean answer_Question10 = radioButton10B.isChecked();

        int questionCount = 0;
        int questionTwoCount = 0;
        int questionThreeCount = 0;
        int questionFourCount = 0;
        int questionFiveCount = 0;
        int questionSixCount = 0;
        int questionSevenCount = 0;
        int questionEightCount = 0;
        int questionNineCount = 0;
        int questionTenCount = 0;


        private int  gradingResultOne(String imputAnsw){
            if (imputAnswer1 == "Localisation") {

                questionOneCount = 1;

            } else return questionOneCount;
        }

        int gradingResultTwo(){
            if ((imputAnswer2 == "Activity") || (imputAnswer2 == "Application")) {

                questionTwoCount = 1;
            } else
                return questionTwoCount;
        }
        int gradingResultThree(){
            if (imputAnswer3 == "Universal Resource Identifier") {

                questionThreeCount = 1;
            } else
                return questionThreeCount;
        }

        int gradingResultFour() {
            if (imputAnswer4 == "Constant") {

                questionFourCount = 1;;
            } else
                return questionFourCount;
        }
        int gradingResultFive() {
            if (answer_Question5 == radioButton5D.isChecked()) {

                questionFiveCount = 1;;

            } else
                return questionFiveCount;
        }

        int gradingResultSix() {
            if (answer_Question6 == radioButton6C.isChecked()) {

                questionSixCount = 1;;

            } else
                return questionSixCount;
        }
        int gradingResultSeven() {
            if ((answer1_Question7 == checkBox7A.isChecked()) && (answer2_Question7 == checkBox7B.isChecked())) {

                questionSevenCount = 1;;

            } else
                return questionSevencount;
        }

        int gradingResultEignt() {
            if (answer_Question8 == radioButton8B.isChecked()) {

                questionEightCount = 1;;

            } else
                return questionEightCount;
        }
        int gradingResultNine() {
            if ((answer1_Question9 == checkBox9C.isChecked()) && (answer2_Question9 == checkBox9D.isChecked())) {

                questionNineCount = 1;;

            } else
                return questionNineCount;
        }
        int gradingResultTen() {
            if (answer_Question10 == radioButton10B.isChecked()) {

                questionTenCount = 1;;

            } else
                 return questionTenCount;
        }





//This method displays the user quiz summary message on a new screen

    public void quizSummary(View view){

        String message = "";
        if (count < 5) {
            // creating a toast message for the score Summary

            message = "You can try more, your score is:" + count;
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        }
        if (count == 5) {
            message = "You have an average score, your score is:" + count;
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        }
        if ((count > 5) && (count < 8)) {
            message = "you score is great, your score is:" + count;
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

        } else
            message = "awesome work !, your score is:" + count;
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}
// creating a toast message for the score Summary





