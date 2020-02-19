/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dromara.myth.admin.service.app;

import com.google.common.base.Splitter;
import org.dromara.myth.admin.service.AppNameService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * AppNameServiceImpl.
 *
 * @author xiaoyu(Myth)
 */
@Service("recoverApplicationNameService")
public class AppNameServiceImpl implements AppNameService {

    @Value("${myth.application.list}")
    private String appNameList;

    @Override
    public List<String> list() {
        return Splitter.on(",").splitToList(appNameList);
    }
}
