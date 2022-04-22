package quanli;

import xaydungcaclop.Nguoi;
import xaydungcaclop.Tinh;

import java.util.ArrayList;
import java.util.List;

public class QuanLiNguoi implements QuanLi<Nguoi> {
    List<Nguoi> nguoiList = new ArrayList<>();
    List<QuanLiTinh> quanLiTinhs = new ArrayList<>();

    @Override
    public void add(Nguoi nguoi) {
        nguoiList.add(nguoi);
    }

    @Override
    public void display() {
        for (int i = 0; i < nguoiList.size(); i++) {
            System.out.println(nguoiList.get(i));
        }
    }

    @Override
    public int search(String name) {
        for (int i = 0; i < nguoiList.size(); i++) {
            if (nguoiList.get(i).getTen().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void edit(String name, Nguoi nguoi) {
        int index = search(name);
        if (index != -1) {
            nguoiList.set(index, nguoi);
        } else {
            System.out.println("ko co");
        }
    }

    @Override
    public void delete(String name) {
        search(name);
        nguoiList.remove(search(name));
        System.out.println("da xoa thanh cong!");
    }
}
