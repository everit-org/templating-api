package org.everit.templating;

/**
 * Constants of EWT.
 *
 */
public final class TemplateConstants {

    /**
     * The name of the root bookmark, that represents the full page.
     */
    public static final String BOOKMARK_ROOT = "root";

    /**
     * Variable that is always available in the template rendering process. See the documentation of
     * {@link TemplateContext}.
     */
    public static final String VAR_TEMPLATE_CONTEXT = "template_ctx";

    private TemplateConstants() {
    }
}
