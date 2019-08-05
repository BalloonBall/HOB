package com.example.hob;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;


public class LoadingActivity extends AppCompatActivity implements View.OnClickListener {
    private Handler handler;
    private Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);
        // click to skip method.
        initView();
        // delay to skip method with handler. Delay 3000ms and intent to next activity.
        handler = new Handler();
        handler.postDelayed(runnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(LoadingActivity.this, StartingActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);

    }

    // set onclick listener on loading image.
    private void initView() {
        ImageView loading = findViewById(R.id.loading);
        loading.setOnClickListener(this);
    }


    // onclick, intent to next activity immediately and remove the delay handler
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.loading:
                Intent intent = new Intent(LoadingActivity.this, StartingActivity.class);
                startActivity(intent);
                finish();
                if (runnable != null) {
                    handler.removeCallbacks(runnable);
                }
                break;
            default:
                break;
        }
    }
}