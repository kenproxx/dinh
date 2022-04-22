package xaydungcaclop;

public class Tinh {
    private int ma;
    private String ten;
    private long danSo;
    private double GDP;

    public Tinh() {
    }

    public Tinh(int ma, String ten, long danSo, double GDP) {
        this.ma = ma;
        this.ten = ten;
        this.danSo = danSo;
        this.GDP = GDP;
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

    public long getDanSo() {
        return danSo;
    }

    public void setDanSo(long danSo) {
        this.danSo = danSo;
    }

    public double getGDP() {
        return GDP;
    }

    public void setGDP(int GDP) {
        this.GDP = GDP;
    }

    @Override
    public String toString() {
        return "Tinh{" +
                "ma=" + ma +
                ", ten='" + ten + '\'' +
                ", danSo=" + danSo +
                ", GDP=" + GDP +
                '}';
    }

}
