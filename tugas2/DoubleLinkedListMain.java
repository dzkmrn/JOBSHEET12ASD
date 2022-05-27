package tugas1;

import java.util.Scanner;
public class DoubleLinkedListMain {

    public static void menu(){
        System.out.println("=========================");
        System.out.println("  Data Film Layar Lebar  ");
        System.out.println("=========================");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Index Tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari ID Film");
        System.out.println("9. Urut Data Rating Film DESC");
        System.out.println("10. Keluar");
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       Scanner sd = new Scanner(System.in);
       Scanner sb = new Scanner(System.in);
       
       DoubleLinkedList dll = new DoubleLinkedList();
        
       int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
    
            switch(pilih){
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.print("ID Film\t\t: ");
                    int id = sd.nextInt();
                    System.out.print("Judul Film\t: ");
                    String judulFilm = sc.nextLine();
                    System.out.print("Rating\t\t: ");
                    double rating = sb.nextDouble();
                    dll.addFirst(id, judulFilm, rating);
                    sc.nextLine();
                break;
                
                case 2:
                    System.out.println("Masukkan Data Film Posisi Akhir");
                    System.out.print("ID Film\t\t: ");
                    int idD = sd.nextInt();
                    System.out.print("Judul Film\t: ");
                    String judulFilmM = sc.nextLine();
                    System.out.print("Rating\t\t: ");
                    double ratingG = sb.nextDouble();
                    dll.addLast(idD, judulFilmM, ratingG);
                    sc.nextLine();
                break;
                
                case 3:
                    System.out.println("Masukkan Data Film Posisi yang diinginkan");
                    System.out.print("Urutan ke - ");
                    int idx = sd.nextInt();
                    System.out.print("ID Film\t\t: ");
                    int idDD = sd.nextInt();
                    System.out.print("Judul Film\t: ");
                    String judulFilmMM = sc.nextLine();
                    System.out.print("Rating\t\t: ");
                    double ratingGG = sb.nextDouble();
                    dll.add(idDD, judulFilmMM, ratingGG, idx);
                    sc.nextLine();
                break;
                
                case 4:
                    dll.removeFirst();
                    dll.print();
                break;
                
                case 5:
                    dll.removeLast();
                    dll.print();
                break;
                
                case 6:
                    System.out.println("hapus Data Film Posisi yang diinginkan");
                    System.out.print("Urutan ke - ");
                    int index = sd.nextInt();
                    dll.remove(index);
                    dll.print();
                break;
                
                case 7:
                    dll.print();
                break;
                
                case 8:
                    System.out.println("Cari ID Film Yang ingin dicari");
                    System.out.print("Masukkan ID\t: ");
                    int cari = sd.nextInt();
                    int idF = dll.findSeqSearch(cari);
                    dll.tampilPosisi(cari, idF);
                break;
                
                case 9:
                    System.out.println("Data Akan diurut secara DESC");
                    dll.sort();
                break;
                
                case 10:
                    System.exit(0);
                break;
            } 
        }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 || pilih == 8 || pilih == 9 || pilih == 10);
    }
}
