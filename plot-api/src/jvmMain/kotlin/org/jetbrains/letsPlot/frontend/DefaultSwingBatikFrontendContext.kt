/*
 * Copyright (c) 2021. JetBrains s.r.o.
 * Use of this source code is governed by the MIT license that can be found in the LICENSE file.
 */

package org.jetbrains.letsPlot.frontend

import org.jetbrains.letsPlot.FrontendContext
import org.jetbrains.letsPlot.batik.plot.component.PlotViewerWindowBatik

/**
 * Shows plot in Java Swing Window.
 * Uses Batik mapping for SVG rendering.
 */
class DefaultSwingBatikFrontendContext private constructor() : FrontendContext {
    override fun display(plotSpecRaw: MutableMap<String, Any>) {
        PlotViewerWindowBatik(
            "Plot Viewer",
            rawSpec = plotSpecRaw,
            windowSize = null,
            preserveAspectRatio = false,
            repaintDelay = 300
        ).open()
    }

    companion object {
        fun tryCreate(): FrontendContext? {
            return try {
                // Try load Batik window class.
                // Requires "lets-plot-batik-<version>.jar" in classpath.
                PlotViewerWindowBatik("", rawSpec = HashMap())
                // If Ok - create the frontend context.
                DefaultSwingBatikFrontendContext()
            } catch (e: Throwable) {
                when (e) {
                    is ClassNotFoundException,
                    is NoClassDefFoundError -> null

                    else -> throw e
                }
            }
        }
    }
}