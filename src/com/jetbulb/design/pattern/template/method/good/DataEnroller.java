package com.jetbulb.design.pattern.template.method.good;

import java.io.InputStream;

/**
 * Интерфейс определяющий контракт для загрузки данных в документ.
 */
public interface DataEnroller {

    /**
     * Будущий Template Method
     */
    void doEnrollment(InputStream in);

}
