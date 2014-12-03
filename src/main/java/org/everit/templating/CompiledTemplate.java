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
     * @throws RenderException
     *             if any exception occurs during rendering.
     */
    void render(Writer writer, Map<String, Object> vars);

    /**
     * Renders a part of a compiled template.
     *
     * @param writer
     *            The output of the template will be written to the writer.
     * @param vars
     *            The variables that will be used during the template rendering.
     * @param bookmark
     *            Identifies the part of the template that should be rendered. In case the bookmark is null, the full
     *            template will be rendered.
     * @throws RenderException
     *             if any exception occurs during rendering.
     */
    void render(Writer writer, Map<String, Object> vars, String bookmark);

}
