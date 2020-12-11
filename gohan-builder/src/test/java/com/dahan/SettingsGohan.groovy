package com.dahan

import com.dahan.gohan.buildscript.GohanSettings

/* ************************************************************************
 *
 * Copyright (C) 2020 dahan All rights reserved.
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
 *
 * ************************************************************************/

/*
 * Creates on 2020/12/10.
 */

/**
 * @author kevin
 */
class SettingsGohan extends GohanSettings
{

    def buildscript = {

        //
        // 属性列表，可以使用 ${xx} 来引用, 这里是使用Groovy原生的DSL来做的。
        // 后续会将 def 关键字去掉，引用时的 ${exts.xx} 去掉。
        //
        exts {

            def springbootVersion = "1.0.0.RELEASE"
            def groovyVersion = "3.0.4"

        }

        /**
         * 定义子模块
         */
        subprojects = [
                "subprojects/modules-a",
                "subprojects/modules-b",
                "subprojects/modules-c",
                "subprojects/modules-d"
        ]

    }

    static void main(String[] args)
    {
        new SettingsGohan().buildscript.call()
    }

}