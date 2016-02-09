/*
 * Copyright 2000-2015 JetBrains s.r.o.
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
package com.intellij.internal.statistic.persistence;

import com.intellij.internal.statistic.beans.UsageDescriptor;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

/**
 * @author Ivan Chirkov
 */
public class CollectedUsages {
  @NotNull
  public final Set<UsageDescriptor> usages;
  public final long collectionTime;

  public CollectedUsages(@NotNull Set<UsageDescriptor> usages, long time) {
    this.usages = usages;
    collectionTime = time;
  }
}
