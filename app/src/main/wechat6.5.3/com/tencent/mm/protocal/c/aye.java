package com.tencent.mm.protocal.c;

import com.tencent.mm.ba.a;

public final class aye extends a {
    public String gln;
    public int mVI;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            if (this.gln != null) {
                aVar.e(1, this.gln);
            }
            aVar.dV(2, this.mVI);
            return 0;
        } else if (i == 1) {
            if (this.gln != null) {
                r0 = a.a.a.b.b.a.f(1, this.gln) + 0;
            } else {
                r0 = 0;
            }
            return r0 + a.a.a.a.dS(2, this.mVI);
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = a.a(aVar2); r0 > 0; r0 = a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            aye com_tencent_mm_protocal_c_aye = (aye) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    com_tencent_mm_protocal_c_aye.gln = aVar3.pMj.readString();
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_aye.mVI = aVar3.pMj.mH();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
