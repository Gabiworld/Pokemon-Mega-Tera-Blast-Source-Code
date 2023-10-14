package com.facebook.messenger;

import android.net.Uri;
import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import com.facebook.share.internal.ShareInternalUtility;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ShareToMessengerParams {
    public static final Set<String> VALID_EXTERNAL_URI_SCHEMES;
    public static final Set<String> VALID_MIME_TYPES;
    public static final Set<String> VALID_URI_SCHEMES;
    public final Uri externalUri;
    public final String metaData;
    public final String mimeType;
    public final Uri uri;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("image/*");
        hashSet.add("image/jpeg");
        hashSet.add("image/png");
        hashSet.add("image/gif");
        hashSet.add("image/webp");
        hashSet.add("video/*");
        hashSet.add("video/mp4");
        hashSet.add("audio/*");
        hashSet.add("audio/mpeg");
        VALID_MIME_TYPES = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add("content");
        hashSet2.add("android.resource");
        hashSet2.add(ShareInternalUtility.STAGING_PARAM);
        VALID_URI_SCHEMES = Collections.unmodifiableSet(hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add("http");
        hashSet3.add(TournamentShareDialogURIBuilder.scheme);
        VALID_EXTERNAL_URI_SCHEMES = Collections.unmodifiableSet(hashSet3);
    }

    ShareToMessengerParams(ShareToMessengerParamsBuilder shareToMessengerParamsBuilder) {
        Uri uri2 = shareToMessengerParamsBuilder.getUri();
        this.uri = uri2;
        String mimeType2 = shareToMessengerParamsBuilder.getMimeType();
        this.mimeType = mimeType2;
        this.metaData = shareToMessengerParamsBuilder.getMetaData();
        Uri externalUri2 = shareToMessengerParamsBuilder.getExternalUri();
        this.externalUri = externalUri2;
        Objects.requireNonNull(uri2, "Must provide non-null uri");
        Objects.requireNonNull(mimeType2, "Must provide mimeType");
        if (!VALID_URI_SCHEMES.contains(uri2.getScheme())) {
            throw new IllegalArgumentException("Unsupported URI scheme: " + uri2.getScheme());
        } else if (!VALID_MIME_TYPES.contains(mimeType2)) {
            throw new IllegalArgumentException("Unsupported mime-type: " + mimeType2);
        } else if (externalUri2 != null && !VALID_EXTERNAL_URI_SCHEMES.contains(externalUri2.getScheme())) {
            throw new IllegalArgumentException("Unsupported external uri scheme: " + externalUri2.getScheme());
        }
    }

    public static ShareToMessengerParamsBuilder newBuilder(Uri uri2, String str) {
        return new ShareToMessengerParamsBuilder(uri2, str);
    }
}
