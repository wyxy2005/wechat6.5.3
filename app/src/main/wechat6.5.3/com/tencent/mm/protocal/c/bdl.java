package com.tencent.mm.protocal.c;

import a.a.a.b;
import a.a.a.c.a;
import java.util.LinkedList;

public final class bdl extends aqp {
    public String mXo;
    public String mXp;
    public int maG;
    public are mgD;
    public String mhc;
    public String mhd;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mgD == null) {
                throw new b("Not all required fields were included: RandomEncryKey");
            }
            if (this.mPU != null) {
                aVar.dX(1, this.mPU.aHr());
                this.mPU.a(aVar);
            }
            if (this.mXo != null) {
                aVar.e(2, this.mXo);
            }
            if (this.mXp != null) {
                aVar.e(3, this.mXp);
            }
            if (this.mhc != null) {
                aVar.e(4, this.mhc);
            }
            if (this.mhd != null) {
                aVar.e(5, this.mhd);
            }
            aVar.dV(6, this.maG);
            if (this.mgD == null) {
                return 0;
            }
            aVar.dX(7, this.mgD.aHr());
            this.mgD.a(aVar);
            return 0;
        } else if (i == 1) {
            if (this.mPU != null) {
                r0 = a.a.a.a.dU(1, this.mPU.aHr()) + 0;
            } else {
                r0 = 0;
            }
            if (this.mXo != null) {
                r0 += a.a.a.b.b.a.f(2, this.mXo);
            }
            if (this.mXp != null) {
                r0 += a.a.a.b.b.a.f(3, this.mXp);
            }
            if (this.mhc != null) {
                r0 += a.a.a.b.b.a.f(4, this.mhc);
            }
            if (this.mhd != null) {
                r0 += a.a.a.b.b.a.f(5, this.mhd);
            }
            r0 += a.a.a.a.dS(6, this.maG);
            if (this.mgD != null) {
                r0 += a.a.a.a.dU(7, this.mgD.aHr());
            }
            return r0;
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = aqp.a(aVar2); r0 > 0; r0 = aqp.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            if (this.mgD != null) {
                return 0;
            }
            throw new b("Not all required fields were included: RandomEncryKey");
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            bdl com_tencent_mm_protocal_c_bdl = (bdl) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList zQ;
            int size;
            byte[] bArr;
            a.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        en enVar = new en();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, aqp.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_bdl.mPU = enVar;
                    }
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_bdl.mXo = aVar3.pMj.readString();
                    return 0;
                case 3:
                    com_tencent_mm_protocal_c_bdl.mXp = aVar3.pMj.readString();
                    return 0;
                case 4:
                    com_tencent_mm_protocal_c_bdl.mhc = aVar3.pMj.readString();
                    return 0;
                case 5:
                    com_tencent_mm_protocal_c_bdl.mhd = aVar3.pMj.readString();
                    return 0;
                case 6:
                    com_tencent_mm_protocal_c_bdl.maG = aVar3.pMj.mH();
                    return 0;
                case 7:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        are com_tencent_mm_protocal_c_are = new are();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = com_tencent_mm_protocal_c_are.a(aVar4, com_tencent_mm_protocal_c_are, aqp.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_bdl.mgD = com_tencent_mm_protocal_c_are;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
