package com.zuziula.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener {

    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create empty Toast
        toast = Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT);

        // buttons reference variables
        Button buttonSpotify = (Button)findViewById(R.id.buttonSpotify);
        Button buttonScores = (Button)findViewById(R.id.buttonScores);
        Button buttonLib = (Button)findViewById(R.id.buttonLibrary);
        Button buttonBuildIt = (Button)findViewById(R.id.buttonBuildIt);
        Button buttonXYZ = (Button)findViewById(R.id.buttonXYZ);
        Button buttonCapstone = (Button)findViewById(R.id.buttonCapstone);

        // give buttons ability to listen to clicks
        buttonSpotify.setOnClickListener(this);
        buttonScores.setOnClickListener(this);
        buttonLib.setOnClickListener(this);
        buttonBuildIt.setOnClickListener(this);
        buttonXYZ.setOnClickListener(this);
        buttonCapstone.setOnClickListener(this);


    }
/*
// auto-generated menu commented
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
*/
    @Override
    public void onClick(View view) {

        // what happens when button is clicked
        switch (view.getId()) {
            case R.id.buttonSpotify:
                toast.setText("This button will launch my Spotify app!");
                toast.show();
                break;
            case R.id.buttonScores:
                toast.setText("This button will launch my Scores app!");
                toast.show();
                break;
            case R.id.buttonLibrary:
                toast.setText("This button will launch my Library app!");
                toast.show();
                break;
            case R.id.buttonBuildIt:
                toast.setText("This button will launch my Build app!");
                toast.show();
                break;
            case R.id.buttonXYZ:
                toast.setText("This button will launch my XYZ app!");
                toast.show();
                break;
            case R.id.buttonCapstone:
                toast.setText("This button will launch my Capstone app!");
                toast.show();
                break;
        } // end of switch

    } // end of onClick()

} // end of MainActivity class
