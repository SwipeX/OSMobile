package defpackage;

public class gs {
    static final int aa = 6;
    public static final int ah = 12;
    static ho ak = null;
    static jn bc = null;
    static int[] bh = null;
    public static final int ca = 82;

    gs() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "gs.<init>(" + ')');
        }
    }

    public static char ao(char c, int i) {
        if (c >= 'À' && c <= 'ÿ') {
            if (c >= 'À' && c <= 'Æ') {
                return 'A';
            }
            if ('Ç' == c) {
                return 'C';
            }
            if (c >= 'È' && c <= 'Ë') {
                return 'E';
            }
            if (c >= 'Ì' && c <= 'Ï') {
                return 'I';
            }
            if (c >= 'Ò' && c <= 'Ö') {
                return 'O';
            }
            if (c >= 'Ù' && c <= 'Ü') {
                return 'U';
            }
            if ('Ý' == c) {
                return 'Y';
            }
            if (c == 'ß') {
                return 's';
            }
            if (c >= 'à' && c <= 'æ') {
                return 'a';
            }
            if (c == 'ç') {
                return 'c';
            }
            if (c >= 'è' && c <= 'ë') {
                return 'e';
            }
            if (c >= 'ì' && c <= 'ï') {
                return 'i';
            }
            if (c >= 'ò' && c <= 'ö') {
                return 'o';
            }
            if (c >= 'ù' && c <= 'ü') {
                return 'u';
            }
            if (c == 'ý' || c == 'ÿ') {
                return 'y';
            }
        }
        if (c == 'Œ') {
            return 'O';
        }
        if ('œ' == c) {
            return 'o';
        }
        if (c == 'Ÿ') {
            return 'Y';
        }
        return c;
    }

    public static char aq(char c, int i) {
        if (c >= 'À' && c <= 'ÿ') {
            if (c >= 'À' && c <= 'Æ') {
                return 'A';
            }
            if ('Ç' == c) {
                return 'C';
            }
            if (c >= 'È' && c <= 'Ë') {
                return 'E';
            }
            if (c >= 'Ì' && c <= 'Ï') {
                return 'I';
            }
            if (c >= 'Ò' && c <= 'Ö') {
                return 'O';
            }
            if (c >= 'Ù' && c <= 'Ü') {
                return 'U';
            }
            if ('Ý' == c) {
                return 'Y';
            }
            if (c == 'ß') {
                return 's';
            }
            if (c >= 'à' && c <= 'æ') {
                return 'a';
            }
            if (c == 'ç') {
                return 'c';
            }
            if (c >= 'è' && c <= 'ë') {
                return 'e';
            }
            if (c >= 'ì' && c <= 'ï') {
                return 'i';
            }
            if (c >= 'ò' && c <= 'ö') {
                return 'o';
            }
            if (c >= 'ù' && c <= 'ü') {
                return 'u';
            }
            if (c == 'ý' || c == 'ÿ') {
                return 'y';
            }
        }
        if (c == 'Œ') {
            return 'O';
        }
        if ('œ' == c) {
            return 'o';
        }
        if (c == 'Ÿ') {
            return 'Y';
        }
        return c;
    }

    public static char aa(char c) {
        if (c == 'Æ') {
            return 'E';
        }
        if (c == 'æ') {
            return 'e';
        }
        if ('ß' == c) {
            return 's';
        }
        if ('Œ' == c) {
            return 'E';
        }
        if (c == 'œ') {
            return 'e';
        }
        return '\u0000';
    }

    public static char ak(char c) {
        if (c == 'Æ') {
            return 'E';
        }
        if (c == 'æ') {
            return 'e';
        }
        if ('ß' == c) {
            return 's';
        }
        if ('Œ' == c) {
            return 'E';
        }
        if (c == 'œ') {
            return 'e';
        }
        return '\u0000';
    }

    public static char ap(char c) {
        if (c == 'Æ') {
            return 'E';
        }
        if (c == 'æ') {
            return 'e';
        }
        if ('ß' == c) {
            return 's';
        }
        if ('Œ' == c) {
            return 'E';
        }
        if (c == 'œ') {
            return 'e';
        }
        return '\u0000';
    }

    public static char at(char c) {
        if (c == 'Æ') {
            return 'E';
        }
        if (c == 'æ') {
            return 'e';
        }
        if ('ß' == c) {
            return 's';
        }
        if ('Œ' == c) {
            return 'E';
        }
        if (c == 'œ') {
            return 'e';
        }
        return '\u0000';
    }

    public static int ah(char c, int i) {
        int i2 = c << 4;
        if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
            return (Character.toLowerCase(c) << 4) + 1;
        }
        return i2;
    }

    public static int ai(char c, int i) {
        int i2 = c << 4;
        if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
            return (Character.toLowerCase(c) << 4) + 1;
        }
        return i2;
    }

    public static int aw(char c, int i) {
        int i2 = c << 4;
        if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
            return (Character.toLowerCase(c) << 4) + 1;
        }
        return i2;
    }
}
