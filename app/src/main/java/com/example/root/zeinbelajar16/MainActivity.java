package com.example.root.zeinbelajar16;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                if(!text.equalsIgnoreCase("")){
                    final int second = Integer.parseInt(editText.getText().toString());
                    CountDownTimer countDownTimer = new CountDownTimer(second *1000,1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            textView.setText("seconds = " + (int)(millisUntilFinished/1000));
                        }

                        @Override
                        public void onFinish() {
                            textView.setText("Finished");
                        }
                    }.start();
                }

            }
        });
    }
}
