package com.exmample.android.tour_guide_app;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class GuideAdapter extends RecyclerView.Adapter<GuideAdapter.RecyclerViewHolder> {

    private List<LocationItem> items;

    public GuideAdapter(List<LocationItem> locationsList) {
        items = locationsList;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new RecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        LocationItem locationItem = items.get(position);
        holder.image.setImageResource(locationItem.getImageResource());
        holder.title.setText(locationItem.getTitle());
        holder.website.setText(locationItem.getWebsite());
        holder.phone.setText(locationItem.getPhoneNumber());
        holder.address.setText(locationItem.getAddress());

    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        public ImageView image;
        public TextView title, address, phone, website;

        public RecyclerViewHolder(View view) {
            super(view);
            image = view.findViewById(R.id.imageView);
            title = view.findViewById(R.id.title_tv);
            address = view.findViewById(R.id.address_tv);
            phone = view.findViewById(R.id.phone_tv);
            website = view.findViewById(R.id.website_tv);
        }
    }
}
