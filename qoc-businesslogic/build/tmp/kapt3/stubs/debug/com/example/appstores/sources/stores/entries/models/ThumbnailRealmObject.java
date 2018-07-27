package com.example.appstores.sources.stores.entries.models;

import java.lang.System;

/**
 * * Created by ahmedsaad on 2018-07-26.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0002\u0010\u0004B\u0019\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tR\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/example/appstores/sources/stores/entries/models/ThumbnailRealmObject;", "Lio/realm/RealmObject;", "Lcom/example/appstores/sources/stores/entries/models/ThumbnailType;", "from", "(Lcom/example/appstores/sources/stores/entries/models/ThumbnailType;)V", "height", "", "link", "", "(ILjava/lang/String;)V", "getHeight", "()I", "setHeight", "(I)V", "getLink", "()Ljava/lang/String;", "setLink", "(Ljava/lang/String;)V", "qoc-businesslogic_debug"})
public class ThumbnailRealmObject extends io.realm.RealmObject implements com.example.appstores.sources.stores.entries.models.ThumbnailType {
    private int height;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String link;
    
    @java.lang.Override()
    public int getHeight() {
        return 0;
    }
    
    @java.lang.Override()
    public void setHeight(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getLink() {
        return null;
    }
    
    @java.lang.Override()
    public void setLink(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public ThumbnailRealmObject(int height, @org.jetbrains.annotations.NotNull()
    java.lang.String link) {
        super();
    }
    
    public ThumbnailRealmObject() {
        super();
    }
    
    public ThumbnailRealmObject(@org.jetbrains.annotations.Nullable()
    com.example.appstores.sources.stores.entries.models.ThumbnailType from) {
        super();
    }
}