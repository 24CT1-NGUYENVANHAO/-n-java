package model;

/**
 * Ngoại lệ checked gốc cho toàn hệ thống (CN-03), mang MaLoi để phân loại lỗi.
 * Dùng cho mọi phép nghiệp vụ trong SoChiTieu khi thất bại.
 */
public class ChiTieuException extends Exception {
    private final MaLoi ma;

    public ChiTieuException(MaLoi ma, String message) {
        super(message);
        this.ma = ma;
    }

    public ChiTieuException(MaLoi ma, String message, Throwable cause) {
        super(message, cause);
        this.ma = ma;
    }

    public MaLoi getMa() {
        return ma;
    }
}
