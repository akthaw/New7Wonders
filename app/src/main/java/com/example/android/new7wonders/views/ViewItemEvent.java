package com.example.android.new7wonders.views;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.android.new7wonders.R;
import com.example.android.new7wonders.data.vos.EventVO;

/**
 * Created by akthaw on 3/10/16.
 */
public class ViewItemEvent extends CardView {

    private TextView tvEventTitle;
    private ImageView ivStockPhoto;
    private TextView tvEventDesc;
    private Button btnLearnMore;

    public ViewItemEvent(Context context) {
        super(context);
    }

    public ViewItemEvent(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewItemEvent(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * Finalize inflating a view from XML.  This is called as the last phase
     * of inflation, after all child views have been added.
     * <p/>
     * <p>Even if the subclass overrides onFinishInflate, they should always be
     * sure to call the super method, so that we get called.
     */
    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        tvEventTitle = (TextView) findViewById(R.id.tv_event_title);
        ivStockPhoto = (ImageView) findViewById(R.id.iv_stock_photo);
        tvEventDesc = (TextView) findViewById(R.id.tv_event_desc);

        btnLearnMore = (Button) findViewById(R.id.btn_learn_more);

        btnLearnMore.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = (String) btnLearnMore.getTag();

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                btnLearnMore.getContext().startActivity(i);
            }
        });
    }

    public String getUrl(EventVO event) {
        return event.getLearnMore();
    }

    public void setData(EventVO event) {
        tvEventTitle.setText(event.getEventTitle());
        tvEventDesc.setText(event.getEventDesc());
        btnLearnMore.getText();
        btnLearnMore.setTag(event.getLearnMore());

        Glide.with(getContext())
                .load(event.getStockPhoto())
                .centerCrop()
                .placeholder(R.drawable.new7wonders_logo)
                .into(ivStockPhoto);
    }
}
