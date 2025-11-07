package com.codingkiddo.api.streams.internal;

import org.jetbrains.annotations.NotNull;

public final class Parameterss {

    public Runnable closeHandler;

    public static Parameterss wrapWithCloseHandler(Parameterss params, @NotNull Runnable closeHandler) {
        final Parameterss newParams;
        if (params == null) {
            newParams = new Parameterss();
            newParams.closeHandler = closeHandler;
        } else {
            newParams = params;
        }
        return newParams;
    }
}
