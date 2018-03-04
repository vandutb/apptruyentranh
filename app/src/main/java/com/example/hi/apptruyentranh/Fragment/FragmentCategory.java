package com.example.hi.apptruyentranh.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hi.apptruyentranh.Adapter.AdapterCategory;
import com.example.hi.apptruyentranh.R;

/**
 * Created by hi on 3/4/2018.
 */

public class FragmentCategory extends Fragment implements AdapterCategory.onItemClickListener {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_category,container,false);

        return view;
    }

    @Override
    public void onItemClickListenner(int position) {
        //bắt sự kiện onclick item tại đây
    }
}
