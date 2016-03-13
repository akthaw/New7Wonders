package com.example.android.new7wonders.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.android.new7wonders.R;
import com.example.android.new7wonders.data.DataManager;
import com.example.android.new7wonders.data.vos.EventVO;
import com.example.android.new7wonders.views.ViewItemEvent;

import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class EventListFragment extends Fragment {

    public EventListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_event_list, container, false);

        LinearLayout llEventRoot = (LinearLayout) rootView.findViewById(R.id.ll_event_root);

        List<EventVO> eventList = DataManager.getInstance().getEventList();
        for (EventVO event : eventList) {
            ViewItemEvent viEvent = (ViewItemEvent) inflater.inflate(R.layout.view_item_event, container, false);
            viEvent.setData(event);
            viEvent.getUrl(event);
            llEventRoot.addView(viEvent);
        }

        return rootView;
    }
}
