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

import java.util.Map;

/**
 * The template context instance should be available as a variable with the
 * {@link TemplateConstants#VAR_TEMPLATE_CONTEXT} name.
 */
public interface TemplateContext {

    /**
     * @return the id of the fragment of the template that was called to be rendered. In case the whole template is
     *         rendered, {@link TemplateConstants#FRAGMENT_ROOT} is returned.
     */
    String getFragmentId();

    /**
     * Renders one of the fragments of the current template. The variables that are declared / assigned within the
     * fragment are not visible outside. Variables that are already declared / assigned outside are visible within the
     * fragment.
     *
     * @param fragmentId
     *            The id of the fragment.
     * @return The rendered fragment.
     */
    String renderFragment(String fragmentId);

    /**
     * Renders one of the fragments of the current template. The variables that are declared / assigned within the
     * fragment are not visible outside. Variables that are already declared / assigned outside are visible within the
     * fragment.
     *
     * @param fragmentId
     *            The id of the fragment.
     * @param parameters
     *            Map of variables that are also visible during rendering the fragment.
     * @return The rendered fragment.
     */
    String renderFragment(String fragmentId, Map<String, Object> parameters);

}
