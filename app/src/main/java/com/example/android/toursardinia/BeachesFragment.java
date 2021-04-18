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
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class BeachesFragment extends Fragment {


    public BeachesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.sardinia_list, container, false);
        // Inflate the layout for this fragment

        final ArrayList<Sardinia> sardiniaList = new ArrayList<>();
        sardiniaList.add(new Sardinia(getString(R.string.cala_goritze), getString(R.string.describe_cala_goritze), R.drawable.cala_goritze_dens));
        sardiniaList.add(new Sardinia(getString(R.string.porto_istana), getString(R.string.describe_porto_isana), R.drawable.porto_istana_dens));
        sardiniaList.add(new Sardinia(getString(R.string.spiaggia_del_principe), getString(R.string.describe_spiaggia_del_principe), R.drawable.spiaggia_del_principe_dens));
        sardiniaList.add(new Sardinia(getString(R.string.tuerredda), getString(R.string.describe_tuerredda), R.drawable.tuerredda_dens));
        sardiniaList.add(new Sardinia(getString(R.string.stintino), getString(R.string.describe_stintino), R.drawable.la_pelosa_stintino_dens));


        SardiniaAdapter sardiniaAdapter = new SardiniaAdapter(getActivity(), sardiniaList);

        final ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(sardiniaAdapter);


        return rootView;
    }
}