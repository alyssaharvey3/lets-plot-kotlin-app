/*
 * Copyright (c) 2021. JetBrains s.r.o.
 * Use of this source code is governed by the MIT license that can be found in the LICENSE file.
 */

package jetbrains.letsPlot.intern.layer.stat

import jetbrains.letsPlot.intern.Options
import jetbrains.letsPlot.intern.OptionsCapsule

interface SmoothStatAesthetics : OptionsCapsule {
    val x: Any?
    val y: Any?

    override fun seal() = Options.of(
        "x" to x,
        "y" to y
    )
}