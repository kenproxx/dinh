package quanli;

import xaydungcaclop.Tinh;

import java.util.ArrayList;
import java.util.List;

public class QuanLiTinh implements QuanLi<Tinh> {

    List<Tinh> tinhList = new ArrayList<>();
    int sizeTinh = 1;
    public void khoiTao5Tinh() {
        tinhList.add(new Tinh(20, "Thai Nguyen", 20000, 50000));
        tinhList.add(new Tinh(29, "Ha Noi", 50000, 50000));
        tinhList.add(new Tinh(99, "Bac Ninh", 70000, 50000));
        tinhList.add(new Tinh(38, "Ha Tinh", 290000, 50000));
        tinhList.add(new Tinh(37, "Dak Lak", 10000, 50000));
    }

    @Override
    public void add(Tinh tinh) {
        tinhList.add(tinh);
        sizeTinh++;
    }

    public void addPerson() {
    }

    @Override
    public void display() {
        for (Tinh tinh : tinhList) {
            System.out.println(tinh);
        }
    }

    public void display2() {
        for (Tinh tinh :
                tinhList) {
            System.out.println("Ma tinh: " + tinh.getMa() + ", Ten tinh: " + tinh.getTen());
        }
    }

    public void display3() {
        for (Tinh tinh :
                tinhList) {
            System.out.println("Ma tinh: " + tinh.getMa() + ", Ten tinh: " + tinh.getTen() + ", so nguoi la: " + tinh.getDanSo());
        }
    }
    
    
    
    @Override
    public int search(String name) {
        for (int i = 0; i < tinhList.size(); i++) {
            if (tinhList.get(i).getTen().equals(name)) {
                System.out.println(name + " o vi tri " + i);
                return i;
            }
        }
        return  -1;
    }

    public String searchNameByID(int id) {
        for (int i = 0; i < tinhList.size(); i++) {
            if (id == tinhList.get(i).getMa()) {
                String a = tinhList.get(i).getTen();
                return a;
            }
        }

        return "khong co";
    }

    public int searchidbyName(String name) {
        for (int i = 0; i < tinhList.size(); i++) {
            if (tinhList.get(i).getTen().equals(name)) {
                return tinhList.get(i).getMa();
            }
        }
        return -1;
    }

    @Override
    public void edit(String name, Tinh tinh) {
        int index = search(name);
        if (index != -1) {
            tinhList.set(index, tinh);
        } else {
            System.out.println("ko co");
        }
    }

    @Override
    public void delete(String name) {
        search(name);
        tinhList.remove(search(name));
        System.out.println("da xoa thanh cong!");
    }
    
    public void setDanSo(String name) {
        for(Tinh tinh: tinhList) {
            if(tinh.getTen().equals(name)) {
                tinh.setDanSo(tinh.getDanSo()+1);
            }
        }
    }
}
