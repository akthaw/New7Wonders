package com.example.android.new7wonders.utils;

import android.content.Context;

import com.example.android.new7wonders.New7Wondersapp;

import org.json.JSONException;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by akthaw on 12/12/15.
 * Singleton Design Pattern
 * private att: , public stactic getter , private constructor
 */
public class JsonUtils {

    private static final String PATH_DUMMY_DATA = "dummy_data";

    /**
     * Singleton Design Pattern.
     */
    private Context context;

    private static JsonUtils objInstace;

    /**
     * getter function
     *
     * @return
     */
    public static JsonUtils getInstance() {
        if (objInstace == null) {
            objInstace = new JsonUtils();
        }

        return objInstace;
    }

    /**
     * Constructor
     */
    private JsonUtils() {
        context = New7Wondersapp.getContext();
    }

    /**
     * Read text from assets folder.
     *
     * @param fileName
     * @return
     * @throws IOException
     */
    private byte[] readJsonFile(String fileName) throws IOException {
        InputStream inStream = context.getAssets().open(fileName);
        int size = inStream.available();
        byte[] buffer = new byte[size];
        inStream.read(buffer);
        inStream.close();
        return buffer;
    }

    /**
     * @param fileName - name of Json File.
     * @return JSONObject from loaded file.
     * @throws IOException
     * @throws JSONException
     */
    public String loadDummyData(String fileName) throws IOException, JSONException {
        byte[] buffer = readJsonFile(PATH_DUMMY_DATA + "/" + fileName);
        return new String(buffer, "UTF-8").toString();
    }
}