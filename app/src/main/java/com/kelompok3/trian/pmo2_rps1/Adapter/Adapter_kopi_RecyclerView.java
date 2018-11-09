package com.kelompok3.trian.pmo2_rps1.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kelompok3.trian.pmo2_rps1.Fragment_detail;
import com.kelompok3.trian.pmo2_rps1.MainActivity;
import com.kelompok3.trian.pmo2_rps1.Model.*;
import com.kelompok3.trian.pmo2_rps1.R;
import com.kelompok3.trian.pmo2_rps1.Helper.*;

import java.util.ArrayList;

public class Adapter_kopi_RecyclerView extends
        RecyclerView.Adapter<Adapter_kopi_RecyclerView.ViewHolder> {
    Context context;
    private ArrayList<ModelListKopi> ArrayListKopiModel;



    boolean orientation_vert = true;

    public Adapter_kopi_RecyclerView(Context context,
                                     ArrayList<ModelListKopi>
                                             modelListKopiArraylist){
        //TODO : Adapter = Constructor untuk si adapter
        this.context = context;
        this.ArrayListKopiModel = modelListKopiArraylist;
    }

    @Override
    public Adapter_kopi_RecyclerView.ViewHolder
    onCreateViewHolder(ViewGroup viewGroup,
                       int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_kopi,viewGroup,false);
        //TODO : Adapter = ini method untuk memanggil layout yang jadi wadah datanya

        return new Adapter_kopi_RecyclerView.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(
            Adapter_kopi_RecyclerView.ViewHolder viewHolder,
            final int i) {
        //TODO : Adapter = method untuk mengisi layout yang sudah dipanggil
        viewHolder.judul.setText(ArrayListKopiModel.get(i).getKopi());
        viewHolder.kopi.setImageResource(ArrayListKopiModel.get(i).getGambar());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MainActivity().setJudul(ArrayListKopiModel.get(i).getKopi());

            }
        });

    }

    @Override
    public int getItemCount() {
        return ArrayListKopiModel.size();
    }

    //TODO : Adapter = class untuk inisiasi tampilan/View
    public class ViewHolder extends RecyclerView.ViewHolder{
    TextView judul;
    ImageView kopi;
        public ViewHolder( View itemView) {
            super(itemView);

            judul = itemView.findViewById(R.id.title);
            kopi = itemView.findViewById(R.id.gambar_kopi);
        }
    }

}
