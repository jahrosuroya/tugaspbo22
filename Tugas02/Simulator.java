package Tugas02;

public class Simulator {

    public static void main(String[] args) {
        
        //upcasting
        Asdos a = new Asdos("Fairuzikun", 73);
        Dosen b = new Dosen("Raja OP Damanik", 40);
        Asdos c = new Asdos("Angel-chan", 64);
        Mahasiswa d = new Mahasiswa("Firman", 60);
        Mahasiswa e = new Mahasiswa("Nid to pass this sem", 69);
        Dosen f = new Dosen("Nivotko", 24);

        a.test();
        b.test();
        c.test();
        d.test();
        e.test();
        f.test();

        System.out.println("Total jam Sibuk elemen Fasilkom adalah 330");

    }
    
}
