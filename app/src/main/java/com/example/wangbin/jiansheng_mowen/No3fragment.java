package com.example.wangbin.jiansheng_mowen;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Map;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by wangbin on 2017/8/30.
 */

public class No3fragment extends Fragment {
    private ImageView mail,shezhi;
    private NavigationView navigationView;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState){
        View view =inflater.inflate(R.layout.no3,container,false);
        mail =(ImageView)view.findViewById(R.id.mail);
        shezhi=(ImageView)view.findViewById(R.id.shezhi);
        navigationView=(NavigationView)view.findViewById(R.id.mine_view);
        return view;
    }
    @Override
    public void onActivityCreated( Bundle savedInstanceState){
        super.onActivityCreated( savedInstanceState);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Toast.makeText(getContext(),"youclick this",Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
