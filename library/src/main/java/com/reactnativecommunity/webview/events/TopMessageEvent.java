package com.reactnativecommunity.webview.events;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.jetbrains.annotations.NotNull;


/**
 * Event emitted when there is an error in loading.
 */
public final class TopMessageEvent extends Event {
    private final WritableMap mEventData;
    @NotNull
    public static final String EVENT_NAME = "topMessage";

    @NotNull
    public String getEventName() {
        return "topMessage";
    }

    public boolean canCoalesce() {
        return false;
    }

    public short getCoalescingKey() {
        return 0;
    }

    public void dispatch(@NotNull RCTEventEmitter rctEventEmitter) {
        rctEventEmitter.receiveEvent(this.getViewTag(), EVENT_NAME, this.mEventData);
    }

    public TopMessageEvent(int viewId, @NotNull WritableMap mEventData) {
        super(viewId);
        this.mEventData = mEventData;
    }
}
