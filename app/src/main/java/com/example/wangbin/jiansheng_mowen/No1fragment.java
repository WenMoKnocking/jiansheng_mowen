package com.example.wangbin.jiansheng_mowen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by wangbin on 2017/8/30.
 */

public class No1fragment extends Fragment {
    private ViewPager viewPager;
    private TextView textView1,textView2,textView3,textView4;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState){
        View view =inflater.inflate(R.layout.no1,container,false);
        viewPager =(ViewPager) view.findViewById(R.id.viewpager_1);
        textView1 =(TextView)view.findViewById(R.id.xunlian);
        textView2 =(TextView)view.findViewById(R.id.run);
        textView3 =(TextView)view.findViewById(R.id.bike);
        textView4=(TextView)view.findViewById(R.id.walk);

        return view;
    }
    @Override
    public void onActivityCreated( Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);




        textView1.setOnClickListener(new No1fragment.MyOnClickListener(0));
        textView2.setOnClickListener(new No1fragment.MyOnClickListener(1));
        textView3.setOnClickListener(new No1fragment.MyOnClickListener(2));
        textView4.setOnClickListener(new No1fragment.MyOnClickListener(3));
        List<Fragment> fragmentList=new ArrayList<Fragment>();
        fragmentList.add(new No1_01fragment());
        fragmentList.add(new No1_02fragment());
        fragmentList.add(new No1_03fragment());
        fragmentList.add(new No1_04fragment());
        FragAdapter adapter=new FragAdapter(getChildFragmentManager(),fragmentList);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(0);

    }
   

    public class MyOnClickListener implements View.OnClickListener {
        private int index = 0;

        public MyOnClickListener(int i) {
            this.index = i;
        }

        public void onClick(View v) {
            No1fragment.this.viewPager.setCurrentItem(this.index);
        }
    }
    public class FragAdapter extends FragmentPagerAdapter {

        private List<Fragment> mFragments;

        public FragAdapter(FragmentManager fm, List<Fragment> fragments) {
            super(fm);
            // TODO Auto-generated constructor stub
            mFragments=fragments;
        }




        @Override
        public Fragment getItem(int arg0) {
            // TODO Auto-generated method stub
            return mFragments.get(arg0);
        }

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return mFragments.size();
        }

    }

   
}
