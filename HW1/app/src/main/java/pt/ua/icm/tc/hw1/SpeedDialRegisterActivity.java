package pt.ua.icm.tc.hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SpeedDialRegisterActivity extends AppCompatActivity {
    private static List<Contact> contactList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed_dial_register);

        EditText name = (EditText) findViewById(R.id.textInputEditText);
        name.getBackground().setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP);

        EditText number = (EditText) findViewById(R.id.textInputEditText2);
        number.getBackground().setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP);


        Button submit = (Button) findViewById(R.id.btnSubmit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                intent.putExtra("name", name.getText().toString());
                intent.putExtra("number", number.getText().toString());

                startActivity(intent);
            }
        });
    }
}