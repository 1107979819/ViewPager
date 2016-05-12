package top.wenyl.viewpager.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lzy.widget.tab.PagerSlidingTabStrip;

import java.util.ArrayList;

import fragment.FragmentB;
import fragment.FragmentA;
import fragment.FragmentC;
import fragment.FragmentD;
import fragment.FragmentE;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Fragment> fragments;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        PagerSlidingTabStrip tab = (PagerSlidingTabStrip) findViewById(R.id.tab);

        fragments = new ArrayList<>();
        fragments.add(new FragmentA());
        fragments.add(new FragmentB());
        fragments.add(new FragmentC());
        fragments.add(new FragmentD());
        fragments.add(new FragmentE());

        viewPager.setAdapter(new MyAdapter(getSupportFragmentManager()));
        tab.setViewPager(viewPager);
    } @Override
    protected void onDestroy() {
        super.onDestroy();

    }

    private class MyAdapter extends FragmentPagerAdapter {

        private String[] titles = {"A", "B", "C","D","E"};

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }
    }
}