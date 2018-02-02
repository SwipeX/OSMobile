package defpackage;

public class ki {
    public static final int ac = 0;
    public static String aj = null;
    public static final int an = 1;
    public static final int aq = 2;

    ki() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "ki.<init>(" + ')');
        }
    }

    public static boolean an(String str, int i) {
        return cx.ac(str, i, "openjs", (byte) 0);
    }

    public static boolean aq(String str, int i, String str2) {
        if (i == 0) {
            try {
                if (!aj.startsWith("win")) {
                    throw new Exception();
                } else if (str.startsWith("http://") || str.startsWith("https://")) {
                    String str3 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                    for (int i2 = 0; i2 < str.length(); i2++) {
                        if (str3.indexOf(str.charAt(i2)) == -1) {
                            throw new Exception();
                        }
                    }
                    return true;
                } else {
                    throw new Exception();
                }
            } catch (Throwable th) {
                return false;
            }
        } else if (i == 1 || i == 2 || i == 3) {
            return true;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
