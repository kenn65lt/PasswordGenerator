package kennedyraine.passwordgen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView) findViewById(R.id.TextView);
        btn = (Button) findViewById(R.id.randomBtn);

        final RandomGenerate generate = new RandomGenerate(15,10,15,30);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(generate.getSpecials());
            }
        });
    }
//    EditText e = (EditText) findViewById(R.id.editText);
//    e.("New Text");
}
dsdf