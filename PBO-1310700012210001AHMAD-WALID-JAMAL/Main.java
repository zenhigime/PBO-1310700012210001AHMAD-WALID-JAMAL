
// Mengimpor seluruh class yang ada di dalam package custompackage.program
// Package ini merupakan package buatan sendiri (custom package)
import custompackage.program.*; // custom

// Baris di bawah ini adalah contoh import class tertentu,
// tetapi dikomentari karena sudah diwakili oleh import wildcard (*) diatas
// import custompackage.program.TestProgram;

// Mengimpor class Scanner dari package java.util
// Scanner digunakan untuk mengambil input dari pengguna (keyboard)
import java.util.Scanner; // built-in

// Mendefinisikan class utama bernama Main
class Main {

  // Method utama (main method)
  // Method ini akan dijalankan pertama kali saat program dieksekusi
  public static void main(String[] args) {

    // Menampilkan teks "Hello World" ke layar
    System.out.println("Hello World ");

    // Membuat objek belajarJava dari class TestProgram
    // Objek ini digunakan untuk memanggil method yang ada di class TestProgram
    TestProgram belajarJava = new TestProgram();

    // Memanggil method helloWorld() dari objek belajarJava
    // Mengirimkan parameter berupa String "Budi"
    belajarJava.helloWorld("Budi");

    // Kode di bawah ini dikomentari karena tidak digunakan dalam program ini
    /*
     * System.out.println("Masukan nama: \n"); // Menampilkan teks "Masukan nama:"
     * ke layar
     * Scanner myName = new Scanner(System.in); // Membuat objek Scanner bernama
     * myName, Scanner digunakan untuk membaca input dari keyboard
     * String userName = myName.nextLine(); // Menyimpan input dari user ke dalam
     * variabel userName bertipe String
     * myName.close(); // Menutup objek Scanner untuk menghindari kebocoran resource
     * new TestProgram().helloWorld(userName); // Membuat objek TestProgram secara
     * langsung tanpa disimpan ke variabel lalu memanggil method helloWorld() dengan
     * parameter userName
     * new TestProgram().inisiasiVariable(userName); // Memanggil method
     * inisiasiVariable() dari class TestProgram dengan parameter userName
     */
  }
}