package com.example.hob;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import com.example.hob.ui.login.SignInActivity;

public class StartingActivity extends AppCompatActivity {
    public static StartingActivity instance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        instance=this;
        setContentView(R.layout.activity_starting);

    }

    public void signIn(View view){
        Intent intent=new Intent();
        intent.setClass(StartingActivity.this, SignInActivity.class);
        startActivity(intent);
    }

}
