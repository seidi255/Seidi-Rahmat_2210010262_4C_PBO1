# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `TokoGame`, `GameVoucher`, dan `GameBeraksi` adalah contoh dari class.

```bash
public class TokoGame {
    ...
}

public class GameVoucher extends TokoGame {
    ...
}

public class GameBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `gme[i]= new GameVoucher(nama, kode, gendre, harga);` adalah contoh pembuatan object.

```bash
gme[i]= new GameVoucher(nama, kode, gendre, harga);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`,`kode`,'gendre'dan'harga' adalah contoh atribut.

```bash
String nama;
String kode;
String gendre;
int harga;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `TokoGame` dan `GameVoucher`.

```bash
 public TokoGame(String nama, String kode, String gendre, int harga) {
        this.nama = nama;
        this.kode = kode;
        this.gendre = gendre;
        this.harga = harga;
    }

public GameVoucher(String nama, String kode, String gendre, int harga){
        super(nama, kode, gendre, harga);
        
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama`, `setKode`,'setGendre'dan'setHarga' adalah contoh method mutator.

```bash
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
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getKode`, `getGendre`, `getHarga`dan `getDapatVoucher` adalah contoh method accessor.

```bash
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
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `kode` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String kode;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `GameVoucher` mewarisi `TokoGame` dengan sintaks `extends`.

```bash
public class GameVoucher extends TokoGame {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `TokoGame` merupakan overloading method `displayInfo` dan `displayInfo` di `GameVoucher` merupakan override dari method `displayInfo` di `TokoGame`.

```bash
public String displayInfo(String nama_toko) {
    return displayInfo() + "\nNama Toko: " + nama_toko;
}

@Override
public String displayInfo() {
return super.displayinfo()+"\nSistem: "+getDapatVoucher();
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getDapatVoucher`.

```bash
public String getDapatVoucher(){
        String kodeH = getKode().substring(0, 3);
        if(kodeH.equals("G01")){
            return "selamat anda mendapat vocher game senilai 20.000";
        }else{
            return "anda tidak mendapat voucher";
        }
    }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < gme.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.println("=====================");
System.out.print("Masukan nama Game"+(i+1)+": ");
String nama = scanner.nextLine();
System.out.print("Masukan kode"+(i+1)+": ");
String kode = scanner.nextLine();
System.out.print("Masukan gendre"+(i+1)+": ");
String gendre = scanner.nextLine();
System.out.print("Masukan Harga"+(i+1)+": ");
int harga = scanner.nextInt();
scanner.nextLine();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MahasiswaDetail[] mahasiswas = new MahasiswaDetail[2];` adalah contoh penggunaan array.

```bash
GameVoucher[] gme = new GameVoucher[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
}catch(NumberFormatException e){
             System.out.println("kesalahan format nomor: "+e.getMessage());       
        }
        catch (Exception e){
            System.out.println("kesalahan umum: "+e.getMessage());
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama    : SEIDI RAHMAT
NPM     : 2210010262
Kelas   : 4C REG PAGI BJM
Matkul  : PEMROGRAMAN BERBASI OBJEK 1
