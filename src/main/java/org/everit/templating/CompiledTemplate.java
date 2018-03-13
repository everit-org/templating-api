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
   *          The output of the template will be written to the writer.
   * @param vars
   *          The variables that will be used during the template rendering.
   */
  void render(Writer writer, Map<String, Object> vars);

  /**
   * Renders a part of a compiled template.
   *
   * @param writer
   *          The output of the template will be written to the writer.
   * @param vars
   *          The variables that will be used during the template rendering.
   * @param fragmentId
   *          Identifies the part of the template that should be rendered. In case the fragment is
   *          null, the full template will be rendered.
   *
   * @throws FragmentNotFoundException
   *           if no fragment found with the specified non-null fragment id.
   */
  void render(Writer writer, Map<String, Object> vars, String fragmentId);

}
