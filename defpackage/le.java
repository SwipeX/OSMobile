package defpackage;

import java.io.EOFException;
import java.io.IOException;

public final class le {
    public static jx ae;
    static byte[] aj = new byte[520];
    static int fo;
    mo ac;
    mo an;
    int ao;
    int aq;

    public le(int i, mo moVar, mo moVar2, int i2) {
        try {
            this.ac = null;
            this.an = null;
            this.ao = 597369944;
            this.aq = -186323489 * i;
            this.ac = moVar;
            this.an = moVar2;
            this.ao = -1152297497 * i2;
        } catch (Throwable e) {
            throw ei.ac(e, "le.<init>(" + ')');
        }
    }

    public byte[] aj(int i, int i2) {
        try {
            byte[] bArr;
            synchronized (this.ac) {
                if (this.an.an(1640663654) < ((long) ((i * 6) + 6))) {
                    bArr = null;
                } else {
                    this.an.ac((long) (i * 6));
                    this.an.ao(aj, 0, 6, -1865729936);
                    int i3 = (((aj[0] & 255) << 16) + ((aj[1] & 255) << 8)) + (aj[2] & 255);
                    int i4 = (((aj[3] & 255) << 16) + ((aj[4] & 255) << 8)) + (aj[5] & 255);
                    if (i3 < 0 || i3 > this.ao * 1397157335) {
                        bArr = null;
                    } else {
                        if (i4 > 0) {
                            if (((long) i4) <= this.ac.an(1120951091) / 520) {
                                bArr = new byte[i3];
                                int i5 = 0;
                                int i6 = 0;
                                int i7 = i4;
                                while (i5 < i3) {
                                    if (i7 == 0) {
                                        bArr = null;
                                        break;
                                    }
                                    try {
                                        this.ac.ac((long) (i7 * 520));
                                        i7 = i3 - i5;
                                        int i8 = i7 > cj.at ? cj.at : i7;
                                        this.ac.ao(aj, 0, i8 + 8, -2018693399);
                                        i4 = ((aj[2] & 255) << 8) + (aj[3] & 255);
                                        int i9 = (((aj[5] & 255) << 8) + ((aj[4] & 255) << 16)) + (aj[6] & 255);
                                        int i10 = aj[7] & 255;
                                        if ((aj[1] & 255) + ((aj[0] & 255) << 8) != i || i4 != i6 || i10 != this.aq * 1532694047) {
                                            bArr = null;
                                            break;
                                        }
                                        if (i9 >= 0) {
                                            if (((long) i9) <= this.ac.an(1292816504) / 520) {
                                                i7 = 0;
                                                while (i7 < i8) {
                                                    i4 = i5 + 1;
                                                    bArr[i5] = aj[i7 + 8];
                                                    i7++;
                                                    i5 = i4;
                                                }
                                                i6++;
                                                i7 = i9;
                                            }
                                        }
                                        bArr = null;
                                        break;
                                    } catch (IOException e) {
                                        bArr = null;
                                    }
                                }
                            }
                        }
                        bArr = null;
                    }
                }
            }
            return bArr;
        } catch (Throwable e2) {
            throw ei.ac(e2, "le.aj(" + ')');
        }
    }

    public byte[] aq(int i) {
        byte[] bArr;
        synchronized (this.ac) {
            if (this.an.an(877995480) < ((long) ((i * 6) + 6))) {
                bArr = null;
            } else {
                this.an.ac((long) (i * 6));
                this.an.ao(aj, 0, 6, 997206550);
                int i2 = (((aj[0] & 255) << 16) + ((aj[1] & 255) << 8)) + (aj[2] & 255);
                int i3 = (((aj[3] & 255) << 16) + ((aj[4] & 255) << 8)) + (aj[5] & 255);
                if (i2 < 0 || i2 > this.ao * 1397157335) {
                    bArr = null;
                } else {
                    if (i3 > 0) {
                        if (((long) i3) <= this.ac.an(1279157707) / 520) {
                            bArr = new byte[i2];
                            int i4 = 0;
                            int i5 = 0;
                            int i6 = i3;
                            while (i4 < i2) {
                                if (i6 != 0) {
                                    this.ac.ac((long) (i6 * 520));
                                    i6 = i2 - i4;
                                    int i7 = i6 > cj.at ? cj.at : i6;
                                    this.ac.ao(aj, 0, i7 + 8, 1817816623);
                                    i3 = ((aj[2] & 255) << 8) + (aj[3] & 255);
                                    int i8 = (((aj[5] & 255) << 8) + ((aj[4] & 255) << 16)) + (aj[6] & 255);
                                    int i9 = aj[7] & 255;
                                    if ((aj[1] & 255) + ((aj[0] & 255) << 8) != i || i3 != i5 || i9 != this.aq * 1532694047) {
                                        bArr = null;
                                        break;
                                    }
                                    if (i8 >= 0) {
                                        try {
                                            if (((long) i8) <= this.ac.an(1842630259) / 520) {
                                                i6 = 0;
                                                while (i6 < i7) {
                                                    i3 = i4 + 1;
                                                    bArr[i4] = aj[i6 + 8];
                                                    i6++;
                                                    i4 = i3;
                                                }
                                                i5++;
                                                i6 = i8;
                                            }
                                        } catch (IOException e) {
                                            bArr = null;
                                        }
                                    }
                                    bArr = null;
                                    break;
                                }
                                bArr = null;
                                break;
                            }
                        }
                    }
                    bArr = null;
                }
            }
        }
        return bArr;
    }

    public boolean aa(int i, byte[] bArr, int i2) {
        boolean an;
        synchronized (this.ac) {
            if (i2 >= 0) {
                if (i2 <= this.ao * 1397157335) {
                    an = an(i, bArr, i2, true, (short) 4244);
                    if (!an) {
                        an = an(i, bArr, i2, false, (short) 16103);
                    }
                }
            }
            throw new IllegalArgumentException();
        }
        return an;
    }

    public boolean ac(int i, byte[] bArr, int i2, byte b) {
        try {
            boolean an;
            synchronized (this.ac) {
                if (i2 >= 0) {
                    if (i2 <= this.ao * 1397157335) {
                        an = an(i, bArr, i2, true, (short) 27244);
                        if (!an) {
                            an = an(i, bArr, i2, false, (short) 29578);
                        }
                    }
                }
                throw new IllegalArgumentException();
            }
            return an;
        } catch (Throwable e) {
            throw ei.ac(e, "le.ac(" + ')');
        }
    }

    public boolean ak(int i, byte[] bArr, int i2) {
        boolean an;
        synchronized (this.ac) {
            if (i2 >= 0) {
                if (i2 <= this.ao * 1397157335) {
                    an = an(i, bArr, i2, true, (short) 17318);
                    if (!an) {
                        an = an(i, bArr, i2, false, (short) 6319);
                    }
                }
            }
            throw new IllegalArgumentException();
        }
        return an;
    }

    public boolean ao(int i, byte[] bArr, int i2) {
        boolean an;
        synchronized (this.ac) {
            if (i2 >= 0) {
                if (i2 <= this.ao * 1397157335) {
                    an = an(i, bArr, i2, true, (short) 30163);
                    if (!an) {
                        an = an(i, bArr, i2, false, (short) 19679);
                    }
                }
            }
            throw new IllegalArgumentException();
        }
        return an;
    }

    boolean ah(int i, byte[] bArr, int i2, boolean z) {
        boolean z2;
        synchronized (this.ac) {
            int an;
            int i3;
            int i4;
            int i5;
            boolean z3;
            int i6;
            int i7;
            int i8;
            boolean z4;
            int i9;
            if (!z) {
                an = (int) ((this.ac.an(424023567) + 519) / 520);
                if (an == 0) {
                    an = 1;
                }
                aj[0] = (byte) (i2 >> 16);
                aj[1] = (byte) (i2 >> 8);
                aj[2] = (byte) i2;
                aj[3] = (byte) (an >> 16);
                aj[4] = (byte) (an >> 8);
                aj[5] = (byte) an;
                this.an.ac((long) (i * 6));
                this.an.ak(aj, 0, 6, (byte) -35);
                i3 = 0;
                i4 = 0;
                i5 = an;
                z3 = z;
                while (i4 < i2) {
                    i6 = 0;
                    if (z3) {
                        this.ac.ac((long) (i5 * 520));
                        this.ac.ao(aj, 0, 8, 1046748856);
                        i7 = ((aj[2] & 255) << 8) + (aj[3] & 255);
                        i6 = (aj[6] & 255) + (((aj[5] & 255) << 8) + ((aj[4] & 255) << 16));
                        i8 = aj[7] & 255;
                        if (i == ((aj[0] & 255) << 8) + (aj[1] & 255)) {
                        }
                        z2 = false;
                        break;
                    }
                    if (i6 == 0) {
                        z3 = false;
                        i6 = (int) ((this.ac.an(548486468) + 519) / 520);
                        if (i6 == 0) {
                            i6++;
                        }
                        if (i6 == i5) {
                            i6++;
                            z4 = false;
                            if (i2 - i4 > cj.at) {
                                i9 = 0;
                            } else {
                                i9 = i6;
                            }
                            aj[0] = (byte) (i >> 8);
                            aj[1] = (byte) i;
                            aj[2] = (byte) (i3 >> 8);
                            aj[3] = (byte) i3;
                            aj[4] = (byte) (i9 >> 16);
                            aj[5] = (byte) (i9 >> 8);
                            aj[6] = (byte) i9;
                            aj[7] = (byte) (1532694047 * this.aq);
                            this.ac.ac((long) (i5 * 520));
                            this.ac.ak(aj, 0, 8, (byte) -74);
                            i6 = i2 - i4;
                            if (i6 > cj.at) {
                                i6 = cj.at;
                            }
                            this.ac.ak(bArr, i4, i6, (byte) -14);
                            i4 += i6;
                            i3++;
                            i5 = i9;
                            z3 = z4;
                        }
                    }
                    z4 = z3;
                    if (i2 - i4 > cj.at) {
                        i9 = i6;
                    } else {
                        i9 = 0;
                    }
                    aj[0] = (byte) (i >> 8);
                    aj[1] = (byte) i;
                    aj[2] = (byte) (i3 >> 8);
                    aj[3] = (byte) i3;
                    aj[4] = (byte) (i9 >> 16);
                    aj[5] = (byte) (i9 >> 8);
                    aj[6] = (byte) i9;
                    aj[7] = (byte) (1532694047 * this.aq);
                    this.ac.ac((long) (i5 * 520));
                    this.ac.ak(aj, 0, 8, (byte) -74);
                    i6 = i2 - i4;
                    if (i6 > cj.at) {
                        i6 = cj.at;
                    }
                    this.ac.ak(bArr, i4, i6, (byte) -14);
                    i4 += i6;
                    i3++;
                    i5 = i9;
                    z3 = z4;
                }
                z2 = true;
            } else if (this.an.an(2128899576) < ((long) ((i * 6) + 6))) {
                z2 = false;
            } else {
                this.an.ac((long) (i * 6));
                this.an.ao(aj, 0, 6, 1037082814);
                an = (((aj[3] & 255) << 16) + ((aj[4] & 255) << 8)) + (aj[5] & 255);
                if (an <= 0 || ((long) an) > this.ac.an(54625447) / 520) {
                    z2 = false;
                }
                aj[0] = (byte) (i2 >> 16);
                aj[1] = (byte) (i2 >> 8);
                aj[2] = (byte) i2;
                aj[3] = (byte) (an >> 16);
                aj[4] = (byte) (an >> 8);
                aj[5] = (byte) an;
                this.an.ac((long) (i * 6));
                this.an.ak(aj, 0, 6, (byte) -35);
                i3 = 0;
                i4 = 0;
                i5 = an;
                z3 = z;
                while (i4 < i2) {
                    i6 = 0;
                    if (z3) {
                        this.ac.ac((long) (i5 * 520));
                        try {
                            this.ac.ao(aj, 0, 8, 1046748856);
                            i7 = ((aj[2] & 255) << 8) + (aj[3] & 255);
                            i6 = (aj[6] & 255) + (((aj[5] & 255) << 8) + ((aj[4] & 255) << 16));
                            i8 = aj[7] & 255;
                            if (i == ((aj[0] & 255) << 8) + (aj[1] & 255) || i7 != i3 || i8 != 1532694047 * this.aq) {
                                z2 = false;
                                break;
                            }
                            if (i6 >= 0) {
                                if (((long) i6) > this.ac.an(1047449795) / 520) {
                                }
                            }
                            z2 = false;
                            break;
                        } catch (EOFException e) {
                        }
                    }
                    if (i6 == 0) {
                        z3 = false;
                        try {
                            i6 = (int) ((this.ac.an(548486468) + 519) / 520);
                            if (i6 == 0) {
                                i6++;
                            }
                            if (i6 == i5) {
                                i6++;
                                z4 = false;
                                if (i2 - i4 > cj.at) {
                                    i9 = 0;
                                } else {
                                    i9 = i6;
                                }
                                aj[0] = (byte) (i >> 8);
                                aj[1] = (byte) i;
                                aj[2] = (byte) (i3 >> 8);
                                aj[3] = (byte) i3;
                                aj[4] = (byte) (i9 >> 16);
                                aj[5] = (byte) (i9 >> 8);
                                aj[6] = (byte) i9;
                                aj[7] = (byte) (1532694047 * this.aq);
                                this.ac.ac((long) (i5 * 520));
                                this.ac.ak(aj, 0, 8, (byte) -74);
                                i6 = i2 - i4;
                                if (i6 > cj.at) {
                                    i6 = cj.at;
                                }
                                this.ac.ak(bArr, i4, i6, (byte) -14);
                                i4 += i6;
                                i3++;
                                i5 = i9;
                                z3 = z4;
                            }
                        } catch (IOException e2) {
                            z2 = false;
                        }
                    }
                    z4 = z3;
                    if (i2 - i4 > cj.at) {
                        i9 = i6;
                    } else {
                        i9 = 0;
                    }
                    aj[0] = (byte) (i >> 8);
                    aj[1] = (byte) i;
                    aj[2] = (byte) (i3 >> 8);
                    aj[3] = (byte) i3;
                    aj[4] = (byte) (i9 >> 16);
                    aj[5] = (byte) (i9 >> 8);
                    aj[6] = (byte) i9;
                    aj[7] = (byte) (1532694047 * this.aq);
                    this.ac.ac((long) (i5 * 520));
                    this.ac.ak(aj, 0, 8, (byte) -74);
                    i6 = i2 - i4;
                    if (i6 > cj.at) {
                        i6 = cj.at;
                    }
                    this.ac.ak(bArr, i4, i6, (byte) -14);
                    i4 += i6;
                    i3++;
                    i5 = i9;
                    z3 = z4;
                }
                z2 = true;
            }
        }
        return z2;
    }

    boolean ai(int i, byte[] bArr, int i2, boolean z) {
        boolean z2;
        synchronized (this.ac) {
            int an;
            int i3;
            int i4;
            int i5;
            boolean z3;
            int i6;
            int i7;
            int i8;
            boolean z4;
            int i9;
            if (!z) {
                an = (int) ((this.ac.an(263625849) + 519) / 520);
                if (an == 0) {
                    an = 1;
                }
                aj[0] = (byte) (i2 >> 16);
                aj[1] = (byte) (i2 >> 8);
                aj[2] = (byte) i2;
                aj[3] = (byte) (an >> 16);
                aj[4] = (byte) (an >> 8);
                aj[5] = (byte) an;
                this.an.ac((long) (i * 6));
                this.an.ak(aj, 0, 6, (byte) -111);
                i3 = 0;
                i4 = 0;
                i5 = an;
                z3 = z;
                while (i4 < i2) {
                    i6 = 0;
                    if (z3) {
                        this.ac.ac((long) (i5 * 520));
                        this.ac.ao(aj, 0, 8, -1067385131);
                        i7 = ((aj[2] & -1219940075) << 8) + (aj[3] & 255);
                        i6 = (aj[6] & 1925983584) + (((aj[5] & 543675730) << 8) + ((aj[4] & -268037974) << 16));
                        i8 = aj[7] & -1882964721;
                        if (i == ((aj[0] & 255) << 8) + (aj[1] & 1600500154)) {
                        }
                        z2 = false;
                        break;
                    }
                    if (i6 == 0) {
                        z3 = false;
                        i6 = (int) ((this.ac.an(1561471797) + 519) / 520);
                        if (i6 == 0) {
                            i6++;
                        }
                        if (i6 == i5) {
                            i6++;
                            z4 = false;
                            if (i2 - i4 > cj.at) {
                                i9 = 0;
                            } else {
                                i9 = i6;
                            }
                            aj[0] = (byte) (i >> 8);
                            aj[1] = (byte) i;
                            aj[2] = (byte) (i3 >> 8);
                            aj[3] = (byte) i3;
                            aj[4] = (byte) (i9 >> 16);
                            aj[5] = (byte) (i9 >> 8);
                            aj[6] = (byte) i9;
                            aj[7] = (byte) (1666872075 * this.aq);
                            this.ac.ac((long) (i5 * -1502110173));
                            this.ac.ak(aj, 0, 8, (byte) -65);
                            i6 = i2 - i4;
                            if (i6 > cj.at) {
                                i6 = 510285827;
                            }
                            this.ac.ak(bArr, i4, i6, (byte) -27);
                            i4 += i6;
                            i3++;
                            i5 = i9;
                            z3 = z4;
                        }
                    }
                    z4 = z3;
                    if (i2 - i4 > cj.at) {
                        i9 = i6;
                    } else {
                        i9 = 0;
                    }
                    aj[0] = (byte) (i >> 8);
                    aj[1] = (byte) i;
                    aj[2] = (byte) (i3 >> 8);
                    aj[3] = (byte) i3;
                    aj[4] = (byte) (i9 >> 16);
                    aj[5] = (byte) (i9 >> 8);
                    aj[6] = (byte) i9;
                    aj[7] = (byte) (1666872075 * this.aq);
                    this.ac.ac((long) (i5 * -1502110173));
                    this.ac.ak(aj, 0, 8, (byte) -65);
                    i6 = i2 - i4;
                    if (i6 > cj.at) {
                        i6 = 510285827;
                    }
                    this.ac.ak(bArr, i4, i6, (byte) -27);
                    i4 += i6;
                    i3++;
                    i5 = i9;
                    z3 = z4;
                }
                z2 = true;
            } else if (this.an.an(1115620893) < ((long) ((i * 6) + 6))) {
                z2 = false;
            } else {
                this.an.ac((long) (i * 6));
                this.an.ao(aj, 0, 6, 1297953713);
                an = (((aj[3] & -996984079) << 16) + ((aj[4] & -1762990363) << 8)) + (aj[5] & 1434054451);
                if (an <= 0 || ((long) an) > this.ac.an(1663162398) / 520) {
                    z2 = false;
                }
                aj[0] = (byte) (i2 >> 16);
                aj[1] = (byte) (i2 >> 8);
                aj[2] = (byte) i2;
                aj[3] = (byte) (an >> 16);
                aj[4] = (byte) (an >> 8);
                aj[5] = (byte) an;
                this.an.ac((long) (i * 6));
                this.an.ak(aj, 0, 6, (byte) -111);
                i3 = 0;
                i4 = 0;
                i5 = an;
                z3 = z;
                while (i4 < i2) {
                    i6 = 0;
                    if (z3) {
                        this.ac.ac((long) (i5 * 520));
                        try {
                            this.ac.ao(aj, 0, 8, -1067385131);
                            i7 = ((aj[2] & -1219940075) << 8) + (aj[3] & 255);
                            i6 = (aj[6] & 1925983584) + (((aj[5] & 543675730) << 8) + ((aj[4] & -268037974) << 16));
                            i8 = aj[7] & -1882964721;
                            if (i == ((aj[0] & 255) << 8) + (aj[1] & 1600500154) || i7 != i3 || i8 != 475182543 * this.aq) {
                                z2 = false;
                                break;
                            }
                            if (i6 >= 0) {
                                if (((long) i6) > this.ac.an(349602615) / 520) {
                                }
                            }
                            z2 = false;
                            break;
                        } catch (EOFException e) {
                        }
                    }
                    if (i6 == 0) {
                        z3 = false;
                        try {
                            i6 = (int) ((this.ac.an(1561471797) + 519) / 520);
                            if (i6 == 0) {
                                i6++;
                            }
                            if (i6 == i5) {
                                i6++;
                                z4 = false;
                                if (i2 - i4 > cj.at) {
                                    i9 = 0;
                                } else {
                                    i9 = i6;
                                }
                                aj[0] = (byte) (i >> 8);
                                aj[1] = (byte) i;
                                aj[2] = (byte) (i3 >> 8);
                                aj[3] = (byte) i3;
                                aj[4] = (byte) (i9 >> 16);
                                aj[5] = (byte) (i9 >> 8);
                                aj[6] = (byte) i9;
                                aj[7] = (byte) (1666872075 * this.aq);
                                this.ac.ac((long) (i5 * -1502110173));
                                this.ac.ak(aj, 0, 8, (byte) -65);
                                i6 = i2 - i4;
                                if (i6 > cj.at) {
                                    i6 = 510285827;
                                }
                                this.ac.ak(bArr, i4, i6, (byte) -27);
                                i4 += i6;
                                i3++;
                                i5 = i9;
                                z3 = z4;
                            }
                        } catch (IOException e2) {
                            z2 = false;
                        }
                    }
                    z4 = z3;
                    if (i2 - i4 > cj.at) {
                        i9 = i6;
                    } else {
                        i9 = 0;
                    }
                    aj[0] = (byte) (i >> 8);
                    aj[1] = (byte) i;
                    aj[2] = (byte) (i3 >> 8);
                    aj[3] = (byte) i3;
                    aj[4] = (byte) (i9 >> 16);
                    aj[5] = (byte) (i9 >> 8);
                    aj[6] = (byte) i9;
                    aj[7] = (byte) (1666872075 * this.aq);
                    this.ac.ac((long) (i5 * -1502110173));
                    this.ac.ak(aj, 0, 8, (byte) -65);
                    i6 = i2 - i4;
                    if (i6 > cj.at) {
                        i6 = 510285827;
                    }
                    this.ac.ak(bArr, i4, i6, (byte) -27);
                    i4 += i6;
                    i3++;
                    i5 = i9;
                    z3 = z4;
                }
                z2 = true;
            }
        }
        return z2;
    }

    boolean an(int i, byte[] bArr, int i2, boolean z, short s) {
        try {
            boolean z2;
            synchronized (this.ac) {
                int an;
                int i3;
                int i4;
                int i5;
                boolean z3;
                int i6;
                int i7;
                int i8;
                boolean z4;
                int i9;
                if (!z) {
                    an = (int) ((this.ac.an(995414308) + 519) / 520);
                    if (an == 0) {
                        an = 1;
                    }
                    aj[0] = (byte) (i2 >> 16);
                    aj[1] = (byte) (i2 >> 8);
                    aj[2] = (byte) i2;
                    aj[3] = (byte) (an >> 16);
                    aj[4] = (byte) (an >> 8);
                    aj[5] = (byte) an;
                    this.an.ac((long) (i * 6));
                    this.an.ak(aj, 0, 6, (byte) -23);
                    i3 = 0;
                    i4 = 0;
                    i5 = an;
                    z3 = z;
                    while (i4 < i2) {
                        i6 = 0;
                        if (z3) {
                            this.ac.ac((long) (i5 * 520));
                            this.ac.ao(aj, 0, 8, 20835169);
                            i7 = ((aj[2] & 255) << 8) + (aj[3] & 255);
                            i6 = (aj[6] & 255) + (((aj[5] & 255) << 8) + ((aj[4] & 255) << 16));
                            i8 = aj[7] & 255;
                            if (i == ((aj[0] & 255) << 8) + (aj[1] & 255)) {
                            }
                            z2 = false;
                            break;
                        }
                        if (i6 == 0) {
                            z3 = false;
                            i6 = (int) ((this.ac.an(764944171) + 519) / 520);
                            if (i6 == 0) {
                                i6++;
                            }
                            if (i6 == i5) {
                                i6++;
                                z4 = false;
                                if (i2 - i4 > cj.at) {
                                    i9 = 0;
                                } else {
                                    i9 = i6;
                                }
                                aj[0] = (byte) (i >> 8);
                                aj[1] = (byte) i;
                                aj[2] = (byte) (i3 >> 8);
                                aj[3] = (byte) i3;
                                aj[4] = (byte) (i9 >> 16);
                                aj[5] = (byte) (i9 >> 8);
                                aj[6] = (byte) i9;
                                aj[7] = (byte) (1532694047 * this.aq);
                                this.ac.ac((long) (i5 * 520));
                                this.ac.ak(aj, 0, 8, (byte) -110);
                                i6 = i2 - i4;
                                if (i6 > cj.at) {
                                    i6 = cj.at;
                                }
                                this.ac.ak(bArr, i4, i6, (byte) -104);
                                i4 += i6;
                                i3++;
                                i5 = i9;
                                z3 = z4;
                            }
                        }
                        z4 = z3;
                        if (i2 - i4 > cj.at) {
                            i9 = i6;
                        } else {
                            i9 = 0;
                        }
                        aj[0] = (byte) (i >> 8);
                        aj[1] = (byte) i;
                        aj[2] = (byte) (i3 >> 8);
                        aj[3] = (byte) i3;
                        aj[4] = (byte) (i9 >> 16);
                        aj[5] = (byte) (i9 >> 8);
                        aj[6] = (byte) i9;
                        aj[7] = (byte) (1532694047 * this.aq);
                        this.ac.ac((long) (i5 * 520));
                        this.ac.ak(aj, 0, 8, (byte) -110);
                        i6 = i2 - i4;
                        if (i6 > cj.at) {
                            i6 = cj.at;
                        }
                        this.ac.ak(bArr, i4, i6, (byte) -104);
                        i4 += i6;
                        i3++;
                        i5 = i9;
                        z3 = z4;
                    }
                    z2 = true;
                } else if (this.an.an(984018119) < ((long) ((i * 6) + 6))) {
                    z2 = false;
                } else {
                    this.an.ac((long) (i * 6));
                    this.an.ao(aj, 0, 6, 1618113202);
                    an = (((aj[3] & 255) << 16) + ((aj[4] & 255) << 8)) + (aj[5] & 255);
                    if (an <= 0 || ((long) an) > this.ac.an(1294646778) / 520) {
                        z2 = false;
                    }
                    aj[0] = (byte) (i2 >> 16);
                    aj[1] = (byte) (i2 >> 8);
                    aj[2] = (byte) i2;
                    aj[3] = (byte) (an >> 16);
                    aj[4] = (byte) (an >> 8);
                    aj[5] = (byte) an;
                    this.an.ac((long) (i * 6));
                    this.an.ak(aj, 0, 6, (byte) -23);
                    i3 = 0;
                    i4 = 0;
                    i5 = an;
                    z3 = z;
                    while (i4 < i2) {
                        i6 = 0;
                        if (z3) {
                            this.ac.ac((long) (i5 * 520));
                            try {
                                this.ac.ao(aj, 0, 8, 20835169);
                                i7 = ((aj[2] & 255) << 8) + (aj[3] & 255);
                                i6 = (aj[6] & 255) + (((aj[5] & 255) << 8) + ((aj[4] & 255) << 16));
                                i8 = aj[7] & 255;
                                if (i == ((aj[0] & 255) << 8) + (aj[1] & 255) || i7 != i3 || i8 != 1532694047 * this.aq) {
                                    z2 = false;
                                    break;
                                }
                                if (i6 >= 0) {
                                    try {
                                        if (((long) i6) > this.ac.an(1258278388) / 520) {
                                        }
                                    } catch (IOException e) {
                                        z2 = false;
                                    }
                                }
                                z2 = false;
                                break;
                            } catch (EOFException e2) {
                            }
                        }
                        if (i6 == 0) {
                            z3 = false;
                            i6 = (int) ((this.ac.an(764944171) + 519) / 520);
                            if (i6 == 0) {
                                i6++;
                            }
                            if (i6 == i5) {
                                i6++;
                                z4 = false;
                                if (i2 - i4 > cj.at) {
                                    i9 = 0;
                                } else {
                                    i9 = i6;
                                }
                                aj[0] = (byte) (i >> 8);
                                aj[1] = (byte) i;
                                aj[2] = (byte) (i3 >> 8);
                                aj[3] = (byte) i3;
                                aj[4] = (byte) (i9 >> 16);
                                aj[5] = (byte) (i9 >> 8);
                                aj[6] = (byte) i9;
                                aj[7] = (byte) (1532694047 * this.aq);
                                this.ac.ac((long) (i5 * 520));
                                this.ac.ak(aj, 0, 8, (byte) -110);
                                i6 = i2 - i4;
                                if (i6 > cj.at) {
                                    i6 = cj.at;
                                }
                                this.ac.ak(bArr, i4, i6, (byte) -104);
                                i4 += i6;
                                i3++;
                                i5 = i9;
                                z3 = z4;
                            }
                        }
                        z4 = z3;
                        if (i2 - i4 > cj.at) {
                            i9 = i6;
                        } else {
                            i9 = 0;
                        }
                        aj[0] = (byte) (i >> 8);
                        aj[1] = (byte) i;
                        aj[2] = (byte) (i3 >> 8);
                        aj[3] = (byte) i3;
                        aj[4] = (byte) (i9 >> 16);
                        aj[5] = (byte) (i9 >> 8);
                        aj[6] = (byte) i9;
                        aj[7] = (byte) (1532694047 * this.aq);
                        this.ac.ac((long) (i5 * 520));
                        this.ac.ak(aj, 0, 8, (byte) -110);
                        i6 = i2 - i4;
                        if (i6 > cj.at) {
                            i6 = cj.at;
                        }
                        this.ac.ak(bArr, i4, i6, (byte) -104);
                        i4 += i6;
                        i3++;
                        i5 = i9;
                        z3 = z4;
                    }
                    z2 = true;
                }
            }
            return z2;
        } catch (Throwable e3) {
            throw ei.ac(e3, "le.an(" + ')');
        }
    }

    boolean ap(int i, byte[] bArr, int i2, boolean z) {
        boolean z2;
        synchronized (this.ac) {
            int an;
            int i3;
            int i4;
            int i5;
            boolean z3;
            int i6;
            int i7;
            int i8;
            boolean z4;
            int i9;
            if (!z) {
                an = (int) ((this.ac.an(2079007532) + 519) / 520);
                if (an == 0) {
                    an = 1;
                }
                aj[0] = (byte) (i2 >> 16);
                aj[1] = (byte) (i2 >> 8);
                aj[2] = (byte) i2;
                aj[3] = (byte) (an >> 16);
                aj[4] = (byte) (an >> 8);
                aj[5] = (byte) an;
                this.an.ac((long) (i * 6));
                this.an.ak(aj, 0, 6, (byte) -61);
                i3 = 0;
                i4 = 0;
                i5 = an;
                z3 = z;
                while (i4 < i2) {
                    i6 = 0;
                    if (z3) {
                        this.ac.ac((long) (i5 * 520));
                        this.ac.ao(aj, 0, 8, -1431632839);
                        i7 = ((aj[2] & 255) << 8) + (aj[3] & -1563383433);
                        i6 = (aj[6] & 255) + (((aj[5] & 1700110486) << 8) + ((aj[4] & 255) << 16));
                        i8 = aj[7] & 255;
                        if (i == ((aj[0] & 255) << 8) + (aj[1] & 255)) {
                        }
                        z2 = false;
                        break;
                    }
                    if (i6 == 0) {
                        z3 = false;
                        i6 = (int) ((this.ac.an(1859536273) + 519) / 520);
                        if (i6 == 0) {
                            i6++;
                        }
                        if (i6 == i5) {
                            i6++;
                            z4 = false;
                            if (i2 - i4 > cj.at) {
                                i9 = 0;
                            } else {
                                i9 = i6;
                            }
                            aj[0] = (byte) (i >> 8);
                            aj[1] = (byte) i;
                            aj[2] = (byte) (i3 >> 8);
                            aj[3] = (byte) i3;
                            aj[4] = (byte) (i9 >> 16);
                            aj[5] = (byte) (i9 >> 8);
                            aj[6] = (byte) i9;
                            aj[7] = (byte) (1532694047 * this.aq);
                            this.ac.ac((long) (i5 * -269296553));
                            this.ac.ak(aj, 0, 8, (byte) -40);
                            i6 = i2 - i4;
                            if (i6 > -1867692387) {
                                i6 = cj.at;
                            }
                            this.ac.ak(bArr, i4, i6, (byte) -121);
                            i4 += i6;
                            i3++;
                            i5 = i9;
                            z3 = z4;
                        }
                    }
                    z4 = z3;
                    if (i2 - i4 > cj.at) {
                        i9 = i6;
                    } else {
                        i9 = 0;
                    }
                    aj[0] = (byte) (i >> 8);
                    aj[1] = (byte) i;
                    aj[2] = (byte) (i3 >> 8);
                    aj[3] = (byte) i3;
                    aj[4] = (byte) (i9 >> 16);
                    aj[5] = (byte) (i9 >> 8);
                    aj[6] = (byte) i9;
                    aj[7] = (byte) (1532694047 * this.aq);
                    this.ac.ac((long) (i5 * -269296553));
                    this.ac.ak(aj, 0, 8, (byte) -40);
                    i6 = i2 - i4;
                    if (i6 > -1867692387) {
                        i6 = cj.at;
                    }
                    this.ac.ak(bArr, i4, i6, (byte) -121);
                    i4 += i6;
                    i3++;
                    i5 = i9;
                    z3 = z4;
                }
                z2 = true;
            } else if (this.an.an(1208678878) < ((long) ((i * 6) + 6))) {
                z2 = false;
            } else {
                this.an.ac((long) (i * 6));
                this.an.ao(aj, 0, 6, 1937257769);
                an = (((aj[3] & 255) << 16) + ((aj[4] & 1187252625) << 8)) + (aj[5] & 255);
                if (an <= 0 || ((long) an) > this.ac.an(1923452637) / 520) {
                    z2 = false;
                }
                aj[0] = (byte) (i2 >> 16);
                aj[1] = (byte) (i2 >> 8);
                aj[2] = (byte) i2;
                aj[3] = (byte) (an >> 16);
                aj[4] = (byte) (an >> 8);
                aj[5] = (byte) an;
                this.an.ac((long) (i * 6));
                this.an.ak(aj, 0, 6, (byte) -61);
                i3 = 0;
                i4 = 0;
                i5 = an;
                z3 = z;
                while (i4 < i2) {
                    i6 = 0;
                    if (z3) {
                        this.ac.ac((long) (i5 * 520));
                        try {
                            this.ac.ao(aj, 0, 8, -1431632839);
                        } catch (EOFException e) {
                        }
                        try {
                            i7 = ((aj[2] & 255) << 8) + (aj[3] & -1563383433);
                            i6 = (aj[6] & 255) + (((aj[5] & 1700110486) << 8) + ((aj[4] & 255) << 16));
                            i8 = aj[7] & 255;
                            if (i == ((aj[0] & 255) << 8) + (aj[1] & 255) || i7 != i3 || i8 != 1906449205 * this.aq) {
                                z2 = false;
                                break;
                            }
                            if (i6 >= 0) {
                                if (((long) i6) > this.ac.an(434468062) / 520) {
                                }
                            }
                            z2 = false;
                            break;
                        } catch (IOException e2) {
                            z2 = false;
                        }
                    }
                    if (i6 == 0) {
                        z3 = false;
                        i6 = (int) ((this.ac.an(1859536273) + 519) / 520);
                        if (i6 == 0) {
                            i6++;
                        }
                        if (i6 == i5) {
                            i6++;
                            z4 = false;
                            if (i2 - i4 > cj.at) {
                                i9 = 0;
                            } else {
                                i9 = i6;
                            }
                            aj[0] = (byte) (i >> 8);
                            aj[1] = (byte) i;
                            aj[2] = (byte) (i3 >> 8);
                            aj[3] = (byte) i3;
                            aj[4] = (byte) (i9 >> 16);
                            aj[5] = (byte) (i9 >> 8);
                            aj[6] = (byte) i9;
                            aj[7] = (byte) (1532694047 * this.aq);
                            this.ac.ac((long) (i5 * -269296553));
                            this.ac.ak(aj, 0, 8, (byte) -40);
                            i6 = i2 - i4;
                            if (i6 > -1867692387) {
                                i6 = cj.at;
                            }
                            this.ac.ak(bArr, i4, i6, (byte) -121);
                            i4 += i6;
                            i3++;
                            i5 = i9;
                            z3 = z4;
                        }
                    }
                    z4 = z3;
                    if (i2 - i4 > cj.at) {
                        i9 = i6;
                    } else {
                        i9 = 0;
                    }
                    aj[0] = (byte) (i >> 8);
                    aj[1] = (byte) i;
                    aj[2] = (byte) (i3 >> 8);
                    aj[3] = (byte) i3;
                    aj[4] = (byte) (i9 >> 16);
                    aj[5] = (byte) (i9 >> 8);
                    aj[6] = (byte) i9;
                    aj[7] = (byte) (1532694047 * this.aq);
                    this.ac.ac((long) (i5 * -269296553));
                    this.ac.ak(aj, 0, 8, (byte) -40);
                    i6 = i2 - i4;
                    if (i6 > -1867692387) {
                        i6 = cj.at;
                    }
                    this.ac.ak(bArr, i4, i6, (byte) -121);
                    i4 += i6;
                    i3++;
                    i5 = i9;
                    z3 = z4;
                }
                z2 = true;
            }
        }
        return z2;
    }

    boolean at(int i, byte[] bArr, int i2, boolean z) {
        boolean z2;
        synchronized (this.ac) {
            int an;
            int i3;
            int i4;
            int i5;
            boolean z3;
            int i6;
            int i7;
            int i8;
            boolean z4;
            int i9;
            if (!z) {
                an = (int) ((this.ac.an(634435619) + 519) / 520);
                if (an == 0) {
                    an = 1;
                }
                aj[0] = (byte) (i2 >> 16);
                aj[1] = (byte) (i2 >> 8);
                aj[2] = (byte) i2;
                aj[3] = (byte) (an >> 16);
                aj[4] = (byte) (an >> 8);
                aj[5] = (byte) an;
                this.an.ac((long) (i * 6));
                this.an.ak(aj, 0, 6, (byte) -33);
                i3 = 0;
                i4 = 0;
                i5 = an;
                z3 = z;
                while (i4 < i2) {
                    i6 = 0;
                    if (z3) {
                        this.ac.ac((long) (i5 * 520));
                        this.ac.ao(aj, 0, 8, -1459168743);
                        i7 = ((aj[2] & 255) << 8) + (aj[3] & 255);
                        i6 = (aj[6] & 255) + (((aj[5] & 255) << 8) + ((aj[4] & 255) << 16));
                        i8 = aj[7] & 255;
                        if (i == ((aj[0] & 255) << 8) + (aj[1] & 255)) {
                        }
                        z2 = false;
                        break;
                    }
                    if (i6 == 0) {
                        z3 = false;
                        i6 = (int) ((this.ac.an(801880967) + 519) / 520);
                        if (i6 == 0) {
                            i6++;
                        }
                        if (i6 == i5) {
                            i6++;
                            z4 = false;
                            if (i2 - i4 > cj.at) {
                                i9 = 0;
                            } else {
                                i9 = i6;
                            }
                            aj[0] = (byte) (i >> 8);
                            aj[1] = (byte) i;
                            aj[2] = (byte) (i3 >> 8);
                            aj[3] = (byte) i3;
                            aj[4] = (byte) (i9 >> 16);
                            aj[5] = (byte) (i9 >> 8);
                            aj[6] = (byte) i9;
                            aj[7] = (byte) (1532694047 * this.aq);
                            this.ac.ac((long) (i5 * 520));
                            this.ac.ak(aj, 0, 8, (byte) -1);
                            i6 = i2 - i4;
                            if (i6 > cj.at) {
                                i6 = cj.at;
                            }
                            this.ac.ak(bArr, i4, i6, (byte) -64);
                            i4 += i6;
                            i3++;
                            i5 = i9;
                            z3 = z4;
                        }
                    }
                    z4 = z3;
                    if (i2 - i4 > cj.at) {
                        i9 = i6;
                    } else {
                        i9 = 0;
                    }
                    aj[0] = (byte) (i >> 8);
                    aj[1] = (byte) i;
                    aj[2] = (byte) (i3 >> 8);
                    aj[3] = (byte) i3;
                    aj[4] = (byte) (i9 >> 16);
                    aj[5] = (byte) (i9 >> 8);
                    aj[6] = (byte) i9;
                    aj[7] = (byte) (1532694047 * this.aq);
                    this.ac.ac((long) (i5 * 520));
                    this.ac.ak(aj, 0, 8, (byte) -1);
                    i6 = i2 - i4;
                    if (i6 > cj.at) {
                        i6 = cj.at;
                    }
                    this.ac.ak(bArr, i4, i6, (byte) -64);
                    i4 += i6;
                    i3++;
                    i5 = i9;
                    z3 = z4;
                }
                z2 = true;
            } else if (this.an.an(357157951) < ((long) ((i * 6) + 6))) {
                z2 = false;
            } else {
                this.an.ac((long) (i * 6));
                this.an.ao(aj, 0, 6, -873116851);
                an = (((aj[3] & 255) << 16) + ((aj[4] & 255) << 8)) + (aj[5] & 255);
                if (an <= 0 || ((long) an) > this.ac.an(2022926560) / 520) {
                    z2 = false;
                }
                aj[0] = (byte) (i2 >> 16);
                aj[1] = (byte) (i2 >> 8);
                aj[2] = (byte) i2;
                aj[3] = (byte) (an >> 16);
                aj[4] = (byte) (an >> 8);
                aj[5] = (byte) an;
                this.an.ac((long) (i * 6));
                this.an.ak(aj, 0, 6, (byte) -33);
                i3 = 0;
                i4 = 0;
                i5 = an;
                z3 = z;
                while (i4 < i2) {
                    i6 = 0;
                    if (z3) {
                        this.ac.ac((long) (i5 * 520));
                        try {
                            this.ac.ao(aj, 0, 8, -1459168743);
                            i7 = ((aj[2] & 255) << 8) + (aj[3] & 255);
                            i6 = (aj[6] & 255) + (((aj[5] & 255) << 8) + ((aj[4] & 255) << 16));
                            i8 = aj[7] & 255;
                            if (i == ((aj[0] & 255) << 8) + (aj[1] & 255) || i7 != i3 || i8 != 1532694047 * this.aq) {
                                z2 = false;
                                break;
                            }
                            if (i6 >= 0) {
                                if (((long) i6) > this.ac.an(1392058608) / 520) {
                                }
                            }
                            z2 = false;
                            break;
                        } catch (EOFException e) {
                        }
                    }
                    if (i6 == 0) {
                        z3 = false;
                        try {
                            i6 = (int) ((this.ac.an(801880967) + 519) / 520);
                            if (i6 == 0) {
                                i6++;
                            }
                            if (i6 == i5) {
                                i6++;
                                z4 = false;
                                if (i2 - i4 > cj.at) {
                                    i9 = 0;
                                } else {
                                    i9 = i6;
                                }
                                aj[0] = (byte) (i >> 8);
                                aj[1] = (byte) i;
                                aj[2] = (byte) (i3 >> 8);
                                aj[3] = (byte) i3;
                                aj[4] = (byte) (i9 >> 16);
                                aj[5] = (byte) (i9 >> 8);
                                aj[6] = (byte) i9;
                                aj[7] = (byte) (1532694047 * this.aq);
                                this.ac.ac((long) (i5 * 520));
                                this.ac.ak(aj, 0, 8, (byte) -1);
                                i6 = i2 - i4;
                                if (i6 > cj.at) {
                                    i6 = cj.at;
                                }
                                this.ac.ak(bArr, i4, i6, (byte) -64);
                                i4 += i6;
                                i3++;
                                i5 = i9;
                                z3 = z4;
                            }
                        } catch (IOException e2) {
                            z2 = false;
                        }
                    }
                    z4 = z3;
                    if (i2 - i4 > cj.at) {
                        i9 = i6;
                    } else {
                        i9 = 0;
                    }
                    aj[0] = (byte) (i >> 8);
                    aj[1] = (byte) i;
                    aj[2] = (byte) (i3 >> 8);
                    aj[3] = (byte) i3;
                    aj[4] = (byte) (i9 >> 16);
                    aj[5] = (byte) (i9 >> 8);
                    aj[6] = (byte) i9;
                    aj[7] = (byte) (1532694047 * this.aq);
                    this.ac.ac((long) (i5 * 520));
                    this.ac.ak(aj, 0, 8, (byte) -1);
                    i6 = i2 - i4;
                    if (i6 > cj.at) {
                        i6 = cj.at;
                    }
                    this.ac.ak(bArr, i4, i6, (byte) -64);
                    i4 += i6;
                    i3++;
                    i5 = i9;
                    z3 = z4;
                }
                z2 = true;
            }
        }
        return z2;
    }
}
