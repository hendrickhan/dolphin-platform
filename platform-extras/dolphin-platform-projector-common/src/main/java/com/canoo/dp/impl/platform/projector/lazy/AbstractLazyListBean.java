/*
 * Copyright 2015-2018 Canoo Engineering AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.canoo.dp.impl.platform.projector.lazy;

import com.canoo.dp.impl.platform.projector.base.AbstractProjectableBean;
import com.canoo.dp.impl.platform.projector.metadata.KeyValue;
import com.canoo.platform.remoting.ObservableList;
import com.canoo.platform.remoting.Property;
import com.canoo.platform.remoting.RemotingBean;

@RemotingBean
public abstract class AbstractLazyListBean<E extends LazyListElement> extends AbstractProjectableBean implements LazyList<E> {

    private Property<Integer> listLenght;

    private ObservableList<Integer> neededContent;

    private ObservableList<KeyValue> layoutMetadata;

    private Property<Boolean> multiSelect;

    @Override
    public Property<Integer> listLengthProperty() {
        return listLenght;
    }

    @Override
    public ObservableList<Integer> getNeededContent() {
        return neededContent;
    }

    @Override
    public ObservableList<KeyValue> getLayoutMetadata() {
        return layoutMetadata;
    }

    @Override
    public Property<Boolean> multiSelectProperty() {
        return multiSelect;
    }

}
