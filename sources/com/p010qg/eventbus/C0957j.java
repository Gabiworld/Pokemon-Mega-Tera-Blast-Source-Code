package com.p010qg.eventbus;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.qg.eventbus.j */
final class C0957j {

    /* renamed from: d */
    private static final List<C0957j> f257d = new ArrayList();

    /* renamed from: a */
    Object f258a;

    /* renamed from: b */
    C0964p f259b;

    /* renamed from: c */
    C0957j f260c;

    private C0957j(Object obj, C0964p pVar) {
        this.f258a = obj;
        this.f259b = pVar;
    }

    /* renamed from: a */
    static C0957j m251a(C0964p pVar, Object obj) {
        List<C0957j> list = f257d;
        synchronized (list) {
            int size = list.size();
            if (size <= 0) {
                return new C0957j(obj, pVar);
            }
            C0957j remove = list.remove(size - 1);
            remove.f258a = obj;
            remove.f259b = pVar;
            remove.f260c = null;
            return remove;
        }
    }

    /* renamed from: a */
    static void m252a(C0957j jVar) {
        jVar.f258a = null;
        jVar.f259b = null;
        jVar.f260c = null;
        List<C0957j> list = f257d;
        synchronized (list) {
            if (list.size() < 10000) {
                list.add(jVar);
            }
        }
    }
}
