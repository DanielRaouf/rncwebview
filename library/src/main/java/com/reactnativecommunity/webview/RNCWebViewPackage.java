package com.reactnativecommunity.webview;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.ReactApplicationContext;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import kotlin.collections.CollectionsKt;

public final class RNCWebViewPackage implements ReactPackage {
    @NotNull
    public List createNativeModules(@NotNull ReactApplicationContext reactContext) {
        return CollectionsKt.listOf(new RNCWebViewModule(reactContext));
    }

    @NotNull
    public List createViewManagers(@NotNull ReactApplicationContext reactContext) {
        return CollectionsKt.listOf(new RNCWebViewManager());
    }
}