package com.p010qg.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* renamed from: com.qg.gson.internal.b */
public final class C0991b {

    /* renamed from: a */
    static final Type[] f325a = new Type[0];

    /* renamed from: com.qg.gson.internal.b$a */
    private static final class C0992a implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Type f326a;

        public C0992a(Type type) {
            this.f326a = C0991b.m379b(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C0991b.m378a((Type) this, (Type) (GenericArrayType) obj);
        }

        public Type getGenericComponentType() {
            return this.f326a;
        }

        public int hashCode() {
            return this.f326a.hashCode();
        }

        public String toString() {
            return C0991b.m387h(this.f326a) + "[]";
        }
    }

    /* renamed from: com.qg.gson.internal.b$b */
    private static final class C0993b implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Type f327a;

        /* renamed from: b */
        private final Type f328b;

        /* renamed from: c */
        private final Type[] f329c;

        public C0993b(Type type, Type type2, Type... typeArr) {
            Type type3;
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                C0990a.m366a(z);
            }
            if (type == null) {
                type3 = null;
            } else {
                type3 = C0991b.m379b(type);
            }
            this.f327a = type3;
            this.f328b = C0991b.m379b(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f329c = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                C0990a.m365a(this.f329c[i]);
                C0991b.m382c(this.f329c[i]);
                Type[] typeArr3 = this.f329c;
                typeArr3[i] = C0991b.m379b(typeArr3[i]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C0991b.m378a((Type) this, (Type) (ParameterizedType) obj);
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f329c.clone();
        }

        public Type getOwnerType() {
            return this.f327a;
        }

        public Type getRawType() {
            return this.f328b;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f329c) ^ this.f328b.hashCode()) ^ C0991b.m367a((Object) this.f327a);
        }

        public String toString() {
            int length = this.f329c.length;
            if (length == 0) {
                return C0991b.m387h(this.f328b);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(C0991b.m387h(this.f328b));
            sb.append("<");
            sb.append(C0991b.m387h(this.f329c[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(C0991b.m387h(this.f329c[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: com.qg.gson.internal.b$c */
    private static final class C0994c implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Type f330a;

        /* renamed from: b */
        private final Type f331b;

        public C0994c(Type[] typeArr, Type[] typeArr2) {
            boolean z = true;
            C0990a.m366a(typeArr2.length <= 1);
            C0990a.m366a(typeArr.length == 1);
            if (typeArr2.length == 1) {
                C0990a.m365a(typeArr2[0]);
                C0991b.m382c(typeArr2[0]);
                C0990a.m366a(typeArr[0] != Object.class ? false : z);
                this.f331b = C0991b.m379b(typeArr2[0]);
                this.f330a = Object.class;
                return;
            }
            C0990a.m365a(typeArr[0]);
            C0991b.m382c(typeArr[0]);
            this.f331b = null;
            this.f330a = C0991b.m379b(typeArr[0]);
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C0991b.m378a((Type) this, (Type) (WildcardType) obj);
        }

        public Type[] getLowerBounds() {
            Type type = this.f331b;
            if (type == null) {
                return C0991b.f325a;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f330a};
        }

        public int hashCode() {
            Type type = this.f331b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f330a.hashCode() + 31);
        }

        public String toString() {
            if (this.f331b != null) {
                return "? super " + C0991b.m387h(this.f331b);
            } else if (this.f330a == Object.class) {
                return "?";
            } else {
                return "? extends " + C0991b.m387h(this.f330a);
            }
        }
    }

    /* renamed from: a */
    public static ParameterizedType m371a(Type type, Type type2, Type... typeArr) {
        return new C0993b(type, type2, typeArr);
    }

    /* renamed from: b */
    public static Type m379b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C0992a(m379b(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C0993b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new C0992a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new C0994c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    /* renamed from: c */
    static void m382c(Type type) {
        C0990a.m366a(!(type instanceof Class) || !((Class) type).isPrimitive());
    }

    /* renamed from: d */
    public static Type m383d(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    /* renamed from: e */
    public static Class<?> m384e(Type type) {
        String str;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C0990a.m366a(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(m384e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return m384e(((WildcardType) type).getUpperBounds()[0]);
            }
            if (type == null) {
                str = "null";
            } else {
                str = type.getClass().getName();
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + str);
        }
    }

    /* renamed from: f */
    public static WildcardType m385f(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getUpperBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new C0994c(typeArr, f325a);
    }

    /* renamed from: g */
    public static WildcardType m386g(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getLowerBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new C0994c(new Type[]{Object.class}, typeArr);
    }

    /* renamed from: h */
    public static String m387h(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* renamed from: a */
    public static GenericArrayType m370a(Type type) {
        return new C0992a(type);
    }

    /* renamed from: a */
    static boolean m377a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public static boolean m378a(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (!m377a((Object) parameterizedType.getOwnerType(), (Object) parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return false;
            }
            return true;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m378a(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return false;
            }
            return true;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: b */
    static Type m380b(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C0990a.m366a(cls2.isAssignableFrom(cls));
        return m374a(type, cls, m373a(type, cls, cls2));
    }

    /* renamed from: b */
    public static Type[] m381b(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type b = m380b(type, cls, Map.class);
        if (b instanceof ParameterizedType) {
            return ((ParameterizedType) b).getActualTypeArguments();
        }
        return new Type[]{Object.class, Object.class};
    }

    /* renamed from: a */
    static int m367a(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: a */
    static Type m373a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
                    return m373a(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m373a(cls.getGenericSuperclass(), (Class<?>) superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: a */
    public static Type m372a(Type type, Class<?> cls) {
        Type b = m380b(type, cls, Collection.class);
        if (b instanceof WildcardType) {
            b = ((WildcardType) b).getUpperBounds()[0];
        }
        if (b instanceof ParameterizedType) {
            return ((ParameterizedType) b).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    /* renamed from: a */
    public static Type m374a(Type type, Class<?> cls, Type type2) {
        return m375a(type, cls, type2, new HashMap());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: java.lang.reflect.GenericArrayType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.reflect.GenericArrayType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: java.lang.reflect.GenericArrayType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: java.lang.reflect.ParameterizedType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: java.lang.reflect.ParameterizedType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: java.lang.reflect.GenericArrayType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: java.lang.reflect.GenericArrayType} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Type m375a(java.lang.reflect.Type r9, java.lang.Class<?> r10, java.lang.reflect.Type r11, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r12) {
        /*
            r0 = 0
        L_0x0001:
            boolean r1 = r11 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L_0x0027
            r1 = r11
            java.lang.reflect.TypeVariable r1 = (java.lang.reflect.TypeVariable) r1
            java.lang.Object r2 = r12.get(r1)
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            if (r2 == 0) goto L_0x0017
            java.lang.Class r9 = java.lang.Void.TYPE
            if (r2 != r9) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r11 = r2
        L_0x0016:
            return r11
        L_0x0017:
            java.lang.Class r11 = java.lang.Void.TYPE
            r12.put(r1, r11)
            if (r0 != 0) goto L_0x001f
            r0 = r1
        L_0x001f:
            java.lang.reflect.Type r11 = m376a((java.lang.reflect.Type) r9, (java.lang.Class<?>) r10, (java.lang.reflect.TypeVariable<?>) r1)
            if (r11 != r1) goto L_0x0001
            goto L_0x00dd
        L_0x0027:
            boolean r1 = r11 instanceof java.lang.Class
            if (r1 == 0) goto L_0x004c
            r1 = r11
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r2 = r1.isArray()
            if (r2 == 0) goto L_0x004c
            java.lang.Class r11 = r1.getComponentType()
            java.lang.reflect.Type r9 = m375a(r9, r10, r11, r12)
            boolean r10 = m377a((java.lang.Object) r11, (java.lang.Object) r9)
            if (r10 == 0) goto L_0x0045
            r11 = r1
            goto L_0x00dd
        L_0x0045:
            java.lang.reflect.GenericArrayType r9 = m370a((java.lang.reflect.Type) r9)
            r11 = r9
            goto L_0x00dd
        L_0x004c:
            boolean r1 = r11 instanceof java.lang.reflect.GenericArrayType
            if (r1 == 0) goto L_0x0068
            java.lang.reflect.GenericArrayType r11 = (java.lang.reflect.GenericArrayType) r11
            java.lang.reflect.Type r1 = r11.getGenericComponentType()
            java.lang.reflect.Type r9 = m375a(r9, r10, r1, r12)
            boolean r10 = m377a((java.lang.Object) r1, (java.lang.Object) r9)
            if (r10 == 0) goto L_0x0062
            goto L_0x00dd
        L_0x0062:
            java.lang.reflect.GenericArrayType r11 = m370a((java.lang.reflect.Type) r9)
            goto L_0x00dd
        L_0x0068:
            boolean r1 = r11 instanceof java.lang.reflect.ParameterizedType
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x00ac
            java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
            java.lang.reflect.Type r1 = r11.getOwnerType()
            java.lang.reflect.Type r4 = m375a(r9, r10, r1, r12)
            boolean r1 = m377a((java.lang.Object) r4, (java.lang.Object) r1)
            r1 = r1 ^ r3
            java.lang.reflect.Type[] r5 = r11.getActualTypeArguments()
            int r6 = r5.length
        L_0x0082:
            if (r2 >= r6) goto L_0x00a1
            r7 = r5[r2]
            java.lang.reflect.Type r7 = m375a(r9, r10, r7, r12)
            r8 = r5[r2]
            boolean r8 = m377a((java.lang.Object) r7, (java.lang.Object) r8)
            if (r8 != 0) goto L_0x009e
            if (r1 != 0) goto L_0x009c
            java.lang.Object r1 = r5.clone()
            r5 = r1
            java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
            r1 = 1
        L_0x009c:
            r5[r2] = r7
        L_0x009e:
            int r2 = r2 + 1
            goto L_0x0082
        L_0x00a1:
            if (r1 == 0) goto L_0x00dd
            java.lang.reflect.Type r9 = r11.getRawType()
            java.lang.reflect.ParameterizedType r11 = m371a((java.lang.reflect.Type) r4, (java.lang.reflect.Type) r9, (java.lang.reflect.Type[]) r5)
            goto L_0x00dd
        L_0x00ac:
            boolean r1 = r11 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto L_0x00dd
            java.lang.reflect.WildcardType r11 = (java.lang.reflect.WildcardType) r11
            java.lang.reflect.Type[] r1 = r11.getLowerBounds()
            java.lang.reflect.Type[] r4 = r11.getUpperBounds()
            int r5 = r1.length
            if (r5 != r3) goto L_0x00cc
            r3 = r1[r2]
            java.lang.reflect.Type r9 = m375a(r9, r10, r3, r12)
            r10 = r1[r2]
            if (r9 == r10) goto L_0x00dd
            java.lang.reflect.WildcardType r11 = m386g(r9)
            goto L_0x00dd
        L_0x00cc:
            int r1 = r4.length
            if (r1 != r3) goto L_0x00dd
            r1 = r4[r2]
            java.lang.reflect.Type r9 = m375a(r9, r10, r1, r12)     // Catch:{ all -> 0x00e3 }
            r10 = r4[r2]
            if (r9 == r10) goto L_0x00dd
            java.lang.reflect.WildcardType r11 = m385f(r9)
        L_0x00dd:
            if (r0 == 0) goto L_0x00e2
            r12.put(r0, r11)
        L_0x00e2:
            return r11
        L_0x00e3:
            r9 = move-exception
            goto L_0x00e6
        L_0x00e5:
            throw r9
        L_0x00e6:
            goto L_0x00e5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p010qg.gson.internal.C0991b.m375a(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Map):java.lang.reflect.Type");
    }

    /* renamed from: a */
    static Type m376a(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> a = m369a(typeVariable);
        if (a == null) {
            return typeVariable;
        }
        Type a2 = m373a(type, cls, a);
        if (!(a2 instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) a2).getActualTypeArguments()[m368a((Object[]) a.getTypeParameters(), (Object) typeVariable)];
    }

    /* renamed from: a */
    private static int m368a(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    private static Class<?> m369a(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }
}
