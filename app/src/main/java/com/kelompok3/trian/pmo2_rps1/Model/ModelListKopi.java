package com.kelompok3.trian.pmo2_rps1.Model;

public class ModelListKopi {
    String kopi;
    Integer gambar;

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getKopi() {
        return kopi;
    }

    public void setKopi(String kopi) {
        this.kopi = kopi;
    }

    public ModelListKopi(String kopi,Integer gambar) {
        this.kopi = kopi;this.gambar = gambar;
    }


}
