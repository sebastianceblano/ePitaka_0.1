package com.example.sebastianceblano.epitaka_01;

import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ChangeBalanceDialog extends DialogFragment {

    private static final String TAG = "ChangeBalanceDialog";

    //widgets
    public EditText mInput;
    private TextView mDone;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.dialog_changebalance, container, false);

        mDone = view.findViewById(R.id.btnChange);
        mInput = view.findViewById(R.id.etBalance);

        mDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Done!");
                //ASSIGNING NEW BALANCE
                String input = mInput.getText().toString();
                if(!input.equals("")){
                    FirstFragment FF = (FirstFragment) getActivity().getFragmentManager().findFragmentByTag("FirstFragment");
                    FF.mInputDisplay.setText(input); //Problem
                }
                getDialog().dismiss();
            }
        });

        return view;
    }

}
