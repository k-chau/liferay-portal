/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.template.soy.utils;

import java.util.Map;

/**
 * @author Bruno Basto
 */
public interface SoyContext extends Map<String, Object> {

	public void clearInjectedData();

	/**
	 * Put an HTML parameter in the SoyContext container. This is the same as
	 * calling {@link SoyContext#put(Object, Object)} with a
	 * {@link com.liferay.portal.template.soy.data.SoyHTMLData} value.
	 * @param key
	 * @param value
	 * @see com.liferay.portal.template.soy.data.SoyHTMLData
	 * @review
	 */
	public void putHTML(String key, String value);

	public void putInjectedData(String key, Object value);

	public void removeInjectedData(String key);

}