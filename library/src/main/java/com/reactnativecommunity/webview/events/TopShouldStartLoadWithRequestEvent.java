package com.reactnativecommunity.webview.events;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

import org.jetbrains.annotations.NotNull;


public final class TopShouldStartLoadWithRequestEvent extends Event {
    private final WritableMap mData;
    @NotNull
    public static final String EVENT_NAME = "topShouldStartLoadWithRequest";

    @NotNull
    public String getEventName() {
        return EVENT_NAME;
    }

    public boolean canCoalesce() {
        return false;
    }

    public short getCoalescingKey() {
        return 0;
    }

    public void dispatch(@NotNull RCTEventEmitter rctEventEmitter) {
        rctEventEmitter.receiveEvent(this.getViewTag(), EVENT_NAME, this.mData);
    }

    public TopShouldStartLoadWithRequestEvent(int viewId, @NotNull WritableMap mData) {
        super(viewId);
        this.mData = mData;
        this.mData.putString("navigationType", "other");
    }

}