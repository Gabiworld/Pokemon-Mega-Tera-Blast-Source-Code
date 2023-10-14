package com.quickgame.android.sdk.p036f;

import android.text.TextUtils;
import android.util.Log;
import com.quickgame.android.sdk.p039h.C1541g;
import com.quickgame.android.sdk.utils.log.QGLog;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.quickgame.android.sdk.f.a */
public class C1423a {

    /* renamed from: a */
    public static String f1253a = "";

    /* renamed from: com.quickgame.android.sdk.f.a$b */
    private static class C1425b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C1423a f1254a = new C1423a();
    }

    /* renamed from: a */
    public static C1423a m1689a() {
        return C1425b.f1254a;
    }

    /* renamed from: b */
    private static JSONObject m1693b(String str, Map<String, String> map) {
        return m1692a(str, map, 10000);
    }

    private C1423a() {
    }

    /* renamed from: a */
    public JSONObject mo12661a(String str, Map<String, String> map) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        int i = 0;
        do {
            i++;
            if (i > 2) {
                break;
            }
            if (i > 1) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException unused) {
                }
            }
            String format = String.format("%s%s", new Object[]{f1253a, str});
            Log.d("QGConnectManager", "post request===" + format);
            jSONObject2 = m1693b(format, map);
        } while (jSONObject2 == null);
        if (jSONObject2 != null) {
            QGLog.m2386d("QGConnectManager", "result = " + jSONObject2.toString());
            try {
                if (jSONObject2.has("result") && !jSONObject2.getBoolean("result")) {
                    Log.w("QGConnectManager", "result = " + jSONObject2.toString());
                }
            } catch (Exception unused2) {
            }
        } else {
            try {
                jSONObject = new JSONObject();
            } catch (Exception e) {
                e = e;
                e.printStackTrace();
                return jSONObject2;
            }
            try {
                jSONObject.put("result", false);
                jSONObject.put("error", "connection failed, please check network.");
                return jSONObject;
            } catch (Exception e2) {
                e = e2;
                jSONObject2 = jSONObject;
                e.printStackTrace();
                return jSONObject2;
            }
        }
        return jSONObject2;
    }

    /* renamed from: a */
    private static JSONObject m1692a(String str, Map<String, String> map, int i) {
        try {
            if (C1541g.m1887a().f1492o) {
                C1434e.m1708a();
            }
            URL url = new URL(str);
            byte[] bytes = m1690a(map).toString().getBytes();
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setReadTimeout(i);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Length", String.valueOf(bytes.length));
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bytes);
            outputStream.flush();
            outputStream.close();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                return m1691a(httpURLConnection.getInputStream());
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", false);
            jSONObject.put("error", "http error code " + responseCode);
            return jSONObject;
        } catch (Exception e) {
            Log.e("QGConnectManager", "httpURLConnection Exception " + e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    private static StringBuffer m1690a(Map<String, String> map) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            for (Map.Entry next : map.entrySet()) {
                stringBuffer.append((String) next.getKey());
                stringBuffer.append("=");
                stringBuffer.append(URLEncoder.encode((String) next.getValue(), "utf-8"));
                stringBuffer.append("&");
            }
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        } catch (Exception unused) {
        }
        return stringBuffer;
    }

    /* renamed from: a */
    private static JSONObject m1691a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String str = new String(byteArrayOutputStream.toByteArray());
        try {
            inputStream.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        try {
            byteArrayOutputStream.close();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        if (!TextUtils.isEmpty(str) && str.contains("result")) {
            try {
                return new JSONObject(str.trim());
            } catch (JSONException e4) {
                e4.printStackTrace();
                return null;
            }
        } else if (TextUtils.isEmpty(str) || str.contains("result")) {
            return null;
        } else {
            Log.w("QGConnectManager", "result=" + str);
            try {
                return new JSONObject(str.trim());
            } catch (JSONException e5) {
                e5.printStackTrace();
                return null;
            }
        }
    }
}
