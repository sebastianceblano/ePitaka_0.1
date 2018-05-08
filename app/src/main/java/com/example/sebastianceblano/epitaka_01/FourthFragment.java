package com.example.sebastianceblano.epitaka_01;

import android.app.Fragment;
import android.nfc.Tag;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class FourthFragment extends Fragment {
    //Alt + Insert to open the menu

    private static final String TAG = "FourthFragment"; //Tag of the fragment
    private TextView mUnlock;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        getActivity().setTitle("Goals");
        View view = inflater.inflate(R.layout.fourth_layout, container, false); //calls the xml from the layout

        mUnlock = view.findViewById(R.id.txtUnlock);

        mUnlock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Unlock still in progress", Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }
}
