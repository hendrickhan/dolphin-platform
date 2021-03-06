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
package com.canoo.platform.remoting.spi.converter;

import org.apiguardian.api.API;

import static org.apiguardian.api.API.Status.EXPERIMENTAL;

/**
 * Interface that provides access to the internal Dolphin Platform bean repository. This is used in some converters to access needed data for the conversion.
 *
 * @author Hendrik Ebbers
 */
@API(since = "0.x", status = EXPERIMENTAL)
@Deprecated
public interface DolphinBeanRepo {

    /**
     * Returns the internal Dolphin Platform representation of a bean.
     * @param sourceId the id of the bean
     * @return the bean
     */
    Object getBean(String sourceId);

    /**
     * Returns the internal unique id of a Dolphin Platform bean.
     * @param bean the bean
     * @return the id
     */
    String getDolphinId(Object bean);

}
