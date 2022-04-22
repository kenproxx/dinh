package xaydungcaclop;

import quanli.QuanLiTinh;

public class Nguoi {
    private int ma;
    private String ten;
    private int tuoi;
    private String diaChi;
    QuanLiTinh quanLiTinh = new QuanLiTinh();
    public Nguoi() {
    }

    public Nguoi(int ma, String ten, int tuoi, String diaChi) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "ma=" + ma +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
