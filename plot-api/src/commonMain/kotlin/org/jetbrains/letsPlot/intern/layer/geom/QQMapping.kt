/*
 * Copyright (c) 2022. JetBrains s.r.o.
 * Use of this source code is governed by the MIT license that can be found in the LICENSE file.
 */

package org.jetbrains.letsPlot.intern.layer.geom

import org.jetbrains.letsPlot.intern.layer.WithGroupOption
import org.jetbrains.letsPlot.intern.layer.stat.QQStatAesthetics

class QQMapping(
    override var sample: Any? = null,
    override var alpha: Any? = null,
    override var color: Any? = null,
    override var fill: Any? = null,
    override var shape: Any? = null,
    override var size: Any? = null,
    override var stroke: Any? = null,
    override var group: Any? = null,
    override var paint_a: Any? = null,
    override var paint_b: Any? = null,
    override var paint_c: Any? = null
) : QQAesthetics, QQStatAesthetics, WithGroupOption, PaintAesthetics {
    override fun seal() = super<QQAesthetics>.seal() +
            super<QQStatAesthetics>.seal() +
            groupOption() +
            super<PaintAesthetics>.seal()
}