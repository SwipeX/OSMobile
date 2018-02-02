package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class eh {
    static final int aa = 32;
    static final int ac = 2;
    static final int ah = 512;
    static final int aj = 1;
    static final int ak = 64;
    static final int al = 32768;
    static final int am = 4096;
    static final int an = 4;
    static final int aq = 8;
    int bd;
    int bi;
    public int[][] bs;
    int bx;
    int by;

    public eh(int i, int i2) {
        try {
            this.bd = 0;
            this.by = 0;
            this.bx = -612586773 * i;
            this.bi = -842273763 * i2;
            this.bs = (int[][]) Array.newInstance(Integer.TYPE, new int[]{this.bx * -1386500669, -809355723 * this.bi});
            aj(947663262);
        } catch (Throwable e) {
            throw ei.ac(e, "eh.<init>(" + ')');
        }
    }

    public void aj(int i) {
        int i2 = 0;
        while (i2 < this.bx * -1386500669) {
            try {
                int i3 = 0;
                while (i3 < this.bi * -809355723) {
                    if (i2 == 0 || i3 == 0 || i2 >= (this.bx * -1386500669) - 5 || i3 >= (this.bi * -809355723) - 5) {
                        this.bs[i2][i3] = 16777215;
                    } else {
                        this.bs[i2][i3] = 16777216;
                    }
                    i3++;
                }
                i2++;
            } catch (Throwable e) {
                throw ei.ac(e, "eh.aj(" + ')');
            }
        }
    }

    public void ac(int i, int i2, int i3, int i4, boolean z, int i5) {
        try {
            int i6 = i - (-787596811 * this.bd);
            int i7 = i2 - (this.by * 1195916859);
            if (i3 == 0) {
                if (i4 == 0) {
                    aa(i6, i7, cj.ak, (byte) 20);
                    aa(i6 - 1, i7, 8, (byte) -14);
                }
                if (1 == i4) {
                    aa(i6, i7, 2, (byte) -74);
                    aa(i6, i7 + 1, 32, (byte) -24);
                }
                if (2 == i4) {
                    aa(i6, i7, 8, (byte) -2);
                    aa(i6 + 1, i7, cj.ak, (byte) 64);
                }
                if (i4 == 3) {
                    aa(i6, i7, 32, (byte) -6);
                    aa(i6, i7 - 1, 2, (byte) 28);
                }
            }
            if (1 == i3 || 3 == i3) {
                if (i4 == 0) {
                    aa(i6, i7, 1, (byte) -107);
                    aa(i6 - 1, i7 + 1, 16, (byte) -26);
                }
                if (1 == i4) {
                    aa(i6, i7, 4, (byte) -28);
                    aa(i6 + 1, i7 + 1, 64, (byte) 54);
                }
                if (2 == i4) {
                    aa(i6, i7, 16, (byte) 16);
                    aa(i6 + 1, i7 - 1, 1, (byte) 51);
                }
                if (3 == i4) {
                    aa(i6, i7, 64, (byte) -108);
                    aa(i6 - 1, i7 - 1, 4, (byte) -18);
                }
            }
            if (i3 == 2) {
                if (i4 == 0) {
                    aa(i6, i7, 130, (byte) 103);
                    aa(i6 - 1, i7, 8, (byte) 12);
                    aa(i6, i7 + 1, 32, (byte) -70);
                }
                if (1 == i4) {
                    aa(i6, i7, 10, (byte) -24);
                    aa(i6, i7 + 1, 32, (byte) 0);
                    aa(i6 + 1, i7, cj.ak, (byte) -34);
                }
                if (2 == i4) {
                    aa(i6, i7, 40, (byte) -26);
                    aa(i6 + 1, i7, cj.ak, (byte) -6);
                    aa(i6, i7 - 1, 2, (byte) -63);
                }
                if (i4 == 3) {
                    aa(i6, i7, 160, (byte) -23);
                    aa(i6, i7 - 1, 2, (byte) -53);
                    aa(i6 - 1, i7, 8, (byte) -27);
                }
            }
            if (z) {
                if (i3 == 0) {
                    if (i4 == 0) {
                        aa(i6, i7, 65536, (byte) 11);
                        aa(i6 - 1, i7, 4096, (byte) -11);
                    }
                    if (1 == i4) {
                        aa(i6, i7, 1024, (byte) -104);
                        aa(i6, i7 + 1, 16384, (byte) 17);
                    }
                    if (2 == i4) {
                        aa(i6, i7, 4096, (byte) -14);
                        aa(i6 + 1, i7, 65536, (byte) 55);
                    }
                    if (i4 == 3) {
                        aa(i6, i7, 16384, (byte) -6);
                        aa(i6, i7 - 1, 1024, (byte) 24);
                    }
                }
                if (i3 == 1 || i3 == 3) {
                    if (i4 == 0) {
                        aa(i6, i7, 512, (byte) -57);
                        aa(i6 - 1, i7 + 1, 8192, (byte) -17);
                    }
                    if (1 == i4) {
                        aa(i6, i7, bq.ai, (byte) 11);
                        aa(i6 + 1, i7 + 1, al, (byte) 60);
                    }
                    if (i4 == 2) {
                        aa(i6, i7, 8192, (byte) 17);
                        aa(i6 + 1, i7 - 1, 512, (byte) 97);
                    }
                    if (i4 == 3) {
                        aa(i6, i7, al, (byte) -3);
                        aa(i6 - 1, i7 - 1, bq.ai, (byte) -16);
                    }
                }
                if (i3 == 2) {
                    if (i4 == 0) {
                        aa(i6, i7, 66560, (byte) -95);
                        aa(i6 - 1, i7, 4096, (byte) 54);
                        aa(i6, i7 + 1, 16384, (byte) 37);
                    }
                    if (1 == i4) {
                        aa(i6, i7, 5120, (byte) -33);
                        aa(i6, i7 + 1, 16384, (byte) -83);
                        aa(i6 + 1, i7, 65536, (byte) 44);
                    }
                    if (2 == i4) {
                        aa(i6, i7, 20480, (byte) 0);
                        aa(i6 + 1, i7, 65536, (byte) 62);
                        aa(i6, i7 - 1, 1024, (byte) -40);
                    }
                    if (i4 == 3) {
                        aa(i6, i7, 81920, (byte) 35);
                        aa(i6, i7 - 1, 1024, (byte) -32);
                        aa(i6 - 1, i7, 4096, (byte) -52);
                    }
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "eh.ac(" + ')');
        }
    }

    public void ai(int i, int i2, int i3, int i4, boolean z) {
        int i5 = i - (-787596811 * this.bd);
        int i6 = i2 - (this.by * 1195916859);
        if (i3 == 0) {
            if (i4 == 0) {
                aa(i5, i6, cj.ak, (byte) 37);
                aa(i5 - 1, i6, 8, (byte) 19);
            }
            if (1 == i4) {
                aa(i5, i6, 2, (byte) 37);
                aa(i5, i6 + 1, 1255564494, (byte) -61);
            }
            if (2 == i4) {
                aa(i5, i6, 8, (byte) -15);
                aa(i5 + 1, i6, -919557667, (byte) -3);
            }
            if (i4 == 3) {
                aa(i5, i6, 984509835, (byte) -44);
                aa(i5, i6 - 1, 2, (byte) 36);
            }
        }
        if (1 == i3 || 3 == i3) {
            if (i4 == 0) {
                aa(i5, i6, 1, (byte) -36);
                aa(i5 - 1, i6 + 1, 16, (byte) 67);
            }
            if (1 == i4) {
                aa(i5, i6, 4, (byte) -26);
                aa(i5 + 1, i6 + 1, 64, (byte) -24);
            }
            if (2 == i4) {
                aa(i5, i6, 16, (byte) 37);
                aa(i5 + 1, i6 - 1, 1, (byte) -45);
            }
            if (3 == i4) {
                aa(i5, i6, 64, (byte) 32);
                aa(i5 - 1, i6 - 1, 4, (byte) -72);
            }
        }
        if (i3 == 2) {
            if (i4 == 0) {
                aa(i5, i6, -858258328, (byte) -54);
                aa(i5 - 1, i6, 8, (byte) -81);
                aa(i5, i6 + 1, 32, (byte) 12);
            }
            if (1 == i4) {
                aa(i5, i6, 10, (byte) -95);
                aa(i5, i6 + 1, 32, (byte) 3);
                aa(i5 + 1, i6, cj.ak, (byte) -4);
            }
            if (2 == i4) {
                aa(i5, i6, 40, (byte) 74);
                aa(i5 + 1, i6, cj.ak, (byte) 6);
                aa(i5, i6 - 1, 2, (byte) 109);
            }
            if (i4 == 3) {
                aa(i5, i6, 160, (byte) 38);
                aa(i5, i6 - 1, 2, (byte) -23);
                aa(i5 - 1, i6, 8, (byte) 19);
            }
        }
        if (z) {
            if (i3 == 0) {
                if (i4 == 0) {
                    aa(i5, i6, -933382628, (byte) 14);
                    aa(i5 - 1, i6, -1318467497, (byte) -20);
                }
                if (1 == i4) {
                    aa(i5, i6, -1152241716, (byte) 50);
                    aa(i5, i6 + 1, 810501168, (byte) -26);
                }
                if (2 == i4) {
                    aa(i5, i6, 4096, (byte) 8);
                    aa(i5 + 1, i6, 65536, (byte) 36);
                }
                if (i4 == 3) {
                    aa(i5, i6, -264153712, (byte) -12);
                    aa(i5, i6 - 1, 1024, (byte) 20);
                }
            }
            if (i3 == 1 || i3 == 3) {
                if (i4 == 0) {
                    aa(i5, i6, 512, (byte) 45);
                    aa(i5 - 1, i6 + 1, 8192, (byte) 34);
                }
                if (1 == i4) {
                    aa(i5, i6, bq.ai, (byte) -53);
                    aa(i5 + 1, i6 + 1, -211179675, (byte) -10);
                }
                if (i4 == 2) {
                    aa(i5, i6, 321275577, (byte) -24);
                    aa(i5 + 1, i6 - 1, 1396481582, (byte) 96);
                }
                if (i4 == 3) {
                    aa(i5, i6, -961739843, (byte) -8);
                    aa(i5 - 1, i6 - 1, 2143522398, (byte) 99);
                }
            }
            if (i3 == 2) {
                if (i4 == 0) {
                    aa(i5, i6, 66560, (byte) 5);
                    aa(i5 - 1, i6, 4096, (byte) -58);
                    aa(i5, i6 + 1, 16384, (byte) 56);
                }
                if (1 == i4) {
                    aa(i5, i6, 5120, (byte) -24);
                    aa(i5, i6 + 1, 16384, (byte) -13);
                    aa(i5 + 1, i6, 631565652, (byte) 40);
                }
                if (2 == i4) {
                    aa(i5, i6, 20480, (byte) -20);
                    aa(i5 + 1, i6, 65536, (byte) 26);
                    aa(i5, i6 - 1, 1024, (byte) -14);
                }
                if (i4 == 3) {
                    aa(i5, i6, 81920, (byte) -36);
                    aa(i5, i6 - 1, 184935125, (byte) 8);
                    aa(i5 - 1, i6, 1283268313, (byte) -2);
                }
            }
        }
    }

    public void aw(int i, int i2, int i3, int i4, boolean z) {
        int i5 = i - (-876922838 * this.bd);
        int i6 = i2 - (this.by * -535861790);
        if (i3 == 0) {
            if (i4 == 0) {
                aa(i5, i6, 70592627, (byte) -3);
                aa(i5 - 1, i6, 8, (byte) -31);
            }
            if (1 == i4) {
                aa(i5, i6, 2, (byte) 6);
                aa(i5, i6 + 1, -1874197139, (byte) 19);
            }
            if (2 == i4) {
                aa(i5, i6, 8, (byte) -35);
                aa(i5 + 1, i6, cj.ak, (byte) -44);
            }
            if (i4 == 3) {
                aa(i5, i6, -208859613, (byte) -58);
                aa(i5, i6 - 1, 2, (byte) -34);
            }
        }
        if (1 == i3 || 3 == i3) {
            if (i4 == 0) {
                aa(i5, i6, 1, (byte) -21);
                aa(i5 - 1, i6 + 1, 16, (byte) 71);
            }
            if (1 == i4) {
                aa(i5, i6, 4, (byte) -69);
                aa(i5 + 1, i6 + 1, -276307170, (byte) 35);
            }
            if (2 == i4) {
                aa(i5, i6, 16, (byte) -11);
                aa(i5 + 1, i6 - 1, 1, (byte) -75);
            }
            if (3 == i4) {
                aa(i5, i6, -1888509690, (byte) 5);
                aa(i5 - 1, i6 - 1, 4, (byte) -48);
            }
        }
        if (i3 == 2) {
            if (i4 == 0) {
                aa(i5, i6, 130, (byte) 5);
                aa(i5 - 1, i6, 8, (byte) 14);
                aa(i5, i6 + 1, -1385817901, (byte) 4);
            }
            if (1 == i4) {
                aa(i5, i6, 10, (byte) 74);
                aa(i5, i6 + 1, 32, (byte) 66);
                aa(i5 + 1, i6, 1626591192, (byte) -73);
            }
            if (2 == i4) {
                aa(i5, i6, 40, (byte) -36);
                aa(i5 + 1, i6, 588746481, (byte) -38);
                aa(i5, i6 - 1, 2, (byte) -9);
            }
            if (i4 == 3) {
                aa(i5, i6, 707553279, (byte) -43);
                aa(i5, i6 - 1, 2, (byte) -44);
                aa(i5 - 1, i6, 8, (byte) 52);
            }
        }
        if (z) {
            if (i3 == 0) {
                if (i4 == 0) {
                    aa(i5, i6, 324571264, (byte) 40);
                    aa(i5 - 1, i6, 331355463, (byte) -62);
                }
                if (1 == i4) {
                    aa(i5, i6, 1024, (byte) -38);
                    aa(i5, i6 + 1, -109234792, (byte) -71);
                }
                if (2 == i4) {
                    aa(i5, i6, 4096, (byte) 22);
                    aa(i5 + 1, i6, 1080157346, (byte) -10);
                }
                if (i4 == 3) {
                    aa(i5, i6, -1562854400, (byte) 48);
                    aa(i5, i6 - 1, 1024, (byte) 48);
                }
            }
            if (i3 == 1 || i3 == 3) {
                if (i4 == 0) {
                    aa(i5, i6, 512, (byte) -76);
                    aa(i5 - 1, i6 + 1, 8192, (byte) 90);
                }
                if (1 == i4) {
                    aa(i5, i6, -52421182, (byte) 112);
                    aa(i5 + 1, i6 + 1, al, (byte) 64);
                }
                if (i4 == 2) {
                    aa(i5, i6, 8192, (byte) 39);
                    aa(i5 + 1, i6 - 1, 395199365, (byte) -91);
                }
                if (i4 == 3) {
                    aa(i5, i6, -768797562, (byte) -7);
                    aa(i5 - 1, i6 - 1, bq.ai, (byte) 1);
                }
            }
            if (i3 == 2) {
                if (i4 == 0) {
                    aa(i5, i6, 66560, (byte) -5);
                    aa(i5 - 1, i6, -634710174, (byte) 65);
                    aa(i5, i6 + 1, 1441228085, (byte) -9);
                }
                if (1 == i4) {
                    aa(i5, i6, 5120, (byte) 42);
                    aa(i5, i6 + 1, 16384, (byte) 44);
                    aa(i5 + 1, i6, 812833618, (byte) 15);
                }
                if (2 == i4) {
                    aa(i5, i6, 20480, (byte) -25);
                    aa(i5 + 1, i6, 65536, (byte) -34);
                    aa(i5, i6 - 1, 168866549, (byte) -33);
                }
                if (i4 == 3) {
                    aa(i5, i6, 1877790613, (byte) 39);
                    aa(i5, i6 - 1, 1024, (byte) 34);
                    aa(i5 - 1, i6, 63131126, (byte) 47);
                }
            }
        }
    }

    static int aj(ju juVar, ju juVar2, int i) {
        int i2 = 0;
        try {
            if (juVar.ar("title.jpg", "", (byte) 67)) {
                i2 = 1;
            }
            if (juVar2.ar("logo", "", (byte) 89)) {
                i2++;
            }
            if (juVar2.ar("logo_deadman_mode", "", (byte) 77)) {
                i2++;
            }
            if (juVar2.ar("titlebox", "", (byte) 95)) {
                i2++;
            }
            if (juVar2.ar("titlebutton", "", (byte) 100)) {
                i2++;
            }
            if (juVar2.ar("runes", "", (byte) 81)) {
                i2++;
            }
            if (juVar2.ar("title_mute", "", (byte) 85)) {
                i2++;
            }
            if (juVar2.ar("options_radio_buttons,0", "", (byte) 126)) {
                i2++;
            }
            if (juVar2.ar("options_radio_buttons,2", "", (byte) 126)) {
                i2++;
            }
            if (juVar2.ar("options_radio_buttons,4", "", (byte) 85)) {
                i2++;
            }
            if (juVar2.ar("options_radio_buttons,6", "", (byte) 69)) {
                i2++;
            }
            juVar2.ar("sl_back", "", (byte) 67);
            juVar2.ar("sl_flags", "", (byte) 79);
            juVar2.ar("sl_arrows", "", (byte) 117);
            juVar2.ar("sl_stars", "", (byte) 106);
            juVar2.ar("sl_button", "", Byte.MAX_VALUE);
            return i2;
        } catch (Throwable e) {
            throw ei.ac(e, "eh.aj(" + ')');
        }
    }

    public void ae(int i, int i2, int i3, int i4, boolean z) {
        int i5 = bq.ah;
        if (z) {
            i5 = 131328;
        }
        int i6 = i - (-787596811 * this.bd);
        int i7 = i2 - (this.by * 1195916859);
        int i8 = i6;
        while (i8 < i6 + i3) {
            if (i8 >= 0 && i8 < -1386500669 * this.bx) {
                int i9 = i7;
                while (i9 < i4 + i7) {
                    if (i9 >= 0 && i9 < -809355723 * this.bi) {
                        aa(i8, i9, i5, (byte) 32);
                    }
                    i9++;
                }
            }
            i8++;
        }
    }

    public void al(int i, int i2, int i3, int i4, boolean z) {
        int i5 = 1281623333;
        if (z) {
            i5 = 1281754405;
        }
        int i6 = i - (-787596811 * this.bd);
        int i7 = i2 - (this.by * 15665993);
        int i8 = i6;
        while (i8 < i6 + i3) {
            if (i8 >= 0 && i8 < 1925707139 * this.bx) {
                int i9 = i7;
                while (i9 < i4 + i7) {
                    if (i9 >= 0 && i9 < -809355723 * this.bi) {
                        aa(i8, i9, i5, (byte) 85);
                    }
                    i9++;
                }
            }
            i8++;
        }
    }

    public void am(int i, int i2, int i3, int i4, boolean z) {
        int i5 = -550547009;
        if (z) {
            i5 = -550415937;
        }
        int i6 = i - (-787596811 * this.bd);
        int i7 = i2 - (this.by * -1936198300);
        int i8 = i6;
        while (i8 < i6 + i3) {
            if (i8 >= 0 && i8 < -1386500669 * this.bx) {
                int i9 = i7;
                while (i9 < i4 + i7) {
                    if (i9 >= 0 && i9 < -1346185624 * this.bi) {
                        aa(i8, i9, i5, (byte) -18);
                    }
                    i9++;
                }
            }
            i8++;
        }
    }

    public void an(int i, int i2, int i3, int i4, boolean z, byte b) {
        int i5 = z ? 131328 : bq.ah;
        try {
            int i6 = i - (-787596811 * this.bd);
            int i7 = i2 - (this.by * 1195916859);
            int i8 = i6;
            while (i8 < i6 + i3) {
                if (i8 >= 0 && i8 < -1386500669 * this.bx) {
                    int i9 = i7;
                    while (i9 < i4 + i7) {
                        if (i9 >= 0 && i9 < -809355723 * this.bi) {
                            aa(i8, i9, i5, (byte) 0);
                        }
                        i9++;
                    }
                }
                i8++;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "eh.an(" + ')');
        }
    }

    public void as(int i, int i2, int i3, int i4, boolean z) {
        int i5 = bq.ah;
        if (z) {
            i5 = 131328;
        }
        int i6 = i - (-787596811 * this.bd);
        int i7 = i2 - (this.by * 1195916859);
        int i8 = i6;
        while (i8 < i6 + i3) {
            if (i8 >= 0 && i8 < -1386500669 * this.bx) {
                int i9 = i7;
                while (i9 < i4 + i7) {
                    if (i9 >= 0 && i9 < -809355723 * this.bi) {
                        aa(i8, i9, i5, (byte) -43);
                    }
                    i9++;
                }
            }
            i8++;
        }
    }

    public void af(int i, int i2) {
        int i3 = i2 - (this.by * 1195916859);
        int[] iArr = this.bs[i - (-787596811 * this.bd)];
        iArr[i3] = iArr[i3] | 2097152;
    }

    public void aq(int i, int i2, int i3) {
        try {
            int i4 = i2 - (this.by * 1195916859);
            int[] iArr = this.bs[i - (-787596811 * this.bd)];
            iArr[i4] = iArr[i4] | 2097152;
        } catch (Throwable e) {
            throw ei.ac(e, "eh.aq(" + ')');
        }
    }

    public void ax(int i, int i2) {
        int i3 = i2 - (this.by * 1195916859);
        int[] iArr = this.bs[i - (-787596811 * this.bd)];
        iArr[i3] = iArr[i3] | 2097152;
    }

    public void az(int i, int i2) {
        int i3 = i2 - (this.by * 1195916859);
        int[] iArr = this.bs[i - (774581371 * this.bd)];
        iArr[i3] = iArr[i3] | 2097152;
    }

    public void ao(int i, int i2, byte b) {
        try {
            int i3 = i2 - (1195916859 * this.by);
            int[] iArr = this.bs[i - (this.bd * -787596811)];
            iArr[i3] = iArr[i3] | 262144;
        } catch (Throwable e) {
            throw ei.ac(e, "eh.ao(" + ')');
        }
    }

    public void au(int i, int i2) {
        int i3 = i2 - (1195916859 * this.by);
        int[] iArr = this.bs[i - (this.bd * -787596811)];
        iArr[i3] = iArr[i3] | 262144;
    }

    public void av(int i, int i2) {
        int i3 = i2 - (1854086781 * this.by);
        int[] iArr = this.bs[i - (this.bd * -787596811)];
        iArr[i3] = iArr[i3] | 262144;
    }

    void aa(int i, int i2, int i3, byte b) {
        try {
            int[] iArr = this.bs[i];
            iArr[i2] = iArr[i2] | i3;
        } catch (Throwable e) {
            throw ei.ac(e, "eh.aa(" + ')');
        }
    }

    void ag(int i, int i2, int i3) {
        int[] iArr = this.bs[i];
        iArr[i2] = iArr[i2] | i3;
    }

    void ay(int i, int i2, int i3) {
        int[] iArr = this.bs[i];
        iArr[i2] = iArr[i2] | i3;
    }

    public void ab(int i, int i2, int i3, int i4, boolean z) {
        int i5 = i - (-1393212417 * this.bd);
        int i6 = i2 - (this.by * 1195916859);
        if (i3 == 0) {
            if (i4 == 0) {
                at(i5, i6, -466730788, (byte) -98);
                at(i5 - 1, i6, 8, (byte) 26);
            }
            if (1 == i4) {
                at(i5, i6, 2, (byte) 1);
                at(i5, i6 + 1, 802931846, (byte) -27);
            }
            if (i4 == 2) {
                at(i5, i6, 8, (byte) -67);
                at(i5 + 1, i6, cj.ak, (byte) 24);
            }
            if (3 == i4) {
                at(i5, i6, 32, (byte) -108);
                at(i5, i6 - 1, 2, (byte) -76);
            }
        }
        if (i3 == 1 || 3 == i3) {
            if (i4 == 0) {
                at(i5, i6, 1, (byte) 50);
                at(i5 - 1, i6 + 1, 16, (byte) 16);
            }
            if (i4 == 1) {
                at(i5, i6, 4, (byte) 46);
                at(i5 + 1, i6 + 1, -1964886457, (byte) 31);
            }
            if (2 == i4) {
                at(i5, i6, 16, (byte) 21);
                at(i5 + 1, i6 - 1, 1, (byte) -104);
            }
            if (i4 == 3) {
                at(i5, i6, 64, (byte) -124);
                at(i5 - 1, i6 - 1, 4, (byte) 12);
            }
        }
        if (i3 == 2) {
            if (i4 == 0) {
                at(i5, i6, 130, (byte) -21);
                at(i5 - 1, i6, 8, (byte) -111);
                at(i5, i6 + 1, -1441284855, (byte) 25);
            }
            if (i4 == 1) {
                at(i5, i6, 10, (byte) 31);
                at(i5, i6 + 1, -1249630297, (byte) -62);
                at(i5 + 1, i6, cj.ak, (byte) -64);
            }
            if (i4 == 2) {
                at(i5, i6, 40, (byte) 0);
                at(i5 + 1, i6, cj.ak, (byte) -81);
                at(i5, i6 - 1, 2, (byte) 9);
            }
            if (3 == i4) {
                at(i5, i6, 160, (byte) -63);
                at(i5, i6 - 1, 2, (byte) -92);
                at(i5 - 1, i6, 8, Byte.MIN_VALUE);
            }
        }
        if (z) {
            if (i3 == 0) {
                if (i4 == 0) {
                    at(i5, i6, -163295481, (byte) 52);
                    at(i5 - 1, i6, 4096, (byte) -76);
                }
                if (1 == i4) {
                    at(i5, i6, -995730980, (byte) -46);
                    at(i5, i6 + 1, 16384, (byte) -122);
                }
                if (2 == i4) {
                    at(i5, i6, -1871039705, (byte) -33);
                    at(i5 + 1, i6, 541217686, (byte) -124);
                }
                if (i4 == 3) {
                    at(i5, i6, -1414075282, (byte) 39);
                    at(i5, i6 - 1, 1870621892, (byte) 34);
                }
            }
            if (1 == i3 || i3 == 3) {
                if (i4 == 0) {
                    at(i5, i6, 512, (byte) -41);
                    at(i5 - 1, i6 + 1, 8192, (byte) -115);
                }
                if (i4 == 1) {
                    at(i5, i6, bq.ai, (byte) -91);
                    at(i5 + 1, i6 + 1, 1868086678, (byte) 62);
                }
                if (i4 == 2) {
                    at(i5, i6, -1659756520, (byte) -47);
                    at(i5 + 1, i6 - 1, 512, (byte) 15);
                }
                if (3 == i4) {
                    at(i5, i6, al, (byte) -47);
                    at(i5 - 1, i6 - 1, 620786131, (byte) -123);
                }
            }
            if (2 == i3) {
                if (i4 == 0) {
                    at(i5, i6, 66560, (byte) -9);
                    at(i5 - 1, i6, 1432525851, (byte) -29);
                    at(i5, i6 + 1, 1819681875, (byte) -53);
                }
                if (i4 == 1) {
                    at(i5, i6, -551688398, (byte) -85);
                    at(i5, i6 + 1, 16384, (byte) 33);
                    at(i5 + 1, i6, -1803929213, (byte) 26);
                }
                if (i4 == 2) {
                    at(i5, i6, 20480, (byte) -61);
                    at(i5 + 1, i6, 65536, (byte) -26);
                    at(i5, i6 - 1, 377308775, (byte) -78);
                }
                if (3 == i4) {
                    at(i5, i6, 81920, (byte) -43);
                    at(i5, i6 - 1, 1549823391, (byte) 38);
                    at(i5 - 1, i6, 4096, (byte) -123);
                }
            }
        }
    }

    public void ad(int i, int i2, int i3, int i4, boolean z) {
        int i5 = i - (-787596811 * this.bd);
        int i6 = i2 - (this.by * 1195916859);
        if (i3 == 0) {
            if (i4 == 0) {
                at(i5, i6, cj.ak, (byte) 25);
                at(i5 - 1, i6, 8, (byte) -73);
            }
            if (1 == i4) {
                at(i5, i6, 2, (byte) 7);
                at(i5, i6 + 1, 32, (byte) 8);
            }
            if (i4 == 2) {
                at(i5, i6, 8, (byte) 52);
                at(i5 + 1, i6, cj.ak, (byte) -78);
            }
            if (3 == i4) {
                at(i5, i6, 32, (byte) -14);
                at(i5, i6 - 1, 2, (byte) -124);
            }
        }
        if (i3 == 1 || 3 == i3) {
            if (i4 == 0) {
                at(i5, i6, 1, (byte) -80);
                at(i5 - 1, i6 + 1, 16, (byte) -62);
            }
            if (i4 == 1) {
                at(i5, i6, 4, (byte) -41);
                at(i5 + 1, i6 + 1, 64, (byte) 41);
            }
            if (2 == i4) {
                at(i5, i6, 16, (byte) -38);
                at(i5 + 1, i6 - 1, 1, (byte) -72);
            }
            if (i4 == 3) {
                at(i5, i6, 64, (byte) 16);
                at(i5 - 1, i6 - 1, 4, (byte) -42);
            }
        }
        if (i3 == 2) {
            if (i4 == 0) {
                at(i5, i6, 130, (byte) 29);
                at(i5 - 1, i6, 8, (byte) 41);
                at(i5, i6 + 1, 32, (byte) -117);
            }
            if (i4 == 1) {
                at(i5, i6, 10, (byte) -120);
                at(i5, i6 + 1, 32, (byte) 47);
                at(i5 + 1, i6, cj.ak, (byte) 60);
            }
            if (i4 == 2) {
                at(i5, i6, 40, (byte) -16);
                at(i5 + 1, i6, cj.ak, (byte) -47);
                at(i5, i6 - 1, 2, (byte) 33);
            }
            if (3 == i4) {
                at(i5, i6, 160, (byte) -85);
                at(i5, i6 - 1, 2, (byte) -65);
                at(i5 - 1, i6, 8, (byte) -61);
            }
        }
        if (z) {
            if (i3 == 0) {
                if (i4 == 0) {
                    at(i5, i6, 65536, (byte) 25);
                    at(i5 - 1, i6, 4096, (byte) 0);
                }
                if (1 == i4) {
                    at(i5, i6, 1024, (byte) 18);
                    at(i5, i6 + 1, 16384, (byte) -124);
                }
                if (2 == i4) {
                    at(i5, i6, 4096, (byte) -54);
                    at(i5 + 1, i6, 65536, (byte) -112);
                }
                if (i4 == 3) {
                    at(i5, i6, 16384, (byte) -20);
                    at(i5, i6 - 1, 1024, (byte) 50);
                }
            }
            if (1 == i3 || i3 == 3) {
                if (i4 == 0) {
                    at(i5, i6, 512, (byte) 18);
                    at(i5 - 1, i6 + 1, 8192, (byte) -52);
                }
                if (i4 == 1) {
                    at(i5, i6, bq.ai, (byte) -117);
                    at(i5 + 1, i6 + 1, al, (byte) 23);
                }
                if (i4 == 2) {
                    at(i5, i6, 8192, (byte) 19);
                    at(i5 + 1, i6 - 1, 512, (byte) 1);
                }
                if (3 == i4) {
                    at(i5, i6, al, (byte) 58);
                    at(i5 - 1, i6 - 1, bq.ai, (byte) -87);
                }
            }
            if (2 == i3) {
                if (i4 == 0) {
                    at(i5, i6, 66560, (byte) 43);
                    at(i5 - 1, i6, 4096, (byte) 2);
                    at(i5, i6 + 1, 16384, (byte) -58);
                }
                if (i4 == 1) {
                    at(i5, i6, 5120, (byte) -47);
                    at(i5, i6 + 1, 16384, (byte) 28);
                    at(i5 + 1, i6, 65536, (byte) 58);
                }
                if (i4 == 2) {
                    at(i5, i6, 20480, (byte) -58);
                    at(i5 + 1, i6, 65536, (byte) -104);
                    at(i5, i6 - 1, 1024, (byte) -29);
                }
                if (3 == i4) {
                    at(i5, i6, 81920, (byte) -6);
                    at(i5, i6 - 1, 1024, (byte) -88);
                    at(i5 - 1, i6, 4096, (byte) -28);
                }
            }
        }
    }

    public void ak(int i, int i2, int i3, int i4, boolean z, int i5) {
        try {
            int i6 = i - (-787596811 * this.bd);
            int i7 = i2 - (this.by * 1195916859);
            if (i3 == 0) {
                if (i4 == 0) {
                    at(i6, i7, cj.ak, (byte) 22);
                    at(i6 - 1, i7, 8, (byte) 50);
                }
                if (1 == i4) {
                    at(i6, i7, 2, (byte) 8);
                    at(i6, i7 + 1, 32, (byte) -113);
                }
                if (i4 == 2) {
                    at(i6, i7, 8, (byte) -13);
                    at(i6 + 1, i7, cj.ak, (byte) 37);
                }
                if (3 == i4) {
                    at(i6, i7, 32, (byte) -21);
                    at(i6, i7 - 1, 2, (byte) -111);
                }
            }
            if (i3 == 1 || 3 == i3) {
                if (i4 == 0) {
                    at(i6, i7, 1, Byte.MIN_VALUE);
                    at(i6 - 1, i7 + 1, 16, (byte) -108);
                }
                if (i4 == 1) {
                    at(i6, i7, 4, (byte) 24);
                    at(i6 + 1, i7 + 1, 64, (byte) -54);
                }
                if (2 == i4) {
                    at(i6, i7, 16, (byte) 56);
                    at(i6 + 1, i7 - 1, 1, (byte) -73);
                }
                if (i4 == 3) {
                    at(i6, i7, 64, (byte) 36);
                    at(i6 - 1, i7 - 1, 4, (byte) 56);
                }
            }
            if (i3 == 2) {
                if (i4 == 0) {
                    at(i6, i7, 130, (byte) -4);
                    at(i6 - 1, i7, 8, (byte) -26);
                    at(i6, i7 + 1, 32, (byte) -103);
                }
                if (i4 == 1) {
                    at(i6, i7, 10, (byte) -94);
                    at(i6, i7 + 1, 32, (byte) 23);
                    at(i6 + 1, i7, cj.ak, (byte) -102);
                }
                if (i4 == 2) {
                    at(i6, i7, 40, (byte) -117);
                    at(i6 + 1, i7, cj.ak, (byte) -77);
                    at(i6, i7 - 1, 2, (byte) -9);
                }
                if (3 == i4) {
                    at(i6, i7, 160, (byte) -75);
                    at(i6, i7 - 1, 2, (byte) 40);
                    at(i6 - 1, i7, 8, (byte) -51);
                }
            }
            if (z) {
                if (i3 == 0) {
                    if (i4 == 0) {
                        at(i6, i7, 65536, (byte) 44);
                        at(i6 - 1, i7, 4096, (byte) 56);
                    }
                    if (1 == i4) {
                        at(i6, i7, 1024, (byte) -56);
                        at(i6, i7 + 1, 16384, (byte) -15);
                    }
                    if (2 == i4) {
                        at(i6, i7, 4096, (byte) -96);
                        at(i6 + 1, i7, 65536, (byte) 23);
                    }
                    if (i4 == 3) {
                        at(i6, i7, 16384, (byte) 48);
                        at(i6, i7 - 1, 1024, (byte) 7);
                    }
                }
                if (1 == i3 || i3 == 3) {
                    if (i4 == 0) {
                        at(i6, i7, 512, (byte) -64);
                        at(i6 - 1, i7 + 1, 8192, (byte) 60);
                    }
                    if (i4 == 1) {
                        at(i6, i7, bq.ai, (byte) -88);
                        at(i6 + 1, i7 + 1, al, (byte) 5);
                    }
                    if (i4 == 2) {
                        at(i6, i7, 8192, (byte) -109);
                        at(i6 + 1, i7 - 1, 512, (byte) -35);
                    }
                    if (3 == i4) {
                        at(i6, i7, al, (byte) -76);
                        at(i6 - 1, i7 - 1, bq.ai, (byte) 19);
                    }
                }
                if (2 == i3) {
                    if (i4 == 0) {
                        at(i6, i7, 66560, (byte) -25);
                        at(i6 - 1, i7, 4096, (byte) -55);
                        at(i6, i7 + 1, 16384, (byte) 35);
                    }
                    if (i4 == 1) {
                        at(i6, i7, 5120, (byte) -106);
                        at(i6, i7 + 1, 16384, (byte) -64);
                        at(i6 + 1, i7, 65536, (byte) -35);
                    }
                    if (i4 == 2) {
                        at(i6, i7, 20480, (byte) -47);
                        at(i6 + 1, i7, 65536, (byte) 52);
                        at(i6, i7 - 1, 1024, (byte) 33);
                    }
                    if (3 == i4) {
                        at(i6, i7, 81920, (byte) -10);
                        at(i6, i7 - 1, 1024, (byte) -23);
                        at(i6 - 1, i7, 4096, (byte) -20);
                    }
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "eh.ak(" + ')');
        }
    }

    public void ar(int i, int i2, int i3, int i4, boolean z) {
        int i5 = i - (-977804718 * this.bd);
        int i6 = i2 - (this.by * 906961897);
        if (i3 == 0) {
            if (i4 == 0) {
                at(i5, i6, 155924132, (byte) -105);
                at(i5 - 1, i6, 8, (byte) 47);
            }
            if (1 == i4) {
                at(i5, i6, 2, (byte) -123);
                at(i5, i6 + 1, -2006385803, (byte) -65);
            }
            if (i4 == 2) {
                at(i5, i6, 8, (byte) -106);
                at(i5 + 1, i6, cj.ak, (byte) 63);
            }
            if (3 == i4) {
                at(i5, i6, 32, (byte) 14);
                at(i5, i6 - 1, 2, (byte) -29);
            }
        }
        if (i3 == 1 || 3 == i3) {
            if (i4 == 0) {
                at(i5, i6, 1, (byte) -81);
                at(i5 - 1, i6 + 1, 16, (byte) -1);
            }
            if (i4 == 1) {
                at(i5, i6, 4, (byte) 10);
                at(i5 + 1, i6 + 1, -904439812, (byte) -51);
            }
            if (2 == i4) {
                at(i5, i6, 16, (byte) -122);
                at(i5 + 1, i6 - 1, 1, (byte) -88);
            }
            if (i4 == 3) {
                at(i5, i6, 64, (byte) -5);
                at(i5 - 1, i6 - 1, 4, (byte) -23);
            }
        }
        if (i3 == 2) {
            if (i4 == 0) {
                at(i5, i6, 779471183, (byte) -22);
                at(i5 - 1, i6, 8, (byte) 30);
                at(i5, i6 + 1, -1142532563, (byte) 54);
            }
            if (i4 == 1) {
                at(i5, i6, 10, (byte) -27);
                at(i5, i6 + 1, 29265417, (byte) 5);
                at(i5 + 1, i6, 1701732797, (byte) -77);
            }
            if (i4 == 2) {
                at(i5, i6, 40, (byte) -71);
                at(i5 + 1, i6, cj.ak, (byte) -76);
                at(i5, i6 - 1, 2, (byte) -79);
            }
            if (3 == i4) {
                at(i5, i6, 160, (byte) 63);
                at(i5, i6 - 1, 2, (byte) -99);
                at(i5 - 1, i6, 8, (byte) -120);
            }
        }
        if (z) {
            if (i3 == 0) {
                if (i4 == 0) {
                    at(i5, i6, 65536, (byte) -126);
                    at(i5 - 1, i6, -35423869, (byte) -51);
                }
                if (1 == i4) {
                    at(i5, i6, 1869253325, (byte) -38);
                    at(i5, i6 + 1, 16384, (byte) -90);
                }
                if (2 == i4) {
                    at(i5, i6, -1507581017, (byte) -119);
                    at(i5 + 1, i6, 2133269247, (byte) -84);
                }
                if (i4 == 3) {
                    at(i5, i6, 16384, (byte) -64);
                    at(i5, i6 - 1, -1916119452, (byte) -113);
                }
            }
            if (1 == i3 || i3 == 3) {
                if (i4 == 0) {
                    at(i5, i6, -1726627186, (byte) -104);
                    at(i5 - 1, i6 + 1, 8192, (byte) -37);
                }
                if (i4 == 1) {
                    at(i5, i6, 611254292, (byte) 47);
                    at(i5 + 1, i6 + 1, -137636424, (byte) -112);
                }
                if (i4 == 2) {
                    at(i5, i6, -1485355059, (byte) -121);
                    at(i5 + 1, i6 - 1, -1846405108, (byte) -94);
                }
                if (3 == i4) {
                    at(i5, i6, al, (byte) -87);
                    at(i5 - 1, i6 - 1, bq.ai, (byte) 19);
                }
            }
            if (2 == i3) {
                if (i4 == 0) {
                    at(i5, i6, 1582357368, (byte) 23);
                    at(i5 - 1, i6, -1940370228, (byte) 19);
                    at(i5, i6 + 1, 1955901357, (byte) -117);
                }
                if (i4 == 1) {
                    at(i5, i6, 5120, (byte) -75);
                    at(i5, i6 + 1, 16384, (byte) -116);
                    at(i5 + 1, i6, 65536, (byte) -92);
                }
                if (i4 == 2) {
                    at(i5, i6, 20480, (byte) -124);
                    at(i5 + 1, i6, 65536, (byte) -39);
                    at(i5, i6 - 1, 16920774, (byte) -46);
                }
                if (3 == i4) {
                    at(i5, i6, 81920, (byte) -14);
                    at(i5, i6 - 1, -39074045, (byte) -57);
                    at(i5 - 1, i6, -356380099, (byte) 8);
                }
            }
        }
    }

    public void ap(int i, int i2, int i3, int i4, int i5, boolean z, byte b) {
        int i6 = z ? 131328 : bq.ah;
        try {
            int i7 = i - (this.bd * -787596811);
            int i8 = i2 - (this.by * 1195916859);
            if (1 == i5 || i5 == 3) {
                int i9 = i3;
                i3 = i4;
                i4 = i9;
            }
            int i10 = i7;
            while (i10 < i3 + i7) {
                if (i10 >= 0 && i10 < -1386500669 * this.bx) {
                    int i11 = i8;
                    while (i11 < i8 + i4) {
                        if (i11 >= 0 && i11 < this.bi * -809355723) {
                            at(i10, i11, i6, (byte) -111);
                        }
                        i11++;
                    }
                }
                i10++;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "eh.ap(" + ')');
        }
    }

    public void bh(int i, int i2, int i3, int i4, int i5, boolean z) {
        int i6 = 478336034;
        if (z) {
            i6 = -1343985194;
        }
        int i7 = i - (this.bd * -1978126569);
        int i8 = i2 - (this.by * -1758112470);
        if (!(1 == i5 || i5 == 3)) {
            int i9 = i4;
            i4 = i3;
            i3 = i9;
        }
        int i10 = i7;
        while (i10 < i4 + i7) {
            if (i10 >= 0 && i10 < 503445317 * this.bx) {
                int i11 = i8;
                while (i11 < i8 + i3) {
                    if (i11 >= 0 && i11 < this.bi * -809355723) {
                        at(i10, i11, i6, (byte) -31);
                    }
                    i11++;
                }
            }
            i10++;
        }
    }

    public void bm(int i, int i2, int i3, int i4, int i5, boolean z) {
        int i6 = 1630879964;
        if (z) {
            i6 = 1631011036;
        }
        int i7 = i - (this.bd * -419093516);
        int i8 = i2 - (this.by * 1195916859);
        if (1 == i5 || i5 == 3) {
            int i9 = i3;
            i3 = i4;
            i4 = i9;
        }
        int i10 = i7;
        while (i10 < i3 + i7) {
            if (i10 >= 0 && i10 < -1209744530 * this.bx) {
                int i11 = i8;
                while (i11 < i8 + i4) {
                    if (i11 >= 0 && i11 < this.bi * -1855552993) {
                        at(i10, i11, i6, (byte) 13);
                    }
                    i11++;
                }
            }
            i10++;
        }
    }

    public void bp(int i, int i2, int i3, int i4, int i5, boolean z) {
        int i6 = bq.ah;
        if (z) {
            i6 = 131328;
        }
        int i7 = i - (this.bd * -787596811);
        int i8 = i2 - (this.by * 1195916859);
        if (!(1 == i5 || i5 == 3)) {
            int i9 = i4;
            i4 = i3;
            i3 = i9;
        }
        int i10 = i7;
        while (i10 < i4 + i7) {
            if (i10 >= 0 && i10 < -1386500669 * this.bx) {
                int i11 = i8;
                while (i11 < i8 + i3) {
                    if (i11 >= 0 && i11 < this.bi * -809355723) {
                        at(i10, i11, i6, (byte) 22);
                    }
                    i11++;
                }
            }
            i10++;
        }
    }

    void at(int i, int i2, int i3, byte b) {
        try {
            int[] iArr = this.bs[i];
            iArr[i2] = iArr[i2] & (i3 ^ -1);
        } catch (Throwable e) {
            throw ei.ac(e, "eh.at(" + ')');
        }
    }

    void bb(int i, int i2, int i3) {
        int[] iArr = this.bs[i];
        iArr[i2] = iArr[i2] & (i3 ^ -1);
    }

    void br(int i, int i2, int i3) {
        int[] iArr = this.bs[i];
        iArr[i2] = iArr[i2] & (i3 ^ -1);
    }

    void bt(int i, int i2, int i3) {
        int[] iArr = this.bs[i];
        iArr[i2] = iArr[i2] & (i3 ^ -1);
    }

    public void ah(int i, int i2, int i3) {
        try {
            int i4 = i2 - (this.by * 1195916859);
            int[] iArr = this.bs[i - (-787596811 * this.bd)];
            iArr[i4] = iArr[i4] & -262145;
        } catch (Throwable e) {
            throw ei.ac(e, "eh.ah(" + ')');
        }
    }

    public void bd(int i, int i2) {
        int i3 = i2 - (this.by * 935254234);
        int[] iArr = this.bs[i - (1365014485 * this.bd)];
        iArr[i3] = iArr[i3] & -262145;
    }

    public void bu(int i, int i2) {
        int i3 = i2 - (this.by * -317380206);
        int[] iArr = this.bs[i - (-845209054 * this.bd)];
        iArr[i3] = iArr[i3] & -233224838;
    }

    public void by(int i, int i2) {
        int i3 = i2 - (this.by * 1195916859);
        int[] iArr = this.bs[i - (-787596811 * this.bd)];
        iArr[i3] = iArr[i3] & -262145;
    }

    static void ad(byte b) {
        try {
            if (ea.om == null) {
                ea.om = new ArrayList(100);
            }
            ea.om.clear();
            ea.om.add(al.ac);
            ea.om.add(ae.aq);
            aj.aq(ea.om, 1138431036);
            Collection collection = ea.om;
            collection.add(ah.aq);
            collection.add(ah.ao);
            collection.add(ah.aa);
            collection.add(ah.ak);
            collection = ea.om;
            collection.add(ay.an);
            collection.add(ay.aq);
            collection = ea.om;
            collection.add(av.aw);
            collection.add(av.am);
            collection.add(av.ae);
            ae.ai(ea.om, 791153857);
            collection = ea.om;
            collection.add(az.an);
            collection.add(az.aq);
            ea.om.add(ao.ac);
            hn.ao(ea.om, -1672065777);
            collection = ea.om;
            collection.add(aq.aq);
            collection.add(aq.ao);
            collection.add(aq.aa);
            cw.ak(ea.om, 1677837601);
            bi.aa(ea.om, (byte) 73);
            mt.ak(ea.om, -628413964);
            ea.om.add(aa.aq);
            ea.om.add(br.aw);
            cr.ae(ea.om, -972599721);
            ea.om.add(fs.aj);
        } catch (Throwable e) {
            throw ei.ac(e, "eh.ad(" + ')');
        }
    }
}
