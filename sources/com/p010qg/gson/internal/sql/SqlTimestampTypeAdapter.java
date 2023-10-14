package com.p010qg.gson.internal.sql;

import com.p010qg.gson.C1111u;
import com.p010qg.gson.Gson;
import com.p010qg.gson.TypeAdapter;
import com.p010qg.gson.p024w.C1117a;
import com.p010qg.gson.p025x.C1118a;
import com.p010qg.gson.p025x.C1121c;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

/* renamed from: com.qg.gson.internal.sql.SqlTimestampTypeAdapter */
class SqlTimestampTypeAdapter extends TypeAdapter<Timestamp> {

    /* renamed from: b */
    static final C1111u f520b = new C1111u() {
        /* renamed from: a */
        public <T> TypeAdapter<T> mo11601a(Gson gson, C1117a<T> aVar) {
            if (aVar.mo11792a() == Timestamp.class) {
                return new SqlTimestampTypeAdapter(gson.mo11559a(Date.class));
            }
            return null;
        }
    };

    /* renamed from: a */
    private final TypeAdapter<Date> f521a;

    private SqlTimestampTypeAdapter(TypeAdapter<Date> typeAdapter) {
        this.f521a = typeAdapter;
    }

    /* renamed from: a */
    public Timestamp m688a(C1118a aVar) throws IOException {
        Date a = this.f521a.mo11574a(aVar);
        if (a != null) {
            return new Timestamp(a.getTime());
        }
        return null;
    }

    /* renamed from: a */
    public void mo11576a(C1121c cVar, Timestamp timestamp) throws IOException {
        this.f521a.mo11576a(cVar, timestamp);
    }
}
