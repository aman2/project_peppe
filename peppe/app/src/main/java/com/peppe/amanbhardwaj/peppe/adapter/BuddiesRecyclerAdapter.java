package com.peppe.amanbhardwaj.peppe.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.peppe.amanbhardwaj.peppe.R;
import com.peppe.amanbhardwaj.peppe.bizobj.PetProfile;
import com.peppe.amanbhardwaj.peppe.bizobj.ServiceCategory;
import com.peppe.amanbhardwaj.peppe.viewholder.BuddiesItemViewHolder;
import com.peppe.amanbhardwaj.peppe.viewholder.ServiceCategoryViewHolder;
import com.squareup.picasso.Picasso;

import java.util.List;


/**
 * Created by nisheeth on 17/10/15.
 */
public class BuddiesRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final String LOG_TAG = BuddiesRecyclerAdapter.class.getName();

    Context mContext;
    List<PetProfile> mPetProfiles;


    //Overview mOverview;

    public BuddiesRecyclerAdapter(Context context){
        mContext = context;
    }

    public BuddiesRecyclerAdapter(Context context, List<PetProfile> petProfiles){
        mContext = context;
        this.mPetProfiles = petProfiles;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d("inside Overview","onCreateViewHolder" );
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.content_buddies_item, parent, false);
        RecyclerView.ViewHolder viewHolder = new BuddiesItemViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        Log.d("inside Overview", "onBindViewHolder" + position);
        BuddiesItemViewHolder holder = (BuddiesItemViewHolder) viewHolder;
        View itemView = viewHolder.itemView;

        holder.getBuddyName().setText(mPetProfiles.get(position).getPetName());
        String desc = mPetProfiles.get(position).getBreed() + " | " + mPetProfiles.get(position).getGender();
        holder.getBuddyDesc().setText(desc);
       // holder.getDisplayPic().setBackgroundResource(R.drawable.training1);

        Typeface regularFont = Typeface.createFromAsset(mContext.getAssets(), "comfortaa_regular.ttf");
       // Typeface boldFont = Typeface.createFromAsset(mContext.getAssets(), "comfortaa_bold.ttf");
        Typeface lightFont = Typeface.createFromAsset(mContext.getAssets(), "comfortaa_light.ttf");

        holder.getBuddyName().setTypeface(regularFont);
        holder.getBuddyDesc().setTypeface(regularFont);


        Picasso.with(mContext).load(R.drawable.puppy1).into(holder.getBuddyImg());
    }


    @Override
    public int getItemCount() {
        Log.d(LOG_TAG,"item count");
        return mPetProfiles.size();
    }

}
