package com.example.hi.apptruyentranh.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.hi.apptruyentranh.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by hi on 3/4/2018.
 */

public class FragmentHome extends Fragment {
    @BindView(R.id.title)
    TextView titile;
    @BindView(R.id.more_info)
    TextView more_info;
    @BindView(R.id.layoutperivous)
    RelativeLayout layoutperivous;
    @BindView(R.id.layoutnext)
    RelativeLayout layoutnext;
    String TAG = "FragmentHome";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_home,container,false);
        ButterKnife.bind(this, view);
//        nestedScrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
//            @Override
//            public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
//
////                if (scrollY > oldScrollY) {
////                    Log.i(TAG, "Scroll DOWN");
////                }
////                if (scrollY < oldScrollY) {
////                    Log.i(TAG, "Scroll UP");
////                }
////
////                if (scrollY == 0) {
////                    Log.i(TAG, "TOP SCROLL");
////                }
//                if (scrollY == (v.getChildAt(0).getMeasuredHeight() - v.getMeasuredHeight())) {
//                    Log.i(TAG, "BOTTOM SCROLL");
//                    layoutperivous.setVisibility(View.VISIBLE);
//                    layoutnext.setVisibility(View.VISIBLE);
//                } else {
//                    layoutperivous.setVisibility(View.GONE);
//                    layoutnext.setVisibility(View.GONE);
//                }
//            }
//        });
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
