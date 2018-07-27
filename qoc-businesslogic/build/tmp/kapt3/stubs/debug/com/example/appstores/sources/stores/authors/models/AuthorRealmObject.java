package com.example.appstores.sources.stores.authors.models;

import java.lang.System;

/**
 * * Created by ahmedsaad on 2018-07-26.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0002\u0010\u0004B\u0019\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bR\u001e\u0010\u0005\u001a\u00020\u00068\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lcom/example/appstores/sources/stores/authors/models/AuthorRealmObject;", "Lio/realm/RealmObject;", "Lcom/example/appstores/sources/stores/authors/models/AuthorType;", "from", "(Lcom/example/appstores/sources/stores/authors/models/AuthorType;)V", "link", "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getLink", "()Ljava/lang/String;", "setLink", "(Ljava/lang/String;)V", "getName", "setName", "qoc-businesslogic_debug"})
public class AuthorRealmObject extends io.realm.RealmObject implements com.example.appstores.sources.stores.authors.models.AuthorType {
    @org.jetbrains.annotations.NotNull()
    @io.realm.annotations.Index()
    private java.lang.String link;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getLink() {
        return null;
    }
    
    @java.lang.Override()
    public void setLink(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getName() {
        return null;
    }
    
    @java.lang.Override()
    public void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public AuthorRealmObject(@org.jetbrains.annotations.NotNull()
    java.lang.String link, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        super();
    }
    
    public AuthorRealmObject() {
        super();
    }
    
    public AuthorRealmObject(@org.jetbrains.annotations.Nullable()
    com.example.appstores.sources.stores.authors.models.AuthorType from) {
        super();
    }
}