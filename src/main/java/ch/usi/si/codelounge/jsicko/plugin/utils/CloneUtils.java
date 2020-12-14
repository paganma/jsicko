/*
 * Copyright (C) 2018 Andrea Mocci and CodeLounge https://codelounge.si.usi.ch
 *
 * This file is part of jSicko - Java SImple Contract checKer.
 *
 *  jSicko is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 * jSicko is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with jSicko.  If not, see <https://www.gnu.org/licenses/>.
 *
 */

package ch.usi.si.codelounge.jsicko.plugin.utils;

import com.esotericsoftware.kryo.Kryo;
import org.objenesis.strategy.StdInstantiatorStrategy;

public final class CloneUtils {

    static Kryo kryo = new Kryo();

    static {
        kryo.setInstantiatorStrategy(new Kryo.DefaultInstantiatorStrategy(new StdInstantiatorStrategy()));
        kryo.setCopyReferences(true);
    }

    private CloneUtils() {
        throw new RuntimeException("This is an utility class that is supposed to have no instances.");
    }

    /**
     * Clones the provided object by using Kryo.
     * @param object the object to clone.
     * @param <E> the type of the object to clone.
     * @return a clone of the given object.
     */
    public static <E> E kryoClone(E object) {
        return kryo.copy(object);
    }

}