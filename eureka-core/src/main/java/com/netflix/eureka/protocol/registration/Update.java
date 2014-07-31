package com.netflix.eureka.protocol.registration;

/**
 * @author Tomasz Bak
 */
public class Update {
    private final String key;
    private final String value;

    // For serialization framework
    protected Update() {
        key = value = null;
    }

    public Update(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Update update = (Update) o;

        if (key != null ? !key.equals(update.key) : update.key != null) {
            return false;
        }
        if (value != null ? !value.equals(update.value) : update.value != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = key != null ? key.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
