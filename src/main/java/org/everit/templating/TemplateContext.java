package org.everit.templating;

/**
 * The template context instance should be available as a variable with the
 * {@link TemplateConstants#VAR_TEMPLATE_CONTEXT} name.
 */
public interface TemplateContext {

    /**
     * The bookmark of the template that is rendered. In case the full template is rendered, the
     * 
     * @return The bookmark.
     */
    String getBookmark();

    void renderBookmark(String bookmark);

}
