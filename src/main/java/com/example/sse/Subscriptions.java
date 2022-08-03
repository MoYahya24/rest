package com.example.sse;

import io.quarkus.runtime.Startup;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Startup
@Singleton
public class Subscriptions {

    private Map<String, List<Subscription>> subscribers = new ConcurrentHashMap<>();

    public void add(String id, Subscription sub ) {

        if ( !subscribers.containsKey(id) ) {
            subscribers.put(id, new ArrayList<>());
        }
        subscribers.get(id).add(sub);

    }

    public List<Subscription> find( String id ) {
        return subscribers.get(id);
    }

}
