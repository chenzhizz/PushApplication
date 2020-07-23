/*
 * Copyright (C) 2019 adminjys(adminjys@163.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.sumansoul.push.core.annotation;


import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static com.sumansoul.push.core.annotation.ResultCode.RESULT_ERROR;
import static com.sumansoul.push.core.annotation.ResultCode.RESULT_OK;

/**
 * 结果码
 *
 * @author admin
 * @since 2019-08-17 11:34
 */
@IntDef({RESULT_OK, RESULT_ERROR})
@Retention(RetentionPolicy.SOURCE)
public @interface ResultCode {
    /**
     * 成功
     */
    int RESULT_OK = 0;
    /**
     * 失败
     */
    int RESULT_ERROR = 1;

}
