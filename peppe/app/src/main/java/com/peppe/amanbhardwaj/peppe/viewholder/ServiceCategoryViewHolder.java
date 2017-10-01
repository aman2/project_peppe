package com.peppe.amanbhardwaj.peppe.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.peppe.amanbhardwaj.peppe.R;


/**
 * Created by nisheeth on 03/11/15.
 */
public class ServiceCategoryViewHolder extends  RecyclerView.ViewHolder {

    private TextView categoryName;
    //private TextView activeDealCount;
    private ImageView displayPic;


    public ServiceCategoryViewHolder(View v) {
        super(v);
        categoryName = (TextView)v.findViewById(R.id.list_category_title);
        //activeDealCount = (TextView)v.findViewById(R.id.activeDeal1);
        displayPic = (ImageView) v.findViewById(R.id.list_category_pic);

    }

    public TextView getCategoryName() {
        return categoryName;
    }

    /*public TextView getActiveDealCount() {
        return activeDealCount;
    }*/

    public ImageView getDisplayPic() {
        return displayPic;
    }

}
