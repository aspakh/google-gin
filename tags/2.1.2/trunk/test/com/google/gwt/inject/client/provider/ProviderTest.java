/*
 * Copyright 2009 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.inject.client.provider;

import com.google.gwt.core.client.GWT;
import com.google.gwt.junit.client.GWTTestCase;

public class ProviderTest extends GWTTestCase {

  public void testInnerClassProvider() {
    WatchGinjector ginjector = GWT.create(WatchGinjector.class);
    Watch watch = ginjector.getWatch();
    assertNotNull(watch.getHourHand());
    assertNotNull(watch.getMinuteHand());
    assertNotSame(watch.getMinuteHand(), watch.getHourHand());
  }

  public String getModuleName() {
    return "com.google.gwt.inject.InjectTest";
  }
}