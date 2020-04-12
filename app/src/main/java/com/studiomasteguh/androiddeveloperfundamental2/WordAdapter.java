package com.studiomasteguh.androiddeveloperfundamental2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class WordAdapter extends RecyclerView.Adapter<WordAdapter.ViewHolder> {
    private final LinkedList<String> list;
    private final LayoutInflater mInflater;

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvItem;
        WordAdapter mAdapter;

        public ViewHolder(@NonNull View itemView, WordAdapter adapter) {
            super(itemView);
            tvItem = itemView.findViewById(R.id.tv_word);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int i = getLayoutPosition();

            String e = list.get(i);

            list.set(i, "Clicked" +  e);
            mAdapter.notifyDataSetChanged();

        }
    }

    public WordAdapter(Context context, LinkedList<String> wordList) {
        mInflater = LayoutInflater.from(context);
        this.list = wordList;
    }

    @NonNull
    @Override
    public WordAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_word, parent, false);
        return new ViewHolder(view, this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordAdapter.ViewHolder holder, int position) {
        String mCurrent = list.get(position);
        holder.tvItem.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return 0;
    }


}
