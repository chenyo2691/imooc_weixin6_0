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

        }

        return view;

//        TextView tv = new TextView(getActivity());
//        tv.setTextSize(20);
//        tv.setBackgroundColor(Color.parseColor("#ffffffff"));
//        tv.setText(mTitle);
//        tv.setGravity(Gravity.CENTER);
//        return tv;

    }

//    private ArrayList<Conversation> getConversations() {
//        ArrayList<Conversation> cvs_lst = new ArrayList<Conversation>();
//        Conversation h1 = new Conversation();
//        h1.setTxPath(R.drawable.icon + "");
//        h1.setName1("肖秀");
//        h1.setLastContent("这是唯一一个正常的朋友");
//        h1.setLastTime("下午 18:00");
//
//        Conversation h5 = new Conversation();
//        h5.setTxPath(R.drawable.headshow2 + "");
//        h5.setName1("风清云南");
//        h5.setLastContent("风吹得很清新，云飘荡在南边的天空");
//        h5.setLastTime("下午 16:11");
//
//        Conversation h6 = new Conversation();
//        h6.setTxPath(R.drawable.headshow3 + "");
//        h6.setName1("EatEvery");
//        h6.setLastContent("Don't look me, I will eat you, Are you know");
//        h6.setLastTime("下午 15:08");
//
//        Conversation h7 = new Conversation();
//        h7.setTxPath(R.drawable.headshow4 + "");
//        h7.setName1("鄙人");
//        h7.setLastContent("没有那么大的屌，就不要装B");
//        h7.setLastTime("下午 15:01");
//
//        Conversation h8 = new Conversation();
//        h8.setTxPath(R.drawable.headshow5 + "");
//        h8.setName1("人人人");
//        h8.setLastContent("我就是这么一个人，就是喜欢一个人，不管是不是一个人");
//        h8.setLastTime("下午 14:50");
//
//        Conversation h9 = new Conversation();
//        h9.setTxPath(R.drawable.headshow6 + "");
//        h9.setName1("Diacker");
//        h9.setLastContent("this is very good fill");
//        h9.setLastTime("下午 14:00");
//
//        Conversation h0 = new Conversation();
//        h0.setTxPath(R.drawable.headshow1 + "");
//        h0.setName1("酒香告急");
//        h0.setLastContent("我是个喜欢就得人，但是你们一定要理解清楚我的名字，再跟我说话");
//        h0.setLastTime("中午 12:00");
//
//        cvs_lst.add(h1);
////		cvs_lst.add(h2);
////		cvs_lst.add(h3);
////		cvs_lst.add(h4);
//        cvs_lst.add(h5);
//        cvs_lst.add(h6);
//        cvs_lst.add(h7);
//        cvs_lst.add(h8);
//        cvs_lst.add(h9);
//        cvs_lst.add(h0);
//
//        return cvs_lst;
//    }

//    private ArrayList<ContactP> getContact() {
//        ArrayList<ContactP> hcList = new ArrayList<ContactP>();
//        ContactP c0 = new ContactP();
//        c0.setTxPath(R.drawable.bind_mcontact_reco_friends + "");
//        c0.setName("服务号");
//
//        ContactP c1 = new ContactP();
//        c1.setTxPath(R.drawable.brand_default_head + "");
//        c1.setName("微信测试账号");
//
//        ContactP c2 = new ContactP();
//        c2.setTxPath(R.drawable.bind_qq_icon + "");
//        c2.setName("QQ团队");
//
//        ContactP c3 = new ContactP();
//        c3.setTxPath(R.drawable.icon + "");
//        c3.setName("微信团队");

//        ContactP c4 = new ContactP();
//        c4.setTxPath(R.drawable.xiaohei + "");
//        c4.setName("小黑");
//
//        ContactP c5 = new ContactP();
//        c5.setTxPath(R.drawable.voip_camerachat + "");
//        c5.setName("不再禽兽");
//
//        ContactP c6 = new ContactP();
//        c6.setTxPath(R.drawable.searadd_icon + "");
//        c6.setName("傻逼不哭");
//
//        ContactP c7 = new ContactP();
//        c7.setTxPath(R.drawable.personactivity_cover_heart + "");
//        c7.setName("肖秀");

//        ContactP c8 = new ContactP();
//        c8.setTxPath(R.drawable.headshow2 + "");
//        c8.setName("风清云南");
//
//        ContactP c9 = new ContactP();
//        c9.setTxPath(R.drawable.headshow3 + "");
//        c9.setName("EatEvery");
//
//        ContactP c10 = new ContactP();
//        c10.setTxPath(R.drawable.headshow4 + "");
//        c10.setName("鄙人");
//
//        ContactP c11 = new ContactP();
//        c11.setTxPath(R.drawable.headshow5 + "");
//        c11.setName("人人人");
//
//        ContactP c12 = new ContactP();
//        c12.setTxPath(R.drawable.headshow6 + "");
//        c12.setName("Diacker");
//
//        ContactP c13 = new ContactP();
//        c13.setTxPath(R.drawable.headshow1 + "");
//        c13.setName("王霸");
//
//        hcList.add(c0);
//        hcList.add(c1);
//        hcList.add(c2);
//        hcList.add(c3);
////        hcList.add(c4);
////        hcList.add(c5);
////        hcList.add(c6);
////        hcList.add(c7);
//        hcList.add(c8);
//        hcList.add(c9);
//        hcList.add(c10);
//        hcList.add(c11);
//        hcList.add(c12);
//        hcList.add(c13);
//
//        return hcList;
//    }
}
