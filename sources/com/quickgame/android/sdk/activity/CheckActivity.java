package com.quickgame.android.sdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.base.BaseActivity;
import com.quickgame.android.sdk.p034e.C1346j;
import com.quickgame.android.sdk.p034e.C1369n;
import com.quickgame.android.sdk.p034e.C1373o;
import com.quickgame.android.sdk.p034e.C1377p;
import com.quickgame.android.sdk.p039h.C1538f;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class CheckActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C1160b f657b;

    /* renamed from: c */
    private FragmentManager f658c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C1346j f659d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Handler f660e = new C1159a(Looper.getMainLooper());

    /* renamed from: com.quickgame.android.sdk.activity.CheckActivity$a */
    class C1159a extends Handler {
        C1159a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (CheckActivity.this.f659d != null && (CheckActivity.this.f659d instanceof C1377p)) {
                C1377p pVar = (C1377p) CheckActivity.this.f659d;
                switch (message.what) {
                    case 30:
                        pVar.mo12591c(C1124R.string.qg_update_start_download);
                        pVar.mo12590b(((Integer) message.obj).intValue());
                        return;
                    case 31:
                        pVar.mo12587a(message.arg1);
                        return;
                    case 32:
                        String str = (String) message.obj;
                        Log.d("QGCheckActivity", "apkfilePath " + str);
                        CheckActivity.this.m942y(str);
                        return;
                    case 33:
                        String str2 = (String) message.obj;
                        if (!TextUtils.isEmpty(str2)) {
                            new File(str2).delete();
                        }
                        pVar.mo12589a(CheckActivity.this.getString(C1124R.string.qg_update_cancel));
                        if (C1538f.m1861l().mo12843e().mo13101a().mo13090d()) {
                            CheckActivity.this.finish();
                            return;
                        }
                        HWLoginActivity.m1115a((Activity) CheckActivity.this, false);
                        CheckActivity.this.finish();
                        return;
                    case 34:
                        String str3 = (String) message.obj;
                        if (!TextUtils.isEmpty(str3)) {
                            new File(str3).delete();
                        }
                        pVar.mo12589a((String) message.obj);
                        CheckActivity.this.finish();
                        return;
                    default:
                        return;
                }
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.CheckActivity$b */
    public class C1160b implements Runnable {

        /* renamed from: a */
        String f662a;

        /* renamed from: b */
        int f663b;

        /* renamed from: c */
        int f664c;

        /* renamed from: d */
        String f665d;

        /* renamed from: e */
        boolean f666e = false;

        /* renamed from: f */
        int f667f;

        C1160b(String str) {
            this.f662a = str;
        }

        /* renamed from: a */
        public void mo12055a() {
            this.f666e = true;
        }

        /* renamed from: b */
        public int mo12056b() {
            return this.f663b;
        }

        /* renamed from: c */
        public int mo12057c() {
            return this.f664c;
        }

        /* renamed from: d */
        public String mo12058d() {
            return this.f665d;
        }

        /* renamed from: e */
        public int mo12059e() {
            return this.f667f;
        }

        public void run() {
            this.f667f = 3;
            String str = this.f662a;
            File file = new File(CheckActivity.this.getExternalFilesDir((String) null), str.substring(str.lastIndexOf("/") + 1));
            if (file.exists()) {
                file.delete();
                try {
                    file.createNewFile();
                    this.f665d = file.getAbsolutePath();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (this.f666e) {
                this.f667f = 16;
                Message obtainMessage = CheckActivity.this.f660e.obtainMessage(33);
                obtainMessage.obj = mo12058d();
                obtainMessage.sendToTarget();
                return;
            }
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f662a).openConnection();
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == 200) {
                    this.f667f = 5;
                    this.f663b = httpURLConnection.getContentLength();
                    Message obtainMessage2 = CheckActivity.this.f660e.obtainMessage(30);
                    obtainMessage2.obj = Integer.valueOf(this.f663b);
                    obtainMessage2.sendToTarget();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    this.f664c = 0;
                    byte[] bArr = new byte[1048576];
                    while (this.f663b > this.f664c && !this.f666e) {
                        long currentTimeMillis = System.currentTimeMillis();
                        int read = inputStream.read(bArr, 0, 1048576);
                        if (read != -1) {
                            this.f664c += read;
                            fileOutputStream.write(bArr, 0, read);
                            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                            Message obtainMessage3 = CheckActivity.this.f660e.obtainMessage();
                            obtainMessage3.what = 31;
                            obtainMessage3.obj = Long.valueOf(currentTimeMillis2);
                            obtainMessage3.arg1 = this.f664c;
                            obtainMessage3.arg2 = read;
                            obtainMessage3.sendToTarget();
                        }
                    }
                    fileOutputStream.close();
                    inputStream.close();
                    if (this.f666e) {
                        this.f667f = 16;
                        Message obtainMessage4 = CheckActivity.this.f660e.obtainMessage(33);
                        obtainMessage4.obj = mo12058d();
                        obtainMessage4.sendToTarget();
                        return;
                    }
                    int i = this.f663b;
                    int i2 = this.f664c;
                    if (i != i2 || i2 == 0) {
                        this.f667f = 14;
                        Message obtainMessage5 = CheckActivity.this.f660e.obtainMessage(34);
                        obtainMessage5.obj = CheckActivity.this.getString(C1124R.string.qg_err_download_error);
                        obtainMessage5.sendToTarget();
                        return;
                    }
                    this.f667f = 10;
                    Message obtainMessage6 = CheckActivity.this.f660e.obtainMessage(32);
                    obtainMessage6.obj = file.getAbsolutePath();
                    CheckActivity.this.f660e.sendMessage(obtainMessage6);
                    return;
                }
                this.f667f = 14;
                Message obtainMessage7 = CheckActivity.this.f660e.obtainMessage(34);
                obtainMessage7.obj = CheckActivity.this.getString(C1124R.string.qg_err_connect_service);
                obtainMessage7.sendToTarget();
            } catch (IOException e2) {
                this.f667f = 14;
                Message obtainMessage8 = CheckActivity.this.f660e.obtainMessage(34);
                obtainMessage8.obj = CheckActivity.this.getString(C1124R.string.qg_err_connect_service);
                obtainMessage8.sendToTarget();
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.CheckActivity$c */
    private class C1161c implements C1377p.C1382c {
        private C1161c() {
        }

        /* renamed from: a */
        public void mo12061a() {
        }

        /* renamed from: b */
        public void mo12062b() {
            C1160b r = CheckActivity.this.mo12051r();
            if (r != null && (r.mo12059e() == 5 || r.mo12059e() == 3)) {
                r.mo12055a();
            }
            if (C1538f.m1861l().mo12843e().mo13101a().mo13090d()) {
                Process.killProcess(Process.myPid());
            } else {
                CheckActivity.this.finish();
            }
        }

        /* synthetic */ C1161c(CheckActivity checkActivity, C1159a aVar) {
            this();
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.CheckActivity$d */
    private class C1162d implements C1373o.C1376c {
        private C1162d() {
        }

        /* renamed from: a */
        public void mo12063a(String str) {
            Log.d("QGCheckActivity", "updateDownload url:" + str);
            if (CheckActivity.this.f657b == null || CheckActivity.this.f657b.mo12059e() != 10) {
                CheckActivity checkActivity = CheckActivity.this;
                C1160b unused = checkActivity.f657b = new C1160b(str);
                CheckActivity.this.mo12050b((C1346j) new C1377p());
                new Thread(CheckActivity.this.f657b).start();
                return;
            }
            String d = CheckActivity.this.f657b.mo12058d();
            Message obtainMessage = CheckActivity.this.f660e.obtainMessage(32);
            obtainMessage.obj = d;
            CheckActivity.this.f660e.sendMessage(obtainMessage);
        }

        /* synthetic */ C1162d(CheckActivity checkActivity, C1159a aVar) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m942y(String str) {
        File file = new File(str);
        if (file.exists()) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setFlags(268435456);
            if (Build.VERSION.SDK_INT >= 24) {
                intent.addFlags(1);
                intent.setDataAndType(FileProvider.getUriForFile(this, getPackageName() + ".fileprovider", file), "application/vnd.android.package-archive");
            } else {
                intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
            }
            startActivity(intent);
        }
    }

    public void onBackPressed() {
        Log.d("QGCheckActivity", "onBackPressed");
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1124R.layout.qg_activity_ck);
        this.f658c = getSupportFragmentManager();
        if (mo12051r() != null) {
            return;
        }
        if (C1538f.m1861l().mo12843e().mo13101a().mo13087a().contains("play.google.com")) {
            mo12050b((C1346j) C1369n.m1570b());
            return;
        }
        Log.d("QGCheckActivity", "file url");
        if (mo12051r() == null) {
            mo12050b((C1346j) C1373o.m1573b());
        } else if (mo12051r() != null) {
            int e = mo12051r().mo12059e();
            Log.d("QGCheckActivity", "state=" + e);
            if (e == 3 || e == 5) {
                mo12050b((C1346j) new C1377p());
            } else if (e == 10 || e == 14 || e == 16) {
                mo12050b((C1346j) C1373o.m1573b());
            }
        }
    }

    /* renamed from: r */
    public C1160b mo12051r() {
        return this.f657b;
    }

    /* renamed from: s */
    public C1373o.C1376c mo12052s() {
        return new C1162d(this, (C1159a) null);
    }

    /* renamed from: t */
    public C1377p.C1382c mo12053t() {
        return new C1161c(this, (C1159a) null);
    }

    /* renamed from: b */
    public void mo12050b(C1346j jVar) {
        Log.d("QGCheckActivity", jVar.getClass().getName());
        this.f659d = jVar;
        FragmentTransaction beginTransaction = this.f658c.beginTransaction();
        beginTransaction.replace(C1124R.C1126id.qg_main_content, jVar).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        beginTransaction.addToBackStack((String) null);
        try {
            beginTransaction.commitAllowingStateLoss();
        } catch (Exception unused) {
            Log.e("switchfragment", "commit fragment but destoryed");
        }
    }

    /* renamed from: a */
    public void mo12049a(C1346j jVar) {
        this.f659d = jVar;
    }
}
