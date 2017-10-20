package com.example.b23_customviews.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.b23_customviews.R;

/**
 * Created by DrakeBoltz on 3/10/2017.
 */

public class HeaderView extends RelativeLayout{

    private TextView titleTv;
    private Button loginBtn;

    public HeaderView(Context context) {
        super(context);
        init();
    }

    public HeaderView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public HeaderView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    private void init(){
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View view = layoutInflater.inflate(R.layout.header_view_layout, null);

        addView(view);

        titleTv = (TextView) findViewById(R.id.title_tv);
        loginBtn = (Button) findViewById(R.id.loginBtn);
    }

    public void setTitle(String titleString){
        if(titleString != null && titleString.length() > 0){
            titleTv.setText(titleString);
        }
    }

    public void setOnLoginListener(View.OnClickListener loginListener){
        if(loginListener != null)
            loginBtn.setOnClickListener(loginListener);
    }

}
