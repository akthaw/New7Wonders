package com.example.android.new7wonders.data.vos;

import com.google.gson.annotations.SerializedName;

/**
 * Created by akthaw on 3/10/16.
 **/
public class EventVO {

    /* links between values of json attributes and member variables*/
    @SerializedName("event_title")
    private String eventTitle;

    @SerializedName("stock_photo")
    private String stockPhoto;

    @SerializedName("event_desc")
    private String eventDesc;

    @SerializedName("learn_more")
    private String learnMore;

    /**
     * setting up getter function for eventTitle.
     *
     * @return String.
     */
    public String getEventTitle() {
        return eventTitle;
    }

    /**
     * setting up getter function for stockPhoto.
     *
     * @return String.
     */
    public String getStockPhoto() {
        return stockPhoto;
    }

    /**
     * setting up getter function for eventDesc.
     *
     * @return String
     */
    public String getEventDesc() {
        return eventDesc;
    }

    /**
     * setting up getter function for learnMore.
     *
     * @return String
     */
    public String getLearnMore() {
        return learnMore;
    }
}
