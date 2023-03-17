package com.jgd.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG="SecondActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Toast.makeText(this, "onCreate() SecondActivity",Toast.LENGTH_LONG).show();
        Log.d(TAG,"onCreate() SecondActivity");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart() SecondActivity",Toast.LENGTH_LONG).show();
        Log.d(TAG,"onStart() SecondActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"onStart() SecondActivity",Toast.LENGTH_LONG).show();
        Log.d(TAG,"onStart() SecondActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume() SecondActivity",Toast.LENGTH_LONG).show();
        Log.d(TAG,"onResume() SecondActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onPause() SecondActivity",Toast.LENGTH_LONG).show();
        Log.d(TAG,"onPause() SecondActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onStop() SecondActivity",Toast.LENGTH_LONG).show();
        Log.d(TAG,"onStop() SecondActivity");
    }

    @Override
    protected void onDestroy() {
        Toast.makeText(this,"onDestroy() SecondActivity",Toast.LENGTH_LONG).show();
        Log.d(TAG,"onStart() SecondActivity");
        super.onDestroy();
    }
}