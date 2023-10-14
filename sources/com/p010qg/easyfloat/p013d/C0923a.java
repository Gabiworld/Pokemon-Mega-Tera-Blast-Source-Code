package com.p010qg.easyfloat.p013d;

import android.view.View;
import com.p010qg.easyfloat.p014e.C0924a;
import com.p010qg.easyfloat.p014e.C0925b;
import com.p010qg.easyfloat.p015f.C0926a;
import com.p010qg.easyfloat.p015f.C0928b;
import com.p010qg.easyfloat.p015f.C0929c;
import com.p010qg.easyfloat.p015f.C0930d;
import com.p010qg.easyfloat.p015f.C0932f;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.qg.easyfloat.d.a */
public final class C0923a {

    /* renamed from: A */
    private boolean f135A;

    /* renamed from: B */
    private boolean f136B;

    /* renamed from: C */
    private int f137C;

    /* renamed from: a */
    private Integer f138a;

    /* renamed from: b */
    private View f139b;

    /* renamed from: c */
    private String f140c;

    /* renamed from: d */
    private boolean f141d;

    /* renamed from: e */
    private boolean f142e;

    /* renamed from: f */
    private boolean f143f;

    /* renamed from: g */
    private boolean f144g;

    /* renamed from: h */
    private boolean f145h;

    /* renamed from: i */
    private boolean f146i;

    /* renamed from: j */
    private C0925b f147j;

    /* renamed from: k */
    private C0924a f148k;

    /* renamed from: l */
    private boolean f149l;

    /* renamed from: m */
    private boolean f150m;

    /* renamed from: n */
    private int f151n;

    /* renamed from: o */
    private Pair<Integer, Integer> f152o;

    /* renamed from: p */
    private Pair<Integer, Integer> f153p;

    /* renamed from: q */
    private int f154q;

    /* renamed from: r */
    private int f155r;

    /* renamed from: s */
    private int f156s;

    /* renamed from: t */
    private int f157t;

    /* renamed from: u */
    private C0932f f158u;

    /* renamed from: v */
    private C0930d f159v;

    /* renamed from: w */
    private C0926a f160w;

    /* renamed from: x */
    private C0929c f161x;

    /* renamed from: y */
    private C0928b f162y;

    /* renamed from: z */
    private final Set<String> f163z;

    public C0923a() {
        this((Integer) null, (View) null, (String) null, false, false, false, false, false, false, (C0925b) null, (C0924a) null, false, false, 0, (Pair) null, (Pair) null, 0, 0, 0, 0, (C0932f) null, (C0930d) null, (C0926a) null, (C0929c) null, (C0928b) null, (Set) null, false, false, 0, 536870911, (DefaultConstructorMarker) null);
    }

    public C0923a(Integer num, View view, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, C0925b bVar, C0924a aVar, boolean z7, boolean z8, int i, Pair<Integer, Integer> pair, Pair<Integer, Integer> pair2, int i2, int i3, int i4, int i5, C0932f fVar, C0930d dVar, C0926a aVar2, C0929c cVar, C0928b bVar2, Set<String> set, boolean z9, boolean z10, int i6) {
        C0925b bVar3 = bVar;
        C0924a aVar3 = aVar;
        Pair<Integer, Integer> pair3 = pair;
        Pair<Integer, Integer> pair4 = pair2;
        C0928b bVar4 = bVar2;
        Set<String> set2 = set;
        Intrinsics.checkNotNullParameter(bVar3, "sidePattern");
        Intrinsics.checkNotNullParameter(aVar3, "showPattern");
        Intrinsics.checkNotNullParameter(pair3, "offsetPair");
        Intrinsics.checkNotNullParameter(pair4, "locationPair");
        Intrinsics.checkNotNullParameter(bVar4, "displayHeight");
        Intrinsics.checkNotNullParameter(set2, "filterSet");
        this.f138a = num;
        this.f139b = view;
        this.f140c = str;
        this.f141d = z;
        this.f142e = z2;
        this.f143f = z3;
        this.f144g = z4;
        this.f145h = z5;
        this.f146i = z6;
        this.f147j = bVar3;
        this.f148k = aVar3;
        this.f149l = z7;
        this.f150m = z8;
        this.f151n = i;
        this.f152o = pair3;
        this.f153p = pair4;
        this.f154q = i2;
        this.f155r = i3;
        this.f156s = i4;
        this.f157t = i5;
        this.f158u = fVar;
        this.f159v = dVar;
        this.f160w = aVar2;
        this.f161x = cVar;
        this.f162y = bVar4;
        this.f163z = set2;
        this.f135A = z9;
        this.f136B = z10;
        this.f137C = i6;
    }

    /* renamed from: A */
    public final boolean mo11408A() {
        return this.f143f;
    }

    /* renamed from: B */
    public final boolean mo11409B() {
        return this.f142e;
    }

    /* renamed from: a */
    public final void mo11416a(Integer num) {
        this.f138a = num;
    }

    /* renamed from: b */
    public final void mo11421b(boolean z) {
        this.f142e = z;
    }

    /* renamed from: c */
    public final void mo11423c(boolean z) {
        this.f141d = z;
    }

    /* renamed from: d */
    public final boolean mo11425d() {
        return this.f141d;
    }

    /* renamed from: e */
    public final boolean mo11427e() {
        return this.f135A;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0923a)) {
            return false;
        }
        C0923a aVar = (C0923a) obj;
        return Intrinsics.areEqual((Object) this.f138a, (Object) aVar.f138a) && Intrinsics.areEqual((Object) this.f139b, (Object) aVar.f139b) && Intrinsics.areEqual((Object) this.f140c, (Object) aVar.f140c) && this.f141d == aVar.f141d && this.f142e == aVar.f142e && this.f143f == aVar.f143f && this.f144g == aVar.f144g && this.f145h == aVar.f145h && this.f146i == aVar.f146i && this.f147j == aVar.f147j && this.f148k == aVar.f148k && this.f149l == aVar.f149l && this.f150m == aVar.f150m && this.f151n == aVar.f151n && Intrinsics.areEqual((Object) this.f152o, (Object) aVar.f152o) && Intrinsics.areEqual((Object) this.f153p, (Object) aVar.f153p) && this.f154q == aVar.f154q && this.f155r == aVar.f155r && this.f156s == aVar.f156s && this.f157t == aVar.f157t && Intrinsics.areEqual((Object) this.f158u, (Object) aVar.f158u) && Intrinsics.areEqual((Object) this.f159v, (Object) aVar.f159v) && Intrinsics.areEqual((Object) this.f160w, (Object) aVar.f160w) && Intrinsics.areEqual((Object) this.f161x, (Object) aVar.f161x) && Intrinsics.areEqual((Object) this.f162y, (Object) aVar.f162y) && Intrinsics.areEqual((Object) this.f163z, (Object) aVar.f163z) && this.f135A == aVar.f135A && this.f136B == aVar.f136B && this.f137C == aVar.f137C;
    }

    /* renamed from: f */
    public final void mo11430f(boolean z) {
        this.f144g = z;
    }

    /* renamed from: g */
    public final C0929c mo11431g() {
        return this.f161x;
    }

    /* renamed from: h */
    public final C0926a mo11432h() {
        return this.f160w;
    }

    public int hashCode() {
        Integer num = this.f138a;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        View view = this.f139b;
        int hashCode2 = (hashCode + (view == null ? 0 : view.hashCode())) * 31;
        String str = this.f140c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f141d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f142e;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f143f;
        if (z4) {
            z4 = true;
        }
        int i4 = (i3 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f144g;
        if (z5) {
            z5 = true;
        }
        int i5 = (i4 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.f145h;
        if (z6) {
            z6 = true;
        }
        int i6 = (i5 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.f146i;
        if (z7) {
            z7 = true;
        }
        int hashCode4 = (((((i6 + (z7 ? 1 : 0)) * 31) + this.f147j.hashCode()) * 31) + this.f148k.hashCode()) * 31;
        boolean z8 = this.f149l;
        if (z8) {
            z8 = true;
        }
        int i7 = (hashCode4 + (z8 ? 1 : 0)) * 31;
        boolean z9 = this.f150m;
        if (z9) {
            z9 = true;
        }
        int hashCode5 = (((((((((((((((i7 + (z9 ? 1 : 0)) * 31) + this.f151n) * 31) + this.f152o.hashCode()) * 31) + this.f153p.hashCode()) * 31) + this.f154q) * 31) + this.f155r) * 31) + this.f156s) * 31) + this.f157t) * 31;
        C0932f fVar = this.f158u;
        int hashCode6 = (hashCode5 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        C0930d dVar = this.f159v;
        int hashCode7 = (hashCode6 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        C0926a aVar = this.f160w;
        int hashCode8 = (hashCode7 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        C0929c cVar = this.f161x;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        int hashCode9 = (((((hashCode8 + i) * 31) + this.f162y.hashCode()) * 31) + this.f163z.hashCode()) * 31;
        boolean z10 = this.f135A;
        if (z10) {
            z10 = true;
        }
        int i8 = (hashCode9 + (z10 ? 1 : 0)) * 31;
        boolean z11 = this.f136B;
        if (!z11) {
            z2 = z11;
        }
        return ((i8 + (z2 ? 1 : 0)) * 31) + this.f137C;
    }

    /* renamed from: i */
    public final String mo11434i() {
        return this.f140c;
    }

    /* renamed from: j */
    public final int mo11435j() {
        return this.f151n;
    }

    /* renamed from: k */
    public final boolean mo11436k() {
        return this.f145h;
    }

    /* renamed from: l */
    public final boolean mo11437l() {
        return this.f150m;
    }

    /* renamed from: m */
    public final boolean mo11438m() {
        return this.f146i;
    }

    /* renamed from: n */
    public final C0932f mo11439n() {
        return this.f158u;
    }

    /* renamed from: o */
    public final int mo11440o() {
        return this.f137C;
    }

    /* renamed from: p */
    public final Integer mo11441p() {
        return this.f138a;
    }

    /* renamed from: q */
    public final View mo11442q() {
        return this.f139b;
    }

    /* renamed from: r */
    public final int mo11443r() {
        return this.f154q;
    }

    /* renamed from: s */
    public final Pair<Integer, Integer> mo11444s() {
        return this.f153p;
    }

    /* renamed from: t */
    public final boolean mo11445t() {
        return this.f136B;
    }

    public String toString() {
        return "FloatConfig(layoutId=" + this.f138a + ", layoutView=" + this.f139b + ", floatTag=" + this.f140c + ", dragEnable=" + this.f141d + ", isDrag=" + this.f142e + ", isAnim=" + this.f143f + ", isShow=" + this.f144g + ", hasEditText=" + this.f145h + ", immersionStatusBar=" + this.f146i + ", sidePattern=" + this.f147j + ", showPattern=" + this.f148k + ", widthMatch=" + this.f149l + ", heightMatch=" + this.f150m + ", gravity=" + this.f151n + ", offsetPair=" + this.f152o + ", locationPair=" + this.f153p + ", leftBorder=" + this.f154q + ", topBorder=" + this.f155r + ", rightBorder=" + this.f156s + ", bottomBorder=" + this.f157t + ", invokeView=" + this.f158u + ", callbacks=" + this.f159v + ", floatCallbacks=" + this.f160w + ", floatAnimator=" + this.f161x + ", displayHeight=" + this.f162y + ", filterSet=" + this.f163z + ", filterSelf=" + this.f135A + ", needShow=" + this.f136B + ", layoutChangedGravity=" + this.f137C + ')';
    }

    /* renamed from: u */
    public final Pair<Integer, Integer> mo11447u() {
        return this.f152o;
    }

    /* renamed from: v */
    public final int mo11448v() {
        return this.f156s;
    }

    /* renamed from: w */
    public final C0924a mo11449w() {
        return this.f148k;
    }

    /* renamed from: x */
    public final C0925b mo11450x() {
        return this.f147j;
    }

    /* renamed from: y */
    public final int mo11451y() {
        return this.f155r;
    }

    /* renamed from: z */
    public final boolean mo11452z() {
        return this.f149l;
    }

    /* renamed from: a */
    public final void mo11412a(View view) {
        this.f139b = view;
    }

    /* renamed from: b */
    public final C0930d mo11420b() {
        return this.f159v;
    }

    /* renamed from: c */
    public final C0928b mo11422c() {
        return this.f162y;
    }

    /* renamed from: d */
    public final void mo11424d(boolean z) {
        this.f146i = z;
    }

    /* renamed from: e */
    public final void mo11426e(boolean z) {
        this.f136B = z;
    }

    /* renamed from: f */
    public final Set<String> mo11429f() {
        return this.f163z;
    }

    /* renamed from: a */
    public final void mo11417a(String str) {
        this.f140c = str;
    }

    /* renamed from: a */
    public final void mo11419a(boolean z) {
        this.f143f = z;
    }

    /* renamed from: a */
    public final void mo11413a(C0925b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f147j = bVar;
    }

    /* renamed from: a */
    public final void mo11411a(int i) {
        this.f151n = i;
    }

    /* renamed from: a */
    public final void mo11418a(Pair<Integer, Integer> pair) {
        Intrinsics.checkNotNullParameter(pair, "<set-?>");
        this.f152o = pair;
    }

    /* renamed from: a */
    public final int mo11410a() {
        return this.f157t;
    }

    /* renamed from: a */
    public final void mo11415a(C0932f fVar) {
        this.f158u = fVar;
    }

    /* renamed from: a */
    public final void mo11414a(C0926a aVar) {
        this.f160w = aVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C0923a(java.lang.Integer r31, android.view.View r32, java.lang.String r33, boolean r34, boolean r35, boolean r36, boolean r37, boolean r38, boolean r39, com.p010qg.easyfloat.p014e.C0925b r40, com.p010qg.easyfloat.p014e.C0924a r41, boolean r42, boolean r43, int r44, kotlin.Pair r45, kotlin.Pair r46, int r47, int r48, int r49, int r50, com.p010qg.easyfloat.p015f.C0932f r51, com.p010qg.easyfloat.p015f.C0930d r52, com.p010qg.easyfloat.p015f.C0926a r53, com.p010qg.easyfloat.p015f.C0929c r54, com.p010qg.easyfloat.p015f.C0928b r55, java.util.Set r56, boolean r57, boolean r58, int r59, int r60, kotlin.jvm.internal.DefaultConstructorMarker r61) {
        /*
            r30 = this;
            r0 = r60
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r31
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r32
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r33
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 1
            goto L_0x0022
        L_0x0020:
            r5 = r34
        L_0x0022:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x0028
            r7 = 0
            goto L_0x002a
        L_0x0028:
            r7 = r35
        L_0x002a:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x0030
            r9 = 0
            goto L_0x0032
        L_0x0030:
            r9 = r36
        L_0x0032:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x0038
            r10 = 0
            goto L_0x003a
        L_0x0038:
            r10 = r37
        L_0x003a:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x0040
            r11 = 0
            goto L_0x0042
        L_0x0040:
            r11 = r38
        L_0x0042:
            r12 = r0 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x0048
            r12 = 0
            goto L_0x004a
        L_0x0048:
            r12 = r39
        L_0x004a:
            r13 = r0 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x0051
            com.qg.easyfloat.e.b r13 = com.p010qg.easyfloat.p014e.C0925b.DEFAULT
            goto L_0x0053
        L_0x0051:
            r13 = r40
        L_0x0053:
            r14 = r0 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x005a
            com.qg.easyfloat.e.a r14 = com.p010qg.easyfloat.p014e.C0924a.CURRENT_ACTIVITY
            goto L_0x005c
        L_0x005a:
            r14 = r41
        L_0x005c:
            r15 = r0 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L_0x0062
            r15 = 0
            goto L_0x0064
        L_0x0062:
            r15 = r42
        L_0x0064:
            r2 = r0 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x006a
            r2 = 0
            goto L_0x006c
        L_0x006a:
            r2 = r43
        L_0x006c:
            r6 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r6 == 0) goto L_0x0072
            r6 = 0
            goto L_0x0074
        L_0x0072:
            r6 = r44
        L_0x0074:
            r8 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r8 == 0) goto L_0x008c
            kotlin.Pair r8 = new kotlin.Pair
            r17 = r6
            r16 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r16)
            r18 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r8.<init>(r6, r2)
            goto L_0x0094
        L_0x008c:
            r18 = r2
            r17 = r6
            r16 = 0
            r8 = r45
        L_0x0094:
            r2 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00aa
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.Integer r6 = java.lang.Integer.valueOf(r16)
            r19 = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)
            r2.<init>(r6, r8)
            goto L_0x00ae
        L_0x00aa:
            r19 = r8
            r2 = r46
        L_0x00ae:
            r6 = 65536(0x10000, float:9.18355E-41)
            r6 = r6 & r0
            if (r6 == 0) goto L_0x00b5
            r6 = 0
            goto L_0x00b7
        L_0x00b5:
            r6 = r47
        L_0x00b7:
            r8 = 131072(0x20000, float:1.83671E-40)
            r8 = r8 & r0
            if (r8 == 0) goto L_0x00bf
            r8 = -999(0xfffffffffffffc19, float:NaN)
            goto L_0x00c1
        L_0x00bf:
            r8 = r48
        L_0x00c1:
            r20 = 262144(0x40000, float:3.67342E-40)
            r20 = r0 & r20
            r21 = 9999(0x270f, float:1.4012E-41)
            if (r20 == 0) goto L_0x00cc
            r20 = 9999(0x270f, float:1.4012E-41)
            goto L_0x00ce
        L_0x00cc:
            r20 = r49
        L_0x00ce:
            r22 = 524288(0x80000, float:7.34684E-40)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00d5
            goto L_0x00d7
        L_0x00d5:
            r21 = r50
        L_0x00d7:
            r22 = 1048576(0x100000, float:1.469368E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00e0
            r22 = 0
            goto L_0x00e2
        L_0x00e0:
            r22 = r51
        L_0x00e2:
            r23 = 2097152(0x200000, float:2.938736E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00eb
            r23 = 0
            goto L_0x00ed
        L_0x00eb:
            r23 = r52
        L_0x00ed:
            r24 = 4194304(0x400000, float:5.877472E-39)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00f6
            r24 = 0
            goto L_0x00f8
        L_0x00f6:
            r24 = r53
        L_0x00f8:
            r25 = 8388608(0x800000, float:1.17549435E-38)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x0104
            com.qg.easyfloat.b.b r25 = new com.qg.easyfloat.b.b
            r25.<init>()
            goto L_0x0106
        L_0x0104:
            r25 = r54
        L_0x0106:
            r26 = 16777216(0x1000000, float:2.3509887E-38)
            r26 = r0 & r26
            if (r26 == 0) goto L_0x0112
            com.qg.easyfloat.h.a r26 = new com.qg.easyfloat.h.a
            r26.<init>()
            goto L_0x0114
        L_0x0112:
            r26 = r55
        L_0x0114:
            r27 = 33554432(0x2000000, float:9.403955E-38)
            r27 = r0 & r27
            if (r27 == 0) goto L_0x0120
            java.util.LinkedHashSet r27 = new java.util.LinkedHashSet
            r27.<init>()
            goto L_0x0122
        L_0x0120:
            r27 = r56
        L_0x0122:
            r28 = 67108864(0x4000000, float:1.5046328E-36)
            r28 = r0 & r28
            if (r28 == 0) goto L_0x0129
            goto L_0x012b
        L_0x0129:
            r16 = r57
        L_0x012b:
            r28 = 134217728(0x8000000, float:3.85186E-34)
            r28 = r0 & r28
            if (r28 == 0) goto L_0x0134
            r28 = 1
            goto L_0x0136
        L_0x0134:
            r28 = r58
        L_0x0136:
            r29 = 268435456(0x10000000, float:2.5243549E-29)
            r0 = r0 & r29
            if (r0 == 0) goto L_0x0140
            r0 = 8388659(0x800033, float:1.1755015E-38)
            goto L_0x0142
        L_0x0140:
            r0 = r59
        L_0x0142:
            r31 = r30
            r32 = r1
            r33 = r3
            r34 = r4
            r35 = r5
            r36 = r7
            r37 = r9
            r38 = r10
            r39 = r11
            r40 = r12
            r41 = r13
            r42 = r14
            r43 = r15
            r44 = r18
            r45 = r17
            r46 = r19
            r47 = r2
            r48 = r6
            r49 = r8
            r50 = r20
            r51 = r21
            r52 = r22
            r53 = r23
            r54 = r24
            r55 = r25
            r56 = r26
            r57 = r27
            r58 = r16
            r59 = r28
            r60 = r0
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p010qg.easyfloat.p013d.C0923a.<init>(java.lang.Integer, android.view.View, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, com.qg.easyfloat.e.b, com.qg.easyfloat.e.a, boolean, boolean, int, kotlin.Pair, kotlin.Pair, int, int, int, int, com.qg.easyfloat.f.f, com.qg.easyfloat.f.d, com.qg.easyfloat.f.a, com.qg.easyfloat.f.c, com.qg.easyfloat.f.b, java.util.Set, boolean, boolean, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
