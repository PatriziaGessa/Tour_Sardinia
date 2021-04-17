package com.example.android.toursardinia;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
        sardiniaList.add(new Sardinia(R.string.cagliari, R.drawable.cagliari_principale));
        sardiniaList.add(new Sardinia(R.string.alghero, R.drawable.alghero));
        sardiniaList.add(new Sardinia(R.string.nuoro, R.drawable.nuoro));
        sardiniaList.add(new Sardinia(R.string.sassari, R.drawable.sassari));
        sardiniaList.add(new Sardinia(R.string.oristano, R.drawable.oristano));


        SardiniaAdapter sardiniaAdapter = new SardiniaAdapter(getActivity(), sardiniaList);

        final ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(sardiniaAdapter);

        return rootView;


    }
}