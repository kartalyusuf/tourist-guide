package com.kartal.navigationdrawer2;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    List<Model> my_list ;
    Context context;

    public CustomAdapter(List<Model> my_list, Context context) {
        this.my_list = my_list;
        this.context = context;
    }

    @NonNull
    @Override
    public CustomAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_list_item,parent,false);


        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.MyViewHolder holder, int position) {

        Model model = my_list.get(position);
        holder.name.setText(model.getPlace_name());
        holder.comment.setText(model.getComment_name());
        holder.image.setImageResource(model.getImage());
        holder.relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context,ResimDetay.class);
                intent.putExtra("image",model.getImage());
                intent.putExtra("name",model.getPlace_name());
                intent.putExtra("comment",model.getComment_name());
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return my_list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView name , comment ;
        RelativeLayout relative ;



        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.name);
            comment = itemView.findViewById(R.id.comment);
            relative = itemView.findViewById(R.id.relative);


        }
    }
}
