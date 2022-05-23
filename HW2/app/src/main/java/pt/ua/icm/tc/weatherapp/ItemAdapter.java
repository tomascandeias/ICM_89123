package pt.ua.icm.tc.weatherapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private final List<Model> itemList1;

    public ItemAdapter(List<Model> itemList) {
        this.itemList1=itemList;
    }

    @NonNull
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.rowitem, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.itemtxt.setText(itemList1.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return itemList1.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView itemtxt;
        LinearLayout linearLayout;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemtxt=itemView.findViewById(R.id.itemName);
            linearLayout=itemView.findViewById(R.id.layout_id);
        }
    }
}
