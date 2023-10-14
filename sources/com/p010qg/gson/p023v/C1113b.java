package com.p010qg.gson.p023v;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.qg.gson.v.b */
public @interface C1113b {
    boolean nullSafe() default true;

    Class<?> value();
}
