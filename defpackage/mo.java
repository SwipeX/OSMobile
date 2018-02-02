package defpackage;

import java.io.EOFException;
import java.io.IOException;

public class mo {
    long aa;
    byte[] ac;
    long ah;
    long ai;
    md aj;
    int ak;
    long an;
    byte[] ao;
    long ap;
    int aq;
    long at;

    public mo(md mdVar, int i, int i2) throws IOException {
        try {
            this.an = -4657962565261391169L;
            this.aa = -7934910975904837527L;
            this.ak = 0;
            this.aj = mdVar;
            long ao = mdVar.ao(1663494766) * -8593638781237564631L;
            this.at = ao;
            this.ah = ao * 8239995125225060259L;
            this.ac = new byte[i];
            this.ao = new byte[i2];
            this.ap = 0;
        } catch (Throwable e) {
            throw ei.ac(e, "mo.<init>(" + ')');
        }
    }

    public void ah() throws IOException {
        ap(515059177);
        this.aj.an(669395641);
    }

    public void ai() throws IOException {
        ap(-198324197);
        this.aj.an(-1737343374);
    }

    public void aj(int i) throws IOException {
        try {
            ap(217401153);
            this.aj.an(-1928504931);
        } catch (Throwable e) {
            throw ei.ac(e, "mo.aj(" + ')');
        }
    }

    public void at() throws IOException {
        ap(948316225);
        this.aj.an(-426733167);
    }

    public void ac(long j) throws IOException {
        if (j < 0) {
            try {
                throw new IOException("");
            } catch (Throwable e) {
                throw ei.ac(e, "mo.ac(" + ')');
            }
        }
        this.ap = 2461272658603984169L * j;
    }

    public void aw(long j) throws IOException {
        if (j < 0) {
            throw new IOException("");
        }
        this.ap = 2461272658603984169L * j;
    }

    public long am() {
        return this.ah * 3996431944843165715L;
    }

    public long an(int i) {
        try {
            return this.ah * 3996431944843165715L;
        } catch (Throwable e) {
            throw ei.ac(e, "mo.an(" + ')');
        }
    }

    public void ae(byte[] bArr) throws IOException {
        ao(bArr, 0, bArr.length, 2113292697);
    }

    public void aq(byte[] bArr, int i) throws IOException {
        try {
            ao(bArr, 0, bArr.length, -1085220268);
        } catch (Throwable e) {
            throw ei.ac(e, "mo.aq(" + ')');
        }
    }

    public void ao(byte[] bArr, int i, int i2, int i3) throws IOException {
        try {
            if (i + i2 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException((i2 + i) - bArr.length);
            } else if (-7704750041457917913L * this.aa == -1 || this.ap * 2150214842999351065L < this.aa * -7704750041457917913L || ((long) i2) + (2150214842999351065L * this.ap) > ((long) (this.ak * -2110207779)) + (this.aa * -7704750041457917913L)) {
                int i4;
                int i5;
                int aa;
                long j = 2150214842999351065L * this.ap;
                if (2150214842999351065L * this.ap < this.an * -2937762031685166399L || 2150214842999351065L * this.ap >= ((long) (this.aq * -569598383)) + (-2937762031685166399L * this.an)) {
                    i4 = i2;
                    i5 = i;
                } else {
                    i4 = (int) (((long) (this.aq * -569598383)) - ((this.ap * 2150214842999351065L) - (this.an * -2937762031685166399L)));
                    if (i4 > i2) {
                        i4 = i2;
                    }
                    System.arraycopy(this.ac, (int) ((this.ap * 2150214842999351065L) - (this.an * -2937762031685166399L)), bArr, i, i4);
                    this.ap += ((long) i4) * 2461272658603984169L;
                    i5 = i + i4;
                    i4 = i2 - i4;
                }
                if (i4 > this.ac.length) {
                    this.aj.aj(this.ap * 2150214842999351065L);
                    this.ai = this.ap * 1691598566656684439L;
                    while (i4 > 0) {
                        aa = this.aj.aa(bArr, i5, i4, -142179420);
                        if (aa == -1) {
                            break;
                        }
                        this.ai += 6536432834236032047L * ((long) aa);
                        this.ap += ((long) aa) * 2461272658603984169L;
                        i5 += aa;
                        i4 -= aa;
                    }
                } else if (i4 > 0) {
                    aa(992965355);
                    if (i4 > this.aq * -569598383) {
                        aa = -569598383 * this.aq;
                    } else {
                        aa = i4;
                    }
                    System.arraycopy(this.ac, 0, bArr, i5, aa);
                    i5 += aa;
                    i4 -= aa;
                    this.ap += 2461272658603984169L * ((long) aa);
                }
                if (-1 != -7704750041457917913L * this.aa) {
                    if (this.aa * -7704750041457917913L > 2150214842999351065L * this.ap && i4 > 0) {
                        aa = ((int) ((-7704750041457917913L * this.aa) - (2150214842999351065L * this.ap))) + i5;
                        if (aa > i4 + i5) {
                            aa = i5 + i4;
                        }
                        while (i5 < aa) {
                            int i6 = i5 + 1;
                            bArr[i5] = (byte) 0;
                            i4--;
                            this.ap += 2461272658603984169L;
                            i5 = i6;
                        }
                    }
                    long j2 = -1;
                    long j3 = -1;
                    if (-7704750041457917913L * this.aa >= j && -7704750041457917913L * this.aa < ((long) i2) + j) {
                        j2 = this.aa * -7704750041457917913L;
                    } else if (j >= this.aa * -7704750041457917913L && j < (this.aa * -7704750041457917913L) + ((long) (this.ak * -2110207779))) {
                        j2 = j;
                    }
                    if ((-7704750041457917913L * this.aa) + ((long) (-2110207779 * this.ak)) > j && ((long) (-2110207779 * this.ak)) + (-7704750041457917913L * this.aa) <= ((long) i2) + j) {
                        j3 = (-7704750041457917913L * this.aa) + ((long) (-2110207779 * this.ak));
                    } else if (((long) i2) + j > this.aa * -7704750041457917913L && ((long) i2) + j <= ((long) (-2110207779 * this.ak)) + (this.aa * -7704750041457917913L)) {
                        j3 = ((long) i2) + j;
                    }
                    if (j2 > -1 && j3 > j2) {
                        Object obj = bArr;
                        System.arraycopy(this.ao, (int) (j2 - (this.aa * -7704750041457917913L)), obj, ((int) (j2 - j)) + i, (int) (j3 - j2));
                        if (j3 > this.ap * 2150214842999351065L) {
                            i4 = (int) (((long) i4) - (j3 - (2150214842999351065L * this.ap)));
                            this.ap = j3 * 2461272658603984169L;
                        }
                    }
                }
                if (i4 > 0) {
                    throw new EOFException();
                }
            } else {
                System.arraycopy(this.ao, (int) ((2150214842999351065L * this.ap) - (-7704750041457917913L * this.aa)), bArr, i, i2);
                this.ap += 2461272658603984169L * ((long) i2);
            }
        } catch (IOException e) {
            this.ai = -6536432834236032047L;
            throw e;
        } catch (Throwable e2) {
            throw ei.ac(e2, "mo.ao(" + ')');
        }
    }

    void aa(int i) throws IOException {
        try {
            this.aq = 0;
            if (this.ap * 2150214842999351065L != this.ai * -3824687609485122865L) {
                this.aj.aj(this.ap * 2150214842999351065L);
                this.ai = 1691598566656684439L * this.ap;
            }
            this.an = this.ap * -1257363241558058407L;
            while (this.aq * -569598383 < this.ac.length) {
                int aa = this.aj.aa(this.ac, this.aq * -569598383, this.ac.length - (this.aq * -569598383), -255447792);
                if (-1 != aa) {
                    this.ai += ((long) aa) * 6536432834236032047L;
                    this.aq = (aa * -1461097807) + this.aq;
                } else {
                    return;
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "mo.aa(" + ')');
        }
    }

    void af() throws IOException {
        this.aq = 0;
        if (this.ap * 2150214842999351065L != this.ai * -3824687609485122865L) {
            this.aj.aj(this.ap * 2150214842999351065L);
            this.ai = 1691598566656684439L * this.ap;
        }
        this.an = this.ap * -1257363241558058407L;
        while (this.aq * -569598383 < this.ac.length) {
            int aa = this.aj.aa(this.ac, this.aq * -569598383, this.ac.length - (this.aq * -569598383), 372813136);
            if (-1 != aa) {
                this.ai += ((long) aa) * 6536432834236032047L;
                this.aq = (aa * -1461097807) + this.aq;
            } else {
                return;
            }
        }
    }

    void al() throws IOException {
        this.aq = 0;
        if (this.ap * 2150214842999351065L != this.ai * -3824687609485122865L) {
            this.aj.aj(this.ap * 2150214842999351065L);
            this.ai = 1691598566656684439L * this.ap;
        }
        this.an = this.ap * -1257363241558058407L;
        while (this.aq * -569598383 < this.ac.length) {
            int aa = this.aj.aa(this.ac, this.aq * -569598383, this.ac.length - (this.aq * -569598383), 1925210364);
            if (-1 != aa) {
                this.ai += ((long) aa) * 6536432834236032047L;
                this.aq = (aa * -1461097807) + this.aq;
            } else {
                return;
            }
        }
    }

    void as() throws IOException {
        this.aq = 0;
        if (this.ap * 2150214842999351065L != this.ai * -3824687609485122865L) {
            this.aj.aj(this.ap * 2150214842999351065L);
            this.ai = 1691598566656684439L * this.ap;
        }
        this.an = this.ap * -1257363241558058407L;
        while (this.aq * -569598383 < this.ac.length) {
            int aa = this.aj.aa(this.ac, this.aq * -569598383, this.ac.length - (this.aq * -569598383), 72674078);
            if (-1 != aa) {
                this.ai += ((long) aa) * 6536432834236032047L;
                this.aq = (aa * -1461097807) + this.aq;
            } else {
                return;
            }
        }
    }

    void ax() throws IOException {
        this.aq = 0;
        if (this.ap * 2150214842999351065L != this.ai * -3824687609485122865L) {
            this.aj.aj(this.ap * 2150214842999351065L);
            this.ai = 1691598566656684439L * this.ap;
        }
        this.an = this.ap * -1257363241558058407L;
        while (this.aq * -569598383 < this.ac.length) {
            int aa = this.aj.aa(this.ac, this.aq * -569598383, this.ac.length - (this.aq * -569598383), 700846522);
            if (-1 != aa) {
                this.ai += ((long) aa) * 6536432834236032047L;
                this.aq = (aa * -222816480) + this.aq;
            } else {
                return;
            }
        }
    }

    void az() throws IOException {
        this.aq = 0;
        if (this.ap * 2150214842999351065L != this.ai * -3824687609485122865L) {
            this.aj.aj(this.ap * 2150214842999351065L);
            this.ai = 1691598566656684439L * this.ap;
        }
        this.an = this.ap * -1257363241558058407L;
        while (this.aq * -569598383 < this.ac.length) {
            int aa = this.aj.aa(this.ac, 1698204203 * this.aq, this.ac.length - (this.aq * -182283743), 783368204);
            if (-1 != aa) {
                this.ai += ((long) aa) * 6536432834236032047L;
                this.aq = (aa * -1461097807) + this.aq;
            } else {
                return;
            }
        }
    }

    public void ak(byte[] bArr, int i, int i2, byte b) throws IOException {
        try {
            if (((long) i2) + (2150214842999351065L * this.ap) > this.ah * 3996431944843165715L) {
                this.ah = 150671724852627995L * ((this.ap * 2150214842999351065L) + ((long) i2));
            }
            if (-1 != -7704750041457917913L * this.aa && (this.ap * 2150214842999351065L < -7704750041457917913L * this.aa || 2150214842999351065L * this.ap > (-7704750041457917913L * this.aa) + ((long) (this.ak * -2110207779)))) {
                ap(1825264131);
            }
            if (-1 != -7704750041457917913L * this.aa && (this.ap * 2150214842999351065L) + ((long) i2) > ((long) this.ao.length) + (-7704750041457917913L * this.aa)) {
                int length = (int) (((long) this.ao.length) - ((this.ap * 2150214842999351065L) - (this.aa * -7704750041457917913L)));
                System.arraycopy(bArr, i, this.ao, (int) ((this.ap * 2150214842999351065L) - (this.aa * -7704750041457917913L)), length);
                this.ap += 2461272658603984169L * ((long) length);
                i += length;
                i2 -= length;
                this.ak = this.ao.length * 1699762037;
                ap(-876619526);
            }
            if (i2 > this.ao.length) {
                if (2150214842999351065L * this.ap != -3824687609485122865L * this.ai) {
                    this.aj.aj(this.ap * 2150214842999351065L);
                    this.ai = 1691598566656684439L * this.ap;
                }
                this.aj.ac(bArr, i, i2, (short) -30554);
                this.ai += ((long) i2) * 6536432834236032047L;
                if (this.ai * -3824687609485122865L > this.at * 5203985513351176473L) {
                    this.at = this.ai * -9022773589617207257L;
                }
                long j = -1;
                long j2 = -1;
                if (2150214842999351065L * this.ap >= -2937762031685166399L * this.an && 2150214842999351065L * this.ap < ((long) (this.aq * -569598383)) + (-2937762031685166399L * this.an)) {
                    j = this.ap * 2150214842999351065L;
                } else if (this.an * -2937762031685166399L >= 2150214842999351065L * this.ap && this.an * -2937762031685166399L < ((long) i2) + (this.ap * 2150214842999351065L)) {
                    j = this.an * -2937762031685166399L;
                }
                if ((this.ap * 2150214842999351065L) + ((long) i2) > this.an * -2937762031685166399L && ((long) i2) + (this.ap * 2150214842999351065L) <= ((long) (-569598383 * this.aq)) + (-2937762031685166399L * this.an)) {
                    j2 = ((long) i2) + (2150214842999351065L * this.ap);
                } else if ((this.an * -2937762031685166399L) + ((long) (this.aq * -569598383)) > this.ap * 2150214842999351065L && ((long) (this.aq * -569598383)) + (this.an * -2937762031685166399L) <= (this.ap * 2150214842999351065L) + ((long) i2)) {
                    j2 = (this.an * -2937762031685166399L) + ((long) (-569598383 * this.aq));
                }
                if (j > -1 && j2 > j) {
                    System.arraycopy(bArr, (int) ((((long) i) + j) - (2150214842999351065L * this.ap)), this.ac, (int) (j - (-2937762031685166399L * this.an)), (int) (j2 - j));
                }
                this.ap += ((long) i2) * 2461272658603984169L;
            } else if (i2 > 0) {
                if (-1 == this.aa * -7704750041457917913L) {
                    this.aa = this.ap * 8468561801667864255L;
                }
                System.arraycopy(bArr, i, this.ao, (int) ((2150214842999351065L * this.ap) - (-7704750041457917913L * this.aa)), i2);
                this.ap += ((long) i2) * 2461272658603984169L;
                if ((this.ap * 2150214842999351065L) - (this.aa * -7704750041457917913L) > ((long) (this.ak * -2110207779))) {
                    this.ak = ((int) ((this.ap * 2150214842999351065L) - (this.aa * -7704750041457917913L))) * 1699762037;
                }
            }
        } catch (IOException e) {
            this.ai = -6536432834236032047L;
            throw e;
        } catch (Throwable e2) {
            throw ei.ac(e2, "mo.ak(" + ')');
        }
    }

    public void au(byte[] bArr, int i, int i2) throws IOException {
        try {
            if (((long) i2) + (2150214842999351065L * this.ap) > this.ah * 3996431944843165715L) {
                this.ah = 150671724852627995L * ((this.ap * 2150214842999351065L) + ((long) i2));
            }
            if (-1 != -7704750041457917913L * this.aa && (this.ap * 2150214842999351065L < -7704750041457917913L * this.aa || 2150214842999351065L * this.ap > (-7704750041457917913L * this.aa) + ((long) (this.ak * -2110207779)))) {
                ap(1094399951);
            }
            if (-1 != -7704750041457917913L * this.aa && (this.ap * 2150214842999351065L) + ((long) i2) > ((long) this.ao.length) + (-7704750041457917913L * this.aa)) {
                int length = (int) (((long) this.ao.length) - ((this.ap * 2150214842999351065L) - (this.aa * -7704750041457917913L)));
                System.arraycopy(bArr, i, this.ao, (int) ((this.ap * 2150214842999351065L) - (this.aa * -7704750041457917913L)), length);
                this.ap += 2461272658603984169L * ((long) length);
                i += length;
                i2 -= length;
                this.ak = this.ao.length * 1699762037;
                ap(1777958290);
            }
            if (i2 > this.ao.length) {
                if (2150214842999351065L * this.ap != -3824687609485122865L * this.ai) {
                    this.aj.aj(this.ap * 2150214842999351065L);
                    this.ai = 1691598566656684439L * this.ap;
                }
                this.aj.ac(bArr, i, i2, (short) -6687);
                this.ai += ((long) i2) * 6536432834236032047L;
                if (this.ai * -3824687609485122865L > this.at * 5203985513351176473L) {
                    this.at = this.ai * -9022773589617207257L;
                }
                long j = -1;
                long j2 = -1;
                if (2150214842999351065L * this.ap >= -2937762031685166399L * this.an && 2150214842999351065L * this.ap < ((long) (this.aq * -569598383)) + (-2937762031685166399L * this.an)) {
                    j = this.ap * 2150214842999351065L;
                } else if (this.an * -2937762031685166399L >= 2150214842999351065L * this.ap && this.an * -2937762031685166399L < ((long) i2) + (this.ap * 2150214842999351065L)) {
                    j = this.an * -2937762031685166399L;
                }
                if ((this.ap * 2150214842999351065L) + ((long) i2) > this.an * -2937762031685166399L && ((long) i2) + (this.ap * 2150214842999351065L) <= ((long) (-569598383 * this.aq)) + (-2937762031685166399L * this.an)) {
                    j2 = ((long) i2) + (2150214842999351065L * this.ap);
                } else if ((this.an * -2937762031685166399L) + ((long) (this.aq * -569598383)) > this.ap * 2150214842999351065L && ((long) (this.aq * -569598383)) + (this.an * -2937762031685166399L) <= (this.ap * 2150214842999351065L) + ((long) i2)) {
                    j2 = (this.an * -2937762031685166399L) + ((long) (-569598383 * this.aq));
                }
                if (j > -1 && j2 > j) {
                    System.arraycopy(bArr, (int) ((((long) i) + j) - (2150214842999351065L * this.ap)), this.ac, (int) (j - (-2937762031685166399L * this.an)), (int) (j2 - j));
                }
                this.ap += ((long) i2) * 2461272658603984169L;
            } else if (i2 > 0) {
                if (-1 == this.aa * -7704750041457917913L) {
                    this.aa = this.ap * 8468561801667864255L;
                }
                System.arraycopy(bArr, i, this.ao, (int) ((2150214842999351065L * this.ap) - (-7704750041457917913L * this.aa)), i2);
                this.ap += ((long) i2) * 2461272658603984169L;
                if ((this.ap * 2150214842999351065L) - (this.aa * -7704750041457917913L) > ((long) (this.ak * -2110207779))) {
                    this.ak = ((int) ((this.ap * 2150214842999351065L) - (this.aa * -7704750041457917913L))) * 1699762037;
                }
            }
        } catch (IOException e) {
            this.ai = -6536432834236032047L;
            throw e;
        }
    }

    public void av(byte[] bArr, int i, int i2) throws IOException {
        try {
            if (((long) i2) + (2150214842999351065L * this.ap) > this.ah * 3996431944843165715L) {
                this.ah = 150671724852627995L * ((this.ap * 2150214842999351065L) + ((long) i2));
            }
            if (-1 != -7704750041457917913L * this.aa && (this.ap * 2150214842999351065L < -7704750041457917913L * this.aa || 2150214842999351065L * this.ap > (-7704750041457917913L * this.aa) + ((long) (this.ak * -2110207779)))) {
                ap(755755595);
            }
            if (-1 != -7704750041457917913L * this.aa && (this.ap * 2150214842999351065L) + ((long) i2) > ((long) this.ao.length) + (-7704750041457917913L * this.aa)) {
                int length = (int) (((long) this.ao.length) - ((this.ap * 2150214842999351065L) - (this.aa * -7704750041457917913L)));
                System.arraycopy(bArr, i, this.ao, (int) ((this.ap * 2150214842999351065L) - (this.aa * -7704750041457917913L)), length);
                this.ap += 2461272658603984169L * ((long) length);
                i += length;
                i2 -= length;
                this.ak = this.ao.length * 1699762037;
                ap(-938066578);
            }
            if (i2 > this.ao.length) {
                if (2150214842999351065L * this.ap != -3824687609485122865L * this.ai) {
                    this.aj.aj(this.ap * 2150214842999351065L);
                    this.ai = 1691598566656684439L * this.ap;
                }
                this.aj.ac(bArr, i, i2, (short) -29200);
                this.ai += ((long) i2) * 6536432834236032047L;
                if (this.ai * -3824687609485122865L > this.at * 5203985513351176473L) {
                    this.at = this.ai * -9022773589617207257L;
                }
                long j = -1;
                long j2 = -1;
                if (2150214842999351065L * this.ap >= -2937762031685166399L * this.an && 2150214842999351065L * this.ap < ((long) (this.aq * -569598383)) + (-2937762031685166399L * this.an)) {
                    j = this.ap * 2150214842999351065L;
                } else if (this.an * -2937762031685166399L >= 2150214842999351065L * this.ap && this.an * -2937762031685166399L < ((long) i2) + (this.ap * 2150214842999351065L)) {
                    j = this.an * -2937762031685166399L;
                }
                if ((this.ap * 2150214842999351065L) + ((long) i2) > this.an * -2937762031685166399L && ((long) i2) + (this.ap * 2150214842999351065L) <= ((long) (-569598383 * this.aq)) + (-2937762031685166399L * this.an)) {
                    j2 = ((long) i2) + (2150214842999351065L * this.ap);
                } else if ((this.an * -2937762031685166399L) + ((long) (this.aq * -569598383)) > this.ap * 2150214842999351065L && ((long) (this.aq * -569598383)) + (this.an * -2937762031685166399L) <= (this.ap * 2150214842999351065L) + ((long) i2)) {
                    j2 = (this.an * -2937762031685166399L) + ((long) (-569598383 * this.aq));
                }
                if (j > -1 && j2 > j) {
                    System.arraycopy(bArr, (int) ((((long) i) + j) - (2150214842999351065L * this.ap)), this.ac, (int) (j - (-2937762031685166399L * this.an)), (int) (j2 - j));
                }
                this.ap += ((long) i2) * 2461272658603984169L;
            } else if (i2 > 0) {
                if (-1 == this.aa * -7704750041457917913L) {
                    this.aa = this.ap * 8468561801667864255L;
                }
                System.arraycopy(bArr, i, this.ao, (int) ((2150214842999351065L * this.ap) - (-7704750041457917913L * this.aa)), i2);
                this.ap += ((long) i2) * 2461272658603984169L;
                if ((this.ap * 2150214842999351065L) - (this.aa * -7704750041457917913L) > ((long) (this.ak * -2110207779))) {
                    this.ak = ((int) ((this.ap * 2150214842999351065L) - (this.aa * -7704750041457917913L))) * 1699762037;
                }
            }
        } catch (IOException e) {
            this.ai = -6536432834236032047L;
            throw e;
        }
    }

    public void ay(byte[] bArr, int i, int i2) throws IOException {
        try {
            if (((long) i2) + (2150214842999351065L * this.ap) > this.ah * 3996431944843165715L) {
                this.ah = 150671724852627995L * ((this.ap * 2150214842999351065L) + ((long) i2));
            }
            if (-1 != -7704750041457917913L * this.aa && (this.ap * 2150214842999351065L < -7704750041457917913L * this.aa || 2150214842999351065L * this.ap > (-7704750041457917913L * this.aa) + ((long) (this.ak * -2110207779)))) {
                ap(-248540817);
            }
            if (-1 != -7704750041457917913L * this.aa && (this.ap * 2150214842999351065L) + ((long) i2) > ((long) this.ao.length) + (-7704750041457917913L * this.aa)) {
                int length = (int) (((long) this.ao.length) - ((this.ap * 2150214842999351065L) - (this.aa * -7704750041457917913L)));
                System.arraycopy(bArr, i, this.ao, (int) ((this.ap * 2150214842999351065L) - (this.aa * -7704750041457917913L)), length);
                this.ap += 2461272658603984169L * ((long) length);
                i += length;
                i2 -= length;
                this.ak = this.ao.length * -1426768616;
                ap(1823163686);
            }
            if (i2 > this.ao.length) {
                if (2150214842999351065L * this.ap != -3824687609485122865L * this.ai) {
                    this.aj.aj(this.ap * 2150214842999351065L);
                    this.ai = 1691598566656684439L * this.ap;
                }
                this.aj.ac(bArr, i, i2, (short) -23286);
                this.ai += ((long) i2) * 6536432834236032047L;
                if (this.ai * -3824687609485122865L > this.at * 5203985513351176473L) {
                    this.at = this.ai * -9022773589617207257L;
                }
                long j = -1;
                long j2 = -1;
                if (2150214842999351065L * this.ap >= -2937762031685166399L * this.an && 2150214842999351065L * this.ap < ((long) (this.aq * -569598383)) + (-2937762031685166399L * this.an)) {
                    j = this.ap * 2150214842999351065L;
                } else if (this.an * -2937762031685166399L >= 2150214842999351065L * this.ap && this.an * -2937762031685166399L < ((long) i2) + (this.ap * 2150214842999351065L)) {
                    j = this.an * -2937762031685166399L;
                }
                if ((this.ap * 2150214842999351065L) + ((long) i2) > this.an * -2937762031685166399L && ((long) i2) + (this.ap * 2150214842999351065L) <= ((long) (-569598383 * this.aq)) + (-2937762031685166399L * this.an)) {
                    j2 = ((long) i2) + (2150214842999351065L * this.ap);
                } else if ((this.an * -2937762031685166399L) + ((long) (this.aq * -569598383)) > this.ap * 2150214842999351065L && ((long) (this.aq * -569598383)) + (this.an * -2937762031685166399L) <= (this.ap * 2150214842999351065L) + ((long) i2)) {
                    j2 = (this.an * -2937762031685166399L) + ((long) (1236529326 * this.aq));
                }
                if (j > -1 && j2 > j) {
                    System.arraycopy(bArr, (int) ((((long) i) + j) - (2150214842999351065L * this.ap)), this.ac, (int) (j - (-2937762031685166399L * this.an)), (int) (j2 - j));
                }
                this.ap += ((long) i2) * 2461272658603984169L;
            } else if (i2 > 0) {
                if (-1 == this.aa * -7704750041457917913L) {
                    this.aa = this.ap * 8468561801667864255L;
                }
                System.arraycopy(bArr, i, this.ao, (int) ((2150214842999351065L * this.ap) - (-7704750041457917913L * this.aa)), i2);
                this.ap += ((long) i2) * 2461272658603984169L;
                if ((this.ap * 2150214842999351065L) - (this.aa * -7704750041457917913L) > ((long) (this.ak * -2110207779))) {
                    this.ak = ((int) ((this.ap * 2150214842999351065L) - (this.aa * -7704750041457917913L))) * 1699762037;
                }
            }
        } catch (IOException e) {
            this.ai = -6536432834236032047L;
            throw e;
        }
    }

    void ad() throws IOException {
        if (-1 != this.aa * -7704750041457917913L) {
            if (-7704750041457917913L * this.aa != this.ai * -3824687609485122865L) {
                this.aj.aj(-7704750041457917913L * this.aa);
                this.ai = this.aa * 4310359026211849001L;
            }
            this.aj.ac(this.ao, 0, this.ak * 1352805467, (short) -3470);
            this.ai += ((long) this.ak) * -4008547663164705645L;
            if (-3824687609485122865L * this.ai > this.at * 5203985513351176473L) {
                this.at = this.ai * -9022773589617207257L;
            }
            long j = -1;
            long j2 = -1;
            if (this.aa * -7704750041457917913L >= this.an * -2937762031685166399L && this.aa * -7704750041457917913L < ((long) (this.aq * -811797245)) + (this.an * -2937762031685166399L)) {
                j = this.aa * -7704750041457917913L;
            } else if (this.an * -2937762031685166399L >= -7704750041457917913L * this.aa && this.an * -2937762031685166399L < (this.aa * -7704750041457917913L) + ((long) (1203746768 * this.ak))) {
                j = -2937762031685166399L * this.an;
            }
            if (((long) (1345312280 * this.ak)) + (this.aa * -7704750041457917913L) > -2937762031685166399L * this.an && (-7704750041457917913L * this.aa) + ((long) (-2110207779 * this.ak)) <= (this.an * -2937762031685166399L) + ((long) (-569598383 * this.aq))) {
                j2 = ((long) (this.ak * -2110207779)) + (this.aa * -7704750041457917913L);
            } else if ((this.an * -2937762031685166399L) + ((long) (this.aq * -569598383)) > this.aa * -7704750041457917913L && ((long) (this.aq * -569598383)) + (-2937762031685166399L * this.an) <= (this.aa * -7704750041457917913L) + ((long) (this.ak * 786628574))) {
                j2 = (this.an * -2937762031685166399L) + ((long) (-569598383 * this.aq));
            }
            if (j > -1 && j2 > j) {
                System.arraycopy(this.ao, (int) (j - (this.aa * -7704750041457917913L)), this.ac, (int) (j - (-2937762031685166399L * this.an)), (int) (j2 - j));
            }
            this.aa = -7934910975904837527L;
            this.ak = 0;
        }
    }

    void ag() throws IOException {
        if (-1 != this.aa * -7704750041457917913L) {
            if (-7704750041457917913L * this.aa != this.ai * -3824687609485122865L) {
                this.aj.aj(-7704750041457917913L * this.aa);
                this.ai = this.aa * 4310359026211849001L;
            }
            this.aj.ac(this.ao, 0, this.ak * -2110207779, (short) -4861);
            this.ai += ((long) this.ak) * -4008547663164705645L;
            if (-3824687609485122865L * this.ai > this.at * 5203985513351176473L) {
                this.at = this.ai * -9022773589617207257L;
            }
            long j = -1;
            long j2 = -1;
            if (this.aa * -7704750041457917913L >= this.an * -2937762031685166399L && this.aa * -7704750041457917913L < ((long) (this.aq * -569598383)) + (this.an * -2937762031685166399L)) {
                j = this.aa * -7704750041457917913L;
            } else if (this.an * -2937762031685166399L >= -7704750041457917913L * this.aa && this.an * -2937762031685166399L < (this.aa * -7704750041457917913L) + ((long) (-2110207779 * this.ak))) {
                j = -2937762031685166399L * this.an;
            }
            if (((long) (-2110207779 * this.ak)) + (this.aa * -7704750041457917913L) > -2937762031685166399L * this.an && (-7704750041457917913L * this.aa) + ((long) (-311631503 * this.ak)) <= (this.an * -2937762031685166399L) + ((long) (-569598383 * this.aq))) {
                j2 = ((long) (this.ak * -2125285224)) + (this.aa * -7704750041457917913L);
            } else if ((this.an * -2937762031685166399L) + ((long) (this.aq * -569598383)) > this.aa * -7704750041457917913L && ((long) (this.aq * 2089578504)) + (-2937762031685166399L * this.an) <= (this.aa * -7704750041457917913L) + ((long) (this.ak * -2110207779))) {
                j2 = (this.an * -2937762031685166399L) + ((long) (1435073013 * this.aq));
            }
            if (j > -1 && j2 > j) {
                System.arraycopy(this.ao, (int) (j - (this.aa * -7704750041457917913L)), this.ac, (int) (j - (-2937762031685166399L * this.an)), (int) (j2 - j));
            }
            this.aa = -7934910975904837527L;
            this.ak = 0;
        }
    }

    void ap(int i) throws IOException {
        try {
            if (-1 != this.aa * -7704750041457917913L) {
                if (-7704750041457917913L * this.aa != this.ai * -3824687609485122865L) {
                    this.aj.aj(-7704750041457917913L * this.aa);
                    this.ai = this.aa * 4310359026211849001L;
                }
                this.aj.ac(this.ao, 0, this.ak * -2110207779, (short) -1098);
                this.ai += ((long) this.ak) * -4008547663164705645L;
                if (-3824687609485122865L * this.ai > this.at * 5203985513351176473L) {
                    this.at = this.ai * -9022773589617207257L;
                }
                long j = -1;
                long j2 = -1;
                if (this.aa * -7704750041457917913L >= this.an * -2937762031685166399L && this.aa * -7704750041457917913L < ((long) (this.aq * -569598383)) + (this.an * -2937762031685166399L)) {
                    j = this.aa * -7704750041457917913L;
                } else if (this.an * -2937762031685166399L >= -7704750041457917913L * this.aa && this.an * -2937762031685166399L < (this.aa * -7704750041457917913L) + ((long) (-2110207779 * this.ak))) {
                    j = -2937762031685166399L * this.an;
                }
                if (((long) (-2110207779 * this.ak)) + (this.aa * -7704750041457917913L) > -2937762031685166399L * this.an && (-7704750041457917913L * this.aa) + ((long) (-2110207779 * this.ak)) <= (this.an * -2937762031685166399L) + ((long) (-569598383 * this.aq))) {
                    j2 = ((long) (this.ak * -2110207779)) + (this.aa * -7704750041457917913L);
                } else if ((this.an * -2937762031685166399L) + ((long) (this.aq * -569598383)) > this.aa * -7704750041457917913L && ((long) (this.aq * -569598383)) + (-2937762031685166399L * this.an) <= (this.aa * -7704750041457917913L) + ((long) (this.ak * -2110207779))) {
                    j2 = (this.an * -2937762031685166399L) + ((long) (-569598383 * this.aq));
                }
                if (j > -1 && j2 > j) {
                    System.arraycopy(this.ao, (int) (j - (this.aa * -7704750041457917913L)), this.ac, (int) (j - (-2937762031685166399L * this.an)), (int) (j2 - j));
                }
                this.aa = -7934910975904837527L;
                this.ak = 0;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "mo.ap(" + ')');
        }
    }

    void ar() throws IOException {
        if (-1 != this.aa * -7704750041457917913L) {
            if (-7704750041457917913L * this.aa != this.ai * -3824687609485122865L) {
                this.aj.aj(-7704750041457917913L * this.aa);
                this.ai = this.aa * 4310359026211849001L;
            }
            this.aj.ac(this.ao, 0, this.ak * -2110207779, (short) -1845);
            this.ai += ((long) this.ak) * -4008547663164705645L;
            if (-3824687609485122865L * this.ai > this.at * 5203985513351176473L) {
                this.at = this.ai * -9022773589617207257L;
            }
            long j = -1;
            long j2 = -1;
            if (this.aa * -7704750041457917913L >= this.an * -2937762031685166399L && this.aa * -7704750041457917913L < ((long) (this.aq * -569598383)) + (this.an * -2937762031685166399L)) {
                j = this.aa * -7704750041457917913L;
            } else if (this.an * -2937762031685166399L >= -7704750041457917913L * this.aa && this.an * -2937762031685166399L < (this.aa * -7704750041457917913L) + ((long) (-2110207779 * this.ak))) {
                j = -2937762031685166399L * this.an;
            }
            if (((long) (-2110207779 * this.ak)) + (this.aa * -7704750041457917913L) > -2937762031685166399L * this.an && (-7704750041457917913L * this.aa) + ((long) (-2110207779 * this.ak)) <= (this.an * -2937762031685166399L) + ((long) (-569598383 * this.aq))) {
                j2 = ((long) (this.ak * -2110207779)) + (this.aa * -7704750041457917913L);
            } else if ((this.an * -2937762031685166399L) + ((long) (this.aq * -569598383)) > this.aa * -7704750041457917913L && ((long) (this.aq * -569598383)) + (-2937762031685166399L * this.an) <= (this.aa * -7704750041457917913L) + ((long) (this.ak * -2110207779))) {
                j2 = (this.an * -2937762031685166399L) + ((long) (-569598383 * this.aq));
            }
            if (j > -1 && j2 > j) {
                System.arraycopy(this.ao, (int) (j - (this.aa * -7704750041457917913L)), this.ac, (int) (j - (-2937762031685166399L * this.an)), (int) (j2 - j));
            }
            this.aa = -7934910975904837527L;
            this.ak = 0;
        }
    }
}
