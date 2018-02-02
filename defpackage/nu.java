package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class nu {
    public static jr aj = new jr();
    public static final int at = 20;

    nu() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "nu.<init>(" + ')');
        }
    }

    public static void ao() {
        aj = new jr();
    }

    public static void aq() {
        aj = new jr();
    }

    public static void aa(hn hnVar) {
        ny nyVar = (ny) aj.aa();
        if (nyVar != null) {
            int i = -1313157303 * hnVar.ac;
            hnVar.aa(nyVar.aj * -1464353419, 1859156435);
            for (int i2 = 0; i2 < -1961730386 * nyVar.ac; i2++) {
                if (nyVar.aq[i2] != 0) {
                    hnVar.an(nyVar.aq[i2], (byte) -115);
                } else {
                    try {
                        int i3 = nyVar.an[i2];
                        int i4;
                        if (i3 == 0) {
                            i4 = nyVar.ao[i2].getInt(null);
                            hnVar.an(0, (byte) -92);
                            hnVar.aa(i4, -200139060);
                        } else if (i3 == 1) {
                            nyVar.ao[i2].setInt(null, nyVar.aa[i2]);
                            hnVar.an(0, (byte) -91);
                        } else if (2 == i3) {
                            i4 = nyVar.ao[i2].getModifiers();
                            hnVar.an(0, (byte) -46);
                            hnVar.aa(i4, 1185112022);
                        }
                        if (i3 == 3) {
                            Method method = nyVar.ak[i2];
                            byte[][] bArr = nyVar.ap[i2];
                            Object[] objArr = new Object[bArr.length];
                            for (i3 = 0; i3 < bArr.length; i3++) {
                                objArr[i3] = new ObjectInputStream(new ByteArrayInputStream(bArr[i3])).readObject();
                            }
                            Object invoke = method.invoke(null, objArr);
                            if (invoke == null) {
                                hnVar.an(0, (byte) -90);
                            } else if (invoke instanceof Number) {
                                hnVar.an(1, (byte) -40);
                                hnVar.ap(((Number) invoke).longValue());
                            } else if (invoke instanceof String) {
                                hnVar.an(2, (byte) -111);
                                hnVar.ai((String) invoke, 244018885);
                            } else {
                                hnVar.an(4, (byte) -106);
                            }
                        } else if (i3 == 4) {
                            i3 = nyVar.ak[i2].getModifiers();
                            hnVar.an(0, (byte) -81);
                            hnVar.aa(i3, 743763247);
                        }
                    } catch (ClassNotFoundException e) {
                        hnVar.an(1972350286, (byte) -103);
                    } catch (InvalidClassException e2) {
                        hnVar.an(-1401328470, (byte) -64);
                    } catch (StreamCorruptedException e3) {
                        hnVar.an(-12, (byte) -16);
                    } catch (OptionalDataException e4) {
                        hnVar.an(-13, (byte) -99);
                    } catch (IllegalAccessException e5) {
                        hnVar.an(1267745265, (byte) -22);
                    } catch (IllegalArgumentException e6) {
                        hnVar.an(1799727787, (byte) -76);
                    } catch (InvocationTargetException e7) {
                        hnVar.an(-731957782, (byte) -61);
                    } catch (SecurityException e8) {
                        hnVar.an(-162243614, (byte) -51);
                    } catch (IOException e9) {
                        hnVar.an(-1948478150, (byte) -59);
                    } catch (NullPointerException e10) {
                        hnVar.an(-19, (byte) -86);
                    } catch (Exception e11) {
                        hnVar.an(-1670971305, (byte) -94);
                    } catch (Throwable th) {
                        hnVar.an(-1067359309, (byte) -76);
                    }
                }
            }
            hnVar.bj(i, 1153181199);
            nyVar.kn();
        }
    }

    public static void ak(hn hnVar) {
        ny nyVar = (ny) aj.aa();
        if (nyVar != null) {
            int i = 489625177 * hnVar.ac;
            hnVar.aa(nyVar.aj * -1464353419, 1137648791);
            for (int i2 = 0; i2 < -2038808257 * nyVar.ac; i2++) {
                if (nyVar.aq[i2] != 0) {
                    hnVar.an(nyVar.aq[i2], (byte) -61);
                } else {
                    try {
                        int i3 = nyVar.an[i2];
                        int i4;
                        if (i3 == 0) {
                            i4 = nyVar.ao[i2].getInt(null);
                            hnVar.an(0, (byte) -110);
                            hnVar.aa(i4, -317858802);
                        } else if (i3 == 1) {
                            nyVar.ao[i2].setInt(null, nyVar.aa[i2]);
                            hnVar.an(0, (byte) -114);
                        } else if (2 == i3) {
                            i4 = nyVar.ao[i2].getModifiers();
                            hnVar.an(0, (byte) -95);
                            hnVar.aa(i4, -16679423);
                        }
                        if (i3 == 3) {
                            Method method = nyVar.ak[i2];
                            byte[][] bArr = nyVar.ap[i2];
                            Object[] objArr = new Object[bArr.length];
                            for (i3 = 0; i3 < bArr.length; i3++) {
                                objArr[i3] = new ObjectInputStream(new ByteArrayInputStream(bArr[i3])).readObject();
                            }
                            Object invoke = method.invoke(null, objArr);
                            if (invoke == null) {
                                hnVar.an(0, (byte) -98);
                            } else if (invoke instanceof Number) {
                                hnVar.an(1, (byte) -61);
                                hnVar.ap(((Number) invoke).longValue());
                            } else if (invoke instanceof String) {
                                hnVar.an(2, (byte) -26);
                                hnVar.ai((String) invoke, -1823660733);
                            } else {
                                hnVar.an(4, (byte) -100);
                            }
                        } else if (i3 == 4) {
                            i3 = nyVar.ak[i2].getModifiers();
                            hnVar.an(0, (byte) -122);
                            hnVar.aa(i3, 2016263337);
                        }
                    } catch (ClassNotFoundException e) {
                        hnVar.an(-10, (byte) -60);
                    } catch (InvalidClassException e2) {
                        hnVar.an(-11, (byte) -122);
                    } catch (StreamCorruptedException e3) {
                        hnVar.an(-12, (byte) -109);
                    } catch (OptionalDataException e4) {
                        hnVar.an(-13, (byte) -100);
                    } catch (IllegalAccessException e5) {
                        hnVar.an(-14, (byte) -16);
                    } catch (IllegalArgumentException e6) {
                        hnVar.an(-15, (byte) -38);
                    } catch (InvocationTargetException e7) {
                        hnVar.an(-16, (byte) -35);
                    } catch (SecurityException e8) {
                        hnVar.an(-17, (byte) -53);
                    } catch (IOException e9) {
                        hnVar.an(-18, (byte) -57);
                    } catch (NullPointerException e10) {
                        hnVar.an(-19, (byte) -39);
                    } catch (Exception e11) {
                        hnVar.an(-20, (byte) -39);
                    } catch (Throwable th) {
                        hnVar.an(-21, (byte) -10);
                    }
                }
            }
            hnVar.bj(i, -61858964);
            nyVar.kn();
        }
    }

    public static void ap(hn hnVar) {
        ny nyVar = (ny) aj.aa();
        if (nyVar != null) {
            int i = -1376101007 * hnVar.ac;
            hnVar.aa(nyVar.aj * -1464353419, 112372520);
            for (int i2 = 0; i2 < -1133550142 * nyVar.ac; i2++) {
                if (nyVar.aq[i2] != 0) {
                    hnVar.an(nyVar.aq[i2], (byte) -79);
                } else {
                    try {
                        int i3 = nyVar.an[i2];
                        int i4;
                        if (i3 == 0) {
                            i4 = nyVar.ao[i2].getInt(null);
                            hnVar.an(0, (byte) -67);
                            hnVar.aa(i4, 208878605);
                        } else if (i3 == 1) {
                            nyVar.ao[i2].setInt(null, nyVar.aa[i2]);
                            hnVar.an(0, (byte) -8);
                        } else if (2 == i3) {
                            i4 = nyVar.ao[i2].getModifiers();
                            hnVar.an(0, (byte) -44);
                            hnVar.aa(i4, 113262041);
                        }
                        if (i3 == 3) {
                            Method method = nyVar.ak[i2];
                            byte[][] bArr = nyVar.ap[i2];
                            Object[] objArr = new Object[bArr.length];
                            for (i3 = 0; i3 < bArr.length; i3++) {
                                objArr[i3] = new ObjectInputStream(new ByteArrayInputStream(bArr[i3])).readObject();
                            }
                            Object invoke = method.invoke(null, objArr);
                            if (invoke == null) {
                                hnVar.an(0, (byte) -71);
                            } else if (invoke instanceof Number) {
                                hnVar.an(1, (byte) -63);
                                hnVar.ap(((Number) invoke).longValue());
                            } else if (invoke instanceof String) {
                                hnVar.an(2, (byte) -36);
                                hnVar.ai((String) invoke, -816882657);
                            } else {
                                hnVar.an(4, (byte) -23);
                            }
                        } else if (i3 == 4) {
                            i3 = nyVar.ak[i2].getModifiers();
                            hnVar.an(0, (byte) -1);
                            hnVar.aa(i3, 96939819);
                        }
                    } catch (ClassNotFoundException e) {
                        hnVar.an(-355519568, (byte) -70);
                    } catch (InvalidClassException e2) {
                        hnVar.an(-11, (byte) -9);
                    } catch (StreamCorruptedException e3) {
                        hnVar.an(-12, (byte) -35);
                    } catch (OptionalDataException e4) {
                        hnVar.an(-13, (byte) -52);
                    } catch (IllegalAccessException e5) {
                        hnVar.an(667637767, (byte) -62);
                    } catch (IllegalArgumentException e6) {
                        hnVar.an(-15, (byte) -119);
                    } catch (InvocationTargetException e7) {
                        hnVar.an(-645844170, (byte) -21);
                    } catch (SecurityException e8) {
                        hnVar.an(-17, (byte) -58);
                    } catch (IOException e9) {
                        hnVar.an(-1280368913, (byte) -55);
                    } catch (NullPointerException e10) {
                        hnVar.an(1713134495, (byte) -47);
                    } catch (Exception e11) {
                        hnVar.an(-20, (byte) -33);
                    } catch (Throwable th) {
                        hnVar.an(-1985439964, (byte) -106);
                    }
                }
            }
            hnVar.bj(i, -290065942);
            nyVar.kn();
        }
    }

    public static Class ah(String str) throws ClassNotFoundException {
        if (str.equals("B")) {
            return Byte.TYPE;
        }
        if (str.equals("I")) {
            return Integer.TYPE;
        }
        if (str.equals("S")) {
            return Short.TYPE;
        }
        if (str.equals("J")) {
            return Long.TYPE;
        }
        if (str.equals("Z")) {
            return Boolean.TYPE;
        }
        if (str.equals("F")) {
            return Float.TYPE;
        }
        if (str.equals("D")) {
            return Double.TYPE;
        }
        if (str.equals("C")) {
            return Character.TYPE;
        }
        if (str.equals("void")) {
            return Void.TYPE;
        }
        return Class.forName(str);
    }

    public static Class ai(String str) throws ClassNotFoundException {
        if (str.equals("B")) {
            return Byte.TYPE;
        }
        if (str.equals("I")) {
            return Integer.TYPE;
        }
        if (str.equals("S")) {
            return Short.TYPE;
        }
        if (str.equals("J")) {
            return Long.TYPE;
        }
        if (str.equals("Z")) {
            return Boolean.TYPE;
        }
        if (str.equals("F")) {
            return Float.TYPE;
        }
        if (str.equals("D")) {
            return Double.TYPE;
        }
        if (str.equals("C")) {
            return Character.TYPE;
        }
        if (str.equals("void")) {
            return Void.TYPE;
        }
        return Class.forName(str);
    }

    public static Class at(String str) throws ClassNotFoundException {
        if (str.equals("B")) {
            return Byte.TYPE;
        }
        if (str.equals("I")) {
            return Integer.TYPE;
        }
        if (str.equals("S")) {
            return Short.TYPE;
        }
        if (str.equals("J")) {
            return Long.TYPE;
        }
        if (str.equals("Z")) {
            return Boolean.TYPE;
        }
        if (str.equals("F")) {
            return Float.TYPE;
        }
        if (str.equals("D")) {
            return Double.TYPE;
        }
        if (str.equals("C")) {
            return Character.TYPE;
        }
        if (str.equals("void")) {
            return Void.TYPE;
        }
        return Class.forName(str);
    }
}
