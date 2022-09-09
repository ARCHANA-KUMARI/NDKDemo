package com.example.ndkdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.ndkdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'ndkdemo' and 'calculator' library on application startup.
    static {
        System.loadLibrary("ndkdemo");
        System.loadLibrary("calculator");
    }

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Example of a call to a native method
        TextView tv = binding.stringTxt;
        tv.setText(stringFromJNI());
        // Example of call to a native for int data type
        binding.sumTxt.setText("Addition is: " + sumFromJNI(10,5));
        binding.subTxt.setText("Subtraction is: " + subFromJNI(10,5));
        binding.mulTxt.setText("Multiplication is: " + mulFromJNI(10,5));
        binding.divTxt.setText("Division is: " + divFromJNI(10,5));

    }

    /**
     * A native method that is implemented by the 'ndkdemo'  and 'calculator'native library,
     * which is packaged with this application.
     */

    public native String stringFromJNI();
    public native int sumFromJNI(int x, int y);
    public native int subFromJNI(int x, int y);
    public native int mulFromJNI(int x, int y);
    public native int divFromJNI(int x, int y);
}