package pt.ua.icm.tc.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

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
    }
}