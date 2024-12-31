package com.askrindo.transaction.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "MIKRO_RUMAHKU")
public class MikroRumahku extends Auditable<String> implements Serializable {

    @Column(name = "NAMA_TERTANGGUNG",length = 100)
    private String namaTertanggung;

    @Column(name = "NOMOR_KTP",length = 16)
    private String nomorKtp;

    @Column(name = "EMAIL",length = 150)
    private String email;

    @Column(name = "NOMOR_TELEPON",length = 30)
    private String nomorTelepon;

    @Column(name = "JANGKA_WAKTU_AWAL")
    private LocalDateTime jangkaWaktuAwal;

    @Column(name = "JANGKA_WAKTU_AKHIR")
    private LocalDateTime jangkaWaktuAkhir;

    @Column(name = "INFORMASI_KEPEMILIKAN",length = 150)
    private String informasiKepemilikan;

    @Column(name = "ALAMAT")
    private String alamat;

    @Column(name = "NAMA_AHLI_WARIS",length = 100)
    private String namaAhliWaris;

    @Column(name = "TANGGAL_LAHIR_AHLI_WARIS")
    private LocalDateTime tanggalLahirAhliWaris;

    @Column(name = "NOMOR_TELEPON_AHLI_WARIS",length = 30)
    private String nomorTeleponAhliWaris;

    @Column(name = "HUBUNGAN",length = 150)
    private String hubungan;

    @Column(name = "JENIS_PAKET",length = 150)
    private String jenisPaket;

    @Column(name = "NOMOR_SERTIFIKAT")
    private String nomorSertifikat;

    @Column(name = "NILAI_PREMI")
    private BigDecimal nilaiPremi;
}
