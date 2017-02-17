package com.polidea.rxandroidble.internal.util;

import com.polidea.rxandroidble.internal.operations.TimeoutConfiguration;

import java.util.concurrent.TimeUnit;

import rx.Scheduler;


public class MockOperationTimeoutConfiguration extends TimeoutConfiguration {

    public static final int TIMEOUT_IN_SEC = 30;

    public MockOperationTimeoutConfiguration(Scheduler timeoutScheduler) {
        super(TIMEOUT_IN_SEC, TimeUnit.SECONDS, timeoutScheduler);
    }
}
