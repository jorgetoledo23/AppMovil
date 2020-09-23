package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.Model.Restaurante;
import com.example.myapplication.dummy.DummyContent;

import java.util.ArrayList;
import java.util.List;

/**
 * A fragment representing a list of Items.
 */
public class RestauranteFragment extends Fragment {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;

    public RecyclerView recyclerView;
    public MyRestauranteRecyclerViewAdapter restauranteRecyclerViewAdapter;
    public List<Restaurante> restauranteList;
    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public RestauranteFragment() {

        restauranteList = new ArrayList<>();
        restauranteList.add(new Restaurante(1,"Restaurante App Moviles", "Curicó", "Curicó", "+56 9 1234 5678", "appMoviles@inacap.cl","https://bit.ly/3cu9PRF", (float) 4.0));
        restauranteList.add(new Restaurante(2,"Restaurante App Moviles", "Curicó", "Curicó", "+56 9 1234 5678", "appMoviles@inacap.cl","https://bit.ly/2RMGsR0", (float) 4.0));
        restauranteList.add(new Restaurante(3,"Restaurante App Moviles", "Curicó", "Curicó", "+56 9 1234 5678", "appMoviles@inacap.cl","https://bit.ly/2RMGsR0", (float) 4.0));
        restauranteList.add(new Restaurante(4,"Restaurante App Moviles", "Curicó", "Curicó", "+56 9 1234 5678", "appMoviles@inacap.cl","https://bit.ly/2RMGsR0", (float) 4.0));
        restauranteList.add(new Restaurante(5,"Restaurante App Moviles", "Curicó", "Curicó", "+56 9 1234 5678", "appMoviles@inacap.cl","https://bit.ly/2RMGsR0", (float) 4.0));
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static RestauranteFragment newInstance(int columnCount) {
        RestauranteFragment fragment = new RestauranteFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            restauranteRecyclerViewAdapter = new MyRestauranteRecyclerViewAdapter(getActivity(), restauranteList);
            recyclerView.setAdapter(restauranteRecyclerViewAdapter);
        }
        return view;
    }
}