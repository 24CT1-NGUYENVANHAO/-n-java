package net;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Test mẫu cho LoaiLenh (CN-14): enum loại lệnh từ client.
 */
class LoaiLenhTest {

    @Test
    void testSoLuongLoaiLenh() {
        assertEquals(5, LoaiLenh.values().length);
    }

    @Test
    void testCacLoaiLenh() {
        assertEquals(LoaiLenh.GHI, LoaiLenh.valueOf("GHI"));
        assertEquals(LoaiLenh.XEM, LoaiLenh.valueOf("XEM"));
        assertEquals(LoaiLenh.TONG, LoaiLenh.valueOf("TONG"));
        assertEquals(LoaiLenh.THOAT, LoaiLenh.valueOf("THOAT"));
        assertEquals(LoaiLenh.KHONG_RO, LoaiLenh.valueOf("KHONG_RO"));
    }
}
