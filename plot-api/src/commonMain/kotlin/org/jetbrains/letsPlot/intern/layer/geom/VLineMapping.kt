/*
 * Copyright (c) 2021. JetBrains s.r.o.
 * Use of this source code is governed by the MIT license that can be found in the LICENSE file.
 */

package org.jetbrains.letsPlot.intern.layer.geom

import org.jetbrains.letsPlot.intern.layer.WithGroupOption

class VLineMapping(
    @Suppress("SpellCheckingInspection")
    override var xintercept: Any? = null,
    override var alpha: Any? = null,
    override var color: Any? = null,
    override var linetype: Any? = null,
    override var size: Any? = null,
    override var group: Any? = null,
    override var paint_a: Any? = null,
    override var paint_b: Any? = null,
    override var paint_c: Any? = null
) : VLineAesthetics, WithGroupOption, PaintAesthetics {
    override fun seal() = super<VLineAesthetics>.seal() +
            groupOption() +
            super<PaintAesthetics>.seal()
}


