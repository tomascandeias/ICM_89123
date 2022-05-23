package pt.ua.icm.tc.weatherapp;

import static android.content.ContentValues.TAG;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentA#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentA extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentA() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentA.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentA newInstance(String param1, String param2) {
        FragmentA fragment = new FragmentA();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    RecyclerView recyclerView;
    List<Model> itemList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        recyclerView = view.findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);

        ItemAdapter itemAdapter = new ItemAdapter(initData());
        recyclerView.setAdapter(itemAdapter);

        itemAdapter.setOnItemClickListener(new ItemAdapter.ClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onItemClick(int position, View v) {
                FragmentManager fm=getFragmentManager();

                Bundle bundle = new Bundle();
                System.err.println("onItemClick()");
                System.err.println(initData().get(position).getName());

                bundle.putString("name", initData().get(position).getName());

                FragmentB fragmentB = new FragmentB();
                fragmentB.setArguments(bundle);

                fm.beginTransaction().replace(R.id.MainContainer, fragmentB).commit();
            }
        });



        return view;
    }

    private List<Model> initData() {
        itemList = new ArrayList<>();

        itemList.add(new Model("Braga"));
        itemList.add(new Model("Viana do Castelo"));
        itemList.add(new Model("Porto"));
        itemList.add(new Model("Aveiro"));
        itemList.add(new Model("Coimbra"));
        itemList.add(new Model("Leiria"));
        itemList.add(new Model("Lisboa"));
        itemList.add(new Model("Portalegre"));
        itemList.add(new Model("Alentejo"));
        itemList.add(new Model("Algarve"));

        return itemList;
    }
}