package com.example.nejcvesel.pazikjehodis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.nejcvesel.pazikjehodis.Walkthrough.WalkthroughActivity;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

    }
    public void startMap(View v)
    {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    public void startExplore(View v)
    {
        //FragmentManager fm = getFragmentManager();
        //fm.beginTransaction().replace(R.id.mainMenuFrame, new LocationFragment(), "LocationFragment").commit();


    }

    public void startWalkthrough(View v)
    {

        Intent intent = new Intent(getApplicationContext(),WalkthroughActivity.class);
        startActivity(intent);

    }


}
