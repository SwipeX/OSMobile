package defpackage;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

public final class md {
    long ac;
    RandomAccessFile aj;
    long an;

    public md(File file, String str, long j) throws IOException {
        try {
            if (-1 == j) {
                j = Long.MAX_VALUE;
            }
            if (file.length() >= j) {
                file.delete();
            }
            this.aj = new RandomAccessFile(file, str);
            this.ac = -4893789859586033485L * j;
            this.an = 0;
            int read = this.aj.read();
            if (!(-1 == read || str.equals("r"))) {
                this.aj.seek(0);
                this.aj.write(read);
            }
            this.aj.seek(0);
        } catch (Throwable e) {
            throw ei.ac(e, "md.<init>(" + ')');
        }
    }

    final void aj(long j) throws IOException {
        try {
            this.aj.seek(j);
            this.an = 6567757730599844523L * j;
        } catch (Throwable e) {
            throw ei.ac(e, "md.aj(" + ')');
        }
    }

    final void ak(long j) throws IOException {
        this.aj.seek(j);
        this.an = 6567757730599844523L * j;
    }

    final void ap(long j) throws IOException {
        this.aj.seek(j);
        this.an = 6567757730599844523L * j;
    }

    final void at(long j) throws IOException {
        this.aj.seek(j);
        this.an = 6567757730599844523L * j;
    }

    public final void ac(byte[] bArr, int i, int i2, short s) throws IOException {
        try {
            if (((long) i2) + (this.an * 7793147773103075331L) > this.ac * 2771595870862718587L) {
                this.aj.seek(1 + (this.ac * 2771595870862718587L));
                this.aj.write(1);
                throw new EOFException();
            }
            this.aj.write(bArr, i, i2);
            this.an += ((long) i2) * 6567757730599844523L;
        } catch (Throwable e) {
            throw ei.ac(e, "md.ac(" + ')');
        }
    }

    public final void ah(byte[] bArr, int i, int i2) throws IOException {
        if (((long) i2) + (this.an * 7793147773103075331L) > this.ac * 2771595870862718587L) {
            this.aj.seek(1 + (this.ac * 2771595870862718587L));
            this.aj.write(1);
            throw new EOFException();
        }
        this.aj.write(bArr, i, i2);
        this.an += ((long) i2) * 6567757730599844523L;
    }

    public final void ai(byte[] bArr, int i, int i2) throws IOException {
        if (((long) i2) + (this.an * 7793147773103075331L) > this.ac * 2771595870862718587L) {
            this.aj.seek(1 + (this.ac * 2771595870862718587L));
            this.aj.write(1);
            throw new EOFException();
        }
        this.aj.write(bArr, i, i2);
        this.an += ((long) i2) * 6567757730599844523L;
    }

    public final void aw(byte[] bArr, int i, int i2) throws IOException {
        if (((long) i2) + (this.an * 7793147773103075331L) > this.ac * 2771595870862718587L) {
            this.aj.seek(1 + (this.ac * 2771595870862718587L));
            this.aj.write(1);
            throw new EOFException();
        }
        this.aj.write(bArr, i, i2);
        this.an += ((long) i2) * 6567757730599844523L;
    }

    public final void am() throws IOException {
        aq(false, -850857684);
    }

    public final void an(int i) throws IOException {
        try {
            aq(false, 1727972827);
        } catch (Throwable e) {
            throw ei.ac(e, "md.an(" + ')');
        }
    }

    public final void aq(boolean z, int i) throws IOException {
        try {
            if (this.aj != null) {
                if (z) {
                    try {
                        this.aj.getFD().sync();
                    } catch (SyncFailedException e) {
                    }
                }
                this.aj.close();
                this.aj = null;
            }
        } catch (Throwable e2) {
            throw ei.ac(e2, "md.aq(" + ')');
        }
    }

    public static final void bb(double d, int i, int i2, int i3) {
        try {
            double random = d + ((Math.random() * 0.03d) - 0.015d);
            int i4 = i * cj.ak;
            while (i < i2) {
                double d2 = 0.0078125d + (((double) (i >> 3)) / 64.0d);
                double d3 = 0.0625d + (((double) (i & 7)) / 8.0d);
                int i5 = 0;
                int i6 = i4;
                while (i5 < cj.ak) {
                    double d4;
                    double d5;
                    double d6 = ((double) i5) / 128.0d;
                    if (0.0d != d3) {
                        double d7;
                        if (d6 < 0.5d) {
                            d4 = (1.0d + d3) * d6;
                        } else {
                            d4 = (d3 + d6) - (d6 * d3);
                        }
                        d5 = (d6 * 2.0d) - d4;
                        d6 = 0.3333333333333333d + d2;
                        if (d6 > 1.0d) {
                            d6 -= 1.0d;
                        }
                        double d8 = d2 - 0.3333333333333333d;
                        if (d8 < 0.0d) {
                            d7 = d8 + 1.0d;
                        } else {
                            d7 = d8;
                        }
                        d8 = 6.0d * d6 < 1.0d ? (d6 * (6.0d * (d4 - d5))) + d5 : 2.0d * d6 < 1.0d ? d4 : 3.0d * d6 < 2.0d ? (((0.6666666666666666d - d6) * (d4 - d5)) * 6.0d) + d5 : d5;
                        d6 = 6.0d * d2 < 1.0d ? ((6.0d * (d4 - d5)) * d2) + d5 : 2.0d * d2 < 1.0d ? d4 : 3.0d * d2 < 2.0d ? (((d4 - d5) * (0.6666666666666666d - d2)) * 6.0d) + d5 : d5;
                        if (6.0d * d7 < 1.0d) {
                            d4 = (((d4 - d5) * 6.0d) * d7) + d5;
                            d5 = d8;
                        } else if (2.0d * d7 < 1.0d) {
                            d5 = d8;
                        } else if (3.0d * d7 < 2.0d) {
                            d4 = (((d4 - d5) * (0.6666666666666666d - d7)) * 6.0d) + d5;
                            d5 = d8;
                        } else {
                            d4 = d5;
                            d5 = d8;
                        }
                    } else {
                        d4 = d6;
                        d5 = d6;
                    }
                    int i7 = ((int) (d4 * 256.0d)) + ((((int) (d6 * 256.0d)) << 8) + (((int) (d5 * 256.0d)) << 16));
                    i7 = (i7 & -16777216) | (((((int) (Math.pow(((double) ((i7 >> 16) & 255)) / 256.0d, random) * 256.0d)) << 16) + (((int) (256.0d * Math.pow(((double) ((i7 >> 8) & 255)) / 256.0d, random))) << 8)) + ((int) (256.0d * Math.pow(((double) (i7 & 255)) / 256.0d, random))));
                    if (i7 == 0) {
                        i7 = 1;
                    }
                    i4 = i6 + 1;
                    bl.am[i6] = i7;
                    i5++;
                    i6 = i4;
                }
                i++;
                i4 = i6;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "md.bb(" + ')');
        }
    }

    public final long ae() throws IOException {
        return this.aj.length();
    }

    public final long ao(int i) throws IOException {
        try {
            return this.aj.length();
        } catch (Throwable e) {
            throw ei.ac(e, "md.ao(" + ')');
        }
    }

    public final int aa(byte[] bArr, int i, int i2, int i3) throws IOException {
        try {
            int read = this.aj.read(bArr, i, i2);
            if (read > 0) {
                this.an += 6567757730599844523L * ((long) read);
            }
            return read;
        } catch (Throwable e) {
            throw ei.ac(e, "md.aa(" + ')');
        }
    }

    public final int as(byte[] bArr, int i, int i2) throws IOException {
        int read = this.aj.read(bArr, i, i2);
        if (read > 0) {
            this.an += 6567757730599844523L * ((long) read);
        }
        return read;
    }

    protected void aad() throws Throwable {
        if (this.aj != null) {
            System.out.println("");
            an(-979738843);
        }
    }

    protected void aaq() throws Throwable {
        if (this.aj != null) {
            System.out.println("");
            an(-286073318);
        }
    }

    protected void aax() throws Throwable {
        if (this.aj != null) {
            System.out.println("");
            an(-2124649615);
        }
    }

    protected void finalize() throws Throwable {
        try {
            if (this.aj != null) {
                System.out.println("");
                an(-2010745135);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "md.finalize(" + ')');
        }
    }

    protected void za() throws Throwable {
        if (this.aj != null) {
            System.out.println("");
            an(901264296);
        }
    }

    protected void zy() throws Throwable {
        if (this.aj != null) {
            System.out.println("");
            an(-656836140);
        }
    }
}
