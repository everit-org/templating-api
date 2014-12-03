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
