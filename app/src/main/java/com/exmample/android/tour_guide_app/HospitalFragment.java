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


public class HospitalFragment extends Fragment {

    private RecyclerView recyclerView;
    private GuideAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        List<LocationItem> list = new ArrayList<>();
        list.add(new LocationItem(getString(R.string.apollo_hospital), getString(R.string.apollo_address),
                getString(R.string.apollo_phone), getString(R.string.apollo_website), R.drawable.appollo_hospital));
        list.add(new LocationItem(getString(R.string.bgs_global_hospital), getString(R.string.bgs_address),
                getString(R.string.bgs_phone), getString(R.string.bgs_website), R.drawable.bgs_global_hospital));
        list.add(new LocationItem(getString(R.string.columbia_asia_hospital), getString(R.string.columbia_address),
                getString(R.string.columbia_phone), getString(R.string.columbia_website), R.drawable.columbia_asia_hospital));
        list.add(new LocationItem(getString(R.string.narayana_hrudayalaya), getString(R.string.narayana_address),
                getString(R.string.narayana_phone), getString(R.string.narayana_website), R.drawable.narayana_hrudayalaya_hospital));
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