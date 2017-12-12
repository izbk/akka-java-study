package com.akkademy.messages;

import java.io.Serializable;

public class SetRequest implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -7017549040329146436L;
	public final String key;
    public final Object value;

    public SetRequest(String key, Object value) {
        this.key = key;
        this.value = value;
    }
}
