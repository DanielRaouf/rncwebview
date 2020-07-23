package com.reactnativecommunity.webview.events;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

import org.jetbrains.annotations.NotNull;


/**
 * Event emitted when there is an error in loading.
 */
public final class TopLoadingErrorEvent extends Event {
    private final WritableMap mEventData;
    @NotNull
    public static final String EVENT_NAME = "topLoadingError";

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

    public TopLoadingErrorEvent(int viewId, @NotNull WritableMap mEventData) {
        super(viewId);
        this.mEventData = mEventData;
    }

}
