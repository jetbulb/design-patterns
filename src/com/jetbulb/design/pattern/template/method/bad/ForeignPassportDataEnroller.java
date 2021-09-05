package com.jetbulb.design.pattern.template.method.bad;

import java.io.ByteArrayInputStream;

public class ForeignPassportDataEnroller {

    public void loadData(ByteArrayInputStream in) {
        // Код-дубликат тут
    }

    public void prepareForeignPassportData() {
        // Уникальный код тут
    }

    public void enrollForeignPassportData() {
        // Уникальный код тут
    }

    public void disposeData(ByteArrayInputStream in) {
        // Код-дубликат тут
    }

}
