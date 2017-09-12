package com.peppe.amanbhardwaj.peppe;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.peppe.amanbhardwaj.peppe.adapter.BuddiesRecyclerAdapter;
import com.peppe.amanbhardwaj.peppe.adapter.ServiceCategoryRecyclerAdapter;
import com.peppe.amanbhardwaj.peppe.util.TestUtil;

public class BuddiesListActivity extends AppCompatActivity {

    RecyclerView buddiesList;
    BuddiesRecyclerAdapter buddiesRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buddies_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        initGuiComponent();
    }

    private void initGuiComponent() {


        FloatingActionButton addBuddiesButton = (FloatingActionButton) findViewById(R.id.fab);
        addBuddiesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               naviagateToAddPetProfile();
            }
        });

        // buddies list
        // Service category list
        buddiesList = (RecyclerView)findViewById(R.id.buddiesList);
        buddiesRecyclerAdapter = new BuddiesRecyclerAdapter(this, TestUtil.getPetProfiles());
        buddiesList.setAdapter(buddiesRecyclerAdapter);
        buddiesList.setHasFixedSize(true);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        buddiesList.setLayoutManager(mLayoutManager);


        buddiesList.setItemAnimator(new DefaultItemAnimator());
    }

    private void naviagateToAddPetProfile() {
    }

}
