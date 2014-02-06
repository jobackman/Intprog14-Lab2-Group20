package se.kth.csc.iprog.dinnerplanner.android;

import se.kth.csc.iprog.dinnerplanner.android.view.ExampleView;
import se.kth.csc.iprog.dinnerplanner.android.view.btnNext;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Default call to load previous state
    	super.onCreate(savedInstanceState);
    	
    	// Set the view for the main activity screen
    	// it must come before any call to findViewById method
        setContentView(R.layout.activity_main);
        
    	// Creating the view class instance
    	ExampleView mainView = new ExampleView(findViewById(R.id.this_is_example_view_id));
        btnNext buttonView = new btnNext(findViewById(R.id.next_button));

        /**buttonView.nextButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChooseMenu.class);
                startActivity(intent);
            }

        });**/

}
}