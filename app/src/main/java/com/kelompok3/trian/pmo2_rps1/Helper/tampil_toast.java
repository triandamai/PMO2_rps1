package com.kelompok3.trian.pmo2_rps1.Helper;

import android.content.Context;
import android.widget.Toast;

public class tampil_toast {

    public void tampil(Context context, String pesan){
        Toast.makeText(context,pesan,Toast.LENGTH_LONG).show();
    }
}
