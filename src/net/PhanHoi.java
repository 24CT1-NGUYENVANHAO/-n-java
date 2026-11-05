package net;

import model.MaLoi;

/**
 * Phản hồi chung cho máy khách (CN-18): ok, duLieu, maLoi, thongBao.
 * DichVuLenh là nơi duy nhất dựng PhanHoi(ok=false, …) khi bắt ngoại lệ.
 */
public record PhanHoi(
        boolean ok,
        String duLieu,
        MaLoi maLoi,
        String thongBao
) {
    public PhanHoi {
        throw new UnsupportedOperationException();
    }
}
