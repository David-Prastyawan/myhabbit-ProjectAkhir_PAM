package com.myhabbit.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.myhabbit.database.DaftarController;
import com.myhabbit.R;

import java.util.ArrayList;
import java.util.List;

public class DaftarAdapter extends RecyclerView.Adapter<DaftarAdapter.DaftarViewHolder> {

    private List<DaftarController> listDaftarController = new ArrayList<>();

    public DaftarAdapter(List<DaftarController> listDaftarController) {
        this.listDaftarController = listDaftarController;
    }

    private OnDaftarClickListener listener;

    public interface OnDaftarClickListener {
        void onClick(View view, int position);
    }

    public void setListener(OnDaftarClickListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public DaftarViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vh = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list, viewGroup, false);
        DaftarViewHolder viewHolder = new DaftarViewHolder(vh);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DaftarViewHolder listViewHolder, int i) {

        DaftarController item = listDaftarController.get(i);
        listViewHolder.txtSurah.setText(item.getSurah());
        listViewHolder.txtPanduan.setText(item.getPanduan());
        listViewHolder.txtArab.setText(item.getArab());
        listViewHolder.txtArti.setText(item.getArti());
    }

    @Override
    public int getItemCount() {
        return listDaftarController.size();
    }

    public class DaftarViewHolder extends RecyclerView.ViewHolder {
        public TextView txtSurah, txtPanduan, txtArab, txtArti;

        public DaftarViewHolder(@NonNull View itemView) {
            super(itemView);
            txtSurah = itemView.findViewById(R.id.txtSurah);
            txtPanduan = itemView.findViewById(R.id.txtPanduan);
            txtArab = itemView.findViewById(R.id.txtArab);
            txtArti = itemView.findViewById(R.id.txtArti);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onClick(v, getAdapterPosition());
                }
            });
        }
    }
}
