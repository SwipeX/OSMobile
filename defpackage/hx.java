package defpackage;

public class hx {
    static ir at = null;
    static final int bj = 43;
    public static final int br = 37;
    byte[] ac;
    int[] aj;
    int[] an;

    public hx(byte[] bArr) {
        try {
            int length = bArr.length;
            this.aj = new int[length];
            this.ac = bArr;
            int[] iArr = new int[33];
            this.an = new int[8];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                byte b = bArr[i2];
                if (b != (byte) 0) {
                    int i3;
                    int i4;
                    int i5 = 1 << (32 - b);
                    int i6 = iArr[b];
                    this.aj[i2] = i6;
                    if ((i6 & i5) == 0) {
                        i3 = i6 | i5;
                        i5 = b - 1;
                        while (i5 >= 1) {
                            int i7 = iArr[i5];
                            if (i6 != i7) {
                                break;
                            }
                            i4 = 1 << (32 - i5);
                            if ((i7 & i4) != 0) {
                                iArr[i5] = iArr[i5 - 1];
                                break;
                            } else {
                                iArr[i5] = i7 | i4;
                                i5--;
                            }
                        }
                    } else {
                        i3 = iArr[b - 1];
                    }
                    iArr[b] = i3;
                    for (i5 = b + 1; i5 <= 32; i5++) {
                        if (i6 == iArr[i5]) {
                            iArr[i5] = i3;
                        }
                    }
                    i3 = 0;
                    for (byte b2 = (byte) 0; b2 < b; b2++) {
                        i4 = Integer.MIN_VALUE >>> b2;
                        if ((i6 & i4) != 0) {
                            if (this.an[i3] == 0) {
                                this.an[i3] = i;
                            }
                            i3 = this.an[i3];
                        } else {
                            i3++;
                        }
                        if (i3 >= this.an.length) {
                            int[] iArr2 = new int[(this.an.length * 2)];
                            for (i5 = 0; i5 < this.an.length; i5++) {
                                iArr2[i5] = this.an[i5];
                            }
                            this.an = iArr2;
                        }
                        i5 = i4 >>> 1;
                    }
                    this.an[i3] = i2 ^ -1;
                    if (i3 >= i) {
                        i = i3 + 1;
                    }
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "hx.<init>(" + ')');
        }
    }

    public int aj(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int i5 = i2 + i;
        int i6 = 0;
        int i7 = i3 << 3;
        while (i < i5) {
            int i8 = bArr[i] & 255;
            int i9 = this.aj[i8];
            byte b = this.ac[i8];
            if (b == (byte) 0) {
                throw new RuntimeException("");
            }
            int i10 = i7 >> 3;
            int i11 = i7 & 7;
            i6 &= (-i11) >> 31;
            int i12 = (((i11 + b) - 1) >> 3) + i10;
            i11 += 24;
            i6 |= i9 >>> i11;
            try {
                bArr2[i10] = (byte) i6;
                if (i10 < i12) {
                    i10++;
                    i11 -= 8;
                    i6 = i9 >>> i11;
                    bArr2[i10] = (byte) i6;
                    if (i10 < i12) {
                        i10++;
                        i11 -= 8;
                        i6 = i9 >>> i11;
                        bArr2[i10] = (byte) i6;
                        if (i10 < i12) {
                            i10++;
                            i11 -= 8;
                            i6 = i9 >>> i11;
                            bArr2[i10] = (byte) i6;
                            if (i10 < i12) {
                                i6 = i9 << (-(i11 - 8));
                                bArr2[i10 + 1] = (byte) i6;
                            }
                        }
                    }
                }
                i7 += b;
                i++;
            } catch (Throwable e) {
                throw ei.ac(e, "hx.aj(" + ')');
            }
        }
        return ((i7 + 7) >> 3) - i3;
    }

    public int an(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = i2 + i;
        int i5 = 0;
        int i6 = i3 << 3;
        while (i < i4) {
            int i7 = bArr[i] & 255;
            int i8 = this.aj[i7];
            byte b = this.ac[i7];
            if (b == (byte) 0) {
                throw new RuntimeException("");
            }
            int i9 = i6 >> 3;
            int i10 = i6 & 7;
            i5 &= (-i10) >> -2093075784;
            int i11 = (((i10 + b) - 1) >> 3) + i9;
            i10 += 24;
            i5 |= i8 >>> i10;
            bArr2[i9] = (byte) i5;
            if (i9 < i11) {
                i9++;
                i10 -= 8;
                i5 = i8 >>> i10;
                bArr2[i9] = (byte) i5;
                if (i9 < i11) {
                    i9++;
                    i10 -= 8;
                    i5 = i8 >>> i10;
                    bArr2[i9] = (byte) i5;
                    if (i9 < i11) {
                        i9++;
                        i10 -= 8;
                        i5 = i8 >>> i10;
                        bArr2[i9] = (byte) i5;
                        if (i9 < i11) {
                            i5 = i8 << (-(i10 - 8));
                            bArr2[i9 + 1] = (byte) i5;
                        }
                    }
                }
            }
            i6 += b;
            i++;
        }
        return ((i6 + 7) >> 3) - i3;
    }

    public int aq(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = i2 + i;
        int i5 = 0;
        int i6 = i3 << 3;
        while (i < i4) {
            int i7 = bArr[i] & 255;
            int i8 = this.aj[i7];
            byte b = this.ac[i7];
            if (b == (byte) 0) {
                throw new RuntimeException("");
            }
            int i9 = i6 >> 3;
            int i10 = i6 & 7;
            i5 &= (-i10) >> 31;
            int i11 = (((i10 + b) - 1) >> 3) + i9;
            i10 += 24;
            i5 |= i8 >>> i10;
            bArr2[i9] = (byte) i5;
            if (i9 < i11) {
                i9++;
                i10 -= 8;
                i5 = i8 >>> i10;
                bArr2[i9] = (byte) i5;
                if (i9 < i11) {
                    i9++;
                    i10 -= 8;
                    i5 = i8 >>> i10;
                    bArr2[i9] = (byte) i5;
                    if (i9 < i11) {
                        i9++;
                        i10 -= 8;
                        i5 = i8 >>> i10;
                        bArr2[i9] = (byte) i5;
                        if (i9 < i11) {
                            i5 = i8 << (-(i10 - 8));
                            bArr2[i9 + 1] = (byte) i5;
                        }
                    }
                }
            }
            i6 += b;
            i++;
        }
        return ((i6 + 7) >> 3) - i3;
    }

    public int ac(byte[] bArr, int i, byte[] bArr2, int i2, int i3, byte b) {
        if (i3 == 0) {
            return 0;
        }
        int i4 = i3 + i2;
        int i5 = i;
        int i6 = 0;
        int i7 = i2;
        while (true) {
            byte b2 = bArr[i5];
            if (b2 < (byte) 0) {
                i6 = this.an[i6];
            } else {
                i6++;
            }
            int i8 = this.an[i6];
            int i9;
            if (i8 < 0) {
                i9 = i7 + 1;
                bArr2[i7] = (byte) (i8 ^ -1);
                if (i9 >= i4) {
                    break;
                }
                i6 = 0;
                if ((b2 & 64) == 0) {
                    i6 = this.an[i6];
                } else {
                    i6++;
                }
                try {
                    i8 = this.an[i6];
                    if (i8 < 0) {
                        i7 = i9 + 1;
                        bArr2[i9] = (byte) (i8 ^ -1);
                        if (i7 >= i4) {
                            break;
                        }
                        i6 = 0;
                    } else {
                        i7 = i9;
                    }
                    if ((b2 & 32) == 0) {
                        i6 = this.an[i6];
                    } else {
                        i6++;
                    }
                    i8 = this.an[i6];
                    if (i8 >= 0) {
                        i9 = i7 + 1;
                        bArr2[i7] = (byte) (i8 ^ -1);
                        if (i9 < i4) {
                            break;
                        }
                        i6 = 0;
                    } else {
                        i9 = i7;
                    }
                    if ((b2 & 16) == 0) {
                        i6 = this.an[i6];
                    } else {
                        i6++;
                    }
                    i8 = this.an[i6];
                    if (i8 >= 0) {
                        i7 = i9 + 1;
                        bArr2[i9] = (byte) (i8 ^ -1);
                        if (i7 < i4) {
                            break;
                        }
                        i6 = 0;
                    } else {
                        i7 = i9;
                    }
                    if ((b2 & 8) == 0) {
                        i6 = this.an[i6];
                    } else {
                        i6++;
                    }
                    i8 = this.an[i6];
                    if (i8 < 0) {
                        i9 = i7 + 1;
                        bArr2[i7] = (byte) (i8 ^ -1);
                        if (i9 >= i4) {
                            break;
                        }
                        i6 = 0;
                    } else {
                        i9 = i7;
                    }
                    if ((b2 & 4) == 0) {
                        i6 = this.an[i6];
                    } else {
                        i6++;
                    }
                    i8 = this.an[i6];
                    if (i8 >= 0) {
                        i7 = i9 + 1;
                        bArr2[i9] = (byte) (i8 ^ -1);
                        if (i7 < i4) {
                            break;
                        }
                        i6 = 0;
                    } else {
                        i7 = i9;
                    }
                    if ((b2 & 2) == 0) {
                        i6 = this.an[i6];
                    } else {
                        i6++;
                    }
                    i8 = this.an[i6];
                    if (i8 >= 0) {
                        i9 = i7 + 1;
                        bArr2[i7] = (byte) (i8 ^ -1);
                        if (i9 < i4) {
                            break;
                        }
                        i6 = 0;
                    } else {
                        i9 = i7;
                    }
                    if ((b2 & 1) == 0) {
                        i6 = this.an[i6];
                    } else {
                        i6++;
                    }
                    i7 = this.an[i6];
                    if (i7 < 0) {
                        i6 = i9 + 1;
                        bArr2[i9] = (byte) (i7 ^ -1);
                        if (i6 < i4) {
                            break;
                        }
                        i9 = i6;
                        i6 = 0;
                    }
                    i5++;
                    i7 = i9;
                } catch (Throwable e) {
                    throw ei.ac(e, "hx.ac(" + ')');
                }
            }
            i9 = i7;
            if ((b2 & 64) == 0) {
                i6++;
            } else {
                i6 = this.an[i6];
            }
            i8 = this.an[i6];
            if (i8 < 0) {
                i7 = i9 + 1;
                bArr2[i9] = (byte) (i8 ^ -1);
                if (i7 >= i4) {
                    break;
                }
                i6 = 0;
            } else {
                i7 = i9;
            }
            if ((b2 & 32) == 0) {
                i6++;
            } else {
                i6 = this.an[i6];
            }
            i8 = this.an[i6];
            if (i8 >= 0) {
                i9 = i7;
            } else {
                i9 = i7 + 1;
                bArr2[i7] = (byte) (i8 ^ -1);
                if (i9 < i4) {
                    break;
                }
                i6 = 0;
            }
            if ((b2 & 16) == 0) {
                i6++;
            } else {
                i6 = this.an[i6];
            }
            i8 = this.an[i6];
            if (i8 >= 0) {
                i7 = i9;
            } else {
                i7 = i9 + 1;
                bArr2[i9] = (byte) (i8 ^ -1);
                if (i7 < i4) {
                    break;
                }
                i6 = 0;
            }
            if ((b2 & 8) == 0) {
                i6++;
            } else {
                i6 = this.an[i6];
            }
            i8 = this.an[i6];
            if (i8 < 0) {
                i9 = i7 + 1;
                bArr2[i7] = (byte) (i8 ^ -1);
                if (i9 >= i4) {
                    break;
                }
                i6 = 0;
            } else {
                i9 = i7;
            }
            if ((b2 & 4) == 0) {
                i6++;
            } else {
                i6 = this.an[i6];
            }
            i8 = this.an[i6];
            if (i8 >= 0) {
                i7 = i9;
            } else {
                i7 = i9 + 1;
                bArr2[i9] = (byte) (i8 ^ -1);
                if (i7 < i4) {
                    break;
                }
                i6 = 0;
            }
            if ((b2 & 2) == 0) {
                i6++;
            } else {
                i6 = this.an[i6];
            }
            i8 = this.an[i6];
            if (i8 >= 0) {
                i9 = i7;
            } else {
                i9 = i7 + 1;
                bArr2[i7] = (byte) (i8 ^ -1);
                if (i9 < i4) {
                    break;
                }
                i6 = 0;
            }
            if ((b2 & 1) == 0) {
                i6++;
            } else {
                i6 = this.an[i6];
            }
            i7 = this.an[i6];
            if (i7 < 0) {
                i6 = i9 + 1;
                bArr2[i9] = (byte) (i7 ^ -1);
                if (i6 < i4) {
                    break;
                }
                i9 = i6;
                i6 = 0;
            }
            i5++;
            i7 = i9;
        }
        return (i5 + 1) - i;
    }

    public static final ft dz(int i, int i2) {
        if (i >= 0) {
            try {
                if (i < client.cj.length) {
                    return client.cj[i];
                }
            } catch (Throwable e) {
                throw ei.ac(e, "hx.dz(" + ')');
            }
        }
        return null;
    }
}
