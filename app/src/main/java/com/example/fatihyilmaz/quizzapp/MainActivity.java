package com.example.fatihyilmaz.quizzapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    public int testResult = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitMethod(View view) {
        RadioButton rb1 = findViewById(R.id.Q1_4);
        RadioButton rb2 = findViewById(R.id.Q2_A);
        RadioButton rb3 = findViewById(R.id.Q3_yes);
        RadioButton rb4 = findViewById(R.id.Q4_takingFunQuiz);
        RadioButton rb5 = findViewById(R.id.Q5_yes);

        CheckBox cb6a = findViewById(R.id.Q6_eat);
        CheckBox cb6b = findViewById(R.id.Q6_pray);
        CheckBox cb6c = findViewById(R.id.Q6_love);

        CheckBox cb7a = findViewById(R.id.Q7_fructose);
        CheckBox cb7b = findViewById(R.id.Q7_galactose);
        CheckBox cb7c = findViewById(R.id.Q7_maltose);
        CheckBox cb7d = findViewById(R.id.Q7_surcrose);

        EditText et8 = findViewById(R.id.Q8_name);
        EditText et9 = findViewById(R.id.Q9_age);

        if (rb1.isChecked()) {
            testResult += 5;
        }

        if (rb2.isChecked()) {
            testResult += 5;
        }

        if (rb3.isChecked()) {
            testResult += 5;
        }
        if (rb4.isChecked()) {
            testResult += 5;
        }

        if (rb5.isChecked()) {
            testResult += 5;
        }

        if (cb6a.isChecked()) {
            testResult += 5;
        }

        if (cb6b.isChecked()) {
            testResult += 5;
        }
        if (cb6c.isChecked()) {
            testResult += 5;
        }
        if (cb7a.isChecked()) {
            testResult += 5;
        }
        if (cb7b.isChecked()) {
            testResult += 5;
        }
        if (cb7c.isChecked()) {
            testResult += 5;
        }
        if (cb7d.isChecked()) {
            testResult += 5;
        }

        if (!Objects.equals(et8.getText().toString(), "")) {
            testResult += 5;
        }
        if (!Objects.equals(et9.getText().toString(), "")) {
            testResult += 5;
        }

        Toast.makeText(this, "Your final result is: " + testResult,
                Toast.LENGTH_LONG).show();
        testResult = 0;
    }
}
