package com.example.android.new7wonders;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import com.example.android.new7wonders.data.DataManager;

/**
 * Created by akthaw on 3/10/16.
 */
public class New7Wondersapp extends Application {

    public void browseUrl(String url) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);

    }

    private static Context context;

    /**
     * Called when the application is starting, before any activity, service,
     * or receiver objects (excluding content providers) have been created.
     * Implementations should be as quick as possible (for example using
     * lazy initialization of state) since the time spent in this function
     * directly impacts the performance of starting the first activity,
     * service, or receiver in a process.
     * If you override this method, be sure to call super.onCreate().
     */
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();

        DataManager.getInstance().loadEventList();
    }

    public static Context getContext() {
        return context;
    }


}
