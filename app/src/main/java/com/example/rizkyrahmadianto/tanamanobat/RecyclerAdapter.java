package com.example.rizkyrahmadianto.tanamanobat;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import static android.R.attr.name;
import static com.example.rizkyrahmadianto.tanamanobat.R.id.tv_item_name;

/**
 * Created by Rizky Rahmadianto on 29/10/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.CardViewViewHolder>{

    private ArrayList<Tanaman> listTanaman;
    private Context context;

    public RecyclerAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Tanaman> getListTanaman() {
        return listTanaman;
    }

    public void setListTanaman(ArrayList<Tanaman> listTanaman) {
        this.listTanaman = listTanaman;
    }
    @Override
    public CardViewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        CardViewViewHolder viewHolder = new CardViewViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewViewHolder holder, int position) {

        Tanaman p = getListTanaman().get(position);

        Glide.with(context)
                .load(p.getPhoto())
                .override(350, 550)
                .into(holder.imgPhoto);

        holder.tvName.setText(p.getName());
        holder.tvRemarks.setText(p.getRemarks());

        holder.btnDetail.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {

            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Detail "+getListTanaman().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));

        holder.btnShare.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {

            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Share " + getListTanaman().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));
    }

    @Override
    public int getItemCount() {
        return getListTanaman().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvRemarks;
        Button btnDetail, btnShare;
        public CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = (ImageView)itemView.findViewById(R.id.img_item_photo);
            tvName = (TextView)itemView.findViewById(R.id.tv_item_name);
            tvRemarks = (TextView)itemView.findViewById(R.id.tv_item_remarks);
            btnDetail = (Button)itemView.findViewById(R.id.btn_set_detail);
            btnShare = (Button)itemView.findViewById(R.id.btn_set_share);
        }
    }
}
