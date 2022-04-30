/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staff_management_system.DTO;

import java.util.Date;
import java.util.Objects; 
/**
 *
 * @author Chi Thien
 */
public class CongViec {
    private String MaCongViec;
    private String TenCongViec;
    
    public CongViec(){      
    }

    public CongViec(String MaCongViec, String TenCongViec) {
        this.MaCongViec = MaCongViec;
        this.TenCongViec = TenCongViec;
    }
        public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CongViec other = (CongViec) obj;
        if (!Objects.equals(this.MaCongViec, other.MaCongViec)) {
            return false;
        }
        if (!Objects.equals(this.TenCongViec, other.TenCongViec)) {
            return false;
        }
        return true;
    }

    /**
     * @return the MaCongVIec
     */
    public String getMaCongViec() {
        return MaCongViec;
    }

    /**
     * @param MaCongViec the MaCongVIec to set
     */
    public void setMaCongViec(String MaCongViec) {
        this.MaCongViec = MaCongViec;
    }

    /**
     * @return the TenCongViec
     */
    public String getTenCongViec() {
        return TenCongViec;
    }

    /**
     * @param TenCongViec the TenCongViec to set
     */
    public void setTenCongViec(String TenCongViec) {
        this.TenCongViec = TenCongViec;
    }
}
