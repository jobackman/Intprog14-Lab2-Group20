package se.kth.csc.iprog.dinnerplanner.android.view;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashSet;
import java.util.Set;

import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import se.kth.csc.iprog.dinnerplanner.model.Dish;

/**
 * Created by Johan on 2014-02-06.
 */
public class MainCourse {

    DinnerModel dynamicStarters = new DinnerModel();
    View view;

    String imgFileName;

    Set<Dish> mainCourses = new HashSet<Dish>();
    public TextView imgName;
    public ImageView image;

    public MainCourse(View view){

        this.view = view;

        //Hämta alla main courses
        mainCourses = dynamicStarters.getDishesOfType(2);
        imgName = (TextView) view.findViewById(R.id.mainCourseImgName);



        for(Dish s: mainCourses){
            //Sätt namnet på maten under
            imgName.setText(s.getName());
            //Hämta bildens filnamn
            imgFileName = s.getImage();
        }

        if (imgFileName.indexOf(".") > 0){
            //Ta bort .jpg
            imgFileName = imgFileName.substring(0, imgFileName.lastIndexOf("."));
        }



        /** THIS IS HOW WE DO WHEN WE DO THE IMAGE DONE!**/
        image = (ImageView) view.findViewById(R.id.mainCourseImg);
        int resID = view.getResources().getIdentifier(imgFileName , "drawable", ((Activity)view.getContext()).getPackageName());

        image.setImageResource(resID);



    }
}
