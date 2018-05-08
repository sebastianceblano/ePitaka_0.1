package com.example.sebastianceblano.epitaka_01;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class SettingsFragment extends Fragment {
    //Alt + Insert to open the menu

    private static final String TAG = "SettingsFragment"; //Tag of the fragment

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        getActivity().setTitle("Settings");

        View view = inflater.inflate(R.layout.settings_layout, container, false); //calls the xml from the layout

        return view;
    }
}
