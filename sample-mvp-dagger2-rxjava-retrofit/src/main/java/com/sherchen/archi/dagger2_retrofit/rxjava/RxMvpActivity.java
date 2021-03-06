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

import com.hannesdorfmann.mosby3.mvp.MvpActivity;
import com.hannesdorfmann.mosby3.mvp.MvpView;

/**
 * Created by Sherchen on 2017/5/19.
 */

public abstract class RxMvpActivity<V extends MvpView, P extends RxMvpBasePresenter<V>> extends MvpActivity<V, P> {
//    private Dialog dialog;

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.callOnDestroy();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter.callOnCreate();
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.callOnResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        presenter.callOnPause();
    }


//    public Dialog getDialog() {
//        if (dialog == null) {
//            dialog = DialogUtil.getLoadingDialog(this, "", true, new DialogUtil.DialogCancelListener() {
//                @Override
//                public void onCancel() {
//                    onBackPressed();
//                }
//            });
//            dialog.setCancelable(true);
//        }
//        return dialog;
//    }
}
