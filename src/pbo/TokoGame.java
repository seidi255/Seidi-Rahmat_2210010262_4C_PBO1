
package pbo;

//class
public class TokoGame {
    //atribut dan encapsulasi
    private String nama;
    private String kode;
    public String gendre;
    public int harga;
    
    //contruktor

    public TokoGame(String nama, String kode, String gendre, int harga) {
        this.nama = nama;
        this.kode = kode;
        this.gendre = gendre;
        this.harga = harga;
    }
    
    //mutator (setter)

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setGendre(String gendre) {
        this.gendre = gendre;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    
    //accesor (getter)

    public String getNama() {
        return nama;
    }

    public String getKode() {
        return kode;
    }

    public String getGendre() {
        return gendre;
    }

    public int getHarga() {
        return harga;
    }

    
   
    public String displayinfo(){
        return "============\nNama Game: "+getNama()+ "\nKode: "+getKode()+"\nGendre: "+getGendre()+ "\nHarga: "+getHarga();
    }
    
    //polymorphism (overloding)
    public String displayinfo(String nama_toko){
        return displayinfo()+"\nNama Toko: "+nama_toko;
    }
}
