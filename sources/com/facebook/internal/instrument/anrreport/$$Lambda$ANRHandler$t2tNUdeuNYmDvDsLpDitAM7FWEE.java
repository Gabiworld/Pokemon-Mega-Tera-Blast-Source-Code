package com.facebook.internal.instrument.anrreport;

import com.facebook.internal.instrument.InstrumentData;
import java.util.Comparator;

/* renamed from: com.facebook.internal.instrument.anrreport.-$$Lambda$ANRHandler$t2tNUdeuNYmDvDsLpDitAM7FWEE  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ANRHandler$t2tNUdeuNYmDvDsLpDitAM7FWEE implements Comparator {
    public static final /* synthetic */ $$Lambda$ANRHandler$t2tNUdeuNYmDvDsLpDitAM7FWEE INSTANCE = new $$Lambda$ANRHandler$t2tNUdeuNYmDvDsLpDitAM7FWEE();

    private /* synthetic */ $$Lambda$ANRHandler$t2tNUdeuNYmDvDsLpDitAM7FWEE() {
    }

    public final int compare(Object obj, Object obj2) {
        return ANRHandler.m2580sendANRReports$lambda2((InstrumentData) obj, (InstrumentData) obj2);
    }
}
