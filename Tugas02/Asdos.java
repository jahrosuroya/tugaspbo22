package Tugas02;

public class Asdos extends Mahasiswa {

    private int JamNgasdos;

    public Asdos(String nama, int hitungJamSibuk){
        super(nama, hitungJamSibuk); //upcasting
    }

    public void setJamNgasdos(int JamNgasdos){
        this.JamNgasdos = JamNgasdos;
    }

    public int getJamNgasdos(){
        return JamNgasdos;
    }

    public void setJamSibuk(int JamSibukAsdos, int hitungJamSibuk){
        JamSibukAsdos = hitungJamSibuk + JamNgasdos; //upcasting
        this.JamSibuk = JamSibukAsdos; //upcasting
    }

    //polymorphism method kelas induk (Elemen)
    public int getjamSibuk(){
        return JamSibuk;
    }

    public void test(){
        System.out.println(getName()+ " " +"adalah seorang asdos dengan jam sibuk" + " " +this.JamSibuk);
    }

}
