package com.studies.sandrini.runnablesendmessage;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected static final int TEST_MESSAGE = 1;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.send_button);
        button.setText("Update text in 3 seconds");
        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                //Send message
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Message msg = new Message();
                        msg.what = TEST_MESSAGE;
                    }
                }, 3000);
            }
        });
    }
}
