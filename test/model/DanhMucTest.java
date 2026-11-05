package model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Test mẫu cho DanhMuc (CN-02): enum danh mục khoản chi.
 */
class DanhMucTest {

    @Test
    void testSoLuongDanhMuc() {
        assertEquals(6, DanhMuc.values().length);
    }

    @Test
    void testTenVaMaDanhMuc() {
        assertEquals("Ăn uống", DanhMuc.AN_UONG.getNhan());
        assertEquals("AU", DanhMuc.AN_UONG.getMa());
        assertEquals("Đi lại", DanhMuc.DI_LAI.getNhan());
        assertEquals("DL", DanhMuc.DI_LAI.getMa());
        assertEquals("Giáo dục", DanhMuc.GIAO_DUC.getNhan());
        assertEquals("GD", DanhMuc.GIAO_DUC.getMa());
        assertEquals("Y tế", DanhMuc.Y_TE.getNhan());
        assertEquals("YT", DanhMuc.Y_TE.getMa());
        assertEquals("Giải trí", DanhMuc.GIAI_TRI.getNhan());
        assertEquals("GT", DanhMuc.GIAI_TRI.getMa());
        assertEquals("Khác", DanhMuc.KHAC.getNhan());
        assertEquals("KH", DanhMuc.KHAC.getMa());
    }

    @Test
    void testTraCuuTheoTen() {
        assertEquals(DanhMuc.AN_UONG, DanhMuc.valueOf("AN_UONG"));
        assertEquals(DanhMuc.KHAC, DanhMuc.valueOf("KHAC"));
    }
}
