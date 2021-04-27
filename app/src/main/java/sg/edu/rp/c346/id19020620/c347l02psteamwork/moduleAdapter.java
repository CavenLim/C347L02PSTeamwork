package sg.edu.rp.c346.id19020620.c347l02psteamwork;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class moduleAdapter extends ArrayAdapter<Module> {
    private ArrayList<Module> module;
    private Context context;
    private TextView moduleWeek;
    private TextView moduleGrade;
    private TextView moduleDG;
    private ImageView moduleImage;


    public moduleAdapter(Context context, int resource, ArrayList<Module> objects){
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        module = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    // getView() is the method ListView will call to get the
    //  View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.rowmoduleinfo, parent, false);

        // Get the TextView object
        moduleWeek = (TextView) rowView.findViewById(R.id.textViewWeek);
        // Get the ImageView object
        moduleDG = (TextView) rowView.findViewById(R.id.textViewDG);
        moduleGrade = (TextView) rowView.findViewById(R.id.textViewGrade);
        moduleImage = (ImageView) rowView.findViewById(R.id.imageView);



        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Module currModule = module.get(position);
        String moduleNow = currModule.getModuleName();


        int weekNow = currModule.getModuleWeek();

        moduleWeek.setText("Week "+weekNow);
        moduleDG.setText("DG");


        String gradeNow = currModule.getModuleGrade();

        moduleGrade.setText(gradeNow);
        moduleImage.setImageResource(R.drawable.dg);


        // Return the nicely done up View to the ListView
        return rowView;
    }

}
