package com.example.breem;

import android.os.Bundle;
import android.widget.Toast;

import org.opencv.android.OpenCVLoader;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (OpenCVLoader.initDebug()){
            Toast.makeText(MainActivity.this, "BERHASIL OPENCV", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(MainActivity.this, "GAGAL OPENCV", Toast.LENGTH_SHORT).show();
        }
    }
}