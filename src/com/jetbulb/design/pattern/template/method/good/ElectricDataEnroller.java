package com.jetbulb.design.pattern.template.method.good;

import java.io.InputStream;

/**
 * Абстрактный класс реализующий контракт для загрузки электронных данных в документ
 * соответствующего типа.
 *
 * Данный класс реализует только базовую (общую) реализацию и определяет необходимый "скрытый" контракт
 * для классов-наследников. Такой прием называется "Шаблон проектирования Template Method".
 *
 * Это помогает избавится от дублирующегося кода, а наследникам позволяет сфокусироваться только
 * на собственных деталях, необходмых для функционирования системы.
 *
 * Как следствие, поддержка кода и создание новых реализаций становится легче, поскольку не требуется
 * изменения в уже существующих классах. В тоже время, активируется преимущество объектно-ориентированного
 * подхода: абстракция и полиморфизм, что дает множество реализаций и всеми можно управлять как одной.
 */
abstract class ElectricDataEnroller implements DataEnroller {

    abstract void prepareData();
    abstract void enrollData();

    /**
     * Реализованный Template Method
     */
    @Override
    public void doEnrollment(InputStream in) {
        loadData(in);
        prepareData();
        enrollData();
        disposeData(in);
    }

    void loadData(InputStream in) {
        // Общий код тут
    }

    void disposeData(InputStream in) {
        // Общий код тут
    }

}
