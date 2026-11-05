package store;

import net.Lenh;
import net.PhanHoi;

/**
 * Điều phối lệnh GHI/XEM/TONG (CN-18): là nơi duy nhất bắt ngoại lệ và dựng
 * PhanHoi(ok=false, maLoi, thongBao) cho máy khách.
 */
public class DichVuLenh {
    private final SoChiTieu kho;

    public DichVuLenh(SoChiTieu kho) {
        throw new UnsupportedOperationException();
    }

    public PhanHoi thucHien(Lenh lenh) {
        throw new UnsupportedOperationException();
    }
}
