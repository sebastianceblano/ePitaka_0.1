package com.example.sebastianceblano.epitaka_01;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class MinusDialog extends DialogFragment {

    private static final String TAG = "MinusDialog";

    //widgets
    private EditText mInput;
    private TextView mDone;
    public int differenceGlobal;

    //Seeks for the components of the first fragment

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.dialog_minus, container, false);

        mDone = view.findViewById(R.id.btnMinus);
        mInput = view.findViewById(R.id.etBalance);

        mDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Done!");

                String input = mInput.getText().toString();
                if(!input.equals("")){
                    FirstFragment FF = (FirstFragment) getActivity().getFragmentManager().findFragmentByTag("FirstFragment");
                    //ADDING
                    int difference = Integer.parseInt(FF.mInputDisplay.getText().toString()) - Integer.parseInt(input);
                    //SETTING THE SUM
                    Log.d(TAG , "Difference: " + difference);
                    FF.mInputDisplay.setText(String.valueOf(difference)); //Problem
                    differenceGlobal = difference;
                }
                getDialog().dismiss();
            }
        });

        return view;
    }
}
