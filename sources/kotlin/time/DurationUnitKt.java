package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(mo13301d1 = {"kotlin/time/DurationUnitKt__DurationUnitJvmKt", "kotlin/time/DurationUnitKt__DurationUnitKt"}, mo13303k = 4, mo13304mv = {1, 5, 1}, mo13306xi = 1)
public final class DurationUnitKt extends DurationUnitKt__DurationUnitKt {

    @Metadata(mo13303k = 3, mo13304mv = {1, 5, 1})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            iArr[TimeUnit.MICROSECONDS.ordinal()] = 2;
            iArr[TimeUnit.MILLISECONDS.ordinal()] = 3;
            iArr[TimeUnit.SECONDS.ordinal()] = 4;
            iArr[TimeUnit.MINUTES.ordinal()] = 5;
            iArr[TimeUnit.HOURS.ordinal()] = 6;
            iArr[TimeUnit.DAYS.ordinal()] = 7;
        }
    }

    private DurationUnitKt() {
    }
}
