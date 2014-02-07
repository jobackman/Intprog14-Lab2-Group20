package se.kth.csc.iprog.dinnerplanner.android;

import se.kth.csc.iprog.dinnerplanner.android.view.BackButtonView;
import se.kth.csc.iprog.dinnerplanner.android.view.CheckoutImages;
import se.kth.csc.iprog.dinnerplanner.android.view.CourseDescriptionView;
import se.kth.csc.iprog.dinnerplanner.android.view.IngredientView;
import se.kth.csc.iprog.dinnerplanner.android.view.TotalCost;

import android.os.Bundle;
import android.app.Activity;

public class Checkout2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Default call to load previous state
        super.onCreate(savedInstanceState);

        // Set the view for the main activity screen
        // it must come before any call to findViewById method
        setContentView(R.layout.activity_checkout2);

        // Creating the view class instance
        CourseDescriptionView courseview = new CourseDescriptionView(findViewById(R.id.course_description_view));
        BackButtonView backview = new BackButtonView(findViewById(R.id.back_button));
        CheckoutImages images = new CheckoutImages(findViewById(R.id.image_view));
        TotalCost mainView = new TotalCost(findViewById(R.id.total_cost));




        /**nextButton.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
        }

        });**/

    }
}
