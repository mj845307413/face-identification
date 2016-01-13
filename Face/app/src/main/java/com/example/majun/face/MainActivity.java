package com.example.majun.face;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
private FaceOverlyView faceOverlyView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        faceOverlyView= (FaceOverlyView) findViewById(R.id.overlyview);
        InputStream inputStream=getResources().openRawResource(R.raw.face);
        Bitmap bitmap= BitmapFactory.decodeStream(inputStream);
        faceOverlyView.setBitmap(bitmap);
    }
}
