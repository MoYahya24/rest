package com.example.sse;

import org.eclipse.microprofile.jwt.JsonWebToken;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.sse.Sse;
import javax.ws.rs.sse.SseEventSink;

@Path("/sse")
public class Subscribe {

    @Inject
    JsonWebToken identity;

    @Inject
    Subscriptions subscribers;

    @GET
    @Path( "subscribe" )
    @Produces( MediaType.SERVER_SENT_EVENTS )
    public void handleSubscription(@Context Sse sse, @Context SseEventSink sink ) {

        var pid = ( String ) identity.getClaim( "pid" );
        subscribers.add( pid, new Subscription( sse, sink ) );

    }

}
