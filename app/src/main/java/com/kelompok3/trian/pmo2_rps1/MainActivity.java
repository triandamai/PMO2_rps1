package com.kelompok3.trian.pmo2_rps1;

import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.kelompok3.trian.pmo2_rps1.Adapter.Adapter_kopi_RecyclerView;
import com.kelompok3.trian.pmo2_rps1.Helper.*;

public class MainActivity extends AppCompatActivity implements
        Fragment_list.OnFragmentInteractionListener,
        Fragment_detail.OnFragmentInteractionListener{
        tampil_toast toast_helper = new tampil_toast();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View fragment_land = findViewById(R.id.detail_act);
        if (fragment_land != null){
            Fragment_detail list = new Fragment_detail();

            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.detail_act,list);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();

        }else {

            toast_helper.tampil(this,"layar normal beralih mode portrait");
        }


    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    private String judul;


}
