/*
 * Copyright 2018-present MongoDB, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mongodb.stitch.android.core.auth;

/**
 * StitchAuthListener allows one to hook into authentication events as they happen in a Stitch app
 * client.
 */
public interface StitchAuthListener {

  /**
   * onAuthEvent is called any time a notable event regarding authentication happens.
   * Some of these events are:
   * - When a user logs in.
   * - When a user logs out.
   * - When a user is linked to another identity.
   * - When a listener is registered. This is to handle the case where during registration
   *   an event happens that the registerer would otherwise miss out on.
   * - When switching users.
   * @param auth the instance of {@link StitchAuth} where the event happened. It should be used to
   *     infer the current state of authentication.
   */
  void onAuthEvent(final StitchAuth auth);
}
