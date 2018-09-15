package vn.edu.poly.bookmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Timer;
import java.util.TimerTask;

public class HelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        Timer timer = new Timer();

        // chay ham run sau 2000 milisecond

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // goi chuyen man hinh tai day

                Intent intent = new Intent(HelloActivity.this, LoginActivity.class);
                startActivity(intent);

                // finish man hinh hello
                finish();


            }
        }, 200);
    }
}
