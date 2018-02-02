package defpackage;

import java.util.Hashtable;

public class ld {
    static final int av = 22;
    static jn cf;

    ld() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "ld.<init>(" + ')');
        }
    }

    static void ac(int i, Hashtable hashtable) {
        switch (i) {
            case 0:
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
            default:
                return;
        }
    }

    static void an(int i, Hashtable hashtable) {
        switch (i) {
            case 0:
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
            default:
                return;
        }
    }

    static void aq(int i, Hashtable hashtable) {
        switch (i) {
            case 0:
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
            default:
                return;
        }
    }

    public static int aj(byte[] bArr, int i, int i2, byte b) {
        int i3 = -1;
        while (i < i2) {
            try {
                i3 = he.an[(i3 ^ bArr[i]) & 255] ^ (i3 >>> 8);
                i++;
            } catch (Throwable e) {
                throw ei.ac(e, "ld.aj(" + ')');
            }
        }
        return i3 ^ -1;
    }
}
