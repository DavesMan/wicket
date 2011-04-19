/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.wicket.request.cycle;

import org.apache.wicket.request.IRequestHandler;

/**
 * Empty implementation of an {@link IRequestCycleListener} useful as a starting point for your own
 * custom listener.
 */
public abstract class AbstractRequestCycleListener implements IRequestCycleListener
{
	public void onRequestHandlerScheduled(IRequestHandler handler)
	{
	}

	public void onBeginRequest(RequestCycle cycle)
	{
	}

	public void onRequestHandlerResolved(IRequestHandler handler)
	{
	}

	public void onEndRequest(RequestCycle cycle)
	{
	}

	public void onDetach(RequestCycle cycle)
	{
	}

	public void onExceptionRequestHandlerResolved(IRequestHandler handler, Exception exception)
	{
	}

	public IRequestHandler onException(RequestCycle cycle, Exception ex)
	{
		return null;
	}
}
