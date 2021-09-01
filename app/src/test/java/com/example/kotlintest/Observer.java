package com.example.kotlintest;

public interface Observer<T> {
    /**
     * Called when the data is changed.
     *
     * @param t The new data
     */
    void onChanged(T t);
}