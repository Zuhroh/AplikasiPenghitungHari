
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import javax.swing.JTextField;

public class PenghitungHariHelper {
    public void hitungJumlahHari(int bulan, int tahun, JTextField txtJumlahHari, JTextField txtPertama, JTextField txtTerakhir) {
        // Validasi jika bulan tidak valid
        if (bulan < 1 || bulan > 12) {
            throw new IllegalArgumentException("Bulan tidak valid.");
        }

        // Mendapatkan jumlah hari dalam bulan tersebut menggunakan YearMonth
        YearMonth yearMonth = YearMonth.of(tahun, bulan);
        int jumlahHari = yearMonth.lengthOfMonth(); // Mengambil jumlah hari di bulan tersebut
        
        // Menampilkan jumlah hari
        txtJumlahHari.setText(String.valueOf(jumlahHari));
        
        // Mendapatkan hari pertama dan terakhir bulan tersebut
        LocalDate pertamaBulan = yearMonth.atDay(1);
        LocalDate terakhirBulan = yearMonth.atEndOfMonth();
        
        // Menentukan nama hari pertama dan terakhir
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", Locale.forLanguageTag("id-ID"));
        String hariPertama = pertamaBulan.format(formatter);
        String hariTerakhir = terakhirBulan.format(formatter);
        
        // Menampilkan hari pertama dan terakhir
        txtPertama.setText(hariPertama);
        txtTerakhir.setText(hariTerakhir);
    }

    // Metode untuk menghitung selisih hari antara dua tanggal
    public long hitungSelisihHari(LocalDate tanggalAwal, LocalDate tanggalAkhir) {
        if (tanggalAwal == null || tanggalAkhir == null) {
            throw new IllegalArgumentException("Tanggal awal dan akhir tidak boleh null.");
        }
        return ChronoUnit.DAYS.between(tanggalAwal, tanggalAkhir);  // Menghitung selisih hari
    }

    // Metode untuk mengecek apakah tahun kabisat
    public boolean isTahunKabisat(int tahun) {
        return YearMonth.of(tahun, 2).lengthOfMonth() == 29; // Februari memiliki 29 hari pada tahun kabisat
    }
}
