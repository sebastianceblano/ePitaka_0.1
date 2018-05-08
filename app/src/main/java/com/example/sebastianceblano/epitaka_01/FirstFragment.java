package com.example.sebastianceblano.epitaka_01;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class FirstFragment extends Fragment{
    //Alt + Insert to open the menu

    private static final String TAG = "FirstFragment"; //Tag of the fragment

    private Button mChangeBalance;//Button for the change balance
    private ImageButton mPlus;//Button for the plus button
    private ImageButton mMinus;//Button for the minus button

    public static int  firstBalance; //holds the first balance set by the user

    public TextView mInputDisplay; //Text for the balance

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, Bundle savedInstanceState) {
        //Changes the text on the title bar
        getActivity().setTitle("Home");

        //Calls the view of the first fragment called Home
        View view = inflater.inflate(R.layout.first_layout, container, false);

        //SETTING THE COMPONENTS
        mChangeBalance = view.findViewById(R.id.btnBalance);
        mPlus = view.findViewById(R.id.btnPlus);
        mMinus = view.findViewById(R.id.btnMinus);
        mInputDisplay= view.findViewById(R.id.tvChangeBalance);

        //WHEN CHANGE BALANCE BUTTON IS CLICKED
        mChangeBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: opening dialog");

                ChangeBalanceDialog cbd = new ChangeBalanceDialog();
                cbd.show(getFragmentManager(), "ChangeBalanceDialog");
            }
        });

        //WHEN PLUS BUTTON IS CLICKED
        mPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Code for Plus
                Log.d(TAG, "onClick: Plus!");

                PlusDialog pd = new PlusDialog();
                pd.show(getFragmentManager(), "PlusDialog");
            }
        });

        //WHEN MINUS BUTTON IS CLICKED
        mMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Code for Minus
                Log.d(TAG, "onClick: Minus!");

                MinusDialog md = new MinusDialog();
                md.show(getFragmentManager(), "MinusDialog");
            }
        });


        return view;
    }

}
