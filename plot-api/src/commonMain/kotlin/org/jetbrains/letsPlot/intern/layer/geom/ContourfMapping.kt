/*
 * Copyright (c) 2021. JetBrains s.r.o.
 * Use of this source code is governed by the MIT license that can be found in the LICENSE file.
 */

package org.jetbrains.letsPlot.intern.layer.geom

import org.jetbrains.letsPlot.intern.layer.WithGroupOption
import org.jetbrains.letsPlot.intern.layer.stat.ContourStatAesthetics

class ContourfMapping(
    override var x: Any? = null,
    override var y: Any? = null,
    override var z: Any? = null,
    override var size: Any? = null,
    override var linetype: Any? = null,
    override var color: Any? = null,
    override var fill: Any? = null,
    override var alpha: Any? = null,
    override var group: Any? = null,
    override var paint_a: Any? = null,
    override var paint_b: Any? = null,
    override var paint_c: Any? = null
) : PolygonAesthetics, ContourStatAesthetics, WithGroupOption, PaintAesthetics {
    override fun seal() = super<PolygonAesthetics>.seal() +
            super<ContourStatAesthetics>.seal() +
            groupOption() +
            super<PaintAesthetics>.seal()
}