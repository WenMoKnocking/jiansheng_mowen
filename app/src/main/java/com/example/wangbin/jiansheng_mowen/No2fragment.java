package com.example.wangbin.jiansheng_mowen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by wangbin on 2017/8/30.
 */

public class No2fragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState){
        View view =inflater.inflate(R.layout.no2,container,false);
        Button button2=(Button)view.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"this is no.2",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
