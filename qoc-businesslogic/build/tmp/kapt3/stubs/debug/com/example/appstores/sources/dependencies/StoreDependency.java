package com.example.appstores.sources.dependencies;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lcom/example/appstores/sources/dependencies/StoreDependency;", "Lcom/example/coreandroid/sources/dependencies/CoreDependency;", "Lcom/example/appstores/sources/dependencies/StoreDependable;", "()V", "resolveEntriesCacheStore", "Lcom/example/appstores/sources/stores/entries/EntriesCacheStore;", "resolveEntriesNetworkStore", "Lcom/example/appstores/sources/stores/entries/EntriesStore;", "resolveEntriesWorker", "Lcom/example/appstores/sources/stores/entries/EntriesWorkerType;", "qoc-businesslogic_debug"})
public class StoreDependency extends com.example.coreandroid.sources.dependencies.CoreDependency implements com.example.appstores.sources.dependencies.StoreDependable {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.appstores.sources.stores.entries.EntriesWorkerType resolveEntriesWorker() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.appstores.sources.stores.entries.EntriesStore resolveEntriesNetworkStore() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.appstores.sources.stores.entries.EntriesCacheStore resolveEntriesCacheStore() {
        return null;
    }
    
    public StoreDependency() {
        super();
    }
}