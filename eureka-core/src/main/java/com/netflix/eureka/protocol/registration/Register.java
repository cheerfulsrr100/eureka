package com.netflix.eureka.protocol.registration;

import com.netflix.eureka.registry.InstanceInfo;

/**
 * @author Tomasz Bak
 */
public class Register {
    private final InstanceInfo instanceInfo;

    // For serialization frameworks
    protected Register() {
        instanceInfo = null;
    }

    public Register(InstanceInfo instanceInfo) {
        this.instanceInfo = instanceInfo;
    }

    public InstanceInfo getInstanceInfo() {
        return instanceInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Register register = (Register) o;

        if (instanceInfo != null ? !instanceInfo.equals(register.instanceInfo) : register.instanceInfo != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return instanceInfo != null ? instanceInfo.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Register{instanceInfo=" + instanceInfo + '}';
    }
}
