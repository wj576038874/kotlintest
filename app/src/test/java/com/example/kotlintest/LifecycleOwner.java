package com.example.kotlintest;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;

public interface LifecycleOwner {
    /**
     * Returns the Lifecycle of the provider.
     *
     * @return The lifecycle of the provider.
     */
    void getLifecycle();
}