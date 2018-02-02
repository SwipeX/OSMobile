package defpackage;

public class lh {
    public static final int aj = 1;
    static final char[] an = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
    static final char[] aq = new char[]{'[', ']', '#'};

    lh() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "lh.<init>(" + ')');
        }
    }

    public static final int ao(ma maVar) {
        if (maVar == null) {
            return 12;
        }
        switch (maVar.ah * 1759577167) {
            case 2:
                return 20;
            default:
                return 12;
        }
    }

    public static final int aq(ma maVar) {
        if (maVar == null) {
            return 12;
        }
        switch (maVar.ah * 1759577167) {
            case 2:
                return 20;
            default:
                return 12;
        }
    }

    public static final boolean aa(char c) {
        if (Character.isISOControl(c)) {
            return false;
        }
        boolean z;
        if ((c < '0' || c > '9') && ((c < 'ᤏ' || c > '窈') && (c < 'ᾧ' || c > '㲭'))) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        char[] cArr = an;
        for (char c2 : cArr) {
            if (c == c2) {
                return true;
            }
        }
        cArr = aq;
        for (char c22 : cArr) {
            if (c22 == c) {
                return true;
            }
        }
        return false;
    }

    public static final boolean ak(char c) {
        if (Character.isISOControl(c)) {
            return false;
        }
        boolean z = (c >= '0' && c <= '9') || ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'));
        if (z) {
            return true;
        }
        char[] cArr = an;
        for (char c2 : cArr) {
            if (c == c2) {
                return true;
            }
        }
        cArr = aq;
        for (char c22 : cArr) {
            if (c22 == c) {
                return true;
            }
        }
        return false;
    }

    public static final boolean ap(char c) {
        return c == ' ' || 'ಥ' == c || '⪧' == c || 'ㆶ' == c;
    }

    public static final boolean at(char c) {
        return c == ' ' || ' ' == c || '_' == c || '-' == c;
    }
}
