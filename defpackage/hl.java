package defpackage;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class hl {
    static final String[] ac = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    static final String[][] aj;
    static Calendar an = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    static final int be = 46;

    static {
        r0 = new String[2][];
        r0[0] = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        r0[1] = new String[]{"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"};
        aj = r0;
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
    }

    hl() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "hl.<init>(" + ')');
        }
    }

    public static String aa(long j) {
        an.setTime(new Date(j));
        int i = an.get(7);
        int i2 = an.get(5);
        int i3 = an.get(2);
        int i4 = an.get(1);
        int i5 = an.get(11);
        int i6 = an.get(12);
        int i7 = an.get(13);
        return ac[i - 1] + ", " + (i2 / 10) + (i2 % 10) + "-" + aj[0][i3] + "-" + i4 + " " + (i5 / 10) + (i5 % 10) + ":" + (i6 / 10) + (i6 % 10) + ":" + (i7 / 10) + (i7 % 10) + " GMT";
    }

    public static String ac(long j) {
        an.setTime(new Date(j));
        int i = an.get(7);
        int i2 = an.get(5);
        int i3 = an.get(2);
        int i4 = an.get(1);
        int i5 = an.get(11);
        int i6 = an.get(12);
        int i7 = an.get(13);
        return ac[i - 1] + ", " + (i2 / 10) + (i2 % 10) + "-" + aj[0][i3] + "-" + i4 + " " + (i5 / 10) + (i5 % 10) + ":" + (i6 / 10) + (i6 % 10) + ":" + (i7 / 10) + (i7 % 10) + " GMT";
    }

    public static String an(long j) {
        an.setTime(new Date(j));
        int i = an.get(7);
        int i2 = an.get(5);
        int i3 = an.get(2);
        int i4 = an.get(1);
        int i5 = an.get(11);
        int i6 = an.get(12);
        int i7 = an.get(13);
        return ac[i - 1] + ", " + (i2 / 10) + (i2 % 10) + "-" + aj[0][i3] + "-" + i4 + " " + (i5 / 10) + (i5 % 10) + ":" + (i6 / 10) + (i6 % 10) + ":" + (i7 / 10) + (i7 % 10) + " GMT";
    }

    public static String ao(long j) {
        an.setTime(new Date(j));
        int i = an.get(7);
        int i2 = an.get(5);
        int i3 = an.get(2);
        int i4 = an.get(1);
        int i5 = an.get(11);
        int i6 = an.get(12);
        int i7 = an.get(13);
        return ac[i - 1] + ", " + (i2 / 10) + (i2 % 10) + "-" + aj[0][i3] + "-" + i4 + " " + (i5 / 10) + (i5 % 10) + ":" + (i6 / 10) + (i6 % 10) + ":" + (i7 / 10) + (i7 % 10) + " GMT";
    }

    public static String aq(long j) {
        an.setTime(new Date(j));
        int i = an.get(7);
        int i2 = an.get(5);
        int i3 = an.get(2);
        int i4 = an.get(1);
        int i5 = an.get(11);
        int i6 = an.get(12);
        int i7 = an.get(13);
        return ac[i - 1] + ", " + (i2 / 10) + (i2 % 10) + "-" + aj[0][i3] + "-" + i4 + " " + (i5 / 10) + (i5 % 10) + ":" + (i6 / 10) + (i6 % 10) + ":" + (i7 / 10) + (i7 % 10) + " GMT";
    }
}
