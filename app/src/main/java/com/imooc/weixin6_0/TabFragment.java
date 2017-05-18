package com.imooc.weixin6_0;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TabFragment extends Fragment {
    private String mTitle = "Default";

    public static final String TITLE = "title";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (getArguments() != null) {
            mTitle = getArguments().getString(TITLE);
        }

        View view = null;

        String s = mTitle.toString();
        if (s.equals("微信")) {
            view = inflater.inflate(R.layout.conversation, container, false);
        } else if (s.equals("通讯录")) {

        } else if (s.equals("发现")) {
            view = inflater.inflate(R.layout.found, container, false);
        } else if (s.equals("我")) {
            view = inflater.inflate(R.layout.me, container, false);
        }

        return view;

//        TextView tv = new TextView(getActivity());
//        tv.setTextSize(20);
//        tv.setBackgroundColor(Color.parseColor("#ffffffff"));
//        tv.setText(mTitle);
//        tv.setGravity(Gravity.CENTER);
//        return tv;

    }
}
