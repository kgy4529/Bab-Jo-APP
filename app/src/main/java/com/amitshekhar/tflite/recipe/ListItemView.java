package com.amitshekhar.tflite.recipe;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.amitshekhar.tflite.R;

public class ListItemView extends LinearLayout {

    private TextView cooking_no, cooking_dc;
    private ImageView cooking_profile;

    public ListItemView(Context context){
        super(context);
        init(context);
    }

    public ListItemView(Context context, @Nullable AttributeSet attrs){
        super(context, attrs);

    }

    //아이템 하나(순서, 설명)에 대한 레이아웃을 인플레이션화해서 붙이는 역할
    private void init(Context context){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.item_listview, this, true);

        cooking_no = findViewById(R.id.cooking_no);
        cooking_dc = findViewById(R.id.cooking_dc);
        //cooking_profile = findViewById(R.id.re_profile);


    }

    public void setNo(String no){
        cooking_no.setText(no);
    }

    public void setDc(String dc){
        cooking_dc.setText(dc);
    }

//    public void setImage(int resId){
//        cooking_profile.setImageResource(resId);
//    }
}
