package com.quickgame.android.sdk;

public class SDKConfig {

    /* renamed from: a */
    boolean f583a;

    /* renamed from: b */
    boolean f584b;

    /* renamed from: c */
    private boolean f585c;

    /* renamed from: d */
    private boolean f586d;

    /* renamed from: e */
    private boolean f587e;

    /* renamed from: f */
    private boolean f588f;

    /* renamed from: g */
    private String f589g;

    /* renamed from: h */
    private boolean f590h;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f591a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f592b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f593c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f594d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f595e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f596f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public String f597g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public boolean f598h;

        public Builder addFacebookFriendPermissions() {
            this.f593c = true;
            return this;
        }

        public SDKConfig build() {
            return new SDKConfig(this);
        }

        public Builder disableTrashAccount() {
            this.f598h = true;
            return this;
        }

        public Builder noAutoLogin() {
            this.f592b = true;
            return this;
        }

        public Builder noLoginView() {
            this.f591a = true;
            return this;
        }

        public Builder serverToAppsFlyer() {
            this.f596f = true;
            return this;
        }

        public Builder setMoreAppsFlyerPurchaseEvent(String str) {
            this.f597g = str;
            return this;
        }

        public Builder showFacebookLargeBtn() {
            this.f595e = true;
            return this;
        }

        public Builder showServicesAndPrivacyPolicy() {
            this.f594d = true;
            return this;
        }
    }

    protected SDKConfig(Builder builder) {
        this.f583a = builder.f591a;
        this.f584b = builder.f592b;
        this.f586d = builder.f594d;
        this.f585c = builder.f593c;
        this.f587e = builder.f595e;
        this.f588f = builder.f596f;
        this.f589g = builder.f597g;
        this.f590h = builder.f598h;
    }

    public boolean addFacebookFriendPermissions() {
        return this.f585c;
    }

    public boolean disableTrashAccount() {
        return this.f590h;
    }

    public String getMoreAppsFlyerPurchaseEvent() {
        return this.f589g;
    }

    public boolean isNoLoginView() {
        return this.f583a;
    }

    public boolean noAutoLogin() {
        return this.f584b;
    }

    public boolean serverToAppsFlyer() {
        return this.f588f;
    }

    public boolean showFacebookLargeBtn() {
        return this.f587e;
    }

    public boolean showServicesAndPrivacyPolicy() {
        return this.f586d;
    }
}
