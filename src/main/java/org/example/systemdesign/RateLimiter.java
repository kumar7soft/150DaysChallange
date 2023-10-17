package org.example.systemdesign;

import java.util.concurrent.TimeUnit;

public class RateLimiter {

    private final int capacity;
    private final double refillRate;
    private final long timeWindow;

    private long lastRequestTime;
    private int tokens;

    public RateLimiter(int capacity, double refillRate, long timeWindow) {
        this.capacity = capacity;
        this.refillRate = refillRate;
        this.timeWindow = timeWindow;

        this.lastRequestTime = System.currentTimeMillis();
        this.tokens = capacity;
    }

    public boolean isAllowed() {
        long now = System.currentTimeMillis();
        long tokensAddedSinceLastRequest = (long) ((now - lastRequestTime) / TimeUnit.SECONDS.toMillis(timeWindow) * refillRate);
        tokens += tokensAddedSinceLastRequest;
        if (tokens > capacity) {
            tokens = capacity;
        }
        lastRequestTime = now;
        return tokens > 0;
    }
}

