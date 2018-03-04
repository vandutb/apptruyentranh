package com.example.hi.apptruyentranh.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hungl on 20-Oct-17.
 */

public class HomePagerAdapter extends FragmentPagerAdapter {
  private final List<Fragment> mFragmentList = new ArrayList<>();
  public HomePagerAdapter(FragmentManager fm) {
    super(fm);
  }

  @Override
  public Fragment getItem(int position) {

    return mFragmentList.get(position);
  }

  @Override
  public int getCount() {
    return mFragmentList.size();
  }

  public void addFragment(Fragment fragment) {
    mFragmentList.add(fragment);
  }

}
