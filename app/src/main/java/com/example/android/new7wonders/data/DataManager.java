package com.example.android.new7wonders.data;

import com.example.android.new7wonders.data.vos.EventVO;
import com.example.android.new7wonders.utils.JsonUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by akthaw on 3/10/16.
 */
public class DataManager {

    /*Singleton*/
    private static DataManager objInstance;

    private List<EventVO> eventList;


    private DataManager() {

    }

    public static DataManager getInstance() {
        if (objInstance == null) {
            objInstance = new DataManager();
        }

        return objInstance;
    }

    /**
     * parsing json fromat data into listType array list.
     */
    public void loadEventList() {
        Gson gson = new Gson();
        try {
            String dummyEventList = JsonUtils.getInstance().loadDummyData("event_list.json");
            Type listType = new TypeToken<List<EventVO>>() {
            }.getType();
            eventList = gson.fromJson(dummyEventList, listType);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public List<EventVO> getEventList() {
        return eventList;
    }
}
