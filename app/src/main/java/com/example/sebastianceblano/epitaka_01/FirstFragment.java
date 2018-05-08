package com.example.sebastianceblano.epitaka_01;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FirstFragment extends Fragment {
    //Alt + Insert to open the menu

    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        //Changes the text on the title bar
        getActivity().setTitle("Home");


        //Calls the view of the first fragment called Home
        myView = inflater.inflate(R.layout.first_layout, container, false);
        return myView;
    }


}
