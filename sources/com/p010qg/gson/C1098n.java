package com.p010qg.gson;

import com.p010qg.gson.internal.C0990a;
import com.p010qg.gson.internal.C1065f;
import java.math.BigInteger;

/* renamed from: com.qg.gson.n */
public final class C1098n extends C0988i {

    /* renamed from: a */
    private final Object f528a;

    public C1098n(Boolean bool) {
        this.f528a = C0990a.m365a(bool);
    }

    /* renamed from: a */
    private static boolean m698a(C1098n nVar) {
        Object obj = nVar.f528a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1098n.class != obj.getClass()) {
            return false;
        }
        C1098n nVar = (C1098n) obj;
        if (this.f528a == null) {
            if (nVar.f528a == null) {
                return true;
            }
            return false;
        } else if (!m698a(this) || !m698a(nVar)) {
            Object obj2 = this.f528a;
            if (!(obj2 instanceof Number) || !(nVar.f528a instanceof Number)) {
                return obj2.equals(nVar.f528a);
            }
            double doubleValue = mo11777l().doubleValue();
            double doubleValue2 = nVar.mo11777l().doubleValue();
            if (doubleValue == doubleValue2) {
                return true;
            }
            if (!Double.isNaN(doubleValue) || !Double.isNaN(doubleValue2)) {
                return false;
            }
            return true;
        } else if (mo11777l().longValue() == nVar.mo11777l().longValue()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: h */
    public boolean mo11772h() {
        if (mo11779n()) {
            return ((Boolean) this.f528a).booleanValue();
        }
        return Boolean.parseBoolean(mo11778m());
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f528a == null) {
            return 31;
        }
        if (m698a(this)) {
            doubleToLongBits = mo11777l().longValue();
        } else {
            Object obj = this.f528a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(mo11777l().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    /* renamed from: i */
    public double mo11774i() {
        return mo11780o() ? mo11777l().doubleValue() : Double.parseDouble(mo11778m());
    }

    /* renamed from: j */
    public int mo11775j() {
        return mo11780o() ? mo11777l().intValue() : Integer.parseInt(mo11778m());
    }

    /* renamed from: k */
    public long mo11776k() {
        return mo11780o() ? mo11777l().longValue() : Long.parseLong(mo11778m());
    }

    /* renamed from: l */
    public Number mo11777l() {
        Object obj = this.f528a;
        return obj instanceof String ? new C1065f((String) this.f528a) : (Number) obj;
    }

    /* renamed from: m */
    public String mo11778m() {
        if (mo11780o()) {
            return mo11777l().toString();
        }
        if (mo11779n()) {
            return ((Boolean) this.f528a).toString();
        }
        return (String) this.f528a;
    }

    /* renamed from: n */
    public boolean mo11779n() {
        return this.f528a instanceof Boolean;
    }

    /* renamed from: o */
    public boolean mo11780o() {
        return this.f528a instanceof Number;
    }

    /* renamed from: p */
    public boolean mo11781p() {
        return this.f528a instanceof String;
    }

    public C1098n(Number number) {
        this.f528a = C0990a.m365a(number);
    }

    public C1098n(String str) {
        this.f528a = C0990a.m365a(str);
    }
}
