package model;

import java.time.LocalDate;

/**
 * Bản ghi một khoản chi (CN-04): id, ngày, danh mục, số tiền, người ghi, ghi chú.
 * Compact constructor kiểm tra hợp lệ (soTien > 0, ngày không tương lai, …).
 */
public record KhoanChi(
        String id,
        LocalDate ngay,
        DanhMuc danhMuc,
        double soTien,
        String nguoiGhi,
        String ghiChu
) {
    public KhoanChi {
        throw new UnsupportedOperationException();
    }
}
