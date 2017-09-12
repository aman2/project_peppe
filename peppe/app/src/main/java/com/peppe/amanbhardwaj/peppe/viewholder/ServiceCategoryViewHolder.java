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
    private TextView activeDealCount;
    private LinearLayout displayPic;


    public ServiceCategoryViewHolder(View v) {
        super(v);
        categoryName = (TextView)v.findViewById(R.id.categoryName1);
        activeDealCount = (TextView)v.findViewById(R.id.activeDeal1);
        displayPic = (LinearLayout) v.findViewById(R.id.displayPic1);

    }

    public TextView getCategoryName() {
        return categoryName;
    }

    public TextView getActiveDealCount() {
        return activeDealCount;
    }

    public LinearLayout getDisplayPic() {
        return displayPic;
    }

}
