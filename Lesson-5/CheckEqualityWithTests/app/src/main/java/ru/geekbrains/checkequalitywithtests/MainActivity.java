package ru.geekbrains.checkequalitywithtests;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Integer arg1;
    private Integer arg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        final EditText editText1 = findViewById(R.id.editText1);
        final EditText editText2 = findViewById(R.id.editText2);
        final TextView textView = findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arg1 = Integer.valueOf(editText1.getText().toString());
                arg2 = Integer.valueOf(editText2.getText().toString());
                CheckEquals checkEquals = new CheckEquals();
                textView.setText(checkEquals.Compare(arg1, arg2));
            }
        });
    }
}