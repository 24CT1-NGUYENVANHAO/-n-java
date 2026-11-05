package model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Test mẫu cho MaLoi (CN-03): enum mã lỗi nghiệp vụ.
 */
class MaLoiTest {

    @Test
    void testSoLuongMaLoi() {
        assertEquals(6, MaLoi.values().length);
    }

    @Test
    void testCacMaLoi() {
        assertEquals(MaLoi.DU_LIEU, MaLoi.valueOf("DU_LIEU"));
        assertEquals(MaLoi.KHONG_TIM_THAY, MaLoi.valueOf("KHONG_TIM_THAY"));
        assertEquals(MaLoi.TRUNG_ID, MaLoi.valueOf("TRUNG_ID"));
        assertEquals(MaLoi.THANG_KHONG_HOP_LE, MaLoi.valueOf("THANG_KHONG_HOP_LE"));
        assertEquals(MaLoi.DINH_DANG, MaLoi.valueOf("DINH_DANG"));
        assertEquals(MaLoi.IO, MaLoi.valueOf("IO"));
    }
}
