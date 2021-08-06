package com.kartal.navigationdrawer2;

public class DatabaseUsers {

    String kullaniciAdi ;
    String kullaniciSifre ;

    public DatabaseUsers(String kullaniciAdi, String kullaniciSifre) {
        this.kullaniciAdi = kullaniciAdi;
        this.kullaniciSifre = kullaniciSifre;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getSifre() {
        return kullaniciSifre;
    }

    public void setSifre(String sifre) {
        this.kullaniciSifre = sifre;
    }
}
