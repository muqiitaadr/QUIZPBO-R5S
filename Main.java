 

class member{
    String tlp,nama,alamat;
    int saldo,pinjam;
    double pajak;

    //method tanpa return dengan parameter
   public member(String nama , String tlp, String alamat){
        this.nama=nama;
        this.tlp=tlp;
        this.alamat=alamat;
    }
    member(int saldo, int pinjam, Double pajak){
        this.saldo=saldo;
        this.pinjam=pinjam;
        this.pajak=pajak;
    }
    // method dengan return dan tanpa parameter
    double total () {
        //perhitungan
        return (saldo+(pinjam-(pinjam*pajak)));
    }
    //method tanpa parameter tanpa return
    void tampil (){
        System.out.println("Nama Anggota : "+ this.nama);
        System.out.println("No Telepon : "+ this.tlp);
        System.out.println("Alamat Anggota : "+ this.alamat);
        System.out.println();
    }
    void tampil2(){
        System.out.println("Saldo Anda : Rp."+ this.saldo);
        System.out.println("Jumlah Pinjaman : Rp."+ this.pinjam);
        System.out.println("Pajak Pinjaman : 10%");
        System.out.println();
        System.out.println("Total Saldo : Rp."+ this.total());

    }
}
public class Main {
public static void main(String[] args) {
       member member1 = new member ("Muqiitaa Diahayu","0216638","Tambun");
       member member2 = new member (100000,500000,0.10);
        member1.tampil();
        member2.tampil2();
}
}
