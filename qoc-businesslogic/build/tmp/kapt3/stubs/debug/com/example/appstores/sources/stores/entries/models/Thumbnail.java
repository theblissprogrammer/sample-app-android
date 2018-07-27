package com.example.appstores.sources.stores.entries.models;

import java.lang.System;

/**
 * * Created by ahmedsaad on 2018-07-26.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010\u0003B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u001f\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\t\u0010\u001d\u001a\u00020\fH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR&\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8V@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001f"}, d2 = {"Lcom/example/appstores/sources/stores/entries/models/Thumbnail;", "Lcom/example/appstores/sources/stores/entries/models/ThumbnailType;", "from", "(Lcom/example/appstores/sources/stores/entries/models/ThumbnailType;)V", "link", "", "attributes", "Lcom/example/appstores/sources/stores/entries/models/Attributes;", "(Ljava/lang/String;Lcom/example/appstores/sources/stores/entries/models/Attributes;)V", "getAttributes", "()Lcom/example/appstores/sources/stores/entries/models/Attributes;", "value", "", "height", "getHeight", "()I", "setHeight", "(I)V", "getLink", "()Ljava/lang/String;", "setLink", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "qoc-businesslogic_debug"})
public final class Thumbnail implements com.example.appstores.sources.stores.entries.models.ThumbnailType {
    private int height;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "label")
    private java.lang.String link;
    @org.jetbrains.annotations.Nullable()
    private final com.example.appstores.sources.stores.entries.models.Attributes attributes = null;
    
    @java.lang.Override()
    public int getHeight() {
        return 0;
    }
    
    @java.lang.Override()
    public void setHeight(int value) {
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
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.appstores.sources.stores.entries.models.Attributes getAttributes() {
        return null;
    }
    
    public Thumbnail(@org.jetbrains.annotations.NotNull()
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    com.example.appstores.sources.stores.entries.models.Attributes attributes) {
        super();
    }
    
    public Thumbnail() {
        super();
    }
    
    public Thumbnail(@org.jetbrains.annotations.Nullable()
    com.example.appstores.sources.stores.entries.models.ThumbnailType from) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.appstores.sources.stores.entries.models.Attributes component2() {
        return null;
    }
    
    /**
     * * Created by ahmedsaad on 2018-07-26.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.appstores.sources.stores.entries.models.Thumbnail copy(@org.jetbrains.annotations.NotNull()
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    com.example.appstores.sources.stores.entries.models.Attributes attributes) {
        return null;
    }
    
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(java.lang.Object p0) {
        return false;
    }
}