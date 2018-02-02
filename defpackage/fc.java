package defpackage;

import java.util.Iterator;

public class fc {
    public static final int ad = 27;
    static final int ai = 0;
    static final int aj = 0;
    static final int an = 2;
    public static final int cy = 71;
    public final ea aa;
    int ak;
    public final ec ao;
    final ma aq;

    public static char aj(char c, int i, byte b) {
        if (c >= 'À' && c <= 'ÿ') {
            if (c >= 'À' && c <= 'Æ') {
                return 'A';
            }
            if ('Ç' == c) {
                return 'C';
            }
            if (c >= 'È' && c <= 'Ë') {
                return 'E';
            }
            if (c >= 'Ì' && c <= 'Ï') {
                return 'I';
            }
            if (c >= 'Ò' && c <= 'Ö') {
                return 'O';
            }
            if (c >= 'Ù' && c <= 'Ü') {
                return 'U';
            }
            if ('Ý' == c) {
                return 'Y';
            }
            if (c == 'ß') {
                return 's';
            }
            if (c >= 'à' && c <= 'æ') {
                return 'a';
            }
            if (c == 'ç') {
                return 'c';
            }
            if (c >= 'è' && c <= 'ë') {
                return 'e';
            }
            if (c >= 'ì' && c <= 'ï') {
                return 'i';
            }
            if (c >= 'ò' && c <= 'ö') {
                return 'o';
            }
            if (c >= 'ù' && c <= 'ü') {
                return 'u';
            }
            if (c == 'ý' || c == 'ÿ') {
                return 'y';
            }
        }
        if (c == 'Œ') {
            return 'O';
        }
        if ('œ' == c) {
            return 'o';
        }
        if (c == 'Ÿ') {
            return 'Y';
        }
        return c;
    }

    fc(ma maVar) {
        try {
            this.ak = 0;
            this.aq = maVar;
            this.ao = new ec(maVar);
            this.aa = new ea(maVar);
        } catch (Throwable e) {
            throw ei.ac(e, "fc.<init>(" + ')');
        }
    }

    boolean ag() {
        return 2 == this.ak * -289741690;
    }

    boolean aj(byte b) {
        try {
            return 2 == this.ak * -608375691;
        } catch (Throwable e) {
            throw ei.ac(e, "fc.aj(" + ')');
        }
    }

    boolean av() {
        return 2 == this.ak * -608375691;
    }

    boolean ay() {
        return 2 == this.ak * 1031573685;
    }

    final void ab() {
        this.ak = -1605860387;
    }

    final void ac(int i) {
        try {
            this.ak = -1605860387;
        } catch (Throwable e) {
            throw ei.ac(e, "fc.ac(" + ')');
        }
    }

    final void ad() {
        this.ak = -1605860387;
    }

    final void ar() {
        this.ak = -1605860387;
    }

    final void an(he heVar, int i, int i2) {
        try {
            this.ao.cs(heVar, i, -1984607041);
            this.ak = 1083246522;
            for (int i3 = 0; i3 < fu.aa * -2089377233; i3++) {
                client.hx[fu.ak[i3]].aq(-811238921);
            }
            Iterator it = gt.ac.iterator();
            while (it.hasNext()) {
                ((gu) it.next()).ac(1356225601);
            }
            if (bt.lw != null) {
                bt.lw.cw(2114617092);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "fc.an(" + ')');
        }
    }

    final void bh(he heVar, int i) {
        this.ao.cs(heVar, i, -1930657939);
        this.ak = 1083246522;
        for (int i2 = 0; i2 < fu.aa * -2089377233; i2++) {
            client.hx[fu.ak[i2]].aq(270509913);
        }
        Iterator it = gt.ac.iterator();
        while (it.hasNext()) {
            ((gu) it.next()).ac(1747986501);
        }
        if (bt.lw != null) {
            bt.lw.cw(-932899454);
        }
    }

    final void bm(he heVar, int i) {
        this.ao.cs(heVar, i, -489728429);
        this.ak = 1083246522;
        for (int i2 = 0; i2 < fu.aa * -2089377233; i2++) {
            client.hx[fu.ak[i2]].aq(-1484189452);
        }
        Iterator it = gt.ac.iterator();
        while (it.hasNext()) {
            ((gu) it.next()).ac(709732186);
        }
        if (bt.lw != null) {
            bt.lw.cw(1738400723);
        }
    }

    final void bp(he heVar, int i) {
        this.ao.cs(heVar, i, -818489591);
        this.ak = 1083246522;
        for (int i2 = 0; i2 < fu.aa * -2089377233; i2++) {
            client.hx[fu.ak[i2]].aq(-1901927169);
        }
        Iterator it = gt.ac.iterator();
        while (it.hasNext()) {
            ((gu) it.next()).ac(1037980622);
        }
        if (bt.lw != null) {
            bt.lw.cw(1125020277);
        }
    }

    final void aq(int i) {
        try {
            ek ekVar = (ek) this.ao.at.ac();
            while (ekVar != null) {
                if (((long) (-421049949 * ekVar.aj)) < (aw.aj((byte) 42) / 1000) - 5) {
                    if (ekVar.an > (short) 0) {
                        cw.ac(5, "", ekVar.ac + ix.fb, -1967024755);
                    }
                    if (ekVar.an == (short) 0) {
                        cw.ac(5, "", ekVar.ac + ix.fc, -2076669863);
                    }
                    ekVar.aj();
                }
                ekVar = (ek) this.ao.at.an();
            }
        } catch (Throwable e) {
            throw ei.ac(e, "fc.aq(" + ')');
        }
    }

    final void ao(int i) {
        try {
            this.ak = 0;
            this.ao.aj(-1850901960);
            this.aa.aj(-1850901960);
        } catch (Throwable e) {
            throw ei.ac(e, "fc.ao(" + ')');
        }
    }

    final void bb() {
        this.ak = 0;
        this.ao.aj(-1850901960);
        this.aa.aj(-1850901960);
    }

    final void br() {
        this.ak = 0;
        this.ao.aj(-1850901960);
        this.aa.aj(-1850901960);
    }

    final void bt() {
        this.ak = 0;
        this.ao.aj(-1850901960);
        this.aa.aj(-1850901960);
    }

    public static fl[] ao(ju juVar, String str, String str2, byte b) {
        try {
            int au = juVar.au(str, -1272927997);
            return lr.aj(juVar, au, juVar.av(au, str2, (byte) -106), 608432325);
        } catch (Throwable e) {
            throw ei.ac(e, "fc.ao(" + ')');
        }
    }

    final boolean aa(ez ezVar, boolean z, byte b) {
        if (ezVar == null) {
            return false;
        }
        if (ezVar.equals(cx.hb.aj)) {
            return true;
        }
        try {
            if (this.ao.cg(ezVar, z, (byte) 82)) {
                return true;
            }
            return false;
        } catch (Throwable e) {
            throw ei.ac(e, "fc.aa(" + ')');
        }
    }

    final boolean bd(ez ezVar, boolean z) {
        if (ezVar == null) {
            return false;
        }
        if (ezVar.equals(cx.hb.aj)) {
            return true;
        }
        if (this.ao.cg(ezVar, z, (byte) 2)) {
            return true;
        }
        return false;
    }

    final boolean bu(ez ezVar, boolean z) {
        if (ezVar == null) {
            return false;
        }
        if (ezVar.equals(cx.hb.aj)) {
            return true;
        }
        if (this.ao.cg(ezVar, z, (byte) -22)) {
            return true;
        }
        return false;
    }

    final boolean bx(ez ezVar, boolean z) {
        if (ezVar == null) {
            return false;
        }
        if (ezVar.equals(cx.hb.aj)) {
            return true;
        }
        if (this.ao.cg(ezVar, z, (byte) -43)) {
            return true;
        }
        return false;
    }

    final boolean by(ez ezVar, boolean z) {
        if (ezVar == null) {
            return false;
        }
        if (ezVar.equals(cx.hb.aj)) {
            return true;
        }
        if (this.ao.cg(ezVar, z, (byte) -8)) {
            return true;
        }
        return false;
    }

    final boolean ak(ez ezVar, int i) {
        if (ezVar == null) {
            return false;
        }
        try {
            return this.aa.aq(ezVar, (short) 24207);
        } catch (Throwable e) {
            throw ei.ac(e, "fc.ak(" + ')');
        }
    }

    final boolean bi(ez ezVar) {
        return ezVar != null && this.aa.aq(ezVar, (short) 13791);
    }

    final boolean bo(ez ezVar) {
        if (ezVar != null && this.aa.aq(ezVar, (short) 12074)) {
            return true;
        }
        return false;
    }

    final boolean bs(ez ezVar) {
        if (ezVar != null && this.aa.aq(ezVar, (short) 29748)) {
            return true;
        }
        return false;
    }

    final boolean bz(ez ezVar) {
        if (ezVar != null && this.aa.aq(ezVar, (short) 30391)) {
            return true;
        }
        return false;
    }

    final void ap(String str, byte b) {
        if (str != null) {
            try {
                ez ezVar = new ez(str, this.aq);
                if (!ezVar.ac((byte) 64)) {
                    return;
                }
                if (am(947202014)) {
                    cl.at(109481557);
                } else if (cx.hb.aj.equals(ezVar)) {
                    ed.ai((byte) 122);
                } else if (aa(ezVar, false, (byte) 0)) {
                    StringBuilder append = new StringBuilder().append(str);
                    ix ixVar = (ix) null;
                    cw.ac(30, "", append.append(ix.gw).toString(), -1886827020);
                } else if (ak(ezVar, 1228934358)) {
                    ep.ah(str, 1140575652);
                } else {
                    he.aw(str, -1739571568);
                }
            } catch (Throwable e) {
                throw ei.ac(e, "fc.ap(" + ')');
            }
        }
    }

    final void ba(String str) {
        if (str != null) {
            ez ezVar = new ez(str, this.aq);
            if (!ezVar.ac((byte) 76)) {
                return;
            }
            if (am(1758629437)) {
                cl.at(-924046442);
            } else if (cx.hb.aj.equals(ezVar)) {
                ed.ai((byte) 116);
            } else if (aa(ezVar, false, (byte) 0)) {
                StringBuilder append = new StringBuilder().append(str);
                ix ixVar = (ix) null;
                cw.ac(30, "", append.append(ix.gw).toString(), -1894017347);
            } else if (ak(ezVar, 1228934358)) {
                ep.ah(str, 1212076796);
            } else {
                he.aw(str, 1487451129);
            }
        }
    }

    final void bj(String str) {
        if (str != null) {
            ez ezVar = new ez(str, this.aq);
            if (!ezVar.ac((byte) 95)) {
                return;
            }
            if (am(1674873684)) {
                cl.at(8198703);
            } else if (cx.hb.aj.equals(ezVar)) {
                ed.ai((byte) 113);
            } else if (aa(ezVar, false, (byte) 0)) {
                StringBuilder append = new StringBuilder().append(str);
                ix ixVar = (ix) null;
                cw.ac(30, "", append.append(ix.gw).toString(), -2026089327);
            } else if (ak(ezVar, 1228934358)) {
                ep.ah(str, 1737244366);
            } else {
                he.aw(str, -800695552);
            }
        }
    }

    final void bq(String str) {
        if (str != null) {
            ez ezVar = new ez(str, this.aq);
            if (!ezVar.ac((byte) 47)) {
                return;
            }
            if (am(1210212196)) {
                cl.at(-486200075);
            } else if (cx.hb.aj.equals(ezVar)) {
                ed.ai((byte) 105);
            } else if (aa(ezVar, false, (byte) 0)) {
                StringBuilder append = new StringBuilder().append(str);
                ix ixVar = (ix) null;
                cw.ac(30, "", append.append(ix.gw).toString(), -2005342597);
            } else if (ak(ezVar, 1228934358)) {
                ep.ah(str, 337621476);
            } else {
                he.aw(str, -800755044);
            }
        }
    }

    static final void be() {
        ix ixVar = (ix) null;
        cw.ac(30, "", ix.ge, -1897149300);
    }

    static final void bv() {
        ix ixVar = (ix) null;
        cw.ac(30, "", ix.ge, -1927861815);
    }

    static final void bw() {
        ix ixVar = (ix) null;
        cw.ac(30, "", ix.ge, -2006392686);
    }

    static final void bn(String str) {
        ix ixVar = (ix) null;
        ix ixVar2 = (ix) null;
        cw.ac(30, "", ix.gc + str + ix.gj, -2031762807);
    }

    static final void bg(String str) {
        mg ac = hd.ac(mr.dq, client.dp.ao, (byte) 0);
        ac.an.an(cx.ah(str, -1157560512), (byte) -105);
        ac.an.ai(str, 1980995853);
        client.dp.an(ac, 2021902716);
    }

    final boolean am(int i) {
        try {
            if (this.ao.an(262563405)) {
                return true;
            }
            if (this.ao.ac((byte) -1) < fr.ak || client.hv * -69943969 == 1) {
                return false;
            }
            return true;
        } catch (Throwable e) {
            throw ei.ac(e, "fc.am(" + ')');
        }
    }

    final boolean bc() {
        if (this.ao.an(262563405)) {
            return true;
        }
        if (this.ao.ac((byte) -1) < fr.ak || client.hv * -69943969 == 1) {
            return false;
        }
        return true;
    }

    final boolean bf() {
        if (this.ao.an(262563405)) {
            return true;
        }
        if (this.ao.ac((byte) -1) < fr.ak || client.hv * -69943969 == 1) {
            return false;
        }
        return true;
    }

    final boolean bk() {
        if (this.ao.an(262563405)) {
            return true;
        }
        if (this.ao.ac((byte) -1) < fr.ak || client.hv * -69943969 == 1) {
            return false;
        }
        return true;
    }

    final boolean bl() {
        if (this.ao.an(262563405)) {
            return true;
        }
        if (this.ao.ac((byte) -1) < fr.ak || client.hv * -69943969 == 1) {
            return false;
        }
        return true;
    }

    final boolean cb() {
        if (this.ao.an(262563405)) {
            return true;
        }
        if (this.ao.ac((byte) -1) < 1150053420 || client.hv * -69943969 == 1) {
            return false;
        }
        return true;
    }

    final boolean cy() {
        if (this.ao.an(262563405)) {
            return true;
        }
        if (this.ao.ac((byte) -1) < 162719085 || client.hv * 1149621772 == 1) {
            return false;
        }
        return true;
    }

    final void ae(String str, int i) {
        if (str != null) {
            try {
                ez ezVar = new ez(str, this.aq);
                if (!ezVar.ac((byte) 33)) {
                    return;
                }
                ix ixVar;
                if (ax(1935756855)) {
                    ixVar = (ix) null;
                    cw.ac(30, "", ix.go, -1875710187);
                } else if (cx.hb.aj.equals(ezVar)) {
                    aw.al((byte) -37);
                } else if (ak(ezVar, 1228934358)) {
                    hd.as(str, (byte) -18);
                } else if (aa(ezVar, false, (byte) 0)) {
                    ixVar = (ix) null;
                    ixVar = (ix) null;
                    String str2 = "";
                    cw.ac(30, str2, ix.gv + str + ix.gm, -2102496145);
                } else {
                    el.az(str, -374394496);
                }
            } catch (Throwable e) {
                throw ei.ac(e, "fc.ae(" + ')');
            }
        }
    }

    final void cl(String str) {
        if (str != null) {
            ez ezVar = new ez(str, this.aq);
            if (!ezVar.ac((byte) 38)) {
                return;
            }
            ix ixVar;
            if (ax(1844500469)) {
                ixVar = (ix) null;
                cw.ac(30, "", ix.go, -1888985704);
            } else if (cx.hb.aj.equals(ezVar)) {
                aw.al((byte) 2);
            } else if (ak(ezVar, 1228934358)) {
                hd.as(str, (byte) 25);
            } else if (aa(ezVar, false, (byte) 0)) {
                ix ixVar2 = (ix) null;
                ixVar = (ix) null;
                cw.ac(30, "", ix.gv + str + ix.gm, -1860098900);
            } else {
                el.az(str, -185325636);
            }
        }
    }

    final void co(String str) {
        if (str != null) {
            ez ezVar = new ez(str, this.aq);
            if (!ezVar.ac((byte) 8)) {
                return;
            }
            ix ixVar;
            if (ax(2018262146)) {
                ixVar = (ix) null;
                cw.ac(30, "", ix.go, -2101217262);
            } else if (cx.hb.aj.equals(ezVar)) {
                aw.al((byte) 67);
            } else if (ak(ezVar, 1228934358)) {
                hd.as(str, (byte) 99);
            } else if (aa(ezVar, false, (byte) 0)) {
                ix ixVar2 = (ix) null;
                ixVar = (ix) null;
                cw.ac(30, "", ix.gv + str + ix.gm, -1971365718);
            } else {
                el.az(str, 1059441884);
            }
        }
    }

    static final void ca(String str) {
        StringBuilder append = new StringBuilder().append(str);
        ix ixVar = (ix) null;
        cw.ac(30, "", append.append(ix.gx).toString(), -1915905738);
    }

    static final void cc(String str) {
        StringBuilder append = new StringBuilder().append(str);
        ix ixVar = (ix) null;
        cw.ac(30, "", append.append(ix.gx).toString(), -2033492873);
    }

    static final void cf(String str) {
        StringBuilder append = new StringBuilder().append(str);
        ix ixVar = (ix) null;
        cw.ac(30, "", append.append(ix.gx).toString(), -2033378938);
    }

    static final void cp() {
        ix ixVar = (ix) null;
        cw.ac(30, "", ix.gp, -1991772471);
    }

    static final void cr() {
        ix ixVar = (ix) null;
        cw.ac(30, "", ix.gp, -1956086565);
    }

    static final void ct() {
        ix ixVar = (ix) null;
        cw.ac(30, "", ix.gp, -2049547008);
    }

    static final void ce(String str) {
        mg ac = hd.ac(mr.dl, client.dp.ao, (byte) 21);
        ac.an.an(cx.ah(str, 824427700), (byte) -115);
        ac.an.ai(str, 1395454236);
        client.dp.an(ac, 2109211739);
    }

    static final void ck(String str) {
        mg ac = hd.ac(mr.dl, client.dp.ao, (byte) -97);
        ac.an.an(cx.ah(str, 424232855), (byte) -36);
        ac.an.ai(str, -2146009341);
        client.dp.an(ac, 1581794041);
    }

    static final void cm(String str) {
        mg ac = hd.ac(mr.dl, client.dp.ao, (byte) 28);
        ac.an.an(cx.ah(str, -381092924), (byte) -126);
        ac.an.ai(str, -989298216);
        client.dp.an(ac, 1552824289);
    }

    final boolean ax(int i) {
        try {
            if (this.aa.an(262563405)) {
                return true;
            }
            if (this.aa.ac((byte) -1) < 100 || -69943969 * client.hv == 1) {
                return false;
            }
            return true;
        } catch (Throwable e) {
            throw ei.ac(e, "fc.ax(" + ')');
        }
    }

    final boolean ch() {
        if (this.aa.an(262563405)) {
            return true;
        }
        if (this.aa.ac((byte) -1) < 100 || -69943969 * client.hv == 1) {
            return false;
        }
        return true;
    }

    final boolean ci() {
        if (this.aa.an(262563405)) {
            return true;
        }
        if (this.aa.ac((byte) -1) < -365687356 || -69943969 * client.hv == 1) {
            return false;
        }
        return true;
    }

    final void af(String str, byte b) {
        if (str != null) {
            ez ezVar = new ez(str, this.aq);
            if (ezVar.ac((byte) 123)) {
                try {
                    if (this.ao.ap(ezVar, 821290159)) {
                        client.jw = client.jf * 791835259;
                        mg ac = hd.ac(mr.cl, client.dp.ao, (byte) 79);
                        ac.an.an(cx.ah(str, 192684020), Byte.MIN_VALUE);
                        ac.an.ai(str, 119320814);
                        client.dp.an(ac, 1538223020);
                    }
                    for (int i = 0; i < -2089377233 * fu.aa; i++) {
                        client.hx[fu.ak[i]].aq(2117673761);
                    }
                    Iterator it = gt.ac.iterator();
                    while (it.hasNext()) {
                        ((gu) it.next()).ac(885236146);
                    }
                    if (bt.lw != null) {
                        bt.lw.cw(1928207507);
                    }
                } catch (Throwable e) {
                    throw ei.ac(e, "fc.af(" + ')');
                }
            }
        }
    }

    final void cq(String str) {
        if (str != null) {
            ez ezVar = new ez(str, this.aq);
            if (ezVar.ac((byte) 54)) {
                if (this.ao.ap(ezVar, 2032994448)) {
                    client.jw = client.jf * 791835259;
                    mg ac = hd.ac(mr.cl, client.dp.ao, (byte) 8);
                    ac.an.an(cx.ah(str, 727352191), (byte) -68);
                    ac.an.ai(str, 1904983753);
                    client.dp.an(ac, 2058707153);
                }
                for (int i = 0; i < -1516642994 * fu.aa; i++) {
                    client.hx[fu.ak[i]].aq(571140974);
                }
                Iterator it = gt.ac.iterator();
                while (it.hasNext()) {
                    ((gu) it.next()).ac(1834830810);
                }
                if (bt.lw != null) {
                    bt.lw.cw(1209642921);
                }
            }
        }
    }

    final void cv(String str) {
        if (str != null) {
            ez ezVar = new ez(str, this.aq);
            if (ezVar.ac((byte) 48)) {
                if (this.ao.ap(ezVar, 1609161591)) {
                    client.jw = client.jf * 791835259;
                    mg ac = hd.ac(mr.cl, client.dp.ao, (byte) 25);
                    ac.an.an(cx.ah(str, -523514878), (byte) -19);
                    ac.an.ai(str, -402866384);
                    client.dp.an(ac, -197838787);
                }
                for (int i = 0; i < -2089377233 * fu.aa; i++) {
                    client.hx[fu.ak[i]].aq(273008973);
                }
                Iterator it = gt.ac.iterator();
                while (it.hasNext()) {
                    ((gu) it.next()).ac(605945131);
                }
                if (bt.lw != null) {
                    bt.lw.cw(1190294583);
                }
            }
        }
    }

    final void au(String str, byte b) {
        if (str != null) {
            try {
                ez ezVar = new ez(str, this.aq);
                if (ezVar.ac((byte) 91)) {
                    if (this.aa.ap(ezVar, 1344503050)) {
                        client.jw = client.jf * 791835259;
                        mg ac = hd.ac(mr.cd, client.dp.ao, (byte) 15);
                        ac.an.an(cx.ah(str, -676560594), (byte) -9);
                        ac.an.ai(str, -493492022);
                        client.dp.an(ac, 824913246);
                    }
                    ky.aa((short) 11859);
                    if (bt.lw != null) {
                        bt.lw.cn(-1778209979);
                    }
                }
            } catch (Throwable e) {
                throw ei.ac(e, "fc.au(" + ')');
            }
        }
    }

    final void cu(String str) {
        if (str != null) {
            ez ezVar = new ez(str, this.aq);
            if (ezVar.ac((byte) 84)) {
                if (this.aa.ap(ezVar, 943653836)) {
                    client.jw = client.jf * 791835259;
                    mg ac = hd.ac(mr.cd, client.dp.ao, (byte) 36);
                    ac.an.an(cx.ah(str, -980720416), (byte) -71);
                    ac.an.ai(str, -1929879812);
                    client.dp.an(ac, 420432992);
                }
                ky.aa((short) -6267);
                if (bt.lw != null) {
                    bt.lw.cn(-1839083075);
                }
            }
        }
    }

    static boolean aa(hn hnVar, int i, byte b) {
        boolean z = false;
        try {
            int jc = hnVar.jc(2, 1604792541);
            int jc2;
            int i2;
            int i3;
            int i4;
            if (jc == 0) {
                if (hnVar.jc(1, 1621165504) != 0) {
                    fc.aa(hnVar, i, (byte) 76);
                }
                jc = hnVar.jc(13, 1560076166);
                jc2 = hnVar.jc(13, 1528711961);
                if (hnVar.jc(1, 1572282643) == 1) {
                    z = true;
                }
                if (z) {
                    int[] iArr = fu.ae;
                    i2 = fu.am + 647054861;
                    fu.am = i2;
                    iArr[(i2 * -1373931323) - 1] = i;
                }
                if (client.hx[i] != null) {
                    throw new RuntimeException();
                }
                ff[] ffVarArr = client.hx;
                ff ffVar = new ff();
                ffVarArr[i] = ffVar;
                ffVar.ad = -1705513135 * i;
                if (fu.ao[i] != null) {
                    ffVar.aj(fu.ao[i], (byte) 73);
                }
                ffVar.de = 1559303333 * fu.ai[i];
                ffVar.cf = fu.aw[i] * 2130005305;
                int i5 = fu.ah[i];
                i3 = i5 >> 28;
                i4 = (i5 >> 14) & 255;
                i5 &= 255;
                ffVar.da[0] = fu.aq[i];
                ffVar.ar = ((byte) i3) * 1722394509;
                ffVar.as((jc + (i4 << 13)) - (fz.du * -357869149), ((i5 << 13) + jc2) - (1195683827 * fm.dn), (byte) 109);
                ffVar.bm = false;
                return true;
            } else if (1 == jc) {
                r1 = hnVar.jc(2, 1823877390);
                jc = fu.ah[i];
                fu.ah[i] = (((r1 + (jc >> 28)) & 3) << 28) + (jc & 268435455);
                return false;
            } else if (jc == 2) {
                jc = hnVar.jc(5, 1828954602);
                jc2 = jc >> 3;
                i2 = jc & 7;
                i3 = fu.ah[i];
                i4 = ((i3 >> 28) + jc2) & 3;
                jc = (i3 >> 14) & 255;
                jc2 = i3 & 255;
                if (i2 == 0) {
                    jc--;
                    jc2--;
                }
                if (1 == i2) {
                    r1 = jc2 - 1;
                } else {
                    r1 = jc2;
                }
                if (i2 == 2) {
                    jc++;
                    r1--;
                }
                if (3 == i2) {
                    jc--;
                }
                if (i2 == 4) {
                    jc++;
                }
                if (i2 == 5) {
                    jc--;
                    r1++;
                }
                if (i2 == 6) {
                    r1++;
                }
                if (i2 == 7) {
                    jc++;
                    r1++;
                }
                fu.ah[i] = r1 + ((jc << 14) + (i4 << 28));
                return false;
            } else {
                r1 = hnVar.jc(18, 1979806434);
                jc = r1 >> 16;
                jc2 = (r1 >> 8) & 255;
                r1 &= 255;
                i2 = fu.ah[i];
                r1 = (r1 + i2) & 255;
                fu.ah[i] = r1 + ((((jc + (i2 >> 28)) & 3) << 28) + (((jc2 + (i2 >> 14)) & 255) << 14));
                return false;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "fc.aa(" + ')');
        }
    }
}
