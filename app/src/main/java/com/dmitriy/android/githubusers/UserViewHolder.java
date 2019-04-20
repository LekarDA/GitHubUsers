package com.dmitriy.android.githubusers;

import android.view.View;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import de.hdodenhof.circleimageview.CircleImageView;

public class UserViewHolder extends RecyclerView.ViewHolder {

    private CircleImageView ivPhoto;
    private TextView tvName;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        ivPhoto = itemView.findViewById(R.id.photo);
        tvName = itemView.findViewById(R.id.name);
    }

    public void setName(String name) {
        this.tvName.setText(name);
    }

    public void setPhoto(String photo){
        Picasso.get().load(photo).into(ivPhoto);
    }
}
