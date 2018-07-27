package com.example.appstores.sources.stores.entries.models;

import java.lang.System;

/**
 * * Created by ahmedsaad on 2018-07-26.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0002\u0010\u0004B\u0091\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\u0002\u0010\u001aR*\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c8V@VX\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R*\u0010\'\u001a\u0004\u0018\u00010&2\b\u0010\u001b\u001a\u0004\u0018\u00010&8V@VX\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u0010\u0010\u001a\u00020\bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u0010\u0011\u001a\u00020\bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00101\"\u0004\b5\u00103R\u001a\u0010\u000f\u001a\u00020\bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00101\"\u0004\b7\u00103R\u001e\u0010\u0005\u001a\u00020\u00068\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010\u0013\u001a\u00020\bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u00101\"\u0004\b=\u00103R\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u00101\"\u0004\b?\u00103R\u001a\u0010\r\u001a\u00020\u000eX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001a\u0010\u0018\u001a\u00020\u0019X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001a\u0010\f\u001a\u00020\bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u00101\"\u0004\bI\u00103R2\u0010L\u001a\b\u0012\u0004\u0012\u00020K0J2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020K0J8V@VX\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001a\u0010\u0012\u001a\u00020\bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u00101\"\u0004\bV\u00103\u00a8\u0006W"}, d2 = {"Lcom/example/appstores/sources/stores/entries/models/EntryRealmObject;", "Lio/realm/RealmObject;", "Lcom/example/appstores/sources/stores/entries/models/EntryType;", "from", "(Lcom/example/appstores/sources/stores/entries/models/EntryType;)V", "id", "", "name", "", "thumbnailsRaw", "Lio/realm/RealmList;", "Lcom/example/appstores/sources/stores/entries/models/ThumbnailRealmObject;", "summary", "price", "", "currency", "contentType", "copyright", "title", "link", "authorRaw", "Lcom/example/appstores/sources/stores/authors/models/AuthorRealmObject;", "categoryRaw", "Lcom/example/appstores/sources/stores/categories/models/CategoryRealmObject;", "releaseDate", "Ljava/util/Date;", "(ILjava/lang/String;Lio/realm/RealmList;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/appstores/sources/stores/authors/models/AuthorRealmObject;Lcom/example/appstores/sources/stores/categories/models/CategoryRealmObject;Ljava/util/Date;)V", "value", "Lcom/example/appstores/sources/stores/authors/models/Author;", "author", "getAuthor", "()Lcom/example/appstores/sources/stores/authors/models/Author;", "setAuthor", "(Lcom/example/appstores/sources/stores/authors/models/Author;)V", "getAuthorRaw", "()Lcom/example/appstores/sources/stores/authors/models/AuthorRealmObject;", "setAuthorRaw", "(Lcom/example/appstores/sources/stores/authors/models/AuthorRealmObject;)V", "Lcom/example/appstores/sources/stores/categories/models/Category;", "category", "getCategory", "()Lcom/example/appstores/sources/stores/categories/models/Category;", "setCategory", "(Lcom/example/appstores/sources/stores/categories/models/Category;)V", "getCategoryRaw", "()Lcom/example/appstores/sources/stores/categories/models/CategoryRealmObject;", "setCategoryRaw", "(Lcom/example/appstores/sources/stores/categories/models/CategoryRealmObject;)V", "getContentType", "()Ljava/lang/String;", "setContentType", "(Ljava/lang/String;)V", "getCopyright", "setCopyright", "getCurrency", "setCurrency", "getId", "()I", "setId", "(I)V", "getLink", "setLink", "getName", "setName", "getPrice", "()D", "setPrice", "(D)V", "getReleaseDate", "()Ljava/util/Date;", "setReleaseDate", "(Ljava/util/Date;)V", "getSummary", "setSummary", "Ljava/util/ArrayList;", "Lcom/example/appstores/sources/stores/entries/models/Thumbnail;", "thumbnails", "getThumbnails", "()Ljava/util/ArrayList;", "setThumbnails", "(Ljava/util/ArrayList;)V", "getThumbnailsRaw", "()Lio/realm/RealmList;", "setThumbnailsRaw", "(Lio/realm/RealmList;)V", "getTitle", "setTitle", "qoc-businesslogic_debug"})
public class EntryRealmObject extends io.realm.RealmObject implements com.example.appstores.sources.stores.entries.models.EntryType {
    @org.jetbrains.annotations.Nullable()
    @io.realm.annotations.Ignore()
    private com.example.appstores.sources.stores.authors.models.Author author;
    @org.jetbrains.annotations.Nullable()
    @io.realm.annotations.Ignore()
    private com.example.appstores.sources.stores.categories.models.Category category;
    @org.jetbrains.annotations.NotNull()
    @io.realm.annotations.Ignore()
    private java.util.ArrayList<com.example.appstores.sources.stores.entries.models.Thumbnail> thumbnails;
    @io.realm.annotations.PrimaryKey()
    private int id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    private io.realm.RealmList<com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject> thumbnailsRaw;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String summary;
    private double price;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currency;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String contentType;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String copyright;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String link;
    @org.jetbrains.annotations.Nullable()
    private com.example.appstores.sources.stores.authors.models.AuthorRealmObject authorRaw;
    @org.jetbrains.annotations.Nullable()
    private com.example.appstores.sources.stores.categories.models.CategoryRealmObject categoryRaw;
    @org.jetbrains.annotations.NotNull()
    private java.util.Date releaseDate;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.example.appstores.sources.stores.authors.models.Author getAuthor() {
        return null;
    }
    
    @java.lang.Override()
    public void setAuthor(@org.jetbrains.annotations.Nullable()
    com.example.appstores.sources.stores.authors.models.Author value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.example.appstores.sources.stores.categories.models.Category getCategory() {
        return null;
    }
    
    @java.lang.Override()
    public void setCategory(@org.jetbrains.annotations.Nullable()
    com.example.appstores.sources.stores.categories.models.Category value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.ArrayList<com.example.appstores.sources.stores.entries.models.Thumbnail> getThumbnails() {
        return null;
    }
    
    @java.lang.Override()
    public void setThumbnails(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.appstores.sources.stores.entries.models.Thumbnail> value) {
    }
    
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
    public final io.realm.RealmList<com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject> getThumbnailsRaw() {
        return null;
    }
    
    public final void setThumbnailsRaw(@org.jetbrains.annotations.NotNull()
    io.realm.RealmList<com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getSummary() {
        return null;
    }
    
    @java.lang.Override()
    public void setSummary(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public double getPrice() {
        return 0.0;
    }
    
    @java.lang.Override()
    public void setPrice(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getCurrency() {
        return null;
    }
    
    @java.lang.Override()
    public void setCurrency(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getContentType() {
        return null;
    }
    
    @java.lang.Override()
    public void setContentType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getCopyright() {
        return null;
    }
    
    @java.lang.Override()
    public void setCopyright(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getTitle() {
        return null;
    }
    
    @java.lang.Override()
    public void setTitle(@org.jetbrains.annotations.NotNull()
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
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.appstores.sources.stores.authors.models.AuthorRealmObject getAuthorRaw() {
        return null;
    }
    
    public final void setAuthorRaw(@org.jetbrains.annotations.Nullable()
    com.example.appstores.sources.stores.authors.models.AuthorRealmObject p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.appstores.sources.stores.categories.models.CategoryRealmObject getCategoryRaw() {
        return null;
    }
    
    public final void setCategoryRaw(@org.jetbrains.annotations.Nullable()
    com.example.appstores.sources.stores.categories.models.CategoryRealmObject p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Date getReleaseDate() {
        return null;
    }
    
    @java.lang.Override()
    public void setReleaseDate(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    public EntryRealmObject(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    io.realm.RealmList<com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject> thumbnailsRaw, @org.jetbrains.annotations.NotNull()
    java.lang.String summary, double price, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, @org.jetbrains.annotations.NotNull()
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    java.lang.String copyright, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    com.example.appstores.sources.stores.authors.models.AuthorRealmObject authorRaw, @org.jetbrains.annotations.Nullable()
    com.example.appstores.sources.stores.categories.models.CategoryRealmObject categoryRaw, @org.jetbrains.annotations.NotNull()
    java.util.Date releaseDate) {
        super();
    }
    
    public EntryRealmObject() {
        super();
    }
    
    public EntryRealmObject(@org.jetbrains.annotations.Nullable()
    com.example.appstores.sources.stores.entries.models.EntryType from) {
        super();
    }
}