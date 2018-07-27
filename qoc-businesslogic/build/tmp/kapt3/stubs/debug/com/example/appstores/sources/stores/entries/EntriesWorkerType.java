package com.example.appstores.sources.stores.entries;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001JD\u0010\u0002\u001a\u00020\u00032:\u0010\u0004\u001a6\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0004\u0012\u00020\u00030\u0005j\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t`\nH&J@\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2.\u0010\u0004\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0004\u0012\u00020\u00030\u0005j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\nH&\u00a8\u0006\r"}, d2 = {"Lcom/example/appstores/sources/stores/entries/EntriesWorkerType;", "", "fetch", "", "completion", "Lkotlin/Function1;", "Lcom/example/coreandroid/sources/common/CompletionResponse;", "", "Lcom/example/appstores/sources/stores/entries/models/EntryType;", "Lcom/example/coreandroid/sources/errors/DataError;", "Lcom/example/coreandroid/sources/common/Result;", "id", "", "qoc-businesslogic_debug"})
public abstract interface EntriesWorkerType {
    
    public abstract void fetch(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.coreandroid.sources.common.CompletionResponse<java.util.List<com.example.appstores.sources.stores.entries.models.EntryType>, com.example.coreandroid.sources.errors.DataError>, kotlin.Unit> completion);
    
    public abstract void fetch(int id, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.coreandroid.sources.common.CompletionResponse<com.example.appstores.sources.stores.entries.models.EntryType, com.example.coreandroid.sources.errors.DataError>, kotlin.Unit> completion);
}