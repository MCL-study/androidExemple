package com.sylphe.app.exemple.gps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private GpsInfo gpsInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gpsInfo = new GpsInfo(this);
        textView = (TextView) findViewById(R.id.textView);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("lat : "+ gpsInfo.getLatitude()+" lng :"+gpsInfo.getLongitude());
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        gpsInfo.stopUsingGPS();
    }
}
