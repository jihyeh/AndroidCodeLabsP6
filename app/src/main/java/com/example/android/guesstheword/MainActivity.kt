/*
 * Copyright (C) 2019 Google Inc.
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

package com.example.android.guesstheword

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * Creates an Activity that hosts all of the fragments in the app
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
    }

}

/**
 * Codelab : ViewModel
 * https://developer.android.com/codelabs/kotlin-android-training-view-model/?hl=ko#12
 *
 * UI 컨트롤러 : 사용자가 버튼을 선택하는 때를 아는 역할만 담당한다. 버튼이 눌리면 정보가 ViewModel에 전달된다.
 * ViewModel : 데이터에 대한 간단한 계산 및 변환을 수행하며 UI 컨트롤러에 표시할 데이터를 준비한다.
 * ViewModelFactory : ViewModel을 인스턴스화 한다.
 *
 * 기기의 방향이 회전되어도 ViewModel 인스턴스는 유지된다. 단, ViewModelProvider를 사용하여 ViewModel 인스턴스를 만든다.
 *
 * Q1. ViewModel
 * Q2. 참조해서는 안된다.
 * Q3. 관련된 UI 컨트롤러가 finished(activity 일 때) or detached(fragment 일 때) 됐을 때
 * Q4. ViewModel 인스턴스화
 * */

/**
 * Codelab : LiveData and LiveData observers
 * https://developer.android.com/codelabs/kotlin-android-training-live-data?hl=ko#12
 *
 * MutableLiveData : 데이터를 변경 가능하다
 * LiveData : 데이터 변경이 불가능하고, 읽기만 가능하다. 수명주기를 인식하기 때문에 Started & Resumed 상태에서만 업데이트 한다.
 *
 * Q1. ViewModel 안에서 private MutableLiveData를 생성, LiveData를 노출시킨다.
 * Q2. Started, Resumed
 * Q3. The data in a LiveData object
 * */

/**
 * Codelab : Data binding with ViewModel and LiveData
 * https://developer.android.com/codelabs/kotlin-android-training-live-data-data-binding?hl=ko#0
 *
 * Q1. Listener bindings work with all versions of the Android Gradle plugin. -> is not true
 * Q2. android:text= "@{@string/generic_name(user.name)}"
 * Q3. When an event such as onClick() occurs
 * */