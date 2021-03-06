/*
 * Copyright 2017 Sherchen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sherchen.archi.dagger2_retrofit;

import com.sherchen.archi.dagger2_retrofit.main.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Sherchen on 2017/5/19.
 */

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(MyApplication app);

    void inject(MainActivity mainActivity);

    MyApplication getAppInstance();
}
