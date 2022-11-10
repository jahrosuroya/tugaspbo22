package Tugas02;

public class Mahasiswa extends Elemen{
 
    private int sks;

    public Mahasiswa(String nama, int JamSibuk) { 
        super(nama, JamSibuk); //upcasting
    }

    public void setsks(int sks){
        this.sks = sks;
    }

    public int getsks(){
        return sks;
    }

    public void setJamSibuk(int hitungJamSibuk){
        hitungJamSibuk = sks * 3;
        this.JamSibuk = hitungJamSibuk; //upcasting
    }

    //polymorphism method kelas induk (Elemen)
    public int getjamSibuk(){
        return JamSibuk;
    }

    public void test(){
        System.out.println(getName()+ " " +"adalah seorang asdos dengan jam sibuk" + " " +this.JamSibuk);
    }
    
}
