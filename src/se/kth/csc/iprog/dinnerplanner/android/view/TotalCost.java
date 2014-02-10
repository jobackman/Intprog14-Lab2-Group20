package se.kth.csc.iprog.dinnerplanner.android.view;

import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import android.view.View;
import android.widget.TextView;

public class TotalCost {

    /**
     Things I added:
     DinnerModel model;
     public TotalCost(View view, DinnerModel model)
     this.model = model;
     totalcost.setText("Total cost " + model.getTotalMenuPrice() + " kr");
     **/
    //DinnerModel dynamicPrice = new DinnerModel();
    View view;
    DinnerModel model;
    public TotalCost(View view, DinnerModel model) {

        // store in the class the reference to the Android View
        this.view = view;
        this.model = model;
        TextView totalcost = (TextView) view.findViewById(R.id.display_total_cost);
        //totalcost.setText("Total cost " + dynamicPrice.getTotalMenuPrice() + " kr");
        totalcost.setText("Total cost " + model.getTotalMenuPrice() + " kr");



        // Setup the rest of the view layout
    }

}
