package sg.edu.rp.c346.id19020620.c347l02psteamwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class InfoMainScreen extends AppCompatActivity {

    //---------------------Initial Setting--------------
    Button btnRP, btnEmail;

    ListView lv;
    CustomAdapter aa;
    ArrayList<Module> module;
    //---------------------Initial Setting--------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_main_screen);


        //---------------------List View Implementation--------------
        lv = findViewById(R.id.lvShow);

        //Create Food item/object in Food array
        module = new ArrayList<>();
        module.add(new Module( 1, "B"));
        module.add(new Module( 2, "C"));
        module.add(new Module(3, "A"));

        //Link this Activity object, the row.xml layout for each
        //row and the food String array together
        aa = new CustomAdapter(this, R.layout.row, module);
        lv.setAdapter(aa);
        //---------------------List View Implementation--------------


        //---------------------Website Button--------------
        btnRP = findViewById(R.id.buttonInfo);
        btnRP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // Intent to display data
                Intent rpIntent = new Intent(Intent.ACTION_VIEW);
                // Set the URL to be used.
                rpIntent.setData(Uri.parse("http://www.rp.edu.sg"));
                startActivity(rpIntent);
            }
        });
        //---------------------Website Button--------------




    }
}