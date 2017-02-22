package com.example.administrator.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.StringTokenizer;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<String> mAppList=new  ArrayList<String>();

        mAppList.add("热门电影");
        mAppList.add("股票雄鹰");
        mAppList.add("XYZ阅读器");
        mAppList.add("最新闻");
        mAppList.add("毕业设计");

        for (int i=0;i<mAppList.size();i++) {
            LinearLayout bottonRootView = (LinearLayout) findViewById(R.id.bottonRootView);
            Button clickButton = new Button(this);
            clickButton.setText(mAppList.get(i));
            bottonRootView.addView(clickButton);
            final int index=i;
            clickButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Toast.makeText(MainActivity.this, "启动应用："+mAppList.get(index),
                            Toast.LENGTH_LONG).show();
                }
            });
        }
    }
}
