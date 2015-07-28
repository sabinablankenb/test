package com.example;
 
import android.os.Bundle;
import android.util.Log;
import org.apache.cordova.*;
 
public class MainActivity extends DroidGap {
    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("PhoneGapAccelerometerApp", "onCreate: Entered method.");
        super.loadUrl("file:///android_asset/www/index.html");
    }
}
