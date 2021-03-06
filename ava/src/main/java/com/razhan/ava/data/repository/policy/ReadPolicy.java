/*
 * Copyright (C) 2015 Karumi.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.razhan.ava.data.repository.policy;

/**
 * Value to specify modifiers over the retrieval operations on repositories and data sources.
 */
public enum ReadPolicy {
  CACHE_ONLY,
  READABLE_ONLY,
  READ_ALL;

  public boolean useCache() {
    return this == CACHE_ONLY || this == READ_ALL;
  }

  public boolean useReadable() {
    return this == READABLE_ONLY || this == READ_ALL;
  }
}
