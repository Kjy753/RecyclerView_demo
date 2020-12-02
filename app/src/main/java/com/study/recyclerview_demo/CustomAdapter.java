package com.study.recyclerview_demo;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter {

    private ArrayList<Dictionary> mList;

  public class CustomViewHolder extends RecyclerView.ViewHolder {
      protected TextView id;
      protected TextView english;
      protected TextView korean;
      public CustomViewHolder(@NonNull View itemView) {
          super(itemView);
          this.id = (TextView) itemView.findViewById(R.id.id_listitem);
          this.english = (TextView) itemView.findViewById(R.id.english_listitem);
          this.korean = (TextView) itemView.findViewById(R.id.korean_listitem);
      }
  }

    public CustomAdapter(ArrayList<Dictionary> mList) {
        this.mList = mList;
    }
}
