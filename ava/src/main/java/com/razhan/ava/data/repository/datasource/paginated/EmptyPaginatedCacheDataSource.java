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


import com.razhan.ava.data.entity.Identifiable;

import java.util.Collection;

public class EmptyPaginatedCacheDataSource<K, V extends Identifiable<K>>
    implements PaginatedCacheDataSource<K, V> {

  @Override public boolean isValid(V value) {
    return false;
  }

  @Override public PaginatedCollection<V> getPage(Page page)  throws Exception {
    return null;
  }

  @Override
  public PaginatedCollection<V> addOrUpdatePage(Page page, Collection<V> values, boolean hasMore)  throws Exception {
    return null;
  }

  @Override public V addOrUpdate(V value) throws Exception {
    return null;
  }

  @Override public Collection<V> addOrUpdateAll(Collection<V> values) throws Exception {
    return null;
  }

  @Override public void deleteByKey(K key) throws Exception {

  }

  @Override public void deleteAll() throws Exception {

  }

  @Override public V getByKey(K key) throws Exception {
    return null;
  }

  @Override public Collection<V> getAll() throws Exception {
    return null;
  }
}
