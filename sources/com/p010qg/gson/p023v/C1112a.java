package com.p010qg.gson.p023v;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.qg.gson.v.a */
public @interface C1112a {
    boolean deserialize() default true;

    boolean serialize() default true;
}
