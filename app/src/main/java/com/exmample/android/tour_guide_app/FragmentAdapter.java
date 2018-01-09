

package com.exmample.android.tour_guide_app;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class FragmentAdapter extends FragmentPagerAdapter {

    private Context context;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new PlacesFragment();
            case 1:
                return new MallFragment();
            case 2:
                return new HospitalFragment();
            case 3:
                return new RestaurantFragment();
            default:
                return new PlacesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.places);
            case 1:
                return context.getString(R.string.malls);
            case 2:
                return context.getString(R.string.hospitals);
            case 3:
                return context.getString(R.string.restaurants);
            default:
                return "";
        }
    }

}
