package com.exmample.android.tour_guide_app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class RestaurantFragment extends Fragment {

    private RecyclerView recyclerView;
    private GuideAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        List<LocationItem> list = new ArrayList<>();
        list.add(new LocationItem(getString(R.string.barbeque), getString(R.string.barbeque_address),
                getString(R.string.barbeque_phone), getString(R.string.barbeque_website), R.drawable.barbeque_nation_restaurant));
        list.add(new LocationItem(getString(R.string.nandini_restaurant), getString(R.string.nandini_address),
                getString(R.string.nandini_phone), getString(R.string.nandini_website), R.drawable.nandini_restaurant));
        list.add(new LocationItem(getString(R.string.punjabi_grill), getString(R.string.punkabi_address),
                getString(R.string.punkabi_phone), getString(R.string.punjabi_website), R.drawable.punjabi_grill_restaurant));
        list.add(new LocationItem(getString(R.string.taj_vivant), getString(R.string.taj_address),
                getString(R.string.taj_phone), getString(R.string.taj_website), R.drawable.taj_vivant_restaurant));
        View view = inflater.inflate(R.layout.locations_list, container, false);
        recyclerView = view.findViewById(R.id.recycler_view);
        adapter = new GuideAdapter(list);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        return view;
    }
}
