public class DataDosen25 {
    // a. Menampilkan semua data dosen
    public void dataSemuaDosen(Dosen25[] arrayOfDosen) {
        System.out.println("\n--- DATA SEMUA DOSEN ---");
        for (Dosen25 d : arrayOfDosen) { // Menggunakan FOREACH 
            System.out.println("Kode          : " + d.kode);
            System.out.println("Nama          : " + d.nama);
            System.out.println("Jenis Kelamin : " + (d.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + d.usia);
            System.out.println("--------------------------------");
        }
    }

    // b. Jumlah dosen per jenis kelamin 
    public void jumlahDosenPerJenisKelamin(Dosen25[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen25 d : arrayOfDosen) {
            if (d.jenisKelamin) pria++; else wanita++;
        }
        System.out.println("Jumlah Dosen Pria: " + pria + ", Wanita: " + wanita);
    }

    // c. Rerata usia dosen per jenis kelamin 
    public void rerataUsiaDosenPerJenisKelamin(Dosen25[] arrayOfDosen) {
        int tPria = 0, tWanita = 0, jPria = 0, jWanita = 0;
        for (Dosen25 d : arrayOfDosen) {
            if (d.jenisKelamin) { tPria += d.usia; jPria++; }
            else { tWanita += d.usia; jWanita++; }
        }
        System.out.println("Rerata Usia Pria   : " + (jPria > 0 ? (double)tPria/jPria : 0));
        System.out.println("Rerata Usia Wanita : " + (jWanita > 0 ? (double)tWanita/jWanita : 0));
    }

    // d & e. Dosen paling tua dan muda 
    public void infoDosenPalingTua(Dosen25[] arrayOfDosen) {
        Dosen25 tua = arrayOfDosen[0];
        for (Dosen25 d : arrayOfDosen) if (d.usia > tua.usia) tua = d;
        System.out.println("Dosen Paling Tua: " + tua.nama);
    }

    public void infoDosenPalingMuda(Dosen25[] arrayOfDosen) {
        Dosen25 muda = arrayOfDosen[0];
        for (Dosen25 d : arrayOfDosen) if (d.usia < muda.usia) muda = d;
        System.out.println("Dosen Paling Muda: " + muda.nama);
    }
}