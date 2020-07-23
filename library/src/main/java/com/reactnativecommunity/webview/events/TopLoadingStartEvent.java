package com.reactnativecommunity.webview.events;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

import org.jetbrains.annotations.NotNull;


/**
 * Event emitted when loading has started
 */
public final class TopLoadingStartEvent extends Event {
    private final WritableMap mEventData;
    @NotNull
    public static final String EVENT_NAME = "topLoadingStart";

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

    public TopLoadingStartEvent(int viewId, @NotNull WritableMap mEventData) {
        super(viewId);
        this.mEventData = mEventData;
    }

}
