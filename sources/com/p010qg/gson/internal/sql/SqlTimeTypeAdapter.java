package com.p010qg.gson.internal.sql;

import com.p010qg.gson.C1101q;
import com.p010qg.gson.C1111u;
import com.p010qg.gson.Gson;
import com.p010qg.gson.TypeAdapter;
import com.p010qg.gson.p024w.C1117a;
import com.p010qg.gson.p025x.C1118a;
import com.p010qg.gson.p025x.C1120b;
import com.p010qg.gson.p025x.C1121c;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: com.qg.gson.internal.sql.SqlTimeTypeAdapter */
final class SqlTimeTypeAdapter extends TypeAdapter<Time> {

    /* renamed from: b */
    static final C1111u f518b = new C1111u() {
        /* renamed from: a */
        public <T> TypeAdapter<T> mo11601a(Gson gson, C1117a<T> aVar) {
            if (aVar.mo11792a() == Time.class) {
                return new SqlTimeTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a */
    private final DateFormat f519a;

    private SqlTimeTypeAdapter() {
        this.f519a = new SimpleDateFormat("hh:mm:ss a");
    }

    /* renamed from: a */
    public synchronized Time m683a(C1118a aVar) throws IOException {
        if (aVar.mo11679q() == C1120b.NULL) {
            aVar.mo11677o();
            return null;
        }
        try {
            return new Time(this.f519a.parse(aVar.mo11678p()).getTime());
        } catch (ParseException e) {
            throw new C1101q((Throwable) e);
        }
    }

    /* renamed from: a */
    public synchronized void mo11576a(C1121c cVar, Time time) throws IOException {
        cVar.mo11693c(time == null ? null : this.f519a.format(time));
    }
}
