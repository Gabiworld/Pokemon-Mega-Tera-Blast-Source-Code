package com.p010qg.gson.internal.bind;

import com.p010qg.gson.C1101q;
import com.p010qg.gson.TypeAdapter;
import com.p010qg.gson.internal.bind.p021c.C1047a;
import com.p010qg.gson.p025x.C1118a;
import com.p010qg.gson.p025x.C1120b;
import com.p010qg.gson.p025x.C1121c;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/* renamed from: com.qg.gson.internal.bind.DefaultDateTypeAdapter */
public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter<T> {

    /* renamed from: a */
    private final C0997a<T> f340a;

    /* renamed from: b */
    private final List<DateFormat> f341b;

    /* renamed from: com.qg.gson.internal.bind.DefaultDateTypeAdapter$a */
    public static abstract class C0997a<T extends Date> {

        /* renamed from: com.qg.gson.internal.bind.DefaultDateTypeAdapter$a$a */
        static class C0998a extends C0997a<Date> {
            C0998a(Class cls) {
                super(cls);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public Date mo11624a(Date date) {
                return date;
            }
        }

        static {
            new C0998a(Date.class);
        }

        protected C0997a(Class<T> cls) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract T mo11624a(Date date);
    }

    public String toString() {
        DateFormat dateFormat = this.f341b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    /* renamed from: a */
    public void mo11576a(C1121c cVar, Date date) throws IOException {
        if (date == null) {
            cVar.mo11698h();
            return;
        }
        synchronized (this.f341b) {
            cVar.mo11693c(this.f341b.get(0).format(date));
        }
    }

    /* renamed from: a */
    public T m404a(C1118a aVar) throws IOException {
        if (aVar.mo11679q() == C1120b.NULL) {
            aVar.mo11677o();
            return null;
        }
        return this.f340a.mo11624a(m402a(aVar.mo11678p()));
    }

    /* renamed from: a */
    private Date m402a(String str) {
        synchronized (this.f341b) {
            for (DateFormat parse : this.f341b) {
                try {
                    Date parse2 = parse.parse(str);
                    return parse2;
                } catch (ParseException unused) {
                }
            }
            try {
                return C1047a.m613a(str, new ParsePosition(0));
            } catch (ParseException e) {
                throw new C1101q(str, e);
            }
        }
    }
}
