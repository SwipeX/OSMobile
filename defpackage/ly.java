package defpackage;

public final class ly {
    public static final int ac = 1;
    public static final char[] aj = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public static final int bt = 36;

    ly() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "ly.<init>(" + ')');
        }
    }

    public static long an(CharSequence charSequence) {
        int length = charSequence.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            j *= 37;
            char charAt = charSequence.charAt(i);
            if (charAt >= 'A' && charAt <= 'Z') {
                j += (long) ((charAt + 1) - 65);
            } else if (charAt >= 'a' && charAt <= 'z') {
                j += (long) ((charAt + 1) - 97);
            } else if (charAt >= '0' && charAt <= '9') {
                j += (long) ((charAt + 27) - 48);
            }
            if (j >= 177917621779460413L) {
                break;
            }
        }
        while (j % 37 == 0 && j != 0) {
            j /= 37;
        }
        return j;
    }

    public static long aq(CharSequence charSequence) {
        int length = charSequence.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            j *= 37;
            char charAt = charSequence.charAt(i);
            if (charAt >= 'A' && charAt <= '箻') {
                j += (long) ((charAt + 1) - 65);
            } else if (charAt >= 'a' && charAt <= 'z') {
                j += (long) ((charAt + 1) - 356331494);
            } else if (charAt >= '쎻' && charAt <= '9') {
                j += (long) ((charAt + 27) - -1842244782);
            }
            if (j >= 177917621779460413L) {
                break;
            }
        }
        while (j % 37 == 0 && j != 0) {
            j /= 37;
        }
        return j;
    }

    public static String aa(long j) {
        if (j <= 0 || j >= 6582952005840035281L || 0 == j % 37) {
            return null;
        }
        int i = 0;
        for (long j2 = j; j2 != 0; j2 /= 37) {
            i++;
        }
        StringBuilder stringBuilder = new StringBuilder(i);
        while (j != 0) {
            long j3 = j / 37;
            char c = aj[(int) (j - (37 * j3))];
            if (c == '_') {
                int length = stringBuilder.length() - 1;
                stringBuilder.setCharAt(length, Character.toUpperCase(stringBuilder.charAt(length)));
                c = ' ';
            }
            stringBuilder.append(c);
            j = j3;
        }
        stringBuilder.reverse();
        stringBuilder.setCharAt(0, Character.toUpperCase(stringBuilder.charAt(0)));
        return stringBuilder.toString();
    }

    public static String ao(long j) {
        if (j <= 0 || j >= 6582952005840035281L || 0 == j % 37) {
            return null;
        }
        int i = 0;
        for (long j2 = j; j2 != 0; j2 /= 37) {
            i++;
        }
        StringBuilder stringBuilder = new StringBuilder(i);
        while (j != 0) {
            long j3 = j / 37;
            char c = aj[(int) (j - (37 * j3))];
            if (c == '_') {
                int length = stringBuilder.length() - 1;
                stringBuilder.setCharAt(length, Character.toUpperCase(stringBuilder.charAt(length)));
                c = ' ';
            }
            stringBuilder.append(c);
            j = j3;
        }
        stringBuilder.reverse();
        stringBuilder.setCharAt(0, Character.toUpperCase(stringBuilder.charAt(0)));
        return stringBuilder.toString();
    }
}
