package com.example.appstores.sources.stores.entries;

import java.lang.System;

/**
 * * Created by ahmedsaad on 2018-07-26.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006JD\u0010\u000b\u001a\u00020\f2:\u0010\r\u001a6\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u000f\u0012\u0004\u0012\u00020\f0\u000ej\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u0012`\u0013H\u0016J@\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152.\u0010\r\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000f\u0012\u0004\u0012\u00020\f0\u000ej\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012`\u0013H\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/example/appstores/sources/stores/entries/EntriesWorker;", "Lcom/example/appstores/sources/stores/entries/EntriesWorkerType;", "store", "Lcom/example/appstores/sources/stores/entries/EntriesStore;", "cacheStore", "Lcom/example/appstores/sources/stores/entries/EntriesCacheStore;", "(Lcom/example/appstores/sources/stores/entries/EntriesStore;Lcom/example/appstores/sources/stores/entries/EntriesCacheStore;)V", "getCacheStore", "()Lcom/example/appstores/sources/stores/entries/EntriesCacheStore;", "getStore", "()Lcom/example/appstores/sources/stores/entries/EntriesStore;", "fetch", "", "completion", "Lkotlin/Function1;", "Lcom/example/coreandroid/sources/common/CompletionResponse;", "", "Lcom/example/appstores/sources/stores/entries/models/EntryType;", "Lcom/example/coreandroid/sources/errors/DataError;", "Lcom/example/coreandroid/sources/common/Result;", "id", "", "qoc-businesslogic_debug"})
public final class EntriesWorker implements com.example.appstores.sources.stores.entries.EntriesWorkerType {
    @org.jetbrains.annotations.NotNull()
    private final com.example.appstores.sources.stores.entries.EntriesStore store = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.appstores.sources.stores.entries.EntriesCacheStore cacheStore = null;
    
    @java.lang.Override()
    public void fetch(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.coreandroid.sources.common.CompletionResponse<java.util.List<com.example.appstores.sources.stores.entries.models.EntryType>, com.example.coreandroid.sources.errors.DataError>, kotlin.Unit> completion) {
    }
    
    @java.lang.Override()
    public void fetch(int id, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.coreandroid.sources.common.CompletionResponse<com.example.appstores.sources.stores.entries.models.EntryType, com.example.coreandroid.sources.errors.DataError>, kotlin.Unit> completion) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.appstores.sources.stores.entries.EntriesStore getStore() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.appstores.sources.stores.entries.EntriesCacheStore getCacheStore() {
        return null;
    }
    
    public EntriesWorker(@org.jetbrains.annotations.NotNull()
    com.example.appstores.sources.stores.entries.EntriesStore store, @org.jetbrains.annotations.Nullable()
    com.example.appstores.sources.stores.entries.EntriesCacheStore cacheStore) {
        super();
    }
}