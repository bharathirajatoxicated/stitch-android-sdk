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

package com.mongodb.stitch.android.core.auth.internal;

import com.google.android.gms.tasks.Task;
import com.mongodb.stitch.android.core.auth.StitchUser;
import com.mongodb.stitch.core.auth.StitchCredential;
import com.mongodb.stitch.core.auth.internal.CoreStitchUserImpl;
import com.mongodb.stitch.core.auth.internal.StitchUserProfileImpl;

public final class StitchUserImpl extends CoreStitchUserImpl implements StitchUser {
  private final StitchAuthImpl auth;

  public StitchUserImpl(
      final String id,
      final String deviceId,
      final String loggedInProviderType,
      final String loggedInProviderName,
      final StitchUserProfileImpl profile,
      final StitchAuthImpl auth,
      final boolean isLoggedIn) {
    super(id, deviceId, loggedInProviderType, loggedInProviderName, profile, isLoggedIn);
    this.auth = auth;
  }

  @Override
  public Task<StitchUser> linkWithCredential(final StitchCredential credential) {
    return auth.linkWithCredential(this, credential);
  }
}
