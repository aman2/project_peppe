package com.peppe.amanbhardwaj.peppe.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.peppe.amanbhardwaj.peppe.R;
import com.peppe.amanbhardwaj.peppe.bizobj.ServiceCategory;
import com.peppe.amanbhardwaj.peppe.viewholder.ServiceCategoryViewHolder;
import com.squareup.picasso.Picasso;

import java.util.List;


/**
 * Created by nisheeth on 17/10/15.
 */
public class ServiceCategoryRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final String LOG_TAG = ServiceCategoryRecyclerAdapter.class.getName();

    Context mContext;
    List<ServiceCategory> mCategories;


    //Overview mOverview;

    public ServiceCategoryRecyclerAdapter(Context context){
        mContext = context;
    }

    public ServiceCategoryRecyclerAdapter(Context context, List<ServiceCategory> categories){
        mContext = context;
        this.mCategories = categories;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d("inside Overview","onCreateViewHolder" );
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
      //  View v = inflater.inflate(R.layout.content_category_item1, parent, false);
       // RecyclerView.ViewHolder viewHolder = new ServiceCategoryViewHolder(v);
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        Log.d("inside Overview", "onBindViewHolder" + position);
        ServiceCategoryViewHolder holder = (ServiceCategoryViewHolder) viewHolder;
        View itemView = viewHolder.itemView;

        holder.getCategoryName().setText(mCategories.get(position).getServiceCategoryName());
        //holder.getActiveDealCount().setText(mCategories.get(position).getTotalActiveDeals()+" Active Deals");
        holder.getDisplayPic().setBackgroundResource(R.drawable.training1);

        Typeface regularFont = Typeface.createFromAsset(mContext.getAssets(), "comfortaa_regular.ttf");
       // Typeface boldFont = Typeface.createFromAsset(mContext.getAssets(), "comfortaa_bold.ttf");
        Typeface lightFont = Typeface.createFromAsset(mContext.getAssets(), "comfortaa_light.ttf");

        holder.getCategoryName().setTypeface(regularFont);
       // holder.getActiveDealCount().setTypeface(regularFont);


        Picasso.with(mContext).load(R.drawable.puppy1).into(holder.getDisplayPic());
    }


    @Override
    public int getItemCount() {
        Log.d(LOG_TAG,"item count");
        return mCategories.size();
    }

}
