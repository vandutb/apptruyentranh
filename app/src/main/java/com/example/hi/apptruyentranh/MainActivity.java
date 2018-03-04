package com.example.hi.apptruyentranh;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.hi.apptruyentranh.Fragment.FragmentCategory;
import com.example.hi.apptruyentranh.Fragment.FragmentNoti;
import com.example.hi.apptruyentranh.Adapter.HomePagerAdapter;
import com.example.hi.apptruyentranh.Fragment.FragmentHome;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.home_page)
    ViewPager viewPager;
    @BindView(R.id.bottom_navigation)
    BottomNavigationView bottomNavigation;
    HomePagerAdapter homePagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        viewPager.setOffscreenPageLimit(2);

//        bottomNavigation.setOnMenuItemClickListener(new BottomNavigation.OnMenuItemSelectionListener() {
//            @Override
//            public void onMenuItemSelect(@IdRes int i, int position, boolean b) {
//                position = position > 2 ? 0 : position;
//                position = position < 0 ? 2 : position;
//
//                viewPager.setCurrentItem(position, true);
//            }
//
//            @Override
//            public void onMenuItemReselect(@IdRes int i, int i1, boolean b) {
//
//            }
//        });
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.home:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.category:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.noti:
                        viewPager.setCurrentItem(2);
                        break;
                }

                return false;
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
//                bottomNavigation.setSelectedIndex(position, false);
                for (int i=0; i< 3;i++) {
                    if (i == position) {
                        bottomNavigation.getMenu().getItem(i).setChecked(true);
                    }else {
                        bottomNavigation.getMenu().getItem(i).setChecked(false);
                    }
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        setViewPager();
    }

    private void setViewPager() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                homePagerAdapter = new HomePagerAdapter(getSupportFragmentManager());
                Fragment fragment = new FragmentHome();
                Fragment fragment1 = new FragmentCategory();
                Fragment fragment2 = new FragmentNoti();
                homePagerAdapter.addFragment(fragment);
                homePagerAdapter.addFragment(fragment1);
                homePagerAdapter.addFragment(fragment2);
                viewPager.setAdapter(homePagerAdapter);
            }
        });
    }
}
