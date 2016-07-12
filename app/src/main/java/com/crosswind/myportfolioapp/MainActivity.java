package com.crosswind.myportfolioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String mLaunchMessage = "This button will launch my ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void launchPopularMoviesApp(View view) {
        Button mButtonLaunchPopularMovies = (Button) findViewById(R.id.button_launch_popular_movies);

        if (mButtonLaunchPopularMovies != null) {
            Toast.makeText(this, mLaunchMessage + mButtonLaunchPopularMovies.getText().toString(), Toast.LENGTH_LONG).show();
        }
    }

    public void launchStockHawkApp(View view) {
        Button mButtonLaunchStockHawk = (Button) findViewById(R.id.button_launch_stock_hawk);

        if (mButtonLaunchStockHawk != null) {
            Toast.makeText(this, mLaunchMessage + mButtonLaunchStockHawk.getText().toString(), Toast.LENGTH_LONG).show();
        }
    }

    public void launchBuildItBiggerApp(View view) {
        Button mButtonLaunchBuildItBiggerApp = (Button) findViewById(R.id.button_launch_build_it_bigger);

        if (mButtonLaunchBuildItBiggerApp != null) {
            Toast.makeText(this, mLaunchMessage + mButtonLaunchBuildItBiggerApp.getText().toString(), Toast.LENGTH_LONG).show();
        }
    }

    public void launchMakeYourAppMaterialApp(View view) {
        Button mButtonLaunchMakeYourAppMaterial = (Button) findViewById(R.id.button_launch_make_your_app_material);

        if (mButtonLaunchMakeYourAppMaterial != null) {
            Toast.makeText(this, mLaunchMessage + mButtonLaunchMakeYourAppMaterial.getText().toString(), Toast.LENGTH_LONG).show();
        }
    }

    public void launchGoUbiquitousApp(View view) {
        Button mButtonLaunchGoUbiquitous = (Button) findViewById(R.id.button_launch_stock_hawk);

        if (mButtonLaunchGoUbiquitous != null) {
            Toast.makeText(this, mLaunchMessage + mButtonLaunchGoUbiquitous.getText().toString(), Toast.LENGTH_LONG).show();
        }
    }

    public void launchCapstoneApp(View view) {
        Button mButtonLaunchCapstone = (Button) findViewById(R.id.button_launch_stock_hawk);

        if (mButtonLaunchCapstone != null) {
            Toast.makeText(this, mLaunchMessage + mButtonLaunchCapstone.getText().toString(), Toast.LENGTH_LONG).show();
        }
    }
}
