package com.glendroid.mylibrary;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_main_mylibrary, container, false);
        Intent intent = getActivity().getIntent();
        String joke = intent.getStringExtra("joke");
        TextView textView = (TextView)root.findViewById(R.id.textView_mylibrary);
        Log.i("JOKE", joke);
        textView.setText(joke);

        return root;
    }

}
