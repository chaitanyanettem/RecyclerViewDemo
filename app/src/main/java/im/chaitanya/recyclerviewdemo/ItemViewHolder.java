package im.chaitanya.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class ItemViewHolder extends RecyclerView.ViewHolder {

    public final TextView textView;

    public ItemViewHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView;

    }
}