package ru.bezborodov.datastoremicroservice.service;

public interface CDCEventConsumer {

    void handle(String message);
}
