
package qltour.model;

public class HoaDon {
    private String ID_HoaDon;
    private HopDong hopdong;
    private LichTrinh lt;
    private String trangThai;
    private String notes;

    public String getID_HoaDon() {
        return ID_HoaDon;
    }

    public void setID_HoaDon(String ID_HoaDon) {
        this.ID_HoaDon = ID_HoaDon;
    }

    public HopDong getHopdong() {
        return hopdong;
    }

    public void setHopdong(HopDong hopdong) {
        this.hopdong = hopdong;
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
}
