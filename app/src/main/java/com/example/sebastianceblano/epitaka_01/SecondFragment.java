package com.example.sebastianceblano.epitaka_01;

import android.app.Fragment;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class SecondFragment extends Fragment {
    //Alt + Insert to open the menu

    private static final String TAG = "SecondFragment";

    private FloatingActionButton mSetBudget;
    private ProgressBar mProgressBar1;
    private ProgressBar mProgressBar2;
    private ProgressBar mProgressBar3;
    private ProgressBar mProgressBar4;
    private TextView mProgressText;
    public int mProgressStatus;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        getActivity().setTitle("Budget");

        View view = inflater.inflate(R.layout.second_layout, container, false); //calls the xml from the layout


        //COMPONENTS
        mSetBudget = view.findViewById(R.id.btnSetBudget);
        mProgressBar1 = view.findViewById(R.id.pbBudget);
        mProgressBar2 = view.findViewById(R.id.pbBudget2);
        mProgressBar3 = view.findViewById(R.id.pbBudget3);
        mProgressBar4 = view.findViewById(R.id.pbBudget4);

        //SETTING THE PERCENTAGE
        //Get the value from Change Balance
//        String value = this.getArguments().getString("key"); //getting the parameters from changebalancedialog
//        Toast.makeText(getActivity(), value+" ", Toast.LENGTH_LONG).show(); //show data

        mProgressBar1.setProgress(100);
        mProgressBar2.setProgress(80);
        mProgressBar3.setProgress(60);
        mProgressBar4.setProgress(40);
            //Get the value from subtract (if subtracted or add)
                //Divide Change Balance value from Difference
                // Multiply by 100
                //Set it to the progress bar


        //IS CLICKED
        mSetBudget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //WHEN btnSetBudget is clicked
                Log.d(TAG, "OnClick: Set Budget");
            }
        });

        return view;
    }
}
