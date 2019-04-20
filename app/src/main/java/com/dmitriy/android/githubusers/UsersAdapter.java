package com.dmitriy.android.githubusers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.dmitriy.android.githubusers.models.User;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UsersAdapter extends RecyclerView.Adapter<UserViewHolder> {

    private ArrayList<User> users;

    public UsersAdapter(){
        users = new ArrayList<>();
    }

    public void setUsers(ArrayList<User> users){
        this.users.clear();
        this.users.addAll(users);
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_item, parent, false);
        UserViewHolder viewHolder = new UserViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.setName(users.get(position).getName());
        holder.setPhoto(users.get(position).getPhotolink());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
