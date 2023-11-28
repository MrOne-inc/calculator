package mrone.calculator.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    Button buttonAdd, buttonMinus, buttonMultiply, buttonDivision;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        setContentView(R.layout.activity_dashboard);
//
//        //all edittexts
        editText1 = (EditText) findViewById(R.id.Fnumber);
        editText2 = (EditText) findViewById(R.id.Snumber);

        //all buttons->add,minus,
        buttonAdd = findViewById(R.id.bAdd);
        buttonMinus = findViewById(R.id.bMinus);
        buttonMultiply = findViewById(R.id.bMultiply);
        buttonDivision = findViewById(R.id.bDivision);

        //our textview
        textView = findViewById(R.id.viewResult);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String number1Str = editText1.getText().toString();
                String number2Str = editText2.getText().toString();

                if (!number1Str.isEmpty() && !number2Str.isEmpty()) {
                    int number1 = Integer.parseInt(number1Str);
                    int number2 = Integer.parseInt(number2Str);

                    int sum = number1 + number2;

                    //show result for addition
                    textView.setText("Result: " + sum);
                } else {
                    textView.setText("Please enter both numbers.");
                }
            }
        });

    }
}