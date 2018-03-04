package com.example.hi.apptruyentranh.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.hi.apptruyentranh.Adapter.AdapterHome;
import com.example.hi.apptruyentranh.OBJECTS.ObjHome;
import com.example.hi.apptruyentranh.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by hi on 3/4/2018.
 */

public class FragmentHome extends Fragment implements AdapterHome.onRecyclerviewListener {
    @BindView(R.id.title)
    TextView titile;
    @BindView(R.id.more_info)
    TextView more_info;
    @BindView(R.id.layoutperivous)
    RelativeLayout layoutperivous;
    @BindView(R.id.layoutnext)
    RelativeLayout layoutnext;
    String TAG = "FragmentHome";
    @BindView(R.id.list_item_newest)
    RecyclerView recyclerViews;

    private List<ObjHome> objHomeList;
    private AdapterHome adapterHome;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_home,container,false);
        ButterKnife.bind(this, view);
        objHomeList = new ArrayList<>();
        adapterHome = new AdapterHome(objHomeList);
        recyclerViews.setAdapter(adapterHome);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onScrollToLastItemListener(boolean isLastItem) {
        //nếu scroll xuống dưới cùng hiện 2 nút bên cạnh
        //chưa test nên có thể không được
        if (isLastItem)
        {
            layoutperivous.setVisibility(View.VISIBLE);
            layoutnext.setVisibility(View.VISIBLE);
        }else {
            layoutperivous.setVisibility(View.GONE);
            layoutnext.setVisibility(View.GONE);
        }

    }
}
