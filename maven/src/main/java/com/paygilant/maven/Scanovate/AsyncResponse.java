package com.paygilant.maven.Scanovate;

public interface AsyncResponse {
    void onVerificationFinish(double verificationScore, double threshold);
    void onVerificationError(String error);
}