package se.kth.csc.iprog.dinnerplanner.android.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.Set;
import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import se.kth.csc.iprog.dinnerplanner.model.Dish;

/**
 * Created by Johan on 2014-02-06.
 */
public class starter {

    DinnerModel dynamicStarters = new DinnerModel();
    View view;


    public starter(View view){

        this.view = view;
        LinearLayout starterList = (LinearLayout) view.findViewById(R.id.starterLayout);

        Set<Dish> starters = dynamicStarters.getDishesOfType(1);
        for(Dish s : starters){
            s.getImage();
            
        }

       /**
        participantsView = (TextView) view.findViewById(R.id.participantsText);
        participantsView.setText("Participants: ");
        **/

    }
}
