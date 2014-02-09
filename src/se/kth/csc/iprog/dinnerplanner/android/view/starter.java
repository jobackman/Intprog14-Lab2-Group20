package se.kth.csc.iprog.dinnerplanner.android.view;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.HashSet;
import java.util.Set;
import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import se.kth.csc.iprog.dinnerplanner.model.Dish;


public class starter {

    DinnerModel dynamicStarters = new DinnerModel();
    View view;

    String imgFileName;

    Set<Dish> starters = new HashSet<Dish>();
    public TextView imgName;
    public ImageView image;

    public starter(View view){

        this.view = view;

        //Get all starters
        starters = dynamicStarters.getDishesOfType(1);
        imgName = (TextView) view.findViewById(R.id.starterImgName);



        for(Dish s: starters){  /** TODO: choose the correct image according to the image ID! **/
            //get the name
            imgName.setText(s.getName());
            //get the image
            imgFileName = s.getImage();
        }

        if (imgFileName.indexOf(".") > 0){
            //delete .jpg
            imgFileName = imgFileName.substring(0, imgFileName.lastIndexOf("."));
        }



        /** IMAGE AS DRAWABLE! **/
        image = (ImageView) view.findViewById(R.id.starterImg);
        int resID = view.getResources().getIdentifier(imgFileName , "drawable", ((Activity)view.getContext()).getPackageName());

        image.setImageResource(resID);



    }
}
