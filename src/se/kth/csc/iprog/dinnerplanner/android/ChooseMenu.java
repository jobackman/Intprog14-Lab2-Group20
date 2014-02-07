package se.kth.csc.iprog.dinnerplanner.android;

import se.kth.csc.iprog.dinnerplanner.android.view.Desert;
import se.kth.csc.iprog.dinnerplanner.android.view.ExampleView;
import se.kth.csc.iprog.dinnerplanner.android.view.MainCourse;
import se.kth.csc.iprog.dinnerplanner.android.view.btnNext;
import se.kth.csc.iprog.dinnerplanner.android.view.participants;
import se.kth.csc.iprog.dinnerplanner.android.view.TotalCost;
import se.kth.csc.iprog.dinnerplanner.android.view.starter;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import android.os.Bundle;
import android.app.Activity;

public class ChooseMenu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Default call to load previous state
        super.onCreate(savedInstanceState);

        // Set the view for the main activity screen
        // it must come before any call to findViewById method
        setContentView(R.layout.activity_choose);

        // Creating the view class instance

        participants participantView = new participants(findViewById(R.id.participantsLayout));

        TotalCost costView = new TotalCost(findViewById(R.id.total_cost));

        //Starter menu KLAR
        starter startermenu = new starter(findViewById(R.id.starter));

        //Main menu TBD
        MainCourse main = new MainCourse(findViewById(R.id.MainCourse));

        //Dessert TBD
        Desert dess = new Desert(findViewById(R.id.desert));

        //Next button
        btnNext next = new btnNext(findViewById(R.id.next_button));

        /**nextButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }

        });**/

    }
}
