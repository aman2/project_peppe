package com.peppe.amanbhardwaj.peppe;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.peppe.amanbhardwaj.peppe.adapter.ServiceCategoryRecyclerAdapter;
import com.peppe.amanbhardwaj.peppe.bizobj.ServiceCategory;
import com.peppe.amanbhardwaj.peppe.util.TestUtil;

import java.util.ArrayList;

public class LandingPageActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    RecyclerView categoryList;
    ServiceCategoryRecyclerAdapter serviceCategoryRecyclerAdapter;
    LinearLayout mUserDetails;
    TextView mUserName;
    ImageView mUserImage;
    NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        initGui();




    }

    private void initGui() {

        Typeface regularFont = Typeface.createFromAsset(this.getAssets(), "comfortaa_regular.ttf");

        // User Details
        View headerView = navigationView.inflateHeaderView(R.layout.nav_header_landing_page);

        mUserDetails = (LinearLayout) headerView.findViewById(R.id.user_details);
        mUserName = (TextView)headerView.findViewById(R.id.user_name);
        mUserImage = (ImageView)headerView.findViewById(R.id.userImg);

        mUserName.setTypeface(regularFont);

        mUserDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LandingPageActivity.this,UserDetailsActivity.class);
                startActivity(intent);
            }
        });

        // Service category list
        categoryList = (RecyclerView)findViewById(R.id.categoryList);
        serviceCategoryRecyclerAdapter = new ServiceCategoryRecyclerAdapter(this, TestUtil.getServiceCategoryList());
        categoryList.setAdapter(serviceCategoryRecyclerAdapter);
        categoryList.setHasFixedSize(true);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        categoryList.setLayoutManager(mLayoutManager);


        categoryList.setItemAnimator(new DefaultItemAnimator());
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.landing_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_my_buddies) {
        } else if (id == R.id.nav_orders) {

        } else if (id == R.id.nav_orders) {

        } else if (id == R.id.nav_contact_us) {

        } else if (id == R.id.nav_share) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}