package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class nm {
    public static final int aj = 8;
    static final byte ak = (byte) 1;
    public static final int aq = 2;

    nm() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "nm.<init>(" + ')');
        }
    }

    public static void ac(hn hnVar, int i) {
        ny nyVar = (ny) nu.aj.aa();
        if (nyVar != null) {
            int i2 = 489625177 * hnVar.ac;
            hnVar.aa(nyVar.aj * -1464353419, -1229576765);
            for (int i3 = 0; i3 < -2038808257 * nyVar.ac; i3++) {
                if (nyVar.aq[i3] != 0) {
                    hnVar.an(nyVar.aq[i3], (byte) -107);
                } else {
                    try {
                        int i4 = nyVar.an[i3];
                        int i5;
                        if (i4 == 0) {
                            i5 = nyVar.ao[i3].getInt(null);
                            hnVar.an(0, (byte) -15);
                            hnVar.aa(i5, 1072068667);
                        } else if (i4 == 1) {
                            nyVar.ao[i3].setInt(null, nyVar.aa[i3]);
                            hnVar.an(0, (byte) -96);
                        } else if (2 == i4) {
                            i5 = nyVar.ao[i3].getModifiers();
                            hnVar.an(0, (byte) -53);
                            hnVar.aa(i5, 126022971);
                        }
                        if (i4 == 3) {
                            Method method = nyVar.ak[i3];
                            byte[][] bArr = nyVar.ap[i3];
                            Object[] objArr = new Object[bArr.length];
                            for (i4 = 0; i4 < bArr.length; i4++) {
                                objArr[i4] = new ObjectInputStream(new ByteArrayInputStream(bArr[i4])).readObject();
                            }
                            Object invoke = method.invoke(null, objArr);
                            if (invoke == null) {
                                hnVar.an(0, (byte) -118);
                            } else if (invoke instanceof Number) {
                                hnVar.an(1, (byte) -125);
                                hnVar.ap(((Number) invoke).longValue());
                            } else if (invoke instanceof String) {
                                hnVar.an(2, (byte) -26);
                                hnVar.ai((String) invoke, -893059410);
                            } else {
                                hnVar.an(4, (byte) -44);
                            }
                        } else if (i4 == 4) {
                            i4 = nyVar.ak[i3].getModifiers();
                            hnVar.an(0, (byte) -114);
                            hnVar.aa(i4, -898903959);
                        }
                    } catch (ClassNotFoundException e) {
                        hnVar.an(-10, (byte) -124);
                    } catch (InvalidClassException e2) {
                        try {
                            hnVar.an(-11, (byte) -107);
                        } catch (Throwable e3) {
                            throw ei.ac(e3, "nm.ac(" + ')');
                        }
                    } catch (StreamCorruptedException e4) {
                        hnVar.an(-12, (byte) -48);
                    } catch (OptionalDataException e5) {
                        hnVar.an(-13, (byte) -108);
                    } catch (IllegalAccessException e6) {
                        hnVar.an(-14, (byte) -17);
                    } catch (IllegalArgumentException e7) {
                        hnVar.an(-15, (byte) -24);
                    } catch (InvocationTargetException e8) {
                        hnVar.an(-16, (byte) -7);
                    } catch (SecurityException e9) {
                        hnVar.an(-17, (byte) -17);
                    } catch (IOException e10) {
                        hnVar.an(-18, (byte) -48);
                    } catch (NullPointerException e11) {
                        hnVar.an(-19, (byte) -64);
                    } catch (Exception e12) {
                        hnVar.an(-20, (byte) -16);
                    } catch (Throwable th) {
                        hnVar.an(-21, (byte) -116);
                    }
                }
            }
            hnVar.bj(i2, 375829549);
            nyVar.kn();
        }
    }
}
