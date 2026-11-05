# Đề 04 — Sổ chi tiêu dùng chung của một gia đình (AJP201)

Dự án Java cho bài tập lớn AJP201, đề 04 (*Sổ chi tiêu dùng chung của một gia đình*, Nhóm A — ứng dụng quản lý dùng chung qua mạng), trang 6–8 của `de-tai-45.pdf`.

## Cây thư mục

```
de04-so-chi-tieu/
├── src/
│   ├── app/                 # Tầng ứng dụng / điểm vào
│   │   ├── Main.java        # CN-24: main(), khởi động máy chủ hoặc client
│   │   └── KhachHang.java   # CN-11: client gửi lệnh qua Socket
│   ├── net/                 # Tầng mạng: TCP server + giao thức
│   │   ├── MayChu.java      # CN-12: TCP server đa luồng (FixedThreadPool)
│   │   ├── ClientHandler.java # CN-13: xử lý một kết nối client
│   │   ├── GiaoThuc.java    # CN-14: parse/format dòng lệnh
│   │   ├── Lenh.java        # CN-14: record — biểu diễn một lệnh từ client
│   │   ├── LoaiLenh.java    # CN-14: enum — GHI, XEM, TONG, THOAT, KHONG_RO
│   │   └── PhanHoi.java     # CN-18: record — phản hồi chung (ok, duLieu, maLoi, thongBao)
│   ├── store/               # Tầng nghiệp vụ (không phụ thuộc mạng/giao diện, kiểm thử riêng)
│   │   ├── SoChiTieu.java   # CN-05/06/07/08: kho dữ liệu tháng, thêm/sửa/xóa/xem/tổng
│   │   ├── DichVuLenh.java  # CN-18: điều phối lệnh, trả PhanHoi cho máy khách
│   │   ├── BoSinhId.java    # CN-05: sinh mã id khoản chi (CH-YYYYMM-####)
│   │   └── ThongKe.java     # CN-16/17: top 3 tháng, danh mục tăng nhanh nhất
│   └── store/io/            # Tầng lưu trữ
│       ├── KhoCsv.java      # CN-05/06: nạp/ghi chi.tieu.csv
│       ├── BaoCaoCsv.java   # CN-19: xuất báo cáo tháng ra CSV
│       ├── NhatKy.java      # CN-20: ghi audit.log
│       └── LichTongHop.java # CN-21: luồng nền cuối ngày (ScheduledExecutorService)
│   └── model/               # Tầng mô hình dữ liệu
│       ├── DanhMuc.java     # CN-02: enum — danh mục khoản chi
│       ├── KhoanChi.java    # CN-04: record — bản ghi một khoản chi
│       ├── MaLoi.java       # CN-03: enum — mã lỗi nghiệp vụ
│       ├── MucNganSach.java # CN-07: enum — AN_TOAN / SAP_VUOT / VUOT
│       ├── ChiTieuException.java # CN-03: ngoại lệ checked gốc
│       ├── DuLieuKhongHopLeException.java # CN-03: dữ liệu không hợp lệ
│       ├── KhongTimThayException.java     # CN-03: không tìm thấy đối tượng
│       ├── CanhBaoNganSach.java   # CN-05/07: record — cảnh báo ngân sách tháng
│       └── TongThang.java   # CN-17: record — kết quả tổng hợp một tháng
├── build/                   # output biên dịch (.class)
├── data/                    # dữ liệu (chi.tieu.csv nếu đề có lưu tệp)
├── test/                    # kiểm thử (chưa có file)
├── docs/                    # (tham chiếu) danh sách chức năng + sơ đồ
│   ├── danh-sach-chuc-nang.md
│   └── so-do/
└── README.md
```

## Kiểu kết quả dùng chung

Nhóm đã chốt **ném ngoại lệ** (theo Bước 2 của kế hoạch), không dùng `boolean` cờ lỗi, không dùng `sealed interface`, `Optional` chỉ dùng cho “giá trị có thể vắng” (`timTheoId`, `xemNganSach`, `tangNhanhNhat`).

- `ChiTieuException` (checked) là gốc, kèm `MaLoi` để phân loại lỗi.
- `DuLieuKhongHopLeException` và `KhongTimThayException` kế thừa `ChiTieuException`.
- Tầng `store` (`SoChiTieu`) ném `ChiTieuException` khi thất bại, trả giá trị khi thành công.
- `DichVuLenh` là nơi duy nhất bắt ngoại lệ và dựng `PhanHoi(ok=false, maLoi, thongBao)` cho máy khách.

## Biên dịch và chạy bằng dòng lệnh

Yêu cầu: JDK 17+ (máy đã có JDK 26.0.1).

```bash
# Vào thư mục dự án
cd de04-so-chi-tieu

# Biên dịch toàn bộ nguồn vào thư mục build/
javac -d build -sourcepath src $(find src -name "*.java")

# Hoặc sử dụng file danh sách nguồn (tránh tràn lệnh trên đường dẫn dài):
find src -name "*.java" > sources.txt
javac -d build -sourcepath src @sources.txt

# Chạy ứng dụng (điểm vào: app.Main)
java -cp build app.Main
```

Lưu ý: tại thời điểm setup, tất cả thân hàm còn ném `UnsupportedOperationException` (stub). Cần triển khai lại theo `docs/danh-sach-chuc-nang.md` trước khi chạy thực tế.

## Các tệp đã tạo (25 tệp nguồn)

`src/model/` (9): `DanhMuc`, `KhoanChi`, `MaLoi`, `MucNganSach`, `ChiTieuException`, `DuLieuKhongHopLeException`, `KhongTimThayException`, `CanhBaoNganSach`, `TongThang`.

`src/store/` (4): `SoChiTieu`, `DichVuLenh`, `BoSinhId`, `ThongKe`.

`src/store/io/` (4): `KhoCsv`, `BaoCaoCsv`, `NhatKy`, `LichTongHop`.

`src/net/` (6): `MayChu`, `ClientHandler`, `GiaoThuc`, `Lenh`, `LoaiLenh`, `PhanHoi`.

`src/app/` (2): `Main`, `KhachHang`.
