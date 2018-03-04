package com.example.hi.apptruyentranh.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.hi.apptruyentranh.OBJECTS.Category;
import com.example.hi.apptruyentranh.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by hi on 3/4/2018.
 */

public class AdapterCategory extends RecyclerView.Adapter<AdapterCategory.holder> {
    private Context context;
    private List<Category> categories;
    public AdapterCategory(List<Category> categories) {
        this.categories = categories;
    }

    @Override
    public holder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.item_category,parent);
        return null;
    }

    @Override
    public void onBindViewHolder(holder holder, int position) {
        holder.name.setText(categories.get(position).getCategoryName());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class holder extends RecyclerView.ViewHolder{
        @BindView(R.id.bbn_background)
        RelativeLayout backgroud;
        @BindView(R.id.name_item)
        TextView name;
        public holder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
