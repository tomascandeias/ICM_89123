package pt.ua.icm.tc.weatherapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import pt.ua.icm.tc.weatherapp.FragmentA;
import pt.ua.icm.tc.weatherapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.cities, new FragmentA()).commit();
    }
}