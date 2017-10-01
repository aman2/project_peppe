package com.peppe.amanbhardwaj.peppe.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.peppe.amanbhardwaj.peppe.R;
import com.peppe.amanbhardwaj.peppe.landingpagemodels.ServiceItemObj;

import java.util.List;

/**
 * Created by amanbhardwaj on 10/2/17.
 */

public class SectionListDataAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<ServiceItemObj> itemsList;
    private Context mContext;
    private String serviceType;

    public SectionListDataAdapter(Context context, List<ServiceItemObj> itemsList,String serviceType) {
        this.itemsList = itemsList;
        this.mContext = context;
        this.serviceType = serviceType;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = null;
        RecyclerView.ViewHolder mh = null;
         if(serviceType.equalsIgnoreCase("CATEGORY")){
             v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.category_item_dashboard, null);
             mh = new CategoryItemRowHolder(v);
         }else {
             v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.service_item_dashboard, null);
             mh = new ServiceItemRowHolder(v);
         }

        return mh;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {

        ServiceItemObj singleItem = itemsList.get(i);
        if(serviceType.equalsIgnoreCase("CATEGORY")){
            CategoryItemRowHolder categoryItemRowHolder = (CategoryItemRowHolder) holder;
            categoryItemRowHolder.tvTitle.setText(singleItem.getTitle());
        }else {
            ServiceItemRowHolder serviceItemRowHolder = (ServiceItemRowHolder) holder;
            serviceItemRowHolder.tvTitle.setText(singleItem.getTitle());
        }





       /* Glide.with(mContext)
                .load(feedItem.getImageURL())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .error(R.drawable.bg)
                .into(feedListRowHolder.thumbView);*/
    }

    @Override
    public int getItemCount() {
        return (null != itemsList ? itemsList.size() : 0);
    }

    public class ServiceItemRowHolder extends RecyclerView.ViewHolder {

        protected TextView tvTitle;

        protected ImageView itemImage;

        protected RatingBar ratingBar;



        public ServiceItemRowHolder(View view) {
            super(view);

            this.tvTitle = (TextView) view.findViewById(R.id.tvTitle);
            this.itemImage = (ImageView) view.findViewById(R.id.itemImage);
            this.ratingBar = (RatingBar) view.findViewById(R.id.ratingBar);


            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    Toast.makeText(v.getContext(), tvTitle.getText(), Toast.LENGTH_SHORT).show();

                }
            });


        }

    }

    public class CategoryItemRowHolder extends RecyclerView.ViewHolder {

        protected TextView tvTitle;

        protected ImageView itemImage;




        public CategoryItemRowHolder(View view) {
            super(view);

            this.tvTitle = (TextView) view.findViewById(R.id.tvTitle);
            this.itemImage = (ImageView) view.findViewById(R.id.itemImage);


            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), tvTitle.getText(), Toast.LENGTH_SHORT).show();
                }
            });


        }

    }

}