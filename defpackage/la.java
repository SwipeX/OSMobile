package defpackage;

import java.net.URL;
import java.util.LinkedList;
import java.util.List;

public class la {
    static final int am = 13;
    static final int bp = 28;
    List aa;
    kd ac;
    String aj;
    kt an;
    final List ao;
    final lv aq;

    public la(String str) {
        try {
            this.aq = new lv("universal");
            this.ao = new LinkedList();
            this.aa = new LinkedList();
            this.aj = str;
        } catch (Throwable e) {
            throw ei.ac(e, "la.<init>(" + ')');
        }
    }

    public boolean aj(int i, int i2) {
        try {
            if (this.ac == null) {
                this.ac = new kd();
                ha.aj(i, this.aq.an, (byte) 2);
            }
            try {
                if (this.aj == null) {
                    throw new Exception("Url to fetch JavConfig is null");
                }
                if (this.an == null) {
                    this.an = this.ac.aj(new URL(this.aj), -987012516);
                } else if (this.an.ac(1685798816)) {
                    hd hdVar = new hd(new String(this.an.an(417523339), "CP1252").split("[\\r\\n]+"));
                    lv lvVar = this.aq;
                    while (true) {
                        String[] ac = hdVar.ac((byte) -85);
                        if (ac == null) {
                            String aj = hdVar.aj((byte) 20);
                            if (aj != null) {
                                lvVar = new lv(aj);
                                this.ao.add(lvVar);
                            } else {
                                this.ac.an((byte) 0);
                                this.ac = null;
                                return true;
                            }
                        } else if (ac[0].equals("param")) {
                            ac(ac[1], lvVar, (byte) 45);
                        } else if (ac[0].equals("msg")) {
                            an(ac[1], lvVar, (short) 6636);
                        } else {
                            aq(ac, lvVar, (byte) 1);
                        }
                    }
                }
                return false;
            } catch (Exception e) {
                if (this.ac == null) {
                    return true;
                }
                this.ac.an((byte) 0);
                this.ac = null;
                return true;
            }
        } catch (Throwable e2) {
            throw ei.ac(e2, "la.aj(" + ')');
        }
    }

    public boolean ak(int i) {
        if (this.ac == null) {
            this.ac = new kd();
            ha.aj(i, this.aq.an, (byte) 1);
        }
        try {
            if (this.aj == null) {
                throw new Exception("Url to fetch JavConfig is null");
            }
            if (this.an == null) {
                this.an = this.ac.aj(new URL(this.aj), 343973907);
            } else if (this.an.ac(505875986)) {
                hd hdVar = new hd(new String(this.an.an(417523339), "CP1252").split("[\\r\\n]+"));
                lv lvVar = this.aq;
                while (true) {
                    String[] ac = hdVar.ac((byte) -22);
                    if (ac == null) {
                        String aj = hdVar.aj((byte) 20);
                        if (aj != null) {
                            lvVar = new lv(aj);
                            this.ao.add(lvVar);
                        } else {
                            this.ac.an((byte) 0);
                            this.ac = null;
                            return true;
                        }
                    } else if (ac[0].equals("param")) {
                        ac(ac[1], lvVar, (byte) 75);
                    } else if (ac[0].equals("msg")) {
                        an(ac[1], lvVar, (short) 6636);
                    } else {
                        aq(ac, lvVar, (byte) 1);
                    }
                }
            }
            return false;
        } catch (Exception e) {
            if (this.ac == null) {
                return true;
            }
            this.ac.an((byte) 0);
            this.ac = null;
            return true;
        }
    }

    public boolean ap(int i) {
        if (this.ac == null) {
            this.ac = new kd();
            ha.aj(i, this.aq.an, (byte) -24);
        }
        try {
            if (this.aj == null) {
                throw new Exception("Url to fetch JavConfig is null");
            }
            if (this.an == null) {
                this.an = this.ac.aj(new URL(this.aj), 577153429);
            } else if (this.an.ac(1024907708)) {
                hd hdVar = new hd(new String(this.an.an(417523339), "CP1252").split("[\\r\\n]+"));
                lv lvVar = this.aq;
                while (true) {
                    String[] ac = hdVar.ac((byte) -18);
                    if (ac == null) {
                        String aj = hdVar.aj((byte) 20);
                        if (aj != null) {
                            lvVar = new lv(aj);
                            this.ao.add(lvVar);
                        } else {
                            this.ac.an((byte) 0);
                            this.ac = null;
                            return true;
                        }
                    } else if (ac[0].equals("param")) {
                        ac(ac[1], lvVar, (byte) 109);
                    } else if (ac[0].equals("msg")) {
                        an(ac[1], lvVar, (short) 6636);
                    } else {
                        aq(ac, lvVar, (byte) 1);
                    }
                }
            }
            return false;
        } catch (Exception e) {
            if (this.ac == null) {
                return true;
            }
            this.ac.an((byte) 0);
            this.ac = null;
            return true;
        }
    }

    void ac(String str, lv lvVar, byte b) {
        try {
            int indexOf = str.indexOf(61);
            if (-1 != indexOf) {
                lvVar.ac.put(str.substring(0, indexOf).trim(), str.substring(indexOf + 1).trim());
            }
        } catch (Throwable e) {
            throw ei.ac(e, "la.ac(" + ')');
        }
    }

    void ah(String str, lv lvVar) {
        int indexOf = str.indexOf(61);
        if (-1 != indexOf) {
            lvVar.ac.put(str.substring(0, indexOf).trim(), str.substring(indexOf + 1).trim());
        }
    }

    void at(String str, lv lvVar) {
        int indexOf = str.indexOf(61);
        if (-1 != indexOf) {
            lvVar.ac.put(str.substring(0, indexOf).trim(), str.substring(indexOf + 1).trim());
        }
    }

    void ai(String str, lv lvVar) {
        int i = 0;
        int indexOf = str.indexOf(61);
        if (-1 != indexOf) {
            String toLowerCase = str.substring(0, indexOf).trim().toLowerCase();
            StringBuilder stringBuilder = new StringBuilder(str.substring(indexOf + 1).trim());
            while (true) {
                indexOf = stringBuilder.indexOf("\\\\", i);
                i = stringBuilder.indexOf("\\n", i);
                if (indexOf < 0 && i < 0) {
                    break;
                } else if (indexOf < 0 || (i >= 0 && i < indexOf)) {
                    stringBuilder.replace(i, i + 2, "\n");
                    i++;
                } else {
                    stringBuilder.replace(indexOf, indexOf + 2, "\\");
                    i = indexOf + 1;
                }
            }
            if (toLowerCase.startsWith("lang")) {
                try {
                    this.aa.add(new lm(Integer.parseInt(toLowerCase.substring(4)), stringBuilder.toString()));
                } catch (NumberFormatException e) {
                }
            }
            lvVar.an.put(toLowerCase, stringBuilder.toString());
        }
    }

    void an(String str, lv lvVar, short s) {
        int i = 0;
        try {
            int indexOf = str.indexOf(61);
            if (-1 != indexOf) {
                String toLowerCase = str.substring(0, indexOf).trim().toLowerCase();
                StringBuilder stringBuilder = new StringBuilder(str.substring(indexOf + 1).trim());
                while (true) {
                    indexOf = stringBuilder.indexOf("\\\\", i);
                    i = stringBuilder.indexOf("\\n", i);
                    if (indexOf < 0 && i < 0) {
                        break;
                    } else if (indexOf < 0 || (i >= 0 && i < indexOf)) {
                        stringBuilder.replace(i, i + 2, "\n");
                        i++;
                    } else {
                        stringBuilder.replace(indexOf, indexOf + 2, "\\");
                        i = indexOf + 1;
                    }
                }
                if (toLowerCase.startsWith("lang")) {
                    try {
                        this.aa.add(new lm(Integer.parseInt(toLowerCase.substring(4)), stringBuilder.toString()));
                    } catch (NumberFormatException e) {
                    }
                }
                lvVar.an.put(toLowerCase, stringBuilder.toString());
            }
        } catch (Throwable e2) {
            throw ei.ac(e2, "la.an(" + ')');
        }
    }

    void aw(String str, lv lvVar) {
        int i = 0;
        int indexOf = str.indexOf(962702882);
        if (-1 != indexOf) {
            String toLowerCase = str.substring(0, indexOf).trim().toLowerCase();
            StringBuilder stringBuilder = new StringBuilder(str.substring(indexOf + 1).trim());
            while (true) {
                indexOf = stringBuilder.indexOf("\\\\", i);
                i = stringBuilder.indexOf("\\n", i);
                if (indexOf < 0 && i < 0) {
                    break;
                } else if (indexOf < 0 || (i >= 0 && i < indexOf)) {
                    stringBuilder.replace(i, i + 2, "\n");
                    i++;
                } else {
                    stringBuilder.replace(indexOf, indexOf + 2, "\\");
                    i = indexOf + 1;
                }
            }
            if (toLowerCase.startsWith("lang")) {
                try {
                    this.aa.add(new lm(Integer.parseInt(toLowerCase.substring(4)), stringBuilder.toString()));
                } catch (NumberFormatException e) {
                }
            }
            lvVar.an.put(toLowerCase, stringBuilder.toString());
        }
    }

    void ae(String[] strArr, lv lvVar) {
        lvVar.aj.put(strArr[0], strArr[1]);
    }

    void al(String[] strArr, lv lvVar) {
        lvVar.aj.put(strArr[0], strArr[1]);
    }

    void am(String[] strArr, lv lvVar) {
        lvVar.aj.put(strArr[0], strArr[1]);
    }

    void aq(String[] strArr, lv lvVar, byte b) {
        try {
            lvVar.aj.put(strArr[0], strArr[1]);
        } catch (Throwable e) {
            throw ei.ac(e, "la.aq(" + ')');
        }
    }

    void as(String[] strArr, lv lvVar) {
        lvVar.aj.put(strArr[0], strArr[1]);
    }

    public lv af() {
        return this.aq;
    }

    public lv ao(int i) {
        try {
            return this.aq;
        } catch (Throwable e) {
            throw ei.ac(e, "la.ao(" + ')');
        }
    }

    public lv ax() {
        return this.aq;
    }

    public lv az() {
        return this.aq;
    }

    public String aa(int i) {
        try {
            return this.aj;
        } catch (Throwable e) {
            throw ei.ac(e, "la.aa(" + ')');
        }
    }

    public String au() {
        return this.aj;
    }

    public String av() {
        return this.aj;
    }
}
