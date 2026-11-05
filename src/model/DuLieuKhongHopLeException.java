package model;

/**
 * Ngoại lệ khi dữ liệu nhập không hợp lệ (CN-03), kế thừa ChiTieuException.
 */
public class DuLieuKhongHopLeException extends ChiTieuException {
    public DuLieuKhongHopLeException(MaLoi ma, String message) {
        super(ma, message);
    }

    public DuLieuKhongHopLeException(MaLoi ma, String message, Throwable cause) {
        super(ma, message, cause);
    }
}
