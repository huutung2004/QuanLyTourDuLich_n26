
package qltour.model;

import java.util.Date;

public class LichTrinh {
    private String ID_lichTrinh;
    private KhachHang kh;
    private Tour tour;
    private Date date_start;
    private Date date_end;
    private int soKhach;
    private String HDV;
    private String trangThai;

    public String getID_lichTrinh() {
        return ID_lichTrinh;
    }

    public void setID_lichTrinh(String ID_lichTrinh) {
        this.ID_lichTrinh = ID_lichTrinh;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public Date getDate_start() {
        return date_start;
    }

    public void setDate_start(Date date_start) {
        this.date_start = date_start;
    }

    public Date getDate_end() {
        return date_end;
    }

    public void setDate_end(Date date_end) {
        this.date_end = date_end;
    }

    public int getSoKhach() {
        return soKhach;
    }

    public void setSoKhach(int soKhach) {
        this.soKhach = soKhach;
    }

    public String getHDV() {
        return HDV;
    }

    public void setHDV(String HDV) {
        this.HDV = HDV;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
