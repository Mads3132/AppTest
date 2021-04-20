package com.example.activityswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MetalActivity extends AppCompatActivity {

    VideoView videoView;
    Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metal);

        videoView = (VideoView) findViewById(R.id.videoView);

        uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.eeew_dude);
        videoView.setVideoURI(uri);

        configureTilbageMetal();

        videoView.start();
    }

    private void configureTilbageMetal(){
        Button tilbageMetal = (Button) findViewById(R.id.tilbageMetal);
        tilbageMetal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }
        });
    }
}