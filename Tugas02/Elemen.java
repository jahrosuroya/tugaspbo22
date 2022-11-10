package Tugas02;

public class Elemen { 

    private String nama;
    public int JamSibuk;

    public Elemen(String nama, int JamSibuk){
        this.nama = nama;
        this.JamSibuk = JamSibuk;
    }

    public String getName(){
        return nama;
    }

    public int getJamsibuk(){
        return JamSibuk;
    }

}