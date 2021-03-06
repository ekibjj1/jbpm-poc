/**
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package curriculumcourse.curriculumcourse;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Room implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private java.lang.String code;
    private int capacity;

    private java.lang.Long id;

    public Room() {
    }

    public java.lang.String getCode() {
        return this.code;
    }

    public void setCode(java.lang.String code) {
        this.code = code;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public java.lang.Long getId() {
        return this.id;
    }

    public void setId(java.lang.Long id) {
        this.id = id;
    }

    public Room(java.lang.String code,
                int capacity,
                java.lang.Long id) {
        this.code = code;
        this.capacity = capacity;
        this.id = id;
    }
}