package com.jgd.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG="MainActivity";
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate() MainActivity",Toast.LENGTH_LONG).show();
        Log.d(TAG,"onCreate() MainActivity");
        btn=findViewById(R.id.btn);

        if(btn!=null){
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                    startActivity(intent);
                }
            });
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart() MainActivity",Toast.LENGTH_LONG).show();
        Log.d(TAG,"onStart() MainActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"onStart() MainActivity",Toast.LENGTH_LONG).show();
        Log.d(TAG,"onRestart() MainActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume() MainActivity",Toast.LENGTH_LONG).show();
        Log.d(TAG,"onResume() MainActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onPause() MainActivity",Toast.LENGTH_LONG).show();
        Log.d(TAG,"onPause() MainActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onStop() MainActivity",Toast.LENGTH_LONG).show();
        Log.d(TAG,"onStop() MainActivity");
    }

    @Override
    protected void onDestroy() {
        Toast.makeText(this,"onDestroy() MainActivity",Toast.LENGTH_LONG).show();
        Log.d(TAG,"onDestroy() MainActivity");
        super.onDestroy();
    }
}



