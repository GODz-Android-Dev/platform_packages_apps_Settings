/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.settings.applications;

import android.app.Fragment;
import android.view.View;

public interface ApplicationFeatureProvider {

    /**
     * Returns a new {@link AppHeaderController} instance to customize app header.
     */
    AppHeaderController newAppHeaderController(Fragment fragment, View appHeader);

    /**
     * Asynchronously calculates the total number of apps installed on the device, across all users
     * and managed profiles.
     */
    void calculateNumberOfInstalledApps(NumberOfInstalledAppsCallback callback);

    /**
     * Callback that receives the total number of packages installed on the device.
     */
    interface NumberOfInstalledAppsCallback {
        void onNumberOfInstalledAppsResult(int num);
    }
}