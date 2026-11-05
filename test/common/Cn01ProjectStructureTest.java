package common;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Test CN-01: Khung dự án — package common/model/store/net/app, lớp Main,
 * cấu hình build JDK 17 và manifest cho jar.
 */
class Cn01ProjectStructureTest {

    @Test
    void testMainClassCoPhuongThucMain() throws Exception {
        Class<?> mainClass = Class.forName("app.Main");
        assertNotNull(mainClass, "Lop app.Main phai ton tai");
        Method mainMethod = mainClass.getMethod("main", String[].class);
        assertTrue(Modifier.isStatic(mainMethod.getModifiers()),
            "phuong thuc main phai static");
        assertTrue(Modifier.isPublic(mainMethod.getModifiers()),
            "phuong thuc main phai public");
        assertEquals(void.class, mainMethod.getReturnType(),
            "phuong thuc main phai tra ve void");
    }

    @Test
    void testChayTrenJDK17TroLen() {
        String version = System.getProperty("java.version");
        int major = Integer.parseInt(version.split("\\.")[0]);
        assertTrue(major >= 17,
            "Phai chay JDK 17 tro len, hien tai: " + version);
    }

    @Test
    void testPackageCommonTonTai() {
        File commonDir = new File("src/common");
        assertTrue(commonDir.exists() && commonDir.isDirectory(),
            "Thieu package common tai src/common");
    }

    @Test
    void testCacPackageYeuCauTonTai() {
        String[] packages = {"common", "model", "store", "net", "app"};
        for (String pkg : packages) {
            File dir = new File("src/" + pkg);
            assertTrue(dir.exists() && dir.isDirectory(),
                "Thieu package " + pkg + " tai src/" + pkg);
        }
    }
}
