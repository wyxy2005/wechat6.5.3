package com.tencent.mm.protocal.c;

import a.a.a.b;
import a.a.a.c.a;
import java.util.LinkedList;

public final class ath extends aqp {
    public String hQP;
    public int mRz;
    public int maG;
    public afu moG;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.moG == null) {
                throw new b("Not all required fields were included: Loc");
            }
            if (this.mPU != null) {
                aVar.dX(1, this.mPU.aHr());
                this.mPU.a(aVar);
            }
            if (this.moG != null) {
                aVar.dX(2, this.moG.aHr());
                this.moG.a(aVar);
            }
            aVar.dV(3, this.mRz);
            aVar.dV(4, this.maG);
            if (this.hQP == null) {
                return 0;
            }
            aVar.e(5, this.hQP);
            return 0;
        } else if (i == 1) {
            if (this.mPU != null) {
                r0 = a.a.a.a.dU(1, this.mPU.aHr()) + 0;
            } else {
                r0 = 0;
            }
            if (this.moG != null) {
                r0 += a.a.a.a.dU(2, this.moG.aHr());
            }
            r0 = (r0 + a.a.a.a.dS(3, this.mRz)) + a.a.a.a.dS(4, this.maG);
            if (this.hQP != null) {
                r0 += a.a.a.b.b.a.f(5, this.hQP);
            }
            return r0;
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = com.tencent.mm.ba.a.a(aVar2); r0 > 0; r0 = com.tencent.mm.ba.a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            if (this.moG != null) {
                return 0;
            }
            throw new b("Not all required fields were included: Loc");
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            ath com_tencent_mm_protocal_c_ath = (ath) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList zQ;
            int size;
            byte[] bArr;
            com.tencent.mm.ba.a enVar;
            a.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        enVar = new en();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, com.tencent.mm.ba.a.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_ath.mPU = enVar;
                    }
                    return 0;
                case 2:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        enVar = new afu();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, com.tencent.mm.ba.a.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_ath.moG = enVar;
                    }
                    return 0;
                case 3:
                    com_tencent_mm_protocal_c_ath.mRz = aVar3.pMj.mH();
                    return 0;
                case 4:
                    com_tencent_mm_protocal_c_ath.maG = aVar3.pMj.mH();
                    return 0;
                case 5:
                    com_tencent_mm_protocal_c_ath.hQP = aVar3.pMj.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
