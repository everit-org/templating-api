/**
 * This file is part of Everit - Templating API.
 *
 * Everit - Templating API is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Everit - Templating API is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Everit - Templating API.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.everit.templating;

import org.everit.expression.AbstractExpressionException;

public class RenderException extends AbstractExpressionException {

    public RenderException(final String message, final char[] expr, final int cursor) {
        super(message, expr, cursor);
    }

    public RenderException(final String message, final char[] expr, final int cursor, final Throwable e) {
        super(message, expr, cursor, e);
    }

}
