package com.booleanuk.extension;

public class CurrentAccount extends Account {
    boolean overdraftAllowed = false;
    boolean overdraftRequested = false;

    public CurrentAccount(Branch branch) {
        super(branch);
    }

    public boolean isOverdraftAllowed() {
        return overdraftAllowed;
    }

    public boolean isOverdraftRequested() {
        return overdraftRequested;
    }
}