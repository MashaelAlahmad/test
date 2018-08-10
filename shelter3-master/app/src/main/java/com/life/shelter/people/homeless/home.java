package com.life.shelter.people.homeless;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
   /// private String appUrl="https://play.google.com/store/apps/details?id=com.tahany.android.x_o";
    private String appUrl="https://play.google.com/store/apps/details?id=com.life.shelter.people.homeless";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {

        } else if (id == R.id.nav_account) {
            Intent it = new Intent(home.this, Account.class);
            startActivity(it);
        } else if (id == R.id.nav_about) {
            Intent it = new Intent(home.this, About.class);
            startActivity(it);
        } else if (id == R.id.nav_faq) {

            Intent it = new Intent(home.this, FAQ.class);
            startActivity(it);
        } else if (id == R.id.nav_charitable) {

            Intent it = new Intent(home.this, CharitableOrganizations.class);
            startActivity(it);
        } else if (id == R.id.nav_supporting) {

            Intent it = new Intent(home.this, Supporting.class);
            startActivity(it);
        } else if (id == R.id.nav_developers) {

            Intent it = new Intent(home.this, Developers.class);
            startActivity(it);
        } else if (id == R.id.nav_share) {

            ///////// written by Tahany Mahmoud/////////////
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_TEXT, appUrl);
            startActivity(Intent.createChooser(shareIntent, "Share using"));


        } else if (id == R.id.nav_rate) {

            ///////// written by Tahany Mahmoud/////////////
            AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(home.this);
            dialogBuilder.setTitle("Rate Us");
            dialogBuilder.setMessage("If you liked it, please rate it.");
            dialogBuilder.setPositiveButton("Rate", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(appUrl));
                    startActivity(i);
                    dialog.dismiss();
                }
            });

            dialogBuilder.setNegativeButton("Leave it", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });

            dialogBuilder.setNeutralButton("May be, later", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            dialogBuilder.create().show();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
