/*
 * Copyright (C) 2020-2021 Mai Thanh Minh (a.k.a. thanhminhmr or mrmathami)
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package io.github.mrmathami.utils;

import io.github.mrmathami.annotations.Nonnull;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public final class StreamUtils {

	private StreamUtils() {
	}

	@Nonnull
	public static <T> Stream<T> stream(@Nonnull Iterable<T> iterable) {
		return StreamSupport.stream(iterable.spliterator(), false);
	}

}
