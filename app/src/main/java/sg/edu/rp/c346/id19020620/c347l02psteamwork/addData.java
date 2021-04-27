package sg.edu.rp.c346.id19020620.c347l02psteamwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class addData extends AppCompatActivity {
    TextView tvWeek;
    RadioGroup rg;
    RadioButton a,b,c,d,f,x;
    ImageView iv;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_data);
        rg=(RadioGroup) this.findViewById(R.id.rg);
        a=(RadioButton) this.findViewById(R.id.radioButtonA);
        b=(RadioButton) this.findViewById(R.id.radioButtonB);
        c=(RadioButton) this.findViewById(R.id.radioButtonC);
        d=(RadioButton) this.findViewById(R.id.radioButtonD);
        f=(RadioButton) this.findViewById(R.id.radioButtonF);
        x=(RadioButton) this.findViewById(R.id.radioButtonX);
        iv = (ImageView) this.findViewById(R.id.imageView2);
        btn = (Button) this.findViewById(R.id.button);
        tvWeek = (TextView) this.findViewById(R.id.textView);

        Intent get = getIntent();
        int selectedType = get.getIntExtra("arrayCount", 0);

        tvWeek.setText(" Week "+selectedType);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();

                if (a.isChecked()) {

                    i.putExtra("grade", "A");
                    // Set result to RESULT_OK to indicate normal			// response and pass in the intent containing the 		// like
                    setResult(RESULT_OK, i);
                    finish();

                } else if (b.isChecked()) {
                    i.putExtra("grade", "B");
                    // Set result to RESULT_OK to indicate normal			// response and pass in the intent containing the 		// like
                    setResult(RESULT_OK, i);
                    finish();
                } else if (c.isChecked()) {
                    i.putExtra("grade", "C");
                    // Set result to RESULT_OK to indicate normal			// response and pass in the intent containing the 		// like
                    setResult(RESULT_OK, i);
                    finish();
                } else if (d.isChecked()) {
                    i.putExtra("grade", "D");
                    // Set result to RESULT_OK to indicate normal			// response and pass in the intent containing the 		// like
                    setResult(RESULT_OK, i);
                    finish();
                } else if (f.isChecked()) {
                    i.putExtra("grade", "D");
                    // Set result to RESULT_OK to indicate normal			// response and pass in the intent containing the 		// like
                    setResult(RESULT_OK, i);
                    finish();
                }
                else if (x.isChecked()) {
                    i.putExtra("grade", "X");
                    // Set result to RESULT_OK to indicate normal			// response and pass in the intent containing the 		// like
                    setResult(RESULT_OK, i);
                    finish();
                }

            }
        });





    }
}