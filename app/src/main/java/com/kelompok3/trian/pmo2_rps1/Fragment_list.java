package com.kelompok3.trian.pmo2_rps1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kelompok3.trian.pmo2_rps1.Adapter.Adapter_kopi_RecyclerView;
import com.kelompok3.trian.pmo2_rps1.Model.ModelListKopi;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Fragment_list.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragment_list#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_list extends Fragment {
    // TODO: Isi parameter (opsional bray)
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Variabel untuk parameter
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    //TODO : Membuat variabel
    private Adapter_kopi_RecyclerView adapter_kopi_recyclerView;
    private RecyclerView recyclerView;
    private ArrayList<ModelListKopi> ArrayKopiModel;
    Integer  gambar_kopi[]={R.drawable.ic_espresso,R.drawable.ic_cappuccino,R.drawable.ic_macciato,R.drawable.ic_mocha,R.drawable.ic_latte};
    String   txt[]={"Espresso","Cappuccino","Macciato","Mocha","Latte"};

    public Fragment_list() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static Fragment_list newInstance(String param1, String param2) {
        Fragment_list fragment = new Fragment_list();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO : inflating layout
        View v = inflater.inflate(R.layout.fragment_fragment_list,
                container,
                false);
        //
        recyclerView = v.findViewById(R.id.rv);
        //
        RecyclerView.LayoutManager layoutManager =
            new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);


        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        ArrayKopiModel = new ArrayList<>();
        for (int jumlah_kopi =0 ; jumlah_kopi<txt.length; jumlah_kopi++){
            ModelListKopi modelListKopi = new ModelListKopi(txt[jumlah_kopi],gambar_kopi[jumlah_kopi]);
            ArrayKopiModel.add(modelListKopi);
        }
        adapter_kopi_recyclerView = new
                Adapter_kopi_RecyclerView(getActivity().getApplicationContext(),
                ArrayKopiModel);
        recyclerView.setAdapter(adapter_kopi_recyclerView);
        return v;
    }

    // TODO: Method bawaan wkwk
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);

        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
