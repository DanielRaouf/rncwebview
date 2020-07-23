package com.reactnativecommunity.webview.events;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

import org.jetbrains.annotations.NotNull;

/**
 * Event emitted when loading is completed.
 */
public final class TopLoadingFinishEvent extends Event {
    private final WritableMap mEventData;
    @NotNull
    public static final String EVENT_NAME = "topLoadingFinish";

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
        rctEventEmitter.receiveEvent(this.getViewTag(), this.getEventName(), this.mEventData);
    }

    public TopLoadingFinishEvent(int viewId, @NotNull WritableMap mEventData) {
        super(viewId);
        this.mEventData = mEventData;
    }
}
