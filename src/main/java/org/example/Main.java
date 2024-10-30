package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<Double> transactions;
    private double balance;

    public Main() {
        transactions = new ArrayList<>();
        balance = 0.0;
    }

    // fungsi untuk menambah pemasukan
    public void addIncome(double nominal) {
        transactions.add(nominal); // Menambah pemasukan ke daftar transaksi
        balance += nominal; // Menambah pemasukan ke saldo
        System.out.println("Pemasukan sebesar " + nominal + " telah ditambahkan.");
    }

    // fungsi untuk menambah pengeluaran
    public void addExpense(double nominal) {
        transactions.add(-nominal);
        balance -= nominal;
        System.out.println("Pengeluaran sebesar " + nominal + " telah ditambahkan.");
    }

    // fungsi untuk menampilkan saldo saat ini
    public void showBalance() {
        System.out.println("Saldo saat ini: " + balance);
    }

    /**
     * ini adalah method main
     * @param args
     */
    public static void main(String[] args) {
        Main financeApp = new Main();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // tampil menu
            System.out.println("\n==== Pencatatan Keuangan Pribadi ====");
            System.out.println("1. Tambah Pemasukan");
            System.out.println("2. Tambah Pengeluaran");
            System.out.println("3. Lihat Saldo");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");

            int choice = scanner.nextInt(); // scan input menu

            switch (choice) {
                case 1: // fungsi Pemasukan
                    System.out.print("Masukkan nominal pemasukan: ");
                    double income = scanner.nextDouble();
                    financeApp.addIncome(income);
                    break;
                case 2: // fungsi Pengeluaran
                    System.out.print("Masukkan nominal pengeluaran: ");
                    double expense = scanner.nextDouble();
                    financeApp.addExpense(expense);
                    break;
                case 3: // fungsi Lihat Saldo
                    financeApp.showBalance();
                    break;
                case 4: // Keluar
                    running = false;
                    System.out.println("Terima kasih telah menggunakan aplikasi ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
    }
}
