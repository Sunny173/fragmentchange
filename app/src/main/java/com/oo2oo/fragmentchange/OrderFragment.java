package com.oo2oo.fragmentchange;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by sun on 2018/7/19.
 */

public class OrderFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        TextView textView = new TextView(getContext());
        textView.setText("OrderFragment");
        textView.setTextSize(32);
        return textView;
    }
}
