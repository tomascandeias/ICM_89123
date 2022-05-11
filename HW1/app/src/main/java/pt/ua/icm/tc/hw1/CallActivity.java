package pt.ua.icm.tc.hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class CallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        // Display number
        TextView textView = (TextView) findViewById(R.id.textView);

        Intent intent = getIntent();

        textView.setText(String.format("Calling %s", intent.getStringExtra("number")));

        // Hang up
        ImageButton hangUp = (ImageButton) findViewById(R.id.imageButton2);
        hangUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
    }
}