package com.example.test1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    ArrayList<Exercises> exercisesArrayList;

    public MyAdapter(Context context, ArrayList<Exercises> exercisesArrayList) {
        this.context = context;
        this.exercisesArrayList = exercisesArrayList;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(context).inflate(R.id)

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return exercisesArrayList.size();

    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView  name,about, description,  instruction,  warning;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.tvName);
            about=itemView.findViewById(R.id.tvAbout);
            description=itemView.findViewById(R.id.tvDescription);
            instruction=itemView.findViewById(R.id.tvInstruction);
            warning=itemView.findViewById(R.id.tvWarning);
        }
    }
}
