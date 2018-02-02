package defpackage;

import java.io.IOException;
import java.net.Socket;

/* compiled from: ku */
final class kx implements kw {
    static final int ai = 1024;
    public static final int bh = 35;

    kx() {
    }

    public static lo ag(Socket socket, int i, int i2, int i3) throws IOException {
        try {
            return new ln(socket, i, i2);
        } catch (Throwable e) {
            throw ei.ac(e, "kx.ag(" + ')');
        }
    }

    public static String at(char c, int i, int i2) {
        try {
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = c;
            }
            return new String(cArr);
        } catch (Throwable e) {
            throw ei.ac(e, "kx.at(" + ')');
        }
    }

    static int ai(int i, int i2, int i3, short s) {
        try {
            if ((fb.ac[i][i2][i3] & 8) != 0) {
                return 0;
            }
            if (i <= 0 || (fb.ac[1][i2][i3] & 2) == 0) {
                return i;
            }
            return i - 1;
        } catch (Throwable e) {
            throw ei.ac(e, "kx.ai(" + ')');
        }
    }
}
