package com.myhabbit.database;



public class DaftarController {


    private String surah;


    private String panduan;


    private String arab;


    private String arti;

    public DaftarController(String surah, String panduan, String arab, String arti) {
        this.surah = surah;
        this.panduan = panduan;
        this.arab = arab;
        this.arti = arti;
    }

    public String getSurah() {
        return surah;
    }

    public void setSurah(String surah) {
        this.surah = surah;
    }

    public String getArab() {
        return arab;
    }

    public void setArab(String arab) {
        this.arab = arab;
    }

    public String getArti() {
        return arti;
    }

    public void setArti(String arti) {
        this.arti = arti;
    }

    public String getPanduan() {
        return panduan;
    }

    public void setPanduan(String panduan) {
        this.panduan = panduan;
    }
}
