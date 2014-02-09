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


public class Desert {

    DinnerModel dynamicDeserts = new DinnerModel();
    View view;

    String imgFileName;

    Set<Dish> deserts = new HashSet<Dish>();
    public TextView imgName;
    public ImageView image;

    public Desert(View view){

        this.view = view;

        //get all deserts
        deserts = dynamicDeserts.getDishesOfType(3); //This will be empty for now...
        imgName = (TextView) view.findViewById(R.id.desertImgName);
        if (deserts.isEmpty()){
            imgFileName = "icecream.jpg";
            imgName.setText("Ice cream");
        }

        else {  /** TODO: choose the correct image according to the image ID! **/
            for(Dish s: deserts){
                //get the name
                imgName.setText(s.getName());
                //get the image
                /*imgFileName = s.getImage(); CHANGE BACK LATER!!!!!!!!!!*/
                imgFileName = "toast.jpg";
            }

        }

        if (imgFileName.indexOf(".") > 0){
            //delete .jpg
            imgFileName = imgFileName.substring(0, imgFileName.lastIndexOf("."));
        }



        /** IMAGE AS DRAWABLE! **/
        image = (ImageView) view.findViewById(R.id.desertImg);
        int resID = view.getResources().getIdentifier(imgFileName , "drawable", ((Activity)view.getContext()).getPackageName());

        image.setImageResource(resID);



    }
}
