package com.example.android.toursardinia;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
        sardiniaList.add(new Sardinia(R.string.cala_goritze, R.drawable.cala_goritze));
        sardiniaList.add(new Sardinia(R.string.porto_istana, R.drawable.porto_istana));
        sardiniaList.add(new Sardinia(R.string.sapiaggia_del_principe, R.drawable.spiaggia_del_principe));
        sardiniaList.add(new Sardinia(R.string.tuerredda, R.drawable.tuerredda));
        sardiniaList.add(new Sardinia(R.string.porto_istana, R.drawable.porto_istana));
        sardiniaList.add(new Sardinia(R.string.stintino, R.drawable.la_pelosa_stintino));


        SardiniaAdapter sardiniaAdapter = new SardiniaAdapter(getActivity(), sardiniaList);

        final ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(sardiniaAdapter);

        return rootView;

    }
}