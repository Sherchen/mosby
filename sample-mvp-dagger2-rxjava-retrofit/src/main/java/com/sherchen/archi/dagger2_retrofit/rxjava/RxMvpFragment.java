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
package com.sherchen.archi.dagger2_retrofit.rxjava;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.hannesdorfmann.mosby3.mvp.MvpFragment;
import com.hannesdorfmann.mosby3.mvp.MvpView;


/**
 * Created by Sherchen on 2017/5/19.
 */

public abstract class RxMvpFragment<V extends MvpView, P extends RxMvpBasePresenter<V>> extends MvpFragment<V, P> {

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter.callOnCreate();
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.callOnResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        presenter.callOnPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.callOnDestroy();
    }
}
