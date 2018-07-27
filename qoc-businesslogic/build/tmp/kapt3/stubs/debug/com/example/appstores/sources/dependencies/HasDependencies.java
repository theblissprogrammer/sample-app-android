package com.example.appstores.sources.dependencies;

import java.lang.System;

/**
 * * Created by ahmedsaad on 2017-11-30.
 * * Copyright © 2017. All rights reserved.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/appstores/sources/dependencies/HasDependencies;", "", "dependencies", "Lcom/example/appstores/sources/dependencies/StoreDependable;", "getDependencies", "()Lcom/example/appstores/sources/dependencies/StoreDependable;", "qoc-businesslogic_debug"})
public abstract interface HasDependencies {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.appstores.sources.dependencies.StoreDependable getDependencies();
    
    /**
     * * Created by ahmedsaad on 2017-11-30.
     * * Copyright © 2017. All rights reserved.
     */
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        public static com.example.appstores.sources.dependencies.StoreDependable getDependencies(com.example.appstores.sources.dependencies.HasDependencies $this) {
            return null;
        }
    }
}