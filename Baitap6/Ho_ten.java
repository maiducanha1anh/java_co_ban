package Baitap6;

public class Ho_ten {
    private String ho;
    private String dem;
    private String ten;

    public Ho_Ten(String ho, String dem, String ten) {
        this.ho = ho;
        this.dem = dem;
        this.ten = ten;
    }

    public String getHoTenDayDu() {
        return ho + " " + dem + " " + ten;
    }

    @Override
    public String toString() {
        return getHoTenDayDu();
    }
}
