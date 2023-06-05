package com.example.test1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapterList   extends RecyclerView.Adapter<MyAdapterList.MyViewHolder>{

    private String [] mDataset;
    Context context;

    public MyAdapterList(Context context,String [] mDataset  ) {
        this.context = context;
        this.mDataset = mDataset;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView  name;
        LinearLayout loutRv;
      //  ImageView photo;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.tvNameL);
          // photo=itemView.findViewById(R.id.ivPhoto);
            loutRv=itemView.findViewById(R.id.loutRvL);
        }
    }
    public MyAdapterList(String [] myDataset){ mDataset = myDataset;}
    @Override
    public MyAdapterList.MyViewHolder onCreateViewHolder(ViewGroup parent , int viewType){
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlist,parent,false);
        return new MyViewHolder(v);

    }
    @Override
    public void onBindViewHolder(MyViewHolder holder,int position){
        holder.name.setText(mDataset[position]);

        holder.loutRv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppCompatActivity activity = (AppCompatActivity) context;
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.FramlayoutMain,new Details()).addToBackStack(null).commit();

            }

        });
    }
    @Override
    public int getItemCount(){return mDataset.length;}
}
