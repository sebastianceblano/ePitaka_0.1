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

public class PlusDialog extends DialogFragment {

    private static final String TAG = "PlusDialog";

    //widgets
    private EditText mInput;
    private TextView mDone;

    //Seeks for the components of the first fragment

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.dialog_plus, container, false);

        mDone = view.findViewById(R.id.btnAdd);
        mInput = view.findViewById(R.id.etBalance);

        mDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Done!");

                String input = mInput.getText().toString();
                if(!input.equals("")){
                    FirstFragment FF = (FirstFragment) getActivity().getFragmentManager().findFragmentByTag("FirstFragment");
                    //ADDING
                    int sum = Integer.parseInt(FF.mInputDisplay.getText().toString()) + Integer.parseInt(input);
                    //SETTING THE SUM
                    Log.d(TAG , "Sum: " + sum);
                    FF.mInputDisplay.setText(String.valueOf(sum)); //Problem
                }
                getDialog().dismiss();
            }
        });

        return view;
    }
}
