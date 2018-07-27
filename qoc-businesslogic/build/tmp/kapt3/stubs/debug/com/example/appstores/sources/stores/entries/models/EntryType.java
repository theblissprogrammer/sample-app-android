package com.example.appstores.sources.stores.entries.models;

import java.lang.System;

/**
 * * Created by ahmedsaad on 2018-07-26.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000fX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u00020\u000fX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u0018\u0010\u0017\u001a\u00020\u000fX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u0018\u0010\u001a\u001a\u00020\u001bX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u00020\u000fX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R\u0018\u0010#\u001a\u00020\u000fX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013R\u0018\u0010&\u001a\u00020\'X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0018\u0010,\u001a\u00020-X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0018\u00102\u001a\u00020\u000fX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b3\u0010\u0011\"\u0004\b4\u0010\u0013R\u001e\u00105\u001a\b\u0012\u0004\u0012\u00020706X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0018\u0010<\u001a\u00020\u000fX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b=\u0010\u0011\"\u0004\b>\u0010\u0013\u00a8\u0006?"}, d2 = {"Lcom/example/appstores/sources/stores/entries/models/EntryType;", "", "author", "Lcom/example/appstores/sources/stores/authors/models/Author;", "getAuthor", "()Lcom/example/appstores/sources/stores/authors/models/Author;", "setAuthor", "(Lcom/example/appstores/sources/stores/authors/models/Author;)V", "category", "Lcom/example/appstores/sources/stores/categories/models/Category;", "getCategory", "()Lcom/example/appstores/sources/stores/categories/models/Category;", "setCategory", "(Lcom/example/appstores/sources/stores/categories/models/Category;)V", "contentType", "", "getContentType", "()Ljava/lang/String;", "setContentType", "(Ljava/lang/String;)V", "copyright", "getCopyright", "setCopyright", "currency", "getCurrency", "setCurrency", "id", "", "getId", "()I", "setId", "(I)V", "link", "getLink", "setLink", "name", "getName", "setName", "price", "", "getPrice", "()D", "setPrice", "(D)V", "releaseDate", "Ljava/util/Date;", "getReleaseDate", "()Ljava/util/Date;", "setReleaseDate", "(Ljava/util/Date;)V", "summary", "getSummary", "setSummary", "thumbnails", "Ljava/util/ArrayList;", "Lcom/example/appstores/sources/stores/entries/models/Thumbnail;", "getThumbnails", "()Ljava/util/ArrayList;", "setThumbnails", "(Ljava/util/ArrayList;)V", "title", "getTitle", "setTitle", "qoc-businesslogic_debug"})
public abstract interface EntryType {
    
    public abstract int getId();
    
    public abstract void setId(int p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getName();
    
    public abstract void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.ArrayList<com.example.appstores.sources.stores.entries.models.Thumbnail> getThumbnails();
    
    public abstract void setThumbnails(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.appstores.sources.stores.entries.models.Thumbnail> p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getSummary();
    
    public abstract void setSummary(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    public abstract double getPrice();
    
    public abstract void setPrice(double p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getCurrency();
    
    public abstract void setCurrency(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getContentType();
    
    public abstract void setContentType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getCopyright();
    
    public abstract void setCopyright(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getTitle();
    
    public abstract void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getLink();
    
    public abstract void setLink(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.example.appstores.sources.stores.authors.models.Author getAuthor();
    
    public abstract void setAuthor(@org.jetbrains.annotations.Nullable()
    com.example.appstores.sources.stores.authors.models.Author p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.example.appstores.sources.stores.categories.models.Category getCategory();
    
    public abstract void setCategory(@org.jetbrains.annotations.Nullable()
    com.example.appstores.sources.stores.categories.models.Category p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Date getReleaseDate();
    
    public abstract void setReleaseDate(@org.jetbrains.annotations.NotNull()
    java.util.Date p0);
}