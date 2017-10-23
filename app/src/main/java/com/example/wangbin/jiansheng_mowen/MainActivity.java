package com.example.wangbin.jiansheng_mowen;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout linearLayout1,linearLayout2,linearLayout3;
    private No1fragment no1fragment;
    private No2fragment no2fragment;
    private No3fragment no3fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout1 =(LinearLayout)findViewById(R.id.train);
        linearLayout1.setOnClickListener(this);
        linearLayout2 =(LinearLayout)findViewById(R.id.find);
        linearLayout2.setOnClickListener(this);
        linearLayout3 =(LinearLayout)findViewById(R.id.mine);
        linearLayout3.setOnClickListener(this);
        setDefaultFragment();
    }
    private void setDefaultFragment(){
        android.support.v4.app.FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        no1fragment= new No1fragment();
       fragmentTransaction.replace(R.id.content_1,no1fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onClick(View view){
        FragmentManager fm = getFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        switch (view.getId()){
            case R.id.train:
                if (no1fragment ==null){no1fragment= new No1fragment();}
                fragmentTransaction.replace(R.id.content_1,no1fragment);
                break;
            case R.id.find:
                if (no2fragment ==null){no2fragment= new No2fragment();}
                fragmentTransaction.replace(R.id.content_1,no2fragment);
                break;
            case R.id.mine:
                if (no3fragment ==null){no3fragment= new No3fragment();}
                fragmentTransaction.replace(R.id.content_1,no3fragment);
                break;
        }
        fragmentTransaction.commit();
    }

    @Override
    public android.support.v4.app.FragmentManager getSupportFragmentManager() {
        return super.getSupportFragmentManager();
    }
}
