package com.example.vooch.dogruz.ui.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.vooch.dogruz.R;

public class DriverAdapter {

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView mNameTxt;
        TextView mFromTxt;
        TextView mToPlaceTxt;
        TextView mRatingTxt;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mNameTxt = itemView.findViewById(R.id.txtDriverName);
            mFromTxt = itemView.findViewById(R.id.txtFromPlace);
            mToPlaceTxt = itemView.findViewById(R.id.txtToPlace);
        }
    }
}
