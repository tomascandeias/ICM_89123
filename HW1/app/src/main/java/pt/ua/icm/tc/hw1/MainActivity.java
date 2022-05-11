package pt.ua.icm.tc.hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final List<Contact> contactList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("");

        // Speed dial
        Button btnSpeedDial = (Button) findViewById(R.id.btnSpeedDial);
        btnSpeedDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SpeedDialRegisterActivity.class);
                startActivity(intent);
            }
        });


        Button b1 = (Button) findViewById(R.id.button);
        Button b2 = (Button) findViewById(R.id.button2);

        if (getIntent().getStringExtra("name") != null &&
                getIntent().getStringExtra("number") != null){

            if (!contactList.contains(new Contact(getIntent().getStringExtra("name"), getIntent().getStringExtra("number")))){
                // pop
                if (contactList.size() == 2)
                    contactList.remove(0);

                contactList.add(new Contact(getIntent().getStringExtra("name"), getIntent().getStringExtra("number")));
            }
        }

        if (contactList.size() == 2){
            b1.setText(contactList.get(0).getName());
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), CallActivity.class);

                    intent.putExtra("number", contactList.get(0).getNumber());

                    startActivity(intent);
                }
            });

            b2.setText(contactList.get(1).getName());
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), CallActivity.class);

                    intent.putExtra("number", contactList.get(1).getNumber());

                    startActivity(intent);
                }
            });

        }else if(contactList.size() == 1){
            b1.setText(contactList.get(0).getName());
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), CallActivity.class);

                    intent.putExtra("number", contactList.get(0).getNumber());

                    startActivity(intent);
                }
            });
        }

        // Make a call
        ImageButton call = (ImageButton) findViewById(R.id.imageButton);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CallActivity.class);

                intent.putExtra("number", textView.getText().toString());

                startActivity(intent);
            }
        });

        // Delete
        ImageButton btnDelete  = (ImageButton) findViewById(R.id.btnDelete);
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().subSequence(0, textView.getText().length()-1));
            }
        });

        // Buttons - dialed numbers
        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().length() < 9)
                    textView.setText(String.format("%s1", textView.getText()));
            }
        });

        Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().length() < 9)
                    textView.setText(String.format("%s2", textView.getText()));
            }
        });


        Button btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().length() < 9)
                    textView.setText(String.format("%s3", textView.getText()));
            }
        });

        Button btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().length() < 9)
                    textView.setText(String.format("%s4", textView.getText()));
            }
        });

        Button btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().length() < 9)
                    textView.setText(String.format("%s5", textView.getText()));
            }
        });

        Button btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().length() < 9)
                    textView.setText(String.format("%s6", textView.getText()));
            }
        });

        Button btn7 = (Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().length() < 9)
                    textView.setText(String.format("%s7", textView.getText()));
            }
        });

        Button btn8 = (Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().length() < 9)
                    textView.setText(String.format("%s8", textView.getText()));
            }
        });

        Button btn9 = (Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().length() < 9)
                    textView.setText(String.format("%s9", textView.getText()));
            }
        });

        Button btnPlus = (Button) findViewById(R.id.btnPlus);
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().length() < 9)
                    textView.setText(String.format("%s+", textView.getText()));
            }
        });

        Button btnHashTag = (Button) findViewById(R.id.btnHashTag);
        btnHashTag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().length() < 9)
                    textView.setText(String.format("%s#", textView.getText()));
            }
        });

        Button btn0 = (Button) findViewById(R.id.btn0);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().length() < 9)
                    textView.setText(String.format("%s0", textView.getText()));
            }
        });
    }
}