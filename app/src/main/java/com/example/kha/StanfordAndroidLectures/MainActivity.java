package com.example.kha.StanfordAndroidLectures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changePicture(int id) {
        ImageView imageDisplay = (ImageView)findViewById(R.id.imageButton);
        imageDisplay.setImageResource(id);
    }

    public void onClick_MrRobot(View view) {
        changePicture(R.drawable.christianslater);
    }

    public void onClick_Elliot(View view) {
        changePicture(R.drawable.elliot);
    }

    public void onClick_FSociety(View view) {
        changePicture(R.drawable.fsociety);
    }

    public void onClick_Wellick(View view) {
        changePicture(R.drawable.tylerwellick);
    }
}
