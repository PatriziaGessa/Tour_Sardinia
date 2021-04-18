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
 */
public class CitiesFragment extends Fragment {


    public CitiesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.sardinia_list, container, false);
        // Inflate the layout for this fragment

        final ArrayList<Sardinia> sardiniaList = new ArrayList<>();
        sardiniaList.add(new Sardinia(getString(R.string.cagliari), getString(R.string.describe_cagliari), R.drawable.cagliari_dens));
        sardiniaList.add(new Sardinia(getString(R.string.alghero), getString(R.string.describe_alghero), R.drawable.alghero_dens));
        sardiniaList.add(new Sardinia(getString(R.string.nuoro), getString(R.string.describe_nuoro), R.drawable.nuoro_dens));
        sardiniaList.add(new Sardinia(getString(R.string.sassari), getString(R.string.describe_sassari), R.drawable.sassari_dens));
        sardiniaList.add(new Sardinia(getString(R.string.oristano), getString(R.string.describe_oristano), R.drawable.oristano_dens));


        SardiniaAdapter sardiniaAdapter = new SardiniaAdapter(getActivity(), sardiniaList);

        final ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(sardiniaAdapter);




        return rootView;


    }
}