package com.example.myimagesampleapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public void OnClickButton(View view){
        ImageView imageView =findViewById(R.id.imageView2);
        if(imageView.getTag()!=null){
            if((Integer)imageView.getTag())==R.drawable.flower1);
imageView.setTag(R.drawable.flower1);
        }
        else{
            imageView.setImageResource(R.drawable.puppy1);
            imageView.setTag(R.drawable.puppy1);
        }
        else {
            imageView.setImageResource(R.drawable.puppy1);
            imageView.setTag(R.drawable.puppy1);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}