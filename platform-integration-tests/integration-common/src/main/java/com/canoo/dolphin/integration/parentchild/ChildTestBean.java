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
package com.canoo.dolphin.integration.parentchild;

import com.canoo.platform.remoting.Property;
import com.canoo.platform.remoting.RemotingBean;

@RemotingBean
public class ChildTestBean {

    private Property<Boolean> postCreatedCalled;

    private Property<Boolean> preDestroyedCalled;

    public Property<Boolean> postCreatedCalledProperty() {
        return postCreatedCalled;
    }

    public Property<Boolean> preDestroyedCalledProperty() {
        return preDestroyedCalled;
    }

    public void setPostCreatedCalled(Boolean postCreatedCalled) {
        this.postCreatedCalled.set(postCreatedCalled);
    }

    public void setPreDestroyedCalled(Boolean preDestroyedCalled) {
        this.preDestroyedCalled.set(preDestroyedCalled);
    }

    public Boolean getPostCreatedCalled() {
        return postCreatedCalled.get();
    }

    public Boolean getPreDestroyedCalled() {
        return preDestroyedCalled.get();
    }

}
