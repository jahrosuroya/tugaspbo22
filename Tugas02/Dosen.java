package Tugas02;

public class Dosen extends Elemen{

    private int jumlahHariKerja;

    public Dosen(String nama, int JamSibuk) {
        super(nama, JamSibuk); //upcasting
    }

    public int getjumlahHariKerja(){
        return jumlahHariKerja;
    }

    public void setjumlahHariKerja(int jumlahHariKerja){
        this.jumlahHariKerja = jumlahHariKerja;
    }

    public void setJamSibuk(int hitungJamSibuk){
        hitungJamSibuk = jumlahHariKerja * 8;
        this.JamSibuk = hitungJamSibuk;
    }

    //polymorphism method kelas induk (Elemen)
    public int getjamSibuk(){
        return JamSibuk;
    }

    public void test(){
        System.out.println(getName()+ " " + "adalah seorang dosen dengan jam sibuk" + " " +this.JamSibuk);
    }
    
}
