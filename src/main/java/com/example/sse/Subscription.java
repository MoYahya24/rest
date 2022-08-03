package com.example.sse;

import javax.ws.rs.sse.Sse;
import javax.ws.rs.sse.SseEventSink;

public class Subscription {

    private Sse sse;
    private SseEventSink sink;

    public Subscription( Sse sse, SseEventSink sink ) {
        this.sse = sse;
        this.sink = sink;
    }

    public Sse getSse() {
        return sse;
    }

    public void setSse( Sse sse ) {
        this.sse = sse;
    }

    public SseEventSink getSink() {
        return sink;
    }

    public void setSink( SseEventSink sink ) {
        this.sink = sink;
    }

}
