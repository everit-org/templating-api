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

import java.io.Writer;
import java.util.Map;

/**
 * A template that is compiled and can render output based on specified variables.
 *
 */
public interface CompiledTemplate {

    /**
     * Renders the output of a compiled template.
     *
     * @param writer
     *            The output of the template will be written to the writer.
     * @param vars
     *            The variables that will be used during the template rendering.
     */
    void render(Writer writer, Map<String, Object> vars);

    /**
     * Renders a part of a compiled template.
     *
     * @param writer
     *            The output of the template will be written to the writer.
     * @param vars
     *            The variables that will be used during the template rendering.
     * @param fragmentId
     *            Identifies the part of the template that should be rendered. In case the fragment is null, the full
     *            template will be rendered.
     */
    void render(Writer writer, Map<String, Object> vars, String fragmentId);

}
