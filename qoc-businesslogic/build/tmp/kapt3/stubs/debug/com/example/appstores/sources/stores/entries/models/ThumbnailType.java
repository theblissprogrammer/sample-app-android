package com.example.appstores.sources.stores.entries.models;

import java.lang.System;

/**
 * * Created by ahmedsaad on 2018-07-26.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/example/appstores/sources/stores/entries/models/ThumbnailType;", "", "height", "", "getHeight", "()I", "setHeight", "(I)V", "link", "", "getLink", "()Ljava/lang/String;", "setLink", "(Ljava/lang/String;)V", "qoc-businesslogic_debug"})
public abstract interface ThumbnailType {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getLink();
    
    public abstract void setLink(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    public abstract int getHeight();
    
    public abstract void setHeight(int p0);
}