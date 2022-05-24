package pt.ua.icm.tc.weatherapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;

public class ActivityB extends AppCompatActivity {

    private String cityName;
    private FragmentB fragmentB, fragmentB2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        cityName = getIntent().getStringExtra("name");

        Bundle bundle = new Bundle();
        bundle.putString("name", cityName);

        fragmentB = new FragmentB();
        fragmentB.setArguments(bundle);
        fragmentB2 = new FragmentB();
        fragmentB2.setArguments(bundle);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_view, fragmentB).commit();

        getSupportFragmentManager().beginTransaction().replace(R.id.cities, new FragmentA());
        getSupportFragmentManager().beginTransaction().replace(R.id.details, fragmentB2);

    }
    /*
    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        System.err.println("hey");
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            System.err.println("hey");
            Bundle bundle = new Bundle();
            bundle.putString("name", cityName);

            FragmentA fragmentA = new FragmentA();
            fragmentA.setArguments(bundle);

            setContentView(R.layout.fragment_layout);
            getSupportFragmentManager().beginTransaction().replace(R.id.cities, fragmentA).commit();
            getSupportFragmentManager().beginTransaction().replace(R.id.details, fragmentB).commit();

        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("name", cityName);
    }
     */
}