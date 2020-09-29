/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dtstack.flinkx.restapi.common;

/**
 * ParamDefinition
 *
 * @author by dujie@dtstack.com
 * @Date 2020/9/26
 */
public interface ParamDefinition extends  lifecycle {

    /**
     * key
     *
     * @return
     */
    String getName();

    ParamType getType();

    Object getValue();

    Class getValueType();

    /**
     * 用户定义的json
     *
     * @return
     */
    String getDescription();

    String getFormat();

    Object format(Object data);

    <T> T objectConvent(Class<T> tClass, Object data);

    default void init(){

    }
}
