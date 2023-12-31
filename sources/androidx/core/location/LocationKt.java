package androidx.core.location;

import android.location.Location;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0004"}, mo13302d2 = {"component1", "", "Landroid/location/Location;", "component2", "core-ktx_release"}, mo13303k = 2, mo13304mv = {1, 1, 16})
/* compiled from: Location.kt */
public final class LocationKt {
    public static final double component1(Location location) {
        Intrinsics.checkParameterIsNotNull(location, "$this$component1");
        return location.getLatitude();
    }

    public static final double component2(Location location) {
        Intrinsics.checkParameterIsNotNull(location, "$this$component2");
        return location.getLongitude();
    }
}
