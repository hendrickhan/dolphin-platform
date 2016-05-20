package com.canoo.dolphin.test;

import com.canoo.dolphin.collections.ObservableList;
import com.canoo.dolphin.mapping.DolphinBean;
import com.canoo.dolphin.mapping.Property;

@DolphinBean
public class TestModel {

    private Property<String> value;

    private ObservableList<String> items;

    private ObservableList<TestSubModel> internModels;

    public ObservableList<String> getItems() {
        return items;
    }

    public ObservableList<TestSubModel> getInternModels() {
        return internModels;
    }

    public Property<String> valueProperty() {
        return value;
    }

    public String getValue() {
        return value.get();
    }

    public void setValue(String value) {
        this.value.set(value);
    }
}
