package com.example.ujicobaan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.SongViewHolder> {
    Context mCtx;
    ArrayList<Song>songs;
    LayoutInflater mInflater;

    public SongAdapter(Context ctx, ArrayList<Song> songs) {
        mCtx = ctx;
        this.songs = songs;
        mInflater = LayoutInflater.from(ctx);
    }

    @NonNull
    @Override
    public SongAdapter.SongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.row_song,parent,false);
        return new SongViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull SongAdapter.SongViewHolder holder, int position) {
        Song currSong = songs.get(position);
        holder.tvTitle.setText(currSong.title);
        holder.tvArtist.setText(currSong.artist);
    }

    @Override
    public int getItemCount() {
        return songs.size();
    }

    public static class SongViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        SongAdapter songAdapter;
        TextView tvTitle, tvArtist;
        public SongViewHolder(@NonNull View itemView, SongAdapter adapter) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvArtist = itemView.findViewById(R.id.tvArtis);
            songAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(itemView.getContext(),tvTitle.getText().toString()+"is clicked",Toast.LENGTH_LONG).show();
        }
    }
}
