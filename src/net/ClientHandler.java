package net;

import java.net.Socket;
import store.DichVuLenh;

/**
 * Xử lý một kết nối client (CN-13): mỗi kết nối chạy trên một thread lấy từ pool.
 */
public class ClientHandler implements Runnable {
    private final Socket socket;
    private final DichVuLenh dichVu;

    public ClientHandler(Socket socket, DichVuLenh dichVu) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException();
    }
}
