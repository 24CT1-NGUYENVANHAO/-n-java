package model;

import java.time.YearMonth;
import java.util.Map;

/**
 * Kết quả tổng hợp một tháng (CN-17): tổng chi, theo danh mục, theo người.
 */
public record TongThang(
        YearMonth thang,
        double tongThang,
        Map<DanhMuc, Double> theoDanhMuc,
        Map<String, Double> theoNguoi
) {
    public TongThang {
        throw new UnsupportedOperationException();
    }
}
