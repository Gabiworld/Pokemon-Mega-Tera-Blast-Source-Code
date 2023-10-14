package com.quickgame.android.sdk.thirdlogin;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.games.AchievementsClient;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.EventsClient;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.LeaderboardsClient;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayersClient;
import com.google.android.gms.games.event.Event;
import com.google.android.gms.games.event.EventBuffer;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.quickgame.android.sdk.QuickGameManager;
import com.quickgame.android.sdk.constans.QGConstant;
import com.quickgame.android.sdk.p043l.C1601d;
import com.quickgame.android.sdk.utils.log.QGLog;
import java.util.Iterator;

/* renamed from: com.quickgame.android.sdk.thirdlogin.g */
public class C1695g {

    /* renamed from: j */
    public static GoogleSignInOptions f1728j = null;

    /* renamed from: k */
    private static C1695g f1729k = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static Activity f1730l = null;

    /* renamed from: m */
    private static int f1731m = 12501;

    /* renamed from: a */
    EventBuffer f1732a = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f1733b = "QGPlayGameManager";
    /* access modifiers changed from: private */

    /* renamed from: c */
    public GoogleSignInClient f1734c = null;

    /* renamed from: d */
    private PlayersClient f1735d = null;

    /* renamed from: e */
    private EventsClient f1736e = null;

    /* renamed from: f */
    private AchievementsClient f1737f = null;

    /* renamed from: g */
    private LeaderboardsClient f1738g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C1690d f1739h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public QuickGameManager.GooglePlayStatusListener f1740i;

    /* renamed from: com.quickgame.android.sdk.thirdlogin.g$a */
    class C1696a implements OnFailureListener {
        C1696a(C1695g gVar) {
        }

        public void onFailure(Exception exc) {
        }
    }

    /* renamed from: com.quickgame.android.sdk.thirdlogin.g$b */
    class C1697b implements OnSuccessListener<Intent> {

        /* renamed from: a */
        final /* synthetic */ Activity f1741a;

        C1697b(C1695g gVar, Activity activity) {
            this.f1741a = activity;
        }

        /* renamed from: a */
        public void onSuccess(Intent intent) {
            this.f1741a.startActivityForResult(intent, 9004);
        }
    }

    /* renamed from: com.quickgame.android.sdk.thirdlogin.g$c */
    class C1698c implements OnSuccessListener<Intent> {

        /* renamed from: a */
        final /* synthetic */ Activity f1742a;

        C1698c(C1695g gVar, Activity activity) {
            this.f1742a = activity;
        }

        /* renamed from: a */
        public void onSuccess(Intent intent) {
            this.f1742a.startActivityForResult(intent, 9004);
        }
    }

    /* renamed from: com.quickgame.android.sdk.thirdlogin.g$d */
    class C1699d implements OnCompleteListener<Void> {
        C1699d() {
        }

        public void onComplete(Task<Void> task) {
            C1695g.f1730l.startActivityForResult(C1695g.this.f1734c.getSignInIntent(), 9002);
        }
    }

    /* renamed from: com.quickgame.android.sdk.thirdlogin.g$e */
    class C1700e implements OnCompleteListener<GoogleSignInAccount> {
        C1700e() {
        }

        public void onComplete(Task<GoogleSignInAccount> task) {
            if (task.isSuccessful()) {
                Log.d(C1695g.this.f1733b, " silentSignIn success");
                return;
            }
            String b = C1695g.this.f1733b;
            Log.e(b, " silentSignIn failed:" + task.getException().getMessage());
        }
    }

    /* renamed from: com.quickgame.android.sdk.thirdlogin.g$f */
    class C1701f implements OnCompleteListener<Void> {
        C1701f() {
        }

        public void onComplete(Task<Void> task) {
            if (task.isSuccessful()) {
                Log.d(C1695g.this.f1733b, "signOut(): success");
                C1695g.this.f1739h.mo12021a();
            } else {
                Log.e(C1695g.this.f1733b, "signOut() failed!");
            }
            C1695g.this.mo13235e();
        }
    }

    /* renamed from: com.quickgame.android.sdk.thirdlogin.g$g */
    class C1702g implements OnCompleteListener<Player> {

        /* renamed from: a */
        final /* synthetic */ GoogleSignInAccount f1746a;

        C1702g(GoogleSignInAccount googleSignInAccount) {
            this.f1746a = googleSignInAccount;
        }

        public void onComplete(Task<Player> task) {
            String b = C1695g.this.f1733b;
            Log.d(b, "Player:" + ((Player) task.getResult()).toString());
            if (C1695g.this.f1739h != null) {
                C1695g.this.f1739h.mo12042a(this.f1746a.getId(), ((Player) task.getResult()).getDisplayName(), this.f1746a.getIdToken(), "", QGConstant.LOGIN_OPEN_TYPE_PLAYGAME);
            }
            if (C1695g.this.f1740i != null) {
                C1695g.this.f1740i.result(true);
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.thirdlogin.g$h */
    class C1703h implements OnCompleteListener<AnnotatedData<EventBuffer>> {
        C1703h() {
        }

        public void onComplete(Task<AnnotatedData<EventBuffer>> task) {
            if (task.isSuccessful()) {
                Log.d(C1695g.this.f1733b, "load event by id success");
                C1695g.this.f1732a = (EventBuffer) ((AnnotatedData) task.getResult()).get();
                Iterator it = ((EventBuffer) ((AnnotatedData) task.getResult()).get()).iterator();
                while (it.hasNext()) {
                    String b = C1695g.this.f1733b;
                    Log.d(b, "loaded event " + ((Event) it.next()).getName());
                }
                return;
            }
            ApiException exception = task.getException();
            int i = 10;
            if (exception instanceof ApiException) {
                i = exception.getStatusCode();
            }
            String b2 = C1695g.this.f1733b;
            Log.e(b2, "load by id failed:" + i);
        }
    }

    /* renamed from: com.quickgame.android.sdk.thirdlogin.g$i */
    class C1704i implements OnFailureListener {
        C1704i() {
        }

        public void onFailure(Exception exc) {
            Log.e(C1695g.this.f1733b, "load all events failed");
        }
    }

    /* renamed from: com.quickgame.android.sdk.thirdlogin.g$j */
    class C1705j implements OnSuccessListener<AnnotatedData<EventBuffer>> {
        C1705j() {
        }

        /* renamed from: a */
        public void onSuccess(AnnotatedData<EventBuffer> annotatedData) {
            Log.d(C1695g.this.f1733b, "load all events success:");
            C1695g.this.f1732a = (EventBuffer) annotatedData.get();
            EventBuffer eventBuffer = C1695g.this.f1732a;
            int count = eventBuffer != null ? eventBuffer.getCount() : 0;
            String b = C1695g.this.f1733b;
            Log.i(b, "number of events: " + count);
            for (int i = 0; i < count; i++) {
                Event event = C1695g.this.f1732a.get(i);
                String b2 = C1695g.this.f1733b;
                Log.i(b2, "event: " + event.getName() + " -> " + event.getValue());
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.thirdlogin.g$k */
    class C1706k implements OnFailureListener {
        C1706k() {
        }

        public void onFailure(Exception exc) {
            Log.e(C1695g.this.f1733b, "showAchievements failed");
        }
    }

    /* renamed from: com.quickgame.android.sdk.thirdlogin.g$l */
    class C1707l implements OnSuccessListener<Intent> {

        /* renamed from: a */
        final /* synthetic */ Activity f1752a;

        C1707l(Activity activity) {
            this.f1752a = activity;
        }

        /* renamed from: a */
        public void onSuccess(Intent intent) {
            Log.d(C1695g.this.f1733b, "showAchievements success");
            this.f1752a.startActivityForResult(intent, 9003);
        }
    }

    public C1695g(Activity activity) {
        f1730l = activity;
    }

    /* renamed from: e */
    public void mo13235e() {
        Log.d(this.f1733b, "onDisconnected()");
        this.f1737f = null;
        this.f1738g = null;
        this.f1735d = null;
    }

    /* renamed from: f */
    public void mo13236f() {
        QGLog.m2386d(this.f1733b, "silentSignIn");
        QuickGameManager.GooglePlayStatusListener googlePlayStatusListener = this.f1740i;
        if (googlePlayStatusListener != null) {
            googlePlayStatusListener.result(true);
        }
        if (this.f1734c == null) {
            QGLog.m2388e(this.f1733b, "GoogleSignInClient is null");
            GoogleSignInOptions build = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_GAMES_SIGN_IN).requestEmail().requestIdToken(C1601d.m2069c(f1730l, "google-signin-client_id")).requestScopes(Games.SCOPE_GAMES_LITE, new Scope[0]).requestId().build();
            f1728j = build;
            this.f1734c = GoogleSignIn.getClient(f1730l, build);
        }
        this.f1734c.silentSignIn().addOnCompleteListener(new C1700e());
    }

    /* renamed from: b */
    public static synchronized C1695g m2347b(Activity activity) {
        C1695g gVar;
        synchronized (C1695g.class) {
            if (f1729k == null) {
                f1729k = new C1695g(activity);
            }
            gVar = f1729k;
        }
        return gVar;
    }

    /* renamed from: a */
    public void mo13227a(C1690d dVar) {
        Log.d(this.f1733b, "init");
        this.f1739h = dVar;
        try {
            GoogleSignInOptions build = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_GAMES_SIGN_IN).requestEmail().requestIdToken(C1601d.m2069c(f1730l, "google-signin-client_id")).requestScopes(Games.SCOPE_GAMES_LITE, new Scope[0]).requestId().build();
            f1728j = build;
            this.f1734c = GoogleSignIn.getClient(f1730l, build);
            dVar.mo13206b();
        } catch (Exception e) {
            dVar.mo13205a(e.getMessage());
        }
    }

    /* renamed from: c */
    public void mo13233c() {
        Log.d(this.f1733b, "Sign Out()");
        GoogleSignInClient googleSignInClient = this.f1734c;
        if (googleSignInClient != null) {
            try {
                googleSignInClient.signOut().addOnCompleteListener(f1730l, new C1701f());
            } catch (NullPointerException e) {
                Log.e(this.f1733b, e.getMessage());
            }
        }
    }

    /* renamed from: d */
    public boolean mo13234d() {
        GoogleSignInAccount lastSignedInAccount = GoogleSignIn.getLastSignedInAccount(f1730l);
        if (lastSignedInAccount == null) {
            QGLog.m2386d(this.f1733b, "getLastSignedInAccount is null");
            mo13222a();
            return false;
        }
        if (GoogleSignIn.hasPermissions(lastSignedInAccount, new Scope[]{Games.SCOPE_GAMES_LITE})) {
            QGLog.m2386d(this.f1733b, "LastSignedInAccount has permission of SCOPE_GAMES_LITE");
            return true;
        }
        QGLog.m2386d(this.f1733b, "LastSignedInAccount not has permission of SCOPE_GAMES_LITE");
        return false;
    }

    /* renamed from: b */
    public void mo13231b(C1690d dVar) {
        this.f1739h = dVar;
    }

    /* renamed from: b */
    public void mo13230b() {
        Log.d(this.f1733b, "Sign in Bindgin");
        if (mo13234d()) {
            this.f1734c.signOut().addOnCompleteListener(new C1699d());
        } else {
            f1730l.startActivityForResult(this.f1734c.getSignInIntent(), 9002);
        }
    }

    /* renamed from: a */
    public void mo13222a() {
        Log.d(this.f1733b, "Sign in");
        if (this.f1734c == null) {
            GoogleSignInOptions build = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_GAMES_SIGN_IN).requestEmail().requestIdToken(C1601d.m2069c(f1730l, "google-signin-client_id")).requestScopes(Games.SCOPE_GAMES_LITE, new Scope[0]).requestId().build();
            f1728j = build;
            this.f1734c = GoogleSignIn.getClient(f1730l, build);
        }
        f1730l.startActivityForResult(this.f1734c.getSignInIntent(), 9002);
    }

    /* renamed from: b */
    public void mo13232b(String str, int i) {
        if (mo13234d()) {
            Activity activity = f1730l;
            LeaderboardsClient leaderboardsClient = Games.getLeaderboardsClient(activity, GoogleSignIn.getLastSignedInAccount(activity));
            this.f1738g = leaderboardsClient;
            leaderboardsClient.submitScore(str, (long) i);
        }
    }

    /* renamed from: a */
    public void mo13223a(int i, int i2, Intent intent) {
        String str = this.f1733b;
        Log.d(str, "requestCode" + i);
        if (i == 9002) {
            Task signedInAccountFromIntent = GoogleSignIn.getSignedInAccountFromIntent(intent);
            try {
                if (signedInAccountFromIntent.isSuccessful()) {
                    Log.d(this.f1733b, "Login success");
                    m2346a((GoogleSignInAccount) signedInAccountFromIntent.getResult(ApiException.class));
                    return;
                }
                String str2 = this.f1733b;
                Log.e(str2, "Login failed：" + signedInAccountFromIntent.getException().getMessage());
                C1690d dVar = this.f1739h;
                if (dVar != null) {
                    dVar.mo12043b("");
                }
            } catch (ApiException e) {
                String message = e.getMessage();
                String str3 = this.f1733b;
                Log.e(str3, "Error:" + message);
                if (e.getStatusCode() == f1731m) {
                    C1690d dVar2 = this.f1739h;
                    if (dVar2 != null) {
                        dVar2.onLoginCancel();
                    }
                } else {
                    C1690d dVar3 = this.f1739h;
                    if (dVar3 != null) {
                        dVar3.mo12043b(message);
                    }
                }
                mo13235e();
            } catch (NullPointerException e2) {
                Log.e(this.f1733b, e2.getMessage());
            }
        }
    }

    /* renamed from: a */
    private void m2346a(GoogleSignInAccount googleSignInAccount) {
        String str = this.f1733b;
        Log.d(str, "AccontID：" + googleSignInAccount.getId());
        String str2 = this.f1733b;
        Log.d(str2, "AccontToken：" + googleSignInAccount.getIdToken());
        String str3 = this.f1733b;
        Log.d(str3, "AccontEmail：" + googleSignInAccount.getEmail());
        String str4 = this.f1733b;
        Log.d(str4, "AccontDisplayName：" + googleSignInAccount.getDisplayName());
        String str5 = this.f1733b;
        Log.d(str5, "AccontFamilyName：" + googleSignInAccount.getFamilyName());
        String str6 = this.f1733b;
        Log.d(str6, "AccontGivenName：" + googleSignInAccount.getGivenName());
        PlayersClient playersClient = Games.getPlayersClient(f1730l, googleSignInAccount);
        this.f1735d = playersClient;
        playersClient.getCurrentPlayer().addOnCompleteListener(new C1702g(googleSignInAccount));
    }

    /* renamed from: a */
    public EventBuffer mo13221a(String str) {
        Log.d(this.f1733b, "loadAndPrintEvents");
        if (!mo13234d()) {
            return null;
        }
        Activity activity = f1730l;
        this.f1736e = Games.getEventsClient(activity, GoogleSignIn.getLastSignedInAccount(activity));
        if (str == null || str.isEmpty()) {
            Log.d(this.f1733b, "load all events");
            this.f1736e.load(true).addOnSuccessListener(new C1705j()).addOnFailureListener(new C1704i());
        } else {
            Log.d(this.f1733b, "load event by id");
            this.f1736e.loadByIds(true, new String[]{str}).addOnCompleteListener(new C1703h());
        }
        return this.f1732a;
    }

    /* renamed from: a */
    public void mo13228a(String str, int i) {
        Log.d(this.f1733b, "submitEvent");
        if (mo13234d()) {
            Activity activity = f1730l;
            EventsClient eventsClient = Games.getEventsClient(activity, GoogleSignIn.getLastSignedInAccount(activity));
            this.f1736e = eventsClient;
            eventsClient.increment(str, i);
        }
    }

    /* renamed from: a */
    public void mo13224a(Activity activity) {
        Log.d(this.f1733b, "showAchievements");
        if (mo13234d()) {
            Activity activity2 = f1730l;
            AchievementsClient achievementsClient = Games.getAchievementsClient(activity2, GoogleSignIn.getLastSignedInAccount(activity2));
            this.f1737f = achievementsClient;
            achievementsClient.getAchievementsIntent().addOnSuccessListener(new C1707l(activity)).addOnFailureListener(new C1706k());
        }
    }

    /* renamed from: a */
    public void mo13229a(boolean z, String str, int i) {
        if (mo13234d()) {
            Activity activity = f1730l;
            AchievementsClient achievementsClient = Games.getAchievementsClient(activity, GoogleSignIn.getLastSignedInAccount(activity));
            this.f1737f = achievementsClient;
            if (z) {
                achievementsClient.increment(str, i);
            } else {
                achievementsClient.unlock(str);
            }
        }
    }

    /* renamed from: a */
    public void mo13225a(Activity activity, String str) {
        Log.d(this.f1733b, "showLeaderBoards");
        if (mo13234d()) {
            Activity activity2 = f1730l;
            this.f1738g = Games.getLeaderboardsClient(activity2, GoogleSignIn.getLastSignedInAccount(activity2));
            if (str.isEmpty()) {
                this.f1738g.getAllLeaderboardsIntent().addOnSuccessListener(new C1697b(this, activity)).addOnFailureListener(new C1696a(this));
            } else {
                this.f1738g.getLeaderboardIntent(str).addOnSuccessListener(new C1698c(this, activity));
            }
        }
    }

    /* renamed from: a */
    public void mo13226a(QuickGameManager.GooglePlayStatusListener googlePlayStatusListener) {
        this.f1740i = googlePlayStatusListener;
    }
}
