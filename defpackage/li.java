package defpackage;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;

public class li extends RuntimeException {
    public static final int ac = 0;
    static URL aj = null;
    public static final int an = 1;
    public static short[] at;
    Throwable ao;
    String aq;

    public static void aj(ju juVar, int i) {
        try {
            am.aj = juVar;
            am.ac = am.aj.as(16, 415667447) * 2003720729;
        } catch (Throwable e) {
            throw ei.ac(e, "li.aj(" + ')');
        }
    }

    li(Throwable th, String str) {
        try {
            this.aq = str;
            this.ao = th;
        } catch (Throwable e) {
            throw ei.ac(e, "li.<init>(" + ')');
        }
    }

    public static void an(String str, Throwable th) {
        try {
            String str2 = "";
            if (th != null) {
                Throwable th2;
                if (th instanceof li) {
                    li liVar = (li) th;
                    String str3 = liVar.aq + " | ";
                    th2 = liVar.ao;
                    str2 = str3;
                } else {
                    str2 = "";
                    th2 = th;
                }
                Writer stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th2.printStackTrace(printWriter);
                printWriter.close();
                BufferedReader bufferedReader = new BufferedReader(new StringReader(stringWriter.toString()));
                String readLine = bufferedReader.readLine();
                String str4 = str2;
                while (true) {
                    str2 = bufferedReader.readLine();
                    if (str2 == null) {
                        break;
                    }
                    int indexOf = str2.indexOf(40);
                    int indexOf2 = str2.indexOf(-612447617, indexOf + 1);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        String substring = str2.substring(indexOf + 1, indexOf2);
                        int indexOf3 = substring.indexOf(".java:");
                        if (indexOf3 >= 0) {
                            str4 = str4 + (substring.substring(0, indexOf3) + substring.substring(indexOf3 + 5)) + ' ';
                        } else {
                            str2 = str2.substring(0, indexOf);
                        }
                    }
                    str2 = str2.trim();
                    str2 = str2.substring(str2.lastIndexOf(32) + 1);
                    str4 = str4 + str2.substring(str2.lastIndexOf(9) + 1) + 'உ';
                }
                str2 = str4 + "| " + readLine;
            }
            if (str != null) {
                if (th != null) {
                    str2 = str2 + " | ";
                }
                str2 = str2 + str;
            }
            System.out.println("Error: " + str2);
            str2 = str2.replace(':', '禀').replace('@', '꩝').replace('黱', '_').replace('⥚', '_');
            if (aj != null) {
                DataInputStream dataInputStream = new DataInputStream(new URL(aj, "clienterror.ws?c=" + (1188100845 * bb.an) + "&u=" + ab.ac + "&v1=" + hw.aj + "&v2=" + ls.ac + "&e=" + str2).openStream());
                dataInputStream.read();
                dataInputStream.close();
            }
        } catch (Exception e) {
        }
    }

    public static void aq(String str, Throwable th) {
        try {
            String str2 = "";
            if (th != null) {
                Throwable th2;
                if (th instanceof li) {
                    li liVar = (li) th;
                    String str3 = liVar.aq + " | ";
                    th2 = liVar.ao;
                    str2 = str3;
                } else {
                    str2 = "";
                    th2 = th;
                }
                Writer stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th2.printStackTrace(printWriter);
                printWriter.close();
                BufferedReader bufferedReader = new BufferedReader(new StringReader(stringWriter.toString()));
                String readLine = bufferedReader.readLine();
                String str4 = str2;
                while (true) {
                    str2 = bufferedReader.readLine();
                    if (str2 == null) {
                        break;
                    }
                    int indexOf = str2.indexOf(40);
                    int indexOf2 = str2.indexOf(41, indexOf + 1);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        String substring = str2.substring(indexOf + 1, indexOf2);
                        int indexOf3 = substring.indexOf(".java:");
                        if (indexOf3 >= 0) {
                            str4 = str4 + (substring.substring(0, indexOf3) + substring.substring(indexOf3 + 5)) + ' ';
                        } else {
                            str2 = str2.substring(0, indexOf);
                        }
                    }
                    str2 = str2.trim();
                    str2 = str2.substring(str2.lastIndexOf(32) + 1);
                    str4 = str4 + str2.substring(str2.lastIndexOf(9) + 1) + ' ';
                }
                str2 = str4 + "| " + readLine;
            }
            if (str != null) {
                if (th != null) {
                    str2 = str2 + " | ";
                }
                str2 = str2 + str;
            }
            System.out.println("Error: " + str2);
            str2 = str2.replace(':', '.').replace('@', '_').replace('&', '_').replace('#', '_');
            if (aj != null) {
                DataInputStream dataInputStream = new DataInputStream(new URL(aj, "clienterror.ws?c=" + (1556688723 * bb.an) + "&u=" + ab.ac + "&v1=" + hw.aj + "&v2=" + ls.ac + "&e=" + str2).openStream());
                dataInputStream.read();
                dataInputStream.close();
            }
        } catch (Exception e) {
        }
    }

    public static li aa(Throwable th, String str) {
        if (!(th instanceof li)) {
            return new li(th, str);
        }
        li liVar = (li) th;
        liVar.aq += ' ' + str;
        return liVar;
    }

    public static li ak(Throwable th, String str) {
        if (!(th instanceof li)) {
            return new li(th, str);
        }
        li liVar = (li) th;
        liVar.aq += ' ' + str;
        return liVar;
    }

    public static li ao(Throwable th, String str) {
        if (!(th instanceof li)) {
            return new li(th, str);
        }
        li liVar = (li) th;
        liVar.aq += ' ' + str;
        return liVar;
    }

    public static ab ac(int i, int i2, int i3) {
        try {
            ab aj = ac.aj(i, 1491728077);
            if (-1 == i2) {
                return aj;
            }
            if (aj == null || aj.ft == null || i2 >= aj.ft.length) {
                return null;
            }
            return aj.ft[i2];
        } catch (Throwable e) {
            throw ei.ac(e, "li.ac(" + ')');
        }
    }
}
