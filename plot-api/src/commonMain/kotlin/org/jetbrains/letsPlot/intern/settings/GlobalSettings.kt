/*
 * Copyright (c) 2022. JetBrains s.r.o.
 * Use of this source code is governed by the MIT license that can be found in the LICENSE file.
 */

package org.jetbrains.letsPlot.intern.settings

import org.jetbrains.letsPlot.core.spec.Option.Plot.THEME
import org.jetbrains.letsPlot.commons.intern.json.JsonSupport.parseJson
import org.jetbrains.letsPlot.intern.OptionsMap
import org.jetbrains.letsPlot.intern.filterNonNullValues


// Environment variables
const val ENV_HTML_ISOLATED_FRAME = "LETS_PLOT_HTML_ISOLATED_FRAME"
const val ENV_PLOT_THEME = "LETS_PLOT_PLOT_THEME"


internal object GlobalSettings {
    val isolatedFrameContext: Boolean get() = Env.getBool(ENV_HTML_ISOLATED_FRAME) ?: false

    var theme: OptionsMap? = Env.get(ENV_PLOT_THEME)?.let { OptionsMap(THEME, parseJson(it).filterNonNullValues()) }
        set(value) {
            require(value == null || value.kind == THEME) {
                "Wrong options type. Expected `$THEME` but was `${value!!.kind}`"
            }

            field = value
        }
}
