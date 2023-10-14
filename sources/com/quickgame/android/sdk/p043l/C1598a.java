package com.quickgame.android.sdk.p043l;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* renamed from: com.quickgame.android.sdk.l.a */
public class C1598a {
    /* renamed from: a */
    public static String m2042a(Context context, String str) {
        String str2 = "";
        AssetManager assets = context.getAssets();
        try {
            String a = m2043a(assets.open(str));
            InputStream open = assets.open(str);
            str2 = new BufferedReader(new InputStreamReader(open, a)).readLine();
            open.close();
            return str2;
        } catch (IOException e) {
            Log.d("QGGetAssetsUtil", "io ex " + e.getMessage());
            return str2;
        }
    }

    /* renamed from: a */
    private static String m2043a(InputStream inputStream) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            int read = (bufferedInputStream.read() << 8) + bufferedInputStream.read();
            String str = read != 61371 ? read != 65279 ? read != 65534 ? "GBK" : "Unicode" : "UTF-16BE" : "UTF-8";
            inputStream.close();
            return str;
        } catch (IOException e) {
            Log.e("QGGetAssetsUtil", e.getMessage());
            return "";
        }
    }
}
