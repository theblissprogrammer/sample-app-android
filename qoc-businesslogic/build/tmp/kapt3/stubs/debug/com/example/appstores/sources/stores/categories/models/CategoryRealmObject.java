package com.example.appstores.sources.stores.categories.models;

import java.lang.System;

/**
 * * Created by ahmedsaad on 2018-07-26.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0002\u0010\u0004B#\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nR\u001e\u0010\u0005\u001a\u00020\u00068\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\t\u001a\u00020\bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012\u00a8\u0006\u0015"}, d2 = {"Lcom/example/appstores/sources/stores/categories/models/CategoryRealmObject;", "Lio/realm/RealmObject;", "Lcom/example/appstores/sources/stores/categories/models/CategoryType;", "from", "(Lcom/example/appstores/sources/stores/categories/models/CategoryType;)V", "id", "", "name", "", "link", "(ILjava/lang/String;Ljava/lang/String;)V", "getId", "()I", "setId", "(I)V", "getLink", "()Ljava/lang/String;", "setLink", "(Ljava/lang/String;)V", "getName", "setName", "qoc-businesslogic_debug"})
public class CategoryRealmObject extends io.realm.RealmObject implements com.example.appstores.sources.stores.categories.models.CategoryType {
    @io.realm.annotations.PrimaryKey()
    private int id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String link;
    
    @java.lang.Override()
    public int getId() {
        return 0;
    }
    
    @java.lang.Override()
    public void setId(int p0) {
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getLink() {
        return null;
    }
    
    @java.lang.Override()
    public void setLink(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public CategoryRealmObject(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String link) {
        super();
    }
    
    public CategoryRealmObject() {
        super();
    }
    
    public CategoryRealmObject(@org.jetbrains.annotations.Nullable()
    com.example.appstores.sources.stores.categories.models.CategoryType from) {
        super();
    }
}