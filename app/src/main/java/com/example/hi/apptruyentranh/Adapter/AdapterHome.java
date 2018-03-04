package com.example.hi.apptruyentranh.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.hi.apptruyentranh.OBJECTS.ObjHome;
import com.example.hi.apptruyentranh.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by hi on 3/4/2018.
 */

public class AdapterHome extends RecyclerView.Adapter<AdapterHome.holder>{
    private List<ObjHome> objHomeList;
    private Context context;
    private onRecyclerviewListener onRecyclerviewListener;
    public AdapterHome(List<ObjHome> objHomes) {
        objHomeList = objHomes;
    }

    @Override
    public holder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.layout_item_home,parent,false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(holder holder, int position) {
        if (position == objHomeList.size() - 1) {
            onRecyclerviewListener.onScrollToLastItemListener(true);
        }else {
            onRecyclerviewListener.onScrollToLastItemListener(false);
        }
        Picasso.with(context).load(objHomeList.get(position).getUrl()).error(R.drawable.img_noimage2x).into(holder.infoImg);
    }


    @Override
    public int getItemCount() {
        return 0;
    }

    public class holder extends RecyclerView.ViewHolder {
        @BindView(R.id.info_img)
        ImageView infoImg;
        public holder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
    public AdapterHome onScrollRecyclerView(onRecyclerviewListener onRecyclerviewListener){
        this.onRecyclerviewListener = onRecyclerviewListener;
        return this;
    }
    public interface onRecyclerviewListener{
        void onScrollToLastItemListener(boolean islastItem);
    }
}
