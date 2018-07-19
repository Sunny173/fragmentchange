fragment切换demo
采用自定义FragmentTabHost，继承了TabHost
使用方法
在activity中写下
```
  FragmentTabHost mFragmentTabHost = (FragmentTabHost) findViewById(R.id.tabhost);
        mFragmentTabHost.setup(this, getSupportFragmentManager(), R.id.contentLayout);
//        mFragmentTabHost.setOnTabChangedListener(this);
        TabHost.TabSpec tabSpec;
        for (int i = 0; i < classess.length; i++) {
            tabSpec = mFragmentTabHost.newTabSpec(getString(tabs[i]))
                    .setIndicator(getTabView(i));
            mFragmentTabHost.addTab(tabSpec, classess[i], null);
            mFragmentTabHost.setTag(i);
        }
```
xml定义
```
<?xml version="1.0" encoding="utf-8"?>
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <FrameLayout
        android:id="@+id/contentLayout"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />


    <RelativeLayout
        android:id="@+id/rl_tab_anim"
        android:layout_width="match_parent"
        android:layout_height="49dp"
        android:layout_gravity="bottom"
        android:background="@android:color/white">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="vertical"
            android:paddingBottom="3dp">

            <View
                android:layout_width="match_parent"
                android:layout_height="1.5px"
                android:background="#e6e6e6" />

            <com.oo2oo.fragmentchange.FragmentTabHost
                android:id="@+id/tabhost"
                android:layout_width="match_parent"
                android:layout_height="match_parent" />
        </LinearLayout>


    </RelativeLayout>
</FrameLayout>

```
实现效果
![fragment切换.gif](https://upload-images.jianshu.io/upload_images/9093439-d33f98e300f670b2.gif?imageMogr2/auto-orient/strip)


