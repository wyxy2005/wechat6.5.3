package com.tencent.mm.protocal.c;

import com.tencent.mm.ba.a;

public final class axg extends a {
    public int cHn;
    public String cHo;
    public long cHp;
    public int mUx;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            aVar.dV(1, this.cHn);
            if (this.cHo != null) {
                aVar.e(2, this.cHo);
            }
            aVar.C(3, this.cHp);
            aVar.dV(4, this.mUx);
            return 0;
        } else if (i == 1) {
            r0 = a.a.a.a.dS(1, this.cHn) + 0;
            if (this.cHo != null) {
                r0 += a.a.a.b.b.a.f(2, this.cHo);
            }
            return (r0 + a.a.a.a.B(3, this.cHp)) + a.a.a.a.dS(4, this.mUx);
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
            axg com_tencent_mm_protocal_c_axg = (axg) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    com_tencent_mm_protocal_c_axg.cHn = aVar3.pMj.mH();
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_axg.cHo = aVar3.pMj.readString();
                    return 0;
                case 3:
                    com_tencent_mm_protocal_c_axg.cHp = aVar3.pMj.mI();
                    return 0;
                case 4:
                    com_tencent_mm_protocal_c_axg.mUx = aVar3.pMj.mH();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
