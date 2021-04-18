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
public class PlantsFragment extends Fragment {


    public PlantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.sardinia_list, container, false);
        // Inflate the layout for this fragment

        final ArrayList<Sardinia> sardiniaList = new ArrayList<>();
        sardiniaList.add(new Sardinia(getString(R.string.alloro), getString(R.string.describe_alloro), R.drawable.alloro_dens));
        sardiniaList.add(new Sardinia(getString(R.string.corbezzolo), getString(R.string.describe_corbezzolo), R.drawable.cobezzolo_dens));
        sardiniaList.add(new Sardinia(getString(R.string.lentischio), getString(R.string.describe_lentischio), R.drawable.lentisco_dens));
        sardiniaList.add(new Sardinia(getString(R.string.mirto), getString(R.string.describe_mirto), R.drawable.mirto_dens));
        sardiniaList.add(new Sardinia(getString(R.string.elicriso), getString(R.string.describe_elicriso), R.drawable.elicriso_dens));


        SardiniaAdapter sardiniaAdapter = new SardiniaAdapter(getActivity(), sardiniaList);

        final ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(sardiniaAdapter);


        return rootView;

    }


}