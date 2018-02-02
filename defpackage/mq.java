package defpackage;

public class mq {
    static char[] ac = new char[64];
    public static char[] aj = new char[64];
    static int[] an = new int[cj.ak];

    static {
        int i;
        int i2 = 0;
        int i3 = 52;
        int i4 = 26;
        for (i = 0; i < 26; i++) {
            aj[i] = (char) (i + 65);
        }
        for (i = 26; i < 52; i++) {
            aj[i] = (char) ((i + 97) - 26);
        }
        for (i = 52; i < 62; i++) {
            aj[i] = (char) ((i + 48) - 52);
        }
        aj[62] = '+';
        aj[63] = '/';
        for (i = 0; i < 26; i++) {
            ac[i] = (char) (i + 65);
        }
        while (i4 < 52) {
            ac[i4] = (char) ((i4 + 97) - 26);
            i4++;
        }
        while (i3 < 62) {
            ac[i3] = (char) ((i3 + 48) - 52);
            i3++;
        }
        ac[62] = '*';
        ac[63] = '-';
        while (i2 < an.length) {
            an[i2] = -1;
            i2++;
        }
        for (i2 = 65; i2 <= 90; i2++) {
            an[i2] = i2 - 65;
        }
        for (i2 = 97; i2 <= 122; i2++) {
            an[i2] = (i2 - 97) + 26;
        }
        for (i2 = 48; i2 <= 57; i2++) {
            an[i2] = (i2 - 48) + 52;
        }
        int[] iArr = an;
        an[43] = 62;
        iArr[42] = 62;
        iArr = an;
        an[47] = 63;
        iArr[45] = 63;
    }

    mq() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "mq.<init>(" + ')');
        }
    }
}
