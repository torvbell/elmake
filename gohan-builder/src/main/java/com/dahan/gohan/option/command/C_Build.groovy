package com.dahan.gohan.option.command

import com.dahan.gohan.option.GohanOption

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
 * Creates on 2020/12/12.
 */

/**
 * 构建命令
 *
 * @author kevin
 */
class C_Build extends GohanOption
{

    C_Build()
    {
        this("build", "build", false, "构建项目，参数为项目名或模块名。如果不传则默认打包整个项目。")
    }

    private C_Build(String opt, String description) throws IllegalArgumentException
    {
        super(opt, description)
    }

    private C_Build(String opt, boolean hasArg, String description) throws IllegalArgumentException
    {
        super(opt, hasArg, description)
    }

    private C_Build(String opt, String longOpt, boolean hasArg, String description) throws IllegalArgumentException
    {
        super(opt, longOpt, hasArg, description)
    }

    @Override
    boolean exec(Object... values)
    {
        return false
    }

}