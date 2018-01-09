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

public class PlacesFragment extends Fragment {

    private RecyclerView recyclerView;
    private GuideAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        List<LocationItem> list = new ArrayList<>();
        list.add(new LocationItem(getString(R.string.iskon), getString(R.string.iskno_address),
                getString(R.string.iskon_phone), getString(R.string.iskon_website), R.drawable.iskon));
        list.add(new LocationItem(getString(R.string.banneragatta), getString(R.string.banneragatta_address),
                getString(R.string.banneragatta_phone), getString(R.string.bannergatta_website), R.drawable.banner_gatta));
        list.add(new LocationItem(getString(R.string.lalbagh), getString(R.string.lalbagh_address),
                getString(R.string.lalbagh_phone), getString(R.string.lalbagh_website), R.drawable.lalbagh));
        list.add(new LocationItem(getString(R.string.vidhana_soudha), getString(R.string.vidhana_soudha_address),
                getString(R.string.vidhana_soudha_phone), getString(R.string.vidhana_soudha_website), R.drawable.vidhansoudha));
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