package com.razhan.ava.domain.interactor;

/**
 * The params value to execute with a use case.
 */
final class UseCaseParams {

    private final String useCaseName;
    private final Object[] args;

    UseCaseParams(String useCaseName, Object[] args) {
        this.useCaseName = useCaseName;
        this.args = args;
    }

    String getUseCaseName() {
        return useCaseName;
    }

    Object[] getArgs() {
        return args;
    }
}