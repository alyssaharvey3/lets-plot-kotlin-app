/*
 * Copyright (c) 2021. JetBrains s.r.o.
 * Use of this source code is governed by the MIT license that can be found in the LICENSE file.
 */

package frontendContextDemo

import BrowserDemoUtil
import org.jetbrains.letsPlot.FrontendContext
import org.jetbrains.letsPlot.core.util.PlotHtmlHelper
import org.jetbrains.letsPlot.core.util.PlotHtmlHelper.scriptUrl
import org.jetbrains.letsPlot.export.VersionChecker

class BrowserDemoFrontendContext(private val title: String) : FrontendContext {
    private val plotSpecs = ArrayList<MutableMap<String, Any>>()

    override fun display(plotSpecRaw: MutableMap<String, Any>) {
        plotSpecs.add(plotSpecRaw)
    }

    fun showAll() {
        val buffer = StringBuffer()
            .append(
                """
                |<head>
                |   <title>$title</title>
                |
                |   ${PlotHtmlHelper.getStaticConfigureHtml(scriptUrl(VersionChecker.letsPlotJsVersion))}
                |   
                |</head>
                |<body>
                |
            """.trimMargin()
            )

        // For each `plot spec` append html/js block responsible for building the plot
        for (plotSpec in plotSpecs) {
            val html = PlotHtmlHelper.getStaticDisplayHtmlForRawSpec(plotSpec)
            buffer.append(html).append("\n")
        }

        buffer.append("</body>")
        BrowserDemoUtil.openInBrowser(buffer.toString())
    }
}