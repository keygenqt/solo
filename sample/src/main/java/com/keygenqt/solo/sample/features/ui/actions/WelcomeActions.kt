/*
 * Copyright 2022 Vitaliy Zarubin
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
package com.keygenqt.solo.sample.features.ui.actions

import com.keygenqt.solo.sample.features.ui.screens.welcome.WelcomeScreen
import com.keygenqt.solo.sample.utils.Components

/**
 * Actions sealed class for screen [WelcomeScreen]
 */
sealed class WelcomeActions {

    /**
     * Open feature page
     */
    data class ToPageFeature(val feature: Components) : WelcomeActions()
}
