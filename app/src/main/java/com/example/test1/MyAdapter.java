package com.example.test1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
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

        View v= LayoutInflater.from(context).inflate(R.layout.itemexe,parent,false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {

        Exercises exercise=exercisesArrayList.get(position);

        holder.name.setText(exercise.getName());
        holder.about.setText(exercise.getAbout());
        holder.description.setText(exercise.getDescription());
        holder.instruction.setText(exercise.getInstruction());
        holder.warning.setText(exercise.getWarning());

        holder.loutRv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppCompatActivity activity = (AppCompatActivity) context;
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.FramlayoutMain,new Details()).addToBackStack(null).commit();
            }

        });


    }



    @Override
    public int getItemCount() {
        return exercisesArrayList.size();

    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView  name,about, description,  instruction,  warning;
        LinearLayout loutRv;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.tvNameL);
            about=itemView.findViewById(R.id.tvAbout);
            description=itemView.findViewById(R.id.tvDescription);
            instruction=itemView.findViewById(R.id.tvInstruction);
            warning=itemView.findViewById(R.id.tvWarning);
            loutRv=itemView.findViewById(R.id.loutRvL);
        }
    }

}
