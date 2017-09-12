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
public class BuddiesItemViewHolder extends  RecyclerView.ViewHolder {

    private TextView buddyName;
    private TextView buddyDesc;
    private ImageView buddyImg;


    public BuddiesItemViewHolder(View v) {
        super(v);
        buddyName = (TextView)v.findViewById(R.id.buddyName);
        buddyDesc = (TextView)v.findViewById(R.id.buddyDesc);
        buddyImg = (ImageView) v.findViewById(R.id.buddyImg);

    }

    public TextView getBuddyName() {
        return buddyName;
    }

    public TextView getBuddyDesc() {
        return buddyDesc;
    }

    public ImageView getBuddyImg() {
        return buddyImg;
    }

}
