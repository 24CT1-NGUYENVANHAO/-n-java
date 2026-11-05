package net;

import java.util.List;

/**
 * Biểu diễn một lệnh từ client (CN-14): loại lệnh và danh sách tham số.
 */
public record Lenh(
        LoaiLenh loai,
        List<String> thamSo
) {
    public Lenh {
        throw new UnsupportedOperationException();
    }
}
