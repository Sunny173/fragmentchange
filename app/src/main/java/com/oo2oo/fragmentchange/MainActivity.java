package com.oo2oo.fragmentchange;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

public class MainActivity extends FragmentActivity {
    int[] imags = {R.drawable.selector_ic_shop, R.drawable.selector_ic_order};
    Class[] classess = {ShopFragment.class, OrderFragment.class};
    int[] tabs = {R.string.mt_shop, R.string.mt_order};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTabHost mFragmentTabHost = (FragmentTabHost) findViewById(R.id.tabhost);
        mFragmentTabHost.setup(this, getSupportFragmentManager(), R.id.contentLayout);
        mFragmentTabHost.setOnTabChangedListener(new FragmentTabHost.OnTabChangeListener() {
            @Override
            public boolean onTabChanged(String tabId) {
                return true;
            }
        });
        TabHost.TabSpec tabSpec;
        for (int i = 0; i < classess.length; i++) {
            tabSpec = mFragmentTabHost.newTabSpec(getString(tabs[i]))
                    .setIndicator(getTabView(i));
            mFragmentTabHost.addTab(tabSpec, classess[i], null);
            mFragmentTabHost.setTag(i);
        }

    }

    private View getTabView(int index) {
        View view = LayoutInflater.from(this).inflate(R.layout.tabitem_havetext, null);
        TextView textView = (TextView) view.findViewById(R.id.itemTextView);
        ImageView iv_tab_item = (ImageView) view.findViewById(R.id.iv_tab_item);

        textView.setText(getString(tabs[index]));
        iv_tab_item.setImageResource(imags[index]);
        return view;
    }
}
