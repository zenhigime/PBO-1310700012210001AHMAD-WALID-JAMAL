// Mendefinisikan package tempat class ini berada
// Package ini digunakan untuk mengelompokkan class yang saling berkaitan
package custompackage.program;

// Mendefinisikan class TestProgram
// Class ini berisi variabel (attribute) dan method (behavior)
public class TestProgram {

  // Deklarasi variabel instance (attribute) bertipe String
  // Variabel ini dapat menyimpan nama teman dan nama lain
  String namaTeman;

  // Deklarasi beberapa variabel String sekaligus
  // namaSaya dan namaKamu langsung diberi nilai awal
  // namaLain hanya dideklarasikan tanpa nilai awal
  String namaSaya = "Joni", namaKamu = "Yana", namaLain;

  // Deklarasi variabel integer
  // sudutAtas diberi nilai awal 90, sedangkan sudutKiri dan sudutKanan bernilai
  // default 0
  int sudutKiri, sudutKanan, sudutAtas = 90;

  // Deklarasi variabel integer jumlahBuku dengan nilai awal 2
  int jumlahBuku = 2;

  // Deklarasi variabel integer jumlahBukuTotal dengan nilai awal 30
  int jumlahBukuTotal = 30;

  // untuk menampilkan text pada console

  // Method helloWorld menerima satu parameter bertipe String
  // Method ini digunakan untuk menampilkan pesan ke layar
  public void helloWorld(String name) {
    // System.out.println("Hello world, from test program " + namaLain); // isi code
    System.out.println("Hello world, from test program " + name); // Menampilkan teks "Hello world" beserta nilai
                                                                  // parameter name ke console
  }

  // Method inisiasiVariable menerima satu parameter bertipe String
  // Method ini digunakan untuk mengubah nilai variabel dan menampilkannya
  public void inisiasiVariable(String nama) {
    namaSaya = nama; // // Mengisi variabel namaSaya dengan nilai dari parameter nama

    // Menjumlahkan jumlahBuku dengan dirinya sendiri
    // Contoh: jika jumlahBuku = 2, maka hasilnya menjadi 4
    jumlahBuku = jumlahBuku + jumlahBuku;

    // Menampilkan informasi nama dan jumlah buku ke console
    System.out.println(namaSaya + " memiliki " + jumlahBuku + " buku.");

  }

}