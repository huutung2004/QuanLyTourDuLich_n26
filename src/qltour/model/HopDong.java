
package qltour.model;

public class HopDong {
    private String ID_HopDong;
    private KhachHang kh;
    private LichTrinh lt;
    private String trangThai;

    public String getID_HopDong() {
        return ID_HopDong;
    }

    public void setID_HopDong(String ID_HopDong) {
        this.ID_HopDong = ID_HopDong;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public LichTrinh getLt() {
        return lt;
    }

    public void setLt(LichTrinh lt) {
        this.lt = lt;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
}
