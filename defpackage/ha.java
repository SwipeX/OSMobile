package defpackage;

import java.util.Hashtable;

public class ha {
    static long ac = 0;
    static long aj = 0;
    static final int ao = 16;
    static int jn;

    ha() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "ha.<init>(" + ')');
        }
    }

    static void aj(int i, Hashtable hashtable, byte b) {
        switch (i) {
            case 0:
                try {
                    hashtable.put("err_missing_config", "Missing com.jagex.config setting");
                    hashtable.put("err_invalid_config", "Invalid com.jagex.config setting");
                    hashtable.put("loading_config", "Loading configuration");
                    hashtable.put("err_load_config", "There was an error loading the game configuration from the website.\nIf you have a firewall, check that this program is allowed to access the Internet.");
                    hashtable.put("err_decode_config", "Error decoding configuration");
                    hashtable.put("loaderbox_initial", "Loading...");
                    hashtable.put("error", "Error");
                    hashtable.put("quit", "Quit");
                    hashtable.put("alreadyopen", "Please close your existing game before loading another one");
                    return;
                } catch (Throwable e) {
                    throw ei.ac(e, "ha.aj(" + ')');
                }
            default:
                return;
        }
    }

    public static synchronized long ac() {
        long currentTimeMillis;
        synchronized (ha.class) {
            currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis < aj * 5727565921817926221L) {
                ac += ((aj * 5727565921817926221L) - currentTimeMillis) * -4406263104573857541L;
            }
            aj = -3594448448216387963L * currentTimeMillis;
            currentTimeMillis += 6883186051786861107L * ac;
        }
        return currentTimeMillis;
    }

    public static synchronized long an() {
        long currentTimeMillis;
        synchronized (ha.class) {
            currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis < aj * 5727565921817926221L) {
                ac += ((aj * 5727565921817926221L) - currentTimeMillis) * -4406263104573857541L;
            }
            aj = -3594448448216387963L * currentTimeMillis;
            currentTimeMillis += 6883186051786861107L * ac;
        }
        return currentTimeMillis;
    }
}
