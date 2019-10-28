package jetbrains.datalorePlot

import frontendApi.FrontendContext
import frontendApi.HtmlFrontendContext
import frontendApi.SimpleTextFrontendContext

object GlobalSettings {
    private const val PLOT_LIB_URL = "http://dl.bintray.com/jetbrains/datalore-plot/datalore-plot-latest.min.js"

    var frontendContext: FrontendContext = SimpleTextFrontendContext()
        set(value) {
            field = value
            if (value is HtmlFrontendContext) {
                value.headHtml = "<script type=\"text/javascript\" src=\"$PLOT_LIB_URL\"></script>"
            }
        }
}