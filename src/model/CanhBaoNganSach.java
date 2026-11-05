package model;

import java.time.YearMonth;

/**
 * Cảnh báo ngân sách tháng (CN-05/CN-07): so sánh tổng chi với hạn mức,
 * xếp mức AN_TOAN / SAP_VUOT / VUOT.
 */
public record CanhBaoNganSach(
        YearMonth thang,
        double hanMuc,
        double daChi,
        MucNganSach muc
) {
    public CanhBaoNganSach {
        throw new UnsupportedOperationException();
    }

    public double tiLe() {
        throw new UnsupportedOperationException();
    }
}
