/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfttugas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ROG
 */
public class Hfttugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner baca = new Scanner(System.in);
        buku[] perpus = new buku[10000];
        int n = 0;
        double jumlahhala = 0;
        double halamanfiksi = 0;
        double halamannonfiksi = 0;
        double standardeviasi = 0;
        double standardeviasif = 0;
        double standardeviasinf = 0;
        Random rand = new Random();
        int fiksi = 0;
        int nonfiksi = 0;

        for (int i = 0; i < perpus.length; i++) {
            int randomm = rand.nextInt(2) + 1;
            if (randomm == 1) {
                perpus[i] = new fiksi();
            }
            if (randomm == 2) {
                perpus[i] = new nonfiksi();
            }
        }

        perpus[0] = new buku("Matematika Diskrit", "Daryono", "fiksi", 600);
        fiksi += 1;
        halamanfiksi += 600;
        jumlahhala += 600;
        n += 1;

        perpus[1] = new buku("Matematika Statistika", "Wahyu", "nonfiksi", 600);
        nonfiksi += 1;
        halamannonfiksi += 600;
        jumlahhala += 600;
        n += 1;
        perpus[2] = new buku("KPB", "Lukman", "nonfiksi", 600);
        nonfiksi += 1;
        halamannonfiksi += 600;
        jumlahhala += 600;
        n += 1;

        int pil = 1;
        do {
            wow();
            System.out.println(" ____    ____    ____    ____    __  __  ____    ______  ______  __  __   ______  ______  __  __\n"
                    + "/\\  _`\\ /\\  _`\\ /\\  _`\\ /\\  _`\\ /\\ \\/\\ \\/\\  _`\\ /\\__  _\\/\\  _  \\/\\ \\/\\ \\ /\\  _  \\/\\  _  \\/\\ \\/\\ \\\n"
                    + "\\ \\ \\L\\ \\ \\ \\L\\_\\ \\ \\L\\ \\ \\ \\L\\ \\ \\ \\ \\ \\ \\,\\L\\_\\/_/\\ \\/\\ \\ \\L\\ \\ \\ \\/'/'\\ \\ \\L\\ \\ \\ \\L\\ \\ \\ `\\\\ \\\n"
                    + " \\ \\ ,__/\\ \\  _\\L\\ \\ ,  /\\ \\ ,__/\\ \\ \\ \\ \\/_\\__ \\  \\ \\ \\ \\ \\  __ \\ \\ , <  \\ \\  __ \\ \\  __ \\ \\ , ` \\\n"
                    + "  \\ \\ \\/  \\ \\ \\L\\ \\ \\ \\\\ \\\\ \\ \\/  \\ \\ \\_\\ \\/\\ \\L\\ \\ \\ \\ \\ \\ \\ \\/\\ \\ \\ \\\\`\\ \\ \\ \\/\\ \\ \\ \\/\\ \\ \\ \\`\\ \\\n"
                    + "   \\ \\_\\   \\ \\____/\\ \\_\\ \\_\\ \\_\\   \\ \\_____\\ `\\____\\ \\ \\_\\ \\ \\_\\ \\_\\ \\_\\ \\_\\\\ \\_\\ \\_\\ \\_\\ \\_\\ \\_\\ \\_\\\n"
                    + "    \\/_/    \\/___/  \\/_/\\/ /\\/_/    \\/_____/\\/_____/  \\/_/  \\/_/\\/_/\\/_/\\/_/ \\/_/\\/_/\\/_/\\/_/\\/_/\\/_/\n"
                    + "");

            System.out.println("");
            wow();
            System.out.println("Data buku sementara : ");
            for (int i = 0; i < n; i++) {
                System.out.println("[" + (i + 1) + "] " + perpus[i].getJudul() + "\t| " + perpus[i].getPengarang());
            }
            wow();
            System.out.println("Pilih yang diinginkan : \n[1]. Input buku baru\n" + "[2]. Modifikisi detail buku\n" + "[3]. Hapus buku\n" + "[0]. EXIT");
            wow();

            double rata = jumlahhala / n;
            for (int i = 0; i < n; i++) {
                standardeviasi = Math.pow((perpus[i].getHalaman() - rata), 2);
            }

            double ratafiksi = halamanfiksi / fiksi;
            double ratanonfiksi = halamannonfiksi / nonfiksi;
            for (int i = 0; i < n; i++) {
                if (perpus[i].getJenis() == "fiksi") {
                    standardeviasif = Math.pow((perpus[i].getHalaman() - ratafiksi), 2);
                } else {
                    standardeviasinf = Math.pow((perpus[i].getHalaman() - ratanonfiksi), 2);
                }
            }

            System.out.println("Jumlah buku di dalam perpustakaan: " + n + "\nRata-rata halaman buku dalam perpustakaan: " + rata + "\nStandar deviasi halaman buku dalam perpustakaan: " + Math.sqrt(standardeviasi / n));
            wow();
            System.out.println("Jumlah Buku Fiksi dalam perpustakaan: " + fiksi + "\nRata-rata halaman Buku Fiksi dalam perpustakaan: " + ratafiksi + "\nStandar deviasi halaman Buku Fiksi dalam perpustakaan: " + Math.sqrt(standardeviasif / fiksi));
            wow();
            System.out.println("Jumlah Buku Non Fiksi dalam perpustakaan : " + nonfiksi + "\nRata-rata halaman Buku Non Fiksi dalam perpustakaan: " + ratanonfiksi + "\nStandar deviasi halaman Buku Non Fiksi dalam perpustakaan: " + Math.sqrt(standardeviasinf / nonfiksi));
            wow();
            System.out.print("Masukan pilihanmu :");

            int pilihan = baca.nextInt();
            if (pilihan == 1) {
                wow();
                System.out.println(" ____            __                  ____\n"
                        + "/\\  _`\\         /\\ \\                /\\  _`\\\n"
                        + "\\ \\ \\L\\ \\  __  _\\ \\ \\/'\\   __  __   \\ \\ \\L\\ \\     __    _ __   __  __\n"
                        + " \\ \\  _ <'/\\ \\/\\ \\ \\ , <  /\\ \\/\\ \\   \\ \\  _ <'  /'__`\\ /\\`'__\\/\\ \\/\\ \\\n"
                        + "  \\ \\ \\L\\ \\ \\ \\_\\ \\ \\ \\\\`\\\\ \\ \\_\\ \\   \\ \\ \\L\\ \\/\\ \\L\\.\\\\ \\ \\/ \\ \\ \\_\\ \\\n"
                        + "   \\ \\____/\\ \\____/\\ \\_\\ \\_\\ \\____/    \\ \\____/\\ \\__/.\\_\\ \\_\\  \\ \\____/\n"
                        + "    \\/___/  \\/___/  \\/_/\\/_/\\/___/      \\/___/  \\/__/\\/_/\\/_/   \\/___/");
                System.out.println("");
                wow();
                n += 1;

                System.out.print("input judul buku : \n> ");
                String judul = baca.next();
                perpus[n - 1].setJudul(judul);
                System.out.print("input pengarang buku : \n> ");
                String pengarang = baca.next();
                perpus[n - 1].setPengarang(pengarang);
                System.out.print("input jumlah halaman buku : \n> ");
                int halaman = baca.nextInt();
                perpus[n - 1].setHalaman(halaman);

                int randomm = rand.nextInt(2) + 1;
                if (randomm == 1) {
                    perpus[n - 1] = new buku(judul, pengarang, "fiksi", halaman);
                    fiksi += 1;
                    halamanfiksi += halaman;
                }
                if (randomm == 2) {
                    perpus[n - 1] = new buku(judul, pengarang, "nonfiksi", halaman);
                    nonfiksi += 1;
                    halamannonfiksi += halaman;
                }
            } else if (pilihan == 2) {
                wow();
                System.out.println(" __  __     ______     ______     __  __        ______     __  __     __  __     __  __\n"
                        + "/\\ \\/\\ \\   /\\  == \\   /\\  __ \\   /\\ \\_\\ \\      /\\  == \\   /\\ \\/\\ \\   /\\ \\/ /    /\\ \\/\\ \\\n"
                        + "\\ \\ \\_\\ \\  \\ \\  __<   \\ \\  __ \\  \\ \\  __ \\     \\ \\  __<   \\ \\ \\_\\ \\  \\ \\  _\"-.  \\ \\ \\_\\ \\\n"
                        + " \\ \\_____\\  \\ \\_____\\  \\ \\_\\ \\_\\  \\ \\_\\ \\_\\     \\ \\_____\\  \\ \\_____\\  \\ \\_\\ \\_\\  \\ \\_____\\\n"
                        + "  \\/_____/   \\/_____/   \\/_/\\/_/   \\/_/\\/_/      \\/_____/   \\/_____/   \\/_/\\/_/   \\/_____/");
                System.out.println("");
                wow();
                System.out.println("Pilih buku yang akan diubah : ");
                for (int i = 0; i < n; i++) {
                    System.out.println("[" + (i + 1) + "] " + perpus[i].getJudul() + "\t| " + perpus[i].getPengarang());
                }
                int ubahbuku = baca.nextInt();
                System.out.print("input judul buku : \n> ");
                String judul = baca.next();
                perpus[ubahbuku - 1].setJudul(judul);
                System.out.print("input pengarang buku : \n> ");
                String pengarang = baca.next();
                perpus[ubahbuku - 1].setPengarang(pengarang);

                int hallama = perpus[ubahbuku - 1].getHalaman();
                System.out.print("input jumlah halaman buku : \n> ");
                int halaman = baca.nextInt();
                perpus[ubahbuku - 1].setHalaman(halaman);
                jumlahhala = jumlahhala - hallama + halaman;
                if (perpus[ubahbuku - 1].getJenis() == "fiksi") {
                    halamanfiksi = halamanfiksi - hallama + perpus[ubahbuku].getHalaman();
                } else {
                    halamannonfiksi = halamannonfiksi - hallama + perpus[ubahbuku].getHalaman();
                }
            } else if (pilihan == 3) {
                wow();
                System.out.println("/\\ \\_\\ \\   /\\  __ \\   /\\  == \\ /\\ \\/\\ \\   /\\  ___\\      /\\  == \\   /\\ \\/\\ \\   /\\ \\/ /    /\\ \\/\\ \\\n"
                        + "\\ \\  __ \\  \\ \\  __ \\  \\ \\  _-/ \\ \\ \\_\\ \\  \\ \\___  \\     \\ \\  __<   \\ \\ \\_\\ \\  \\ \\  _\"-.  \\ \\ \\_\\ \\\n"
                        + " \\ \\_\\ \\_\\  \\ \\_\\ \\_\\  \\ \\_\\    \\ \\_____\\  \\/\\_____\\     \\ \\_____\\  \\ \\_____\\  \\ \\_\\ \\_\\  \\ \\_____\\\n"
                        + "  \\/_/\\/_/   \\/_/\\/_/   \\/_/     \\/_____/   \\/_____/      \\/_____/   \\/_____/   \\/_/\\/_/   \\/_____/");
                System.out.println("");
                wow();
                System.out.println("Pilih buku yang akan dihapus : ");
                for (int i = 0; i < n; i++) {
                    System.out.println("[" + (i + 1) + "] " + perpus[i].getJudul() + "\t| " + perpus[i].getPengarang());
                }
                int hapusbuku = baca.nextInt();
                for (int i = hapusbuku; i < n; i++) {
                    perpus[i - 1] = perpus[i];
                }

                jumlahhala -= perpus[hapusbuku].getHalaman();
                n -= 1;
                if (perpus[hapusbuku].getJenis() == "fiksi") {
                    fiksi -= 1;
                    halamanfiksi -= perpus[hapusbuku].getHalaman();
                } else {
                    nonfiksi -= 1;
                    halamannonfiksi -= perpus[hapusbuku].getHalaman();
                }
            } else {
                pil = 0;
            }
        } while (pil != 0);

    }

    public static void wow() {
        System.out.println("======================================================================================");
    }
}
        // TODO code application logic here

