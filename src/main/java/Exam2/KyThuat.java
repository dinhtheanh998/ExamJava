package Exam2;

public class KyThuat extends NhanVien{
    public String chuyenNganh;

    public KyThuat(){

    }
    public KyThuat(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    public KyThuat(String maNV, String hoTen, String namSinh, String diaChi, String chuyenNganh) {
        super(maNV, hoTen, namSinh, diaChi);
        this.chuyenNganh = chuyenNganh;
    }


    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public String moTaCongViec(){
        return "Làm việc với máy tính";
    }

    @Override
    public String toString() {
        return "KyThuat{"+ super.toString() +
                "chuyenNganh='" + chuyenNganh + '\'' +
                '}';
    }
}
