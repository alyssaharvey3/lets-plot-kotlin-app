/*
 * Copyright (c) 2020. JetBrains s.r.o.
 * Use of this source code is governed by the MIT license that can be found in the LICENSE file.
 */

package plotDemo

import jetbrains.letsPlot.GlobalSettings

object SwingJfxDemoFrontend {
    fun eval(title: String, script: () -> Unit) {
        val ctx = SwingJfxDemoFrontendContext(title)
        GlobalSettings.frontendContext = ctx

        script()

        ctx.showAll()
    }
}