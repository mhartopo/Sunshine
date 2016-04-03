package com.lobe2.muhtarh.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView =  inflater.inflate(R.layout.fragment_main, container, false);

        String[] forecastArray = {
                "Today - Sunny - 70/40",
                "Tomorrow - Sunny - 70/40",
                "Mon - Sunny - 70/40",
                "Tue - Sunny - 70/40",
                "Wed - Sunny - 70/40",
                "Thu - Sunny - 70/40",
                "Fri - Sunny - 70/40",
                "Sat - Sunny - 70/40",
        };

        List<String> weekForecast = new ArrayList<String>(Arrays.asList(forecastArray));
        ArrayAdapter<String> mForecastAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item_forecast, R.id.listview_forecast, weekForecast);
        ListView list = (ListView) rootView.findViewById(R.id.listview_forecast);
        list.setAdapter(mForecastAdapter);
        return  rootView;
    }
}
