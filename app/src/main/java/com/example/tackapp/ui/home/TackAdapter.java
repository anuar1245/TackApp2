package com.example.tackapp.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tackapp.Models.Tack;
import com.example.tackapp.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class TackAdapter extends RecyclerView.Adapter<TackAdapter.ViewHolder> {

    private ArrayList<Tack> list =  new ArrayList<>();


    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_tack,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {
holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public void addItem(Tack tack) {
        list.add(tack);
        notifyItemInserted(list.indexOf(tack));


    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textTitle ;

        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            textTitle = itemView.findViewById(R.id.textTitle);
        }

        public void bind(Tack tack) {
            textTitle.setText(tack.getTitle());
        }
    }
}
