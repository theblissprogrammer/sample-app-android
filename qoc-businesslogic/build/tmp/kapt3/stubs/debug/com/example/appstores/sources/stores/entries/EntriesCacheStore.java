package com.example.appstores.sources.stores.entries;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\"\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u00040\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\"\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\r"}, d2 = {"Lcom/example/appstores/sources/stores/entries/EntriesCacheStore;", "Lcom/example/appstores/sources/stores/entries/EntriesStore;", "createOrUpdate", "Lkotlinx/coroutines/experimental/Deferred;", "Lcom/example/coreandroid/sources/common/CompletionResponse;", "Lcom/example/appstores/sources/stores/entries/models/EntryType;", "Lcom/example/coreandroid/sources/errors/DataError;", "request", "delete", "Ljava/lang/Void;", "id", "", "fetch", "qoc-businesslogic_debug"})
public abstract interface EntriesCacheStore extends com.example.appstores.sources.stores.entries.EntriesStore {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.experimental.Deferred<com.example.coreandroid.sources.common.CompletionResponse<com.example.appstores.sources.stores.entries.models.EntryType, com.example.coreandroid.sources.errors.DataError>> fetch(int id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.experimental.Deferred<com.example.coreandroid.sources.common.CompletionResponse<com.example.appstores.sources.stores.entries.models.EntryType, com.example.coreandroid.sources.errors.DataError>> createOrUpdate(@org.jetbrains.annotations.NotNull()
    com.example.appstores.sources.stores.entries.models.EntryType request);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.experimental.Deferred<com.example.coreandroid.sources.common.CompletionResponse<java.lang.Void, com.example.coreandroid.sources.errors.DataError>> delete(int id);
}