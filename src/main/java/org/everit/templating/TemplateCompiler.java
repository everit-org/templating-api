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

import org.everit.expression.ParserConfiguration;

/**
 * Standard Interface of template compilers.
 */
public interface TemplateCompiler {

  /**
   * Compiles a template. By calling this method, the implementation of the template compiler might
   * save memory by re-using the passed character array. The
   * {@link ParserConfiguration#getStartRow()} and {@link ParserConfiguration#getStartColumn()}
   * values should point to the place of {@code expressionStart}.
   *
   * @param document
   *          The full document that contains the template.
   * @param templateStart
   *          The starting position of the template within the document.
   * @param templateLength
   *          The length of the template in character number.
   * @param parserConfiguration
   *          Configuration of the parser.
   * @return The compiled template that can be used to render output text.
   */
  CompiledTemplate compile(char[] document, int templateStart, int templateLength,
      ParserConfiguration parserConfiguration);

  /**
   * Compiles a template.
   *
   * @param template
   *          The template that will be parsed and compiled.
   * @param parserConfiguration
   *          Configuration of the parser.
   * @return The compiled template that can be used to render output text.
   */
  CompiledTemplate compile(String template, ParserConfiguration parserConfiguration);
}
