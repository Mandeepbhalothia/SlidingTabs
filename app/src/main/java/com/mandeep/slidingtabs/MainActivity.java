package com.mandeep.slidingtabs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.mandeep.slidingtabs.Fragments.BlankFragment;
import com.mandeep.slidingtabs.Fragments.BlankFragment2;
import com.mandeep.slidingtabs.Fragments.BlankFragment3;
import com.mandeep.slidingtabs.Fragments.BlankFragment4;
import com.mandeep.slidingtabs.Fragments.BlankFragment5;
import com.mandeep.slidingtabs.Fragments.BlankFragment6;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    TextView titleTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolBar);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        titleTv = findViewById(R.id.tileTv);

        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(),
                FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        pagerAdapter.addFragment(new BlankFragment(),"Sliding Tab 1");
        pagerAdapter.addFragment(new BlankFragment2(),"Sliding Tab 2");
        pagerAdapter.addFragment(new BlankFragment3(),"Sliding Tab 3");
        pagerAdapter.addFragment(new BlankFragment4(),"Sliding Tab 4");
        pagerAdapter.addFragment(new BlankFragment5(),"Sliding Tab 5");
        pagerAdapter.addFragment(new BlankFragment6(),"Sliding Tab 6");
        viewPager.setAdapter(pagerAdapter);

        tabLayout.setupWithViewPager(viewPager,true);


        setSupportActionBar(toolbar);

        tabLayout.selectTab(tabLayout.getTabAt(0));
        tabLayout.setTabTextColors(Color.WHITE,Color.YELLOW);
        tabLayout.setSelectedTabIndicatorColor(Color.YELLOW);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                titleTv.setText(tab.getText());
                Log.d("Tag", "onTabSelected: "+tab.getText());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}
