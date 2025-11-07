package com.codingkiddo.api.streams.internal;

import org.jetbrains.annotations.NotNull;

public final class Params {

	public Runnable closeHandler;
	
	public static Params wrapWithCloseHandler(Params params, @NotNull Runnable closeHandler) {
		final Params newParams;
		if( params == null ) {
			newParams = new Params();
			newParams.closeHandler = closeHandler;
		} else {
			newParams = params;
		}
		return newParams;
	}
}
