package se.kth.csc.iprog.dinnerplanner.android.view;

import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import android.view.View;
import android.widget.TextView;

public class TotalCost {

    DinnerModel dynamicPrice = new DinnerModel();
    View view;

    public TotalCost(View view) {

        // store in the class the reference to the Android View
        this.view = view;

        TextView totalcost = (TextView) view.findViewById(R.id.display_total_cost);
        totalcost.setText("Total cost " + dynamicPrice.getTotalMenuPrice());


        // Setup the rest of the view layout
    }

}
