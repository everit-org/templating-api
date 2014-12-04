package org.everit.templating;

import java.io.Reader;

import org.everit.expression.ParserConfiguration;

public interface TemplateCompiler {

    /**
     * Compiles an expression.
     *
     * @param template
     *            The template that will be parsed and compiled.
     * @return The compiled template that can be used to render output text.
     */
    CompiledTemplate compile(Reader template);

    /**
     * Compiles an expression within the given parser context.
     *
     * @param template
     *            The template that will be parsed and compiled.
     * @param parserContext
     *            The clone context that the template is parsed in or null if there is no current context.
     * @return The compiled template that can be used to render output text.
     */
    CompiledTemplate compile(Reader template, ParserConfiguration parserContext);
}
