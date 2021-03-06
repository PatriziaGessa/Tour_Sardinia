package com.example.android.toursardinia;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.sardinia_list, container, false);
        // Inflate the layout for this fragment

        final ArrayList<Sardinia> sardiniaList = new ArrayList<>();
        sardiniaList.add(new Sardinia(getString(R.string.culurgiones), getString(R.string.describe_culurgiones), R.drawable.culurgiones_dens));
        sardiniaList.add(new Sardinia(getString(R.string.malloreddusu), getString(R.string.describe_malloreddusu), R.drawable.malloreddus_dens));
        sardiniaList.add(new Sardinia(getString(R.string.pane_carasu), getString(R.string.describe_pane_carasau), R.drawable.pane_carasau_dens));
        sardiniaList.add(new Sardinia(getString(R.string.porcheddu), getString(R.string.describe_porceddu), R.drawable.porcheddu_dens));
        sardiniaList.add(new Sardinia(getString(R.string.sebadas), getString(R.string.describe_seadas), R.drawable.sebadas_dens));


        SardiniaAdapter sardiniaAdapter = new SardiniaAdapter(getActivity(), sardiniaList);

        final ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(sardiniaAdapter);


        return rootView;


    }
}