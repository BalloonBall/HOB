package com.example.hob;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.lang.reflect.Array;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;

public class HomeActivity extends AppCompatActivity{

    SlidingPaneLayout mSlidier;
    View mMenuNavi;
    View mScrollView;

    ImageView imageRun;
    AnimationDrawable spriteRun;
    AnimationDrawable spriteJump;

    public Handler handler;
    public Runnable runnable;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        imageRun = findViewById(R.id.spriteRunning);
        imageRun.setImageResource(R.drawable.animation_1);
        spriteRun=(AnimationDrawable)imageRun.getDrawable();
        spriteRun.start();

        mSlidier= findViewById(R.id.mainLayout);
        mMenuNavi = findViewById(R.id.menuNavi);
        mScrollView = findViewById(R.id.scrollView);

        mMenuNavi.setAlpha(0);
        mSlidier.setPanelSlideListener(new SlidingPaneLayout.PanelSlideListener() {
            @Override
            public void onPanelSlide(@NonNull View panel, float slideOffset) {
                mMenuNavi.setAlpha(slideOffset);
            }

            @Override
            public void onPanelOpened(@NonNull View panel) {

            }

            @Override
            public void onPanelClosed(@NonNull View panel) {

            }
        });

        int[] imageId = new int[]{R.drawable.icon_profile, R.drawable.icon_news, R.drawable.icon_mail, R.drawable.icon_promo, R.drawable.icon_contact,  R.drawable.icon_setting};
        String[] name = new String[] {"Profile", "News", "Mailbox", "Promos", "Contact us", "Preference"};
        List<Map<String, Object>> listItem = new ArrayList<>();
        for (int i = 0; i < imageId.length; i++)
            {
            Map<String, Object> map = new HashMap<>();
            map.put("image", imageId[i]);
            map.put("name", name[i]);
            listItem.add(map);
            }
        SimpleAdapter adapter = new SimpleAdapter(this, listItem, R.layout.list_layout, new String[]{"name", "image"}, new int[]{R.id.title, R.id.image});
        ListView listView = super.findViewById(R.id.menuListView);
        listView.setAdapter(adapter);
    }

    public void slideOpen(View view){
        mSlidier.openPane();
    }


    public int tag1=0;
    public void moreAccount(View view){
        Animation rotateDown = AnimationUtils.loadAnimation(this, R.animator.rotate_down);
        Animation rotateUp = AnimationUtils.loadAnimation(this, R.animator.rotate_up);
        ConstraintLayout hiddenAccount=findViewById(R.id.hiddenAccount);
        if (tag1 == 0) {
            view.startAnimation(rotateDown);
            hiddenAccount.setVisibility(View.VISIBLE);
            tag1 = 1;
        } else {
            view.startAnimation(rotateUp);
            hiddenAccount.setVisibility(View.GONE);
            tag1 = 0;
        }
    }

    public void clickJump(View view){
        Animation jumpTranslate = AnimationUtils.loadAnimation(this, R.animator.jump);
        view.startAnimation(jumpTranslate);
        imageRun = findViewById(R.id.spriteRunning);
        imageRun.setImageResource(R.drawable.animation_2);
        spriteJump=(AnimationDrawable)imageRun.getDrawable();
        spriteJump.start();

        handler = new Handler();
        handler.postDelayed(runnable = new Runnable() {
            @Override
            public void run() {
                imageRun= findViewById(R.id.spriteRunning);
                imageRun.setImageResource(R.drawable.animation_1);
                spriteRun=(AnimationDrawable)imageRun.getDrawable();
                spriteRun.start();
            }
        }, 810);
    }
}


