package com.example.appstores.sources.stores.entries;

import java.lang.System;

/**
 * * Created by ahmedsaad on 2018-07-26.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00040\u0003H&\u00a8\u0006\b"}, d2 = {"Lcom/example/appstores/sources/stores/entries/EntriesStore;", "", "fetch", "Lkotlinx/coroutines/experimental/Deferred;", "Lcom/example/coreandroid/sources/common/CompletionResponse;", "", "Lcom/example/appstores/sources/stores/entries/models/EntryType;", "Lcom/example/coreandroid/sources/errors/DataError;", "qoc-businesslogic_debug"})
public abstract interface EntriesStore {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.experimental.Deferred<com.example.coreandroid.sources.common.CompletionResponse<java.util.List<com.example.appstores.sources.stores.entries.models.EntryType>, com.example.coreandroid.sources.errors.DataError>> fetch();
}