package model;

/**
 * Danh mục khoản chi (CN-02): Ăn uống, Đi lại, Giáo dục, Y tế, Giải trí, Khác.
 * Mỗi hằng có nhãn tiếng Việt và mã ngắn; tuMa(String) đổi mã → hằng.
 */
public enum DanhMuc {
    AN_UONG("Ăn uống", "AU"),
    DI_LAI("Đi lại", "DL"),
    GIAO_DUC("Giáo dục", "GD"),
    Y_TE("Y tế", "YT"),
    GIAI_TRI("Giải trí", "GT"),
    KHAC("Khác", "KH");

    private final String nhan;
    private final String ma;

    DanhMuc(String nhan, String ma) {
        this.nhan = nhan;
        this.ma = ma;
    }

    public String getNhan() {
        return nhan;
    }

    public String getMa() {
        return ma;
    }

    public static DanhMuc tuMa(String ma) {
        throw new UnsupportedOperationException();
    }
}
