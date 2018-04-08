package kennedyraine.passwordgen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    Button btn;
    private RadioGroup passLengthGroup;
     private RadioButton radio8;
    private RadioButton radio16;
    private RadioButton radio32;
    private RadioButton radio64;

    double num8;
    double num16;
    double num32;
    double num64;
    int passwordLength;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final RandomGenerate generate = new RandomGenerate(passwordLength);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView) findViewById(R.id.TextView);
        btn = (Button) findViewById(R.id.randomBtn);

        passLengthGroup = (RadioGroup) findViewById(R.id.passLengthGroup);
        radio8 = (RadioButton) findViewById(R.id.radio8);
        radio16 = (RadioButton) findViewById(R.id.radio16);
        radio32 = (RadioButton) findViewById(R.id.radio32);
        radio64 = (RadioButton) findViewById(R.id.radio64);

        //Checkbox Values
        
        //Listener for RadioButtons
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int checkedBox = passLengthGroup.getCheckedRadioButtonId();

                switch(checkedBox){
                    case R.id.radio8:
                        if (radio8.isChecked()){
                            passwordLength = 8;
//                            String d = Double.toString(passwordLength);
//                            txt.setText(d);
                            generate.getLowerLetters(passwordLength/4);
                            generate.getNum(passwordLength/4);
                            generate.getSpecial(passwordLength/4);
                            generate.getUpperLetters(passwordLength/4);


                        }
                            break;
                    case R.id.radio16:
                        if (radio16.isChecked()) {
                            passwordLength = 16;
                            generate.getLowerLetters(passwordLength/4);
                            generate.getNum(passwordLength/4);
                            generate.getSpecial(passwordLength/4);
                            generate.getUpperLetters(passwordLength/4);
                        }
                        break;
                    case R.id.radio32:
                        if (radio32.isChecked()){
                            passwordLength = 32;
                            generate.getLowerLetters(passwordLength/4);
                            generate.getNum(passwordLength/4);
                            generate.getSpecial(passwordLength/4);
                            generate.getUpperLetters(passwordLength/4);
                        }
                        break;
                    case R.id.radio64:
                        if (radio64.isChecked()){
                            passwordLength = 64;
                            generate.getLowerLetters(passwordLength/4);
                            generate.getNum(passwordLength/4);
                            generate.getSpecial(passwordLength/4);
                            generate.getUpperLetters(passwordLength/4);
                        }
                        break;

                }

            }
        });


    }
//    EditText e = (EditText) findViewById(R.id.editText);
//    e.("New Text");
}