package com.example.appstores.sources.stores.entries;

import java.lang.System;

/**
 * * Created by ahmedsaad on 2018-07-26.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0016J\"\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\u00050\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e\u0012\u0004\u0012\u00020\u00070\u00050\u0004H\u0016J\"\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016\u00a8\u0006\u000f"}, d2 = {"Lcom/example/appstores/sources/stores/entries/EntriesRealmStore;", "Lcom/example/appstores/sources/stores/entries/EntriesCacheStore;", "()V", "createOrUpdate", "Lkotlinx/coroutines/experimental/Deferred;", "Lcom/example/coreandroid/sources/common/CompletionResponse;", "Lcom/example/appstores/sources/stores/entries/models/EntryType;", "Lcom/example/coreandroid/sources/errors/DataError;", "request", "delete", "Ljava/lang/Void;", "id", "", "fetch", "", "qoc-businesslogic_debug"})
public final class EntriesRealmStore implements com.example.appstores.sources.stores.entries.EntriesCacheStore {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.experimental.Deferred<com.example.coreandroid.sources.common.CompletionResponse<java.util.List<com.example.appstores.sources.stores.entries.models.EntryType>, com.example.coreandroid.sources.errors.DataError>> fetch() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.experimental.Deferred<com.example.coreandroid.sources.common.CompletionResponse<com.example.appstores.sources.stores.entries.models.EntryType, com.example.coreandroid.sources.errors.DataError>> fetch(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.experimental.Deferred<com.example.coreandroid.sources.common.CompletionResponse<com.example.appstores.sources.stores.entries.models.EntryType, com.example.coreandroid.sources.errors.DataError>> createOrUpdate(@org.jetbrains.annotations.NotNull()
    com.example.appstores.sources.stores.entries.models.EntryType request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.experimental.Deferred<com.example.coreandroid.sources.common.CompletionResponse<java.lang.Void, com.example.coreandroid.sources.errors.DataError>> delete(int id) {
        return null;
    }
    
    public EntriesRealmStore() {
        super();
    }
}