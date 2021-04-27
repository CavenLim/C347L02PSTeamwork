package sg.edu.rp.c346.id19020620.c347l02psteamwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class InfoMainScreen extends AppCompatActivity {

    //---------------------Initial Setting--------------
    Button btnRP, btnEmail,btnAdd;
    int requestCodeForC347 = 1;
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
        module.add(new Module("c347", 1, "B"));
        module.add(new Module("c347", 2, "C"));
        module.add(new Module("c347", 3, "A"));

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

        btnAdd = (Button) this.findViewById(R.id.buttonAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InfoMainScreen.this,addData.class);

                intent.putExtra("arrayCount",module.size()+1);

                startActivityForResult(intent,requestCodeForC347);
            }
        });




    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Only handle when 2nd activity closed normally
        //  and data contains something
        if(resultCode == RESULT_OK){
            if (data != null) {
                // Get data passed back from 2nd activity
                String grade = data.getStringExtra("grade");

                // If it is activity started by clicking 				//  Superman, create corresponding String
                if(requestCode == requestCodeForC347){
                    module.add(new Module("c347",module.size()+1,grade));
                    aa.notifyDataSetChanged();
                }
                // If 2nd activity started by clicking
                //  Batman, create a corresponding String



            }
        }
    }
}