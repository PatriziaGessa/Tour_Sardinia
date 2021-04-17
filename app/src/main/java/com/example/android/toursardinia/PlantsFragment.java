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
        sardiniaList.add(new Sardinia(R.string.alloro, R.string.describe_alloro, R.drawable.alloro));
        sardiniaList.add(new Sardinia(R.string.corbezzolo, R.string.describe_corbezzolo, R.drawable.cobezzolo));
        sardiniaList.add(new Sardinia(R.string.lentischio, R.string.describe_lentischio, R.drawable.lentisco));
        sardiniaList.add(new Sardinia(R.string.mirto, R.string.describe_mirto, R.drawable.mirto));
        sardiniaList.add(new Sardinia(R.string.elicriso, R.string.describe_elicriso, R.drawable.elicriso));


        SardiniaAdapter sardiniaAdapter = new SardiniaAdapter(getActivity(), sardiniaList);

        final ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(sardiniaAdapter);

        return rootView;

    }


}