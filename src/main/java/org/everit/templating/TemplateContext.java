/*
 * Copyright (C) 2011 Everit Kft. (http://www.everit.biz)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.everit.templating;

import java.util.Map;

/**
 * The template context instance should be available as a variable with the
 * {@link TemplateConstants#VAR_TEMPLATE_CONTEXT} name.
 */
public interface TemplateContext {

  /**
   * Gets the id of the fragment.
   *
   * @return the id of the fragment of the template that was called to be rendered. In case the
   *         whole template is rendered, {@link TemplateConstants#FRAGMENT_ROOT} is returned.
   */
  String getFragmentId();

  /**
   * Renders one of the fragments of the current template. The variables that are declared /
   * assigned within the fragment are not visible outside. Variables that are already declared /
   * assigned outside are visible within the fragment.
   *
   * @param fragmentId
   *          The id of the fragment.
   * @return The rendered fragment.
   */
  String renderFragment(String fragmentId);

  /**
   * Renders one of the fragments of the current template. The variables that are declared /
   * assigned within the fragment are not visible outside. Variables that are already declared /
   * assigned outside are visible within the fragment.
   *
   * @param fragmentId
   *          The id of the fragment.
   * @param parameters
   *          Map of variables that are also visible during rendering the fragment.
   * @return The rendered fragment.
   */
  String renderFragment(String fragmentId, Map<String, Object> parameters);

}
