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


public class MallFragment extends Fragment {

    private RecyclerView recyclerView;
    private GuideAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        List<LocationItem> list = new ArrayList<>();
        list.add(new LocationItem(getString(R.string.gopalan_mall), getString(R.string.gopalan_address),
                getString(R.string.gopalan_phone), getString(R.string.gopalan_website), R.drawable.gopalan_mall));
        list.add(new LocationItem(getString(R.string.mantri_mall), getString(R.string.mantri_address),
                getString(R.string.mantri_phone), getString(R.string.mantri_website), R.drawable.mantri_mall));
        list.add(new LocationItem(getString(R.string.orion_mall), getString(R.string.orion_address),
                getString(R.string.orion_phone), getString(R.string.orion_website), R.drawable.orion_mall));
        list.add(new LocationItem(getString(R.string.royal_meenakshi), getString(R.string.royal_address),
                getString(R.string.royal_phone), getString(R.string.royal_website), R.drawable.royal_meenakshi_mall));
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