package com.example.sebastianceblano.epitaka_01;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SecondFragment extends Fragment {
    //Alt + Insert to open the menu

    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        getActivity().setTitle("Budget");

        myView = inflater.inflate(R.layout.second_layout, container, false); //calls the xml from the layout
        return myView;
    }
}
