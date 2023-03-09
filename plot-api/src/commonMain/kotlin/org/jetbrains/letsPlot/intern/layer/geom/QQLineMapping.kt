/*
 * Copyright (c) 2022. JetBrains s.r.o.
 * Use of this source code is governed by the MIT license that can be found in the LICENSE file.
 */

package org.jetbrains.letsPlot.intern.layer.geom

import org.jetbrains.letsPlot.intern.layer.WithGroupOption
import org.jetbrains.letsPlot.intern.layer.stat.QQStatAesthetics

class QQLineMapping(
    override var sample: Any? = null,
    override var alpha: Any? = null,
    override var color: Any? = null,
    override var linetype: Any? = null,
    override var size: Any? = null,
    override var group: Any? = null,
    override var paint_a: Any? = null,
    override var paint_b: Any? = null,
    override var paint_c: Any? = null
) : QQLineAesthetics, QQStatAesthetics, WithGroupOption, PaintAesthetics {
    override fun seal() = super<QQLineAesthetics>.seal() +
            super<QQStatAesthetics>.seal() +
            groupOption() +
            super<PaintAesthetics>.seal()
}