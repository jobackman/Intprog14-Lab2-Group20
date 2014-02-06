package se.kth.csc.iprog.dinnerplanner.android.view;

import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import android.view.View;
import android.widget.TextView;

public class NumberOfGuests {

    DinnerModel dynamicGuests = new DinnerModel();
    View view;

    public NumberOfGuests(View view) {

        // store in the class the reference to the Android View
        this.view = view;

        TextView totalguests = (TextView) view.findViewById(R.id.show_number_of_guests);
        totalguests.setText(dynamicGuests.getNumberOfGuests() + " pers");


        // Setup the rest of the view layout
    }

}
