/*
 * Copyright (c) 2022. JetBrains s.r.o.
 * Use of this source code is governed by the MIT license that can be found in the LICENSE file.
 */

package org.jetbrains.letsPlot.intern.layer.stat

import org.jetbrains.letsPlot.core.spec.Option.Stat
import org.jetbrains.letsPlot.intern.Options
import org.jetbrains.letsPlot.intern.OptionsCapsule

interface QQ2LineStatParameters : OptionsCapsule {
    val quantiles: Pair<Number, Number>?

    override fun seal() = Options.of(
        Stat.QQLine.LINE_QUANTILES to quantiles
    )
}