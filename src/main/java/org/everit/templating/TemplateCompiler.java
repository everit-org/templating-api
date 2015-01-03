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

import org.everit.expression.ParserConfiguration;

/**
 * Standard Interface of template compilers.
 */
public interface TemplateCompiler {

    /**
     * Compiles a template. By calling this method, the implementation of the template compiler might save memory by
     * re-using the passed character array. The {@link ParserConfiguration#getStartRow()} and
     * {@link ParserConfiguration#getStartColumn()} values should point to the place of {@code expressionStart}.
     *
     * @param document
     *            The full document that contains the template.
     * @param templateStart
     *            The starting position of the template within the document.
     * @param templateLength
     *            The length of the template in character number.
     * @param parserConfiguration
     *            Configuration of the parser.
     * @return The compiled template that can be used to render output text.
     */
    CompiledTemplate compile(char[] document, int templateStart, int templateLength,
            ParserConfiguration parserConfiguration);

    /**
     * Compiles a template.
     *
     * @param template
     *            The template that will be parsed and compiled.
     * @param parserConfiguration
     *            Configuration of the parser.
     * @return The compiled template that can be used to render output text.
     */
    CompiledTemplate compile(String template, ParserConfiguration parserConfiguration);
}
