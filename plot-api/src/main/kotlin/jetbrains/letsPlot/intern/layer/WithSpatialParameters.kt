/*
 * Copyright (c) 2020. JetBrains s.r.o.
 * Use of this source code is governed by the MIT license that can be found in the LICENSE file.
 */

package jetbrains.letsPlot.intern.layer

import jetbrains.letsPlot.spatial.SpatialDataset

interface WithSpatialParameters {
    val map: SpatialDataset?
    val mapJoin: Pair<Any, Any>?
}