package com.gao.zhong;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager vp;
    private TabLayout tab;
    private ArrayList<Fragment>list;
    private ArrayList<String>title;
    private VADApter vadApter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        vp = (ViewPager) findViewById(R.id.vp);
        tab = (TabLayout) findViewById(R.id.tab);
        list =new ArrayList<>();
        list.add(new AFragment());
        list.add(new BFragment());
        title = new ArrayList<>();
        title.add("主页");
        title.add("收藏");
        vadApter =new VADApter(getSupportFragmentManager(),list,title);
        vp.setAdapter(vadApter);
        tab.setupWithViewPager(vp);
    }
}
