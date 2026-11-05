package model;

/**
 * Ngoại lệ khi không tìm thấy đối tượng yêu cầu (CN-03), kế thừa ChiTieuException.
 */
public class KhongTimThayException extends ChiTieuException {
    public KhongTimThayException(MaLoi ma, String message) {
        super(ma, message);
    }

    public KhongTimThayException(MaLoi ma, String message, Throwable cause) {
        super(ma, message, cause);
    }
}
