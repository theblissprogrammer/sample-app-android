package com.example.appstores.sources.dependencies;

import java.lang.System;

/**
 * * Created by ahmedsaad on 2017-11-29.
 * * Copyright © 2017. All rights reserved.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/appstores/sources/dependencies/StoreDependable;", "Lcom/example/coreandroid/sources/dependencies/CoreDependable;", "resolveEntriesCacheStore", "Lcom/example/appstores/sources/stores/entries/EntriesCacheStore;", "resolveEntriesNetworkStore", "Lcom/example/appstores/sources/stores/entries/EntriesStore;", "resolveEntriesWorker", "Lcom/example/appstores/sources/stores/entries/EntriesWorkerType;", "qoc-businesslogic_debug"})
public abstract interface StoreDependable extends com.example.coreandroid.sources.dependencies.CoreDependable {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.appstores.sources.stores.entries.EntriesWorkerType resolveEntriesWorker();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.appstores.sources.stores.entries.EntriesStore resolveEntriesNetworkStore();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.appstores.sources.stores.entries.EntriesCacheStore resolveEntriesCacheStore();
}