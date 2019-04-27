package com.example.otheranimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public void fade(View view){
        Log.i("info","Start");
        ImageView imageView=(ImageView)findViewById(R.id.imageView);
        ImageView homerimage=(ImageView)findViewById(R.id.homerimageView);
       // imageView.animate().translationYBy(-1000).setDuration(2000); // both for translation up and down
       // imageView.animate().translationXBy(-1000).setDuration(2000);
//        imageView.animate().rotation(3600).alpha(0).setDuration(1000);//roatation in degree
//        homerimage.animate().rotation(3600).alpha(1).setDuration(1000);
       // imageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(1000);//to small the size

       imageView.animate().translationXBy(1000).rotation(3600).scaleY(1).scaleY(1).setDuration(2000);


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView=(ImageView)findViewById(R.id.imageView);
        imageView.animate().translationXBy(-1000);// we can use ImageView.setX(-1000)
    }
}
