
package qltour.model;

import java.io.Serializable;

public class HopDong implements Serializable {
    private String ID_HopDong;
    private String Makh;
    private String NgayLap;
    private String MaTour;
    
    
    

    public HopDong() {
	}

	public HopDong(String iD_HopDong, String kh, String ngayLap, String maTour) {
		ID_HopDong = iD_HopDong;
		this.Makh = kh;
		NgayLap = ngayLap;

		MaTour = maTour;
	}

	public String getID_HopDong() {
        return ID_HopDong;
    }

    public void setID_HopDong(String ID_HopDong) {
        this.ID_HopDong = ID_HopDong;
    }

    public String getMaKh() {
        return Makh;
    }

    public void setMaKh(String kh) {
        this.Makh = kh;
    }




	public String getNgayLap() {
		return NgayLap;
	}

	public String getMaTour() {
		return MaTour;
	}

	public void setNgayLap(String ngayLap) {
		NgayLap = ngayLap;
	}

	public void setMaTour(String maTour) {
		MaTour = maTour;
	}
    
	
	
	
}
