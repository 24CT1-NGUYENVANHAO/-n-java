package store;

import model.CanhBaoNganSach;
import model.ChiTieuException;
import model.DanhMuc;
import model.KhoanChi;
import model.TongThang;
import java.time.YearMonth;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

/**
 * Kho dữ liệu tháng (CN-05/CN-06/CN-07/CN-08): thêm/sửa/xóa/xem/tổng khoản chi.
 * Tầng nghiệp vụ: không phụ thuộc mạng hay giao diện, kiểm thử riêng (TC3 mức 3).
 */
public class SoChiTieu {
    private final TreeMap<YearMonth, List<KhoanChi>> theoThang;
    private final Map<String, List<KhoanChi>> chiMuc;
    private final Map<YearMonth, Double> nganSach;
    private final Object khoa;

    public SoChiTieu() {
        throw new UnsupportedOperationException();
    }

    public KhoanChi them(KhoanChi kc) throws ChiTieuException {
        throw new UnsupportedOperationException();
    }

    public KhoanChi sua(String id, KhoanChi kc) throws ChiTieuException {
        throw new UnsupportedOperationException();
    }

    public KhoanChi xoa(String id) throws ChiTieuException {
        throw new UnsupportedOperationException();
    }

    public Optional<KhoanChi> timTheoId(String id) throws ChiTieuException {
        throw new UnsupportedOperationException();
    }

    public List<KhoanChi> xem(YearMonth thang, DanhMuc dm, String nguoi) throws ChiTieuException {
        throw new UnsupportedOperationException();
    }

    public TongThang tongThang(YearMonth thang) throws ChiTieuException {
        throw new UnsupportedOperationException();
    }

    public void datNganSach(YearMonth thang, double soTien) throws ChiTieuException {
        throw new UnsupportedOperationException();
    }

    public Optional<Double> xemNganSach(YearMonth thang) throws ChiTieuException {
        throw new UnsupportedOperationException();
    }

    public CanhBaoNganSach canhBao(YearMonth thang) throws ChiTieuException {
        throw new UnsupportedOperationException();
    }

    public List<KhoanChi> saoChep(YearMonth thang) throws ChiTieuException {
        throw new UnsupportedOperationException();
    }

    public List<TongThang> top3Thang() throws ChiTieuException {
        throw new UnsupportedOperationException();
    }

    public Optional<DanhMuc> tangNhanhNhat() throws ChiTieuException {
        throw new UnsupportedOperationException();
    }
}
