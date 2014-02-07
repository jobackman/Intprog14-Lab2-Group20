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

/**
 * Created by Johan on 2014-02-06.
 */
public class Desert {

    DinnerModel dynamicDeserts = new DinnerModel();
    View view;

    String imgFileName;

    Set<Dish> deserts = new HashSet<Dish>();
    public TextView imgName;
    public ImageView image;

    public Desert(View view){

        this.view = view;

        //Hamta alla starters
        deserts = dynamicDeserts.getDishesOfType(3);
        imgName = (TextView) view.findViewById(R.id.desertImgName);
        if (deserts.isEmpty()){
            imgFileName = "icecream.jpg";
            imgName.setText("Ice cream");
        }

        else {
            for(Dish s: deserts){
                //Satt namnet på maten under
                imgName.setText(s.getName());
                //Hamta bildens filnamn
                /*imgFileName = s.getImage(); CHANGE BACK LATER!!!!!!!!!!*/
                imgFileName = "toast.jpg";
            }

        }

        if (imgFileName.indexOf(".") > 0){
            //Ta bort .jpg
            imgFileName = imgFileName.substring(0, imgFileName.lastIndexOf("."));
        }



        /** THIS IS HOW WE DO WHEN WE DO THE IMAGE DONE!**/
        image = (ImageView) view.findViewById(R.id.desertImg);
        int resID = view.getResources().getIdentifier(imgFileName , "drawable", ((Activity)view.getContext()).getPackageName());

        image.setImageResource(resID);



    }
}
