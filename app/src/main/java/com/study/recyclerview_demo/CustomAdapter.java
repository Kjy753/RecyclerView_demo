package com.study.recyclerview_demo;

import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

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

    /*카운트 다음으로 호출되는 함수로 ViewHolder이 생성되는 함수로서 여기서 ViewHolder 객체를만들어주면 됩니다.*/
    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_list,viewGroup,false);

        CustomViewHolder viewHolder = new CustomViewHolder(view);

        return  viewHolder;
    }

    /*생성된 뷰 홀더에 데이터를 바인드 해주는 함수입니다.*/
    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.id.setText(mList.get(position).getId());
        holder.english.setText(mList.get(position).getEnglish());
        holder.korean.setText(mList.get(position).getKorean());
    }
        /*가정 먼저 우리가 뿌려줄 데이터의 전체 길이를 리턴하는 getItemCount 메소드가 실행.*/
    @Override
    public int getItemCount() {
        return 0;

    }
}
