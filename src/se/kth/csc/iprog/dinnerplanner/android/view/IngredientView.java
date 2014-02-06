package se.kth.csc.iprog.dinnerplanner.android.view;

import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import se.kth.csc.iprog.dinnerplanner.model.Ingredient;

import android.view.View;
import android.widget.TextView;

public class IngredientView {

    DinnerModel dynamicDish = new DinnerModel();
    View view;
    String string;

    public IngredientView(View view) {

        // store in the class the reference to the Android View
        this.view = view;

        TextView totalguests = (TextView) view.findViewById(R.id.show_number_of_guests);
        totalguests.setText(dynamicDish.getNumberOfGuests() + " pers");

        TextView ingredientTitle = (TextView) view.findViewById(R.id.show_ingredient_title);
        ingredientTitle.setText("Ingredients");

        TextView ingredientlist = (TextView) view.findViewById(R.id.ingredient_list);

        for (Ingredient i : dynamicDish.getAllIngredients()) {
            string = string + i.getName() + "   " + i.getQuantity() + " " + i.getUnit() + "\n";
        }

        ingredientlist.setText(string);

        // Setup the rest of the view layout
    }

}
