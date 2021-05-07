package sg.edu.rp.c346.id19023702.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    RadioButton rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button display = (Button) findViewById(R.id.button);
        RadioGroup rgGender = (RadioGroup) findViewById((R.id.radioGroupGender)) ;
        EditText etInput = (EditText) findViewById(R.id.editTextInput) ;
        TextView tvDisplay = (TextView) findViewById(R.id.textViewDisplay) ;
        ToggleButton tbtn = (ToggleButton) findViewById(R.id.toggleButtonEnabled);

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String stringResponse = etInput.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioButtonMale){
                    // Write the code when male selected
                    tvDisplay.setText("He says " + stringResponse);

                }
                else{
                    // Write the code when female selected
                    tvDisplay.setText("She says " + stringResponse);
                }
                display.setText("Display");
            }
        });

    }
}