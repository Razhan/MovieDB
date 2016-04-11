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

package com.razhan.ava.data.repository.datasource.paginated;

public final class Page {

  private final int offset;
  private final int limit;

  private Page(int offset, int limit) {
    this.offset = offset;
    this.limit = limit;
  }

  public static Page withOffsetAndLimit(int offset, int limit) {
    return new Page(offset, limit);
  }

  public int getOffset() {
    return offset;
  }

  public int getLimit() {
    return limit;
  }
}
