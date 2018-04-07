package kennedyraine.passwordgen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    Button btn;
    private RadioGroup passLengthGroup;
     private CheckBox checkBox8;
    private CheckBox checkBox16;
    private CheckBox checkBox32;
    private CheckBox checkBox64;

    double num8;
    double num16;
    double num32;
    double num64;
    private double passwordLength;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView) findViewById(R.id.TextView);
        btn = (Button) findViewById(R.id.randomBtn);

        passLengthGroup = (RadioGroup) findViewById(R.id.passLengthGroup);
        checkBox8 = (CheckBox) findViewById(R.id.checkBox8);
        checkBox16 = (CheckBox) findViewById(R.id.checkBox16);
        checkBox32 = (CheckBox) findViewById(R.id.checkBox32);
        checkBox64 = (CheckBox) findViewById(R.id.checkBox64);

        //Checkbox Values

        final RandomGenerate generate = new RandomGenerate(15,10,15,30);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(generate.getSpecials());
            }
        });


        passLengthGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int checkedBox = passLengthGroup.getCheckedRadioButtonId();

                switch(checkedBox){
                    case R.id.checkBox8:
                        if (checkBox8.isChecked()){
                            passwordLength = 8;
                        }
                            break;
                    case R.id.checkBox16:
                        if (checkBox16.isChecked()) {
                            passwordLength = 16;
                        }
                        break;
                    case R.id.checkBox32:
                        if (checkBox32.isChecked()){
                            passwordLength = 32;
                        }
                        break;
                    case R.id.checkBox64:
                        if (checkBox64.isChecked()){
                            passwordLength = 64;
                        }
                        break;

                }

            }
        });


    }
//    EditText e = (EditText) findViewById(R.id.editText);
//    e.("New Text");
}