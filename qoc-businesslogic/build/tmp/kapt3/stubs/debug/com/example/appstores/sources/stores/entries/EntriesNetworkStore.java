package com.example.appstores.sources.stores.entries;

import java.lang.System;

/**
 * * Created by ahmedsaad on 2018-07-26.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\t0\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/example/appstores/sources/stores/entries/EntriesNetworkStore;", "Lcom/example/appstores/sources/stores/entries/EntriesStore;", "httpService", "Lcom/example/coreandroid/sources/network/HTTPServiceType;", "(Lcom/example/coreandroid/sources/network/HTTPServiceType;)V", "getHttpService", "()Lcom/example/coreandroid/sources/network/HTTPServiceType;", "fetch", "Lkotlinx/coroutines/experimental/Deferred;", "Lcom/example/coreandroid/sources/common/CompletionResponse;", "", "Lcom/example/appstores/sources/stores/entries/models/EntryType;", "Lcom/example/coreandroid/sources/errors/DataError;", "qoc-businesslogic_debug"})
public final class EntriesNetworkStore implements com.example.appstores.sources.stores.entries.EntriesStore {
    @org.jetbrains.annotations.NotNull()
    private final com.example.coreandroid.sources.network.HTTPServiceType httpService = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.experimental.Deferred<com.example.coreandroid.sources.common.CompletionResponse<java.util.List<com.example.appstores.sources.stores.entries.models.EntryType>, com.example.coreandroid.sources.errors.DataError>> fetch() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.coreandroid.sources.network.HTTPServiceType getHttpService() {
        return null;
    }
    
    public EntriesNetworkStore(@org.jetbrains.annotations.NotNull()
    com.example.coreandroid.sources.network.HTTPServiceType httpService) {
        super();
    }
}