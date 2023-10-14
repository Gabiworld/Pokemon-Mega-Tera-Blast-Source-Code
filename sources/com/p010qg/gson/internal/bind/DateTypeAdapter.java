package com.p010qg.gson.internal.bind;

import com.p010qg.gson.C1101q;
import com.p010qg.gson.C1111u;
import com.p010qg.gson.Gson;
import com.p010qg.gson.TypeAdapter;
import com.p010qg.gson.internal.C1063d;
import com.p010qg.gson.internal.C1075i;
import com.p010qg.gson.internal.bind.p021c.C1047a;
import com.p010qg.gson.p024w.C1117a;
import com.p010qg.gson.p025x.C1118a;
import com.p010qg.gson.p025x.C1120b;
import com.p010qg.gson.p025x.C1121c;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: com.qg.gson.internal.bind.DateTypeAdapter */
public final class DateTypeAdapter extends TypeAdapter<Date> {

    /* renamed from: b */
    public static final C1111u f338b = new C1111u() {
        /* renamed from: a */
        public <T> TypeAdapter<T> mo11601a(Gson gson, C1117a<T> aVar) {
            if (aVar.mo11792a() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a */
    private final List<DateFormat> f339a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f339a = arrayList;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C1063d.m638c()) {
            arrayList.add(C1075i.m656a(2, 2));
        }
    }

    /* renamed from: a */
    public Date m398a(C1118a aVar) throws IOException {
        if (aVar.mo11679q() != C1120b.NULL) {
            return m396a(aVar.mo11678p());
        }
        aVar.mo11677o();
        return null;
    }

    /* renamed from: a */
    private synchronized Date m396a(String str) {
        for (DateFormat parse : this.f339a) {
            try {
                return parse.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return C1047a.m613a(str, new ParsePosition(0));
        } catch (ParseException e) {
            throw new C1101q(str, e);
        }
    }

    /* renamed from: a */
    public synchronized void mo11576a(C1121c cVar, Date date) throws IOException {
        if (date == null) {
            cVar.mo11698h();
        } else {
            cVar.mo11693c(this.f339a.get(0).format(date));
        }
    }
}
