package com.study.recyclerview_demo;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.ViewHolder {

  public class CustomViewHolder extends RecyclerView.ViewHolder {
      public CustomViewHolder(@NonNull View itemView) {
          super(itemView);
      }
  }
}
