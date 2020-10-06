/*
 * Copyright (c) 2020. JetBrains s.r.o.
 * Use of this source code is governed by the MIT license that can be found in the LICENSE file.
 */

package naturalEarth

import jetbrains.datalore.base.geometry.DoubleVector
import jetbrains.letsPlot.geom.geom_polygon
import jetbrains.letsPlot.intern.toSpec
import jetbrains.letsPlot.label.ggtitle
import jetbrains.letsPlot.lets_plot
import jetbrains.letsPlot.toolkit.geotools.toSpatialDatasetGEOJSON

fun main() {
    // GeoTools
    val features = NaturalEarthShp.loadPolygon()

    // Lets-Plot
    val spatialDataset = features.toSpatialDatasetGEOJSON(10)
    val p = lets_plot() + geom_polygon(data = spatialDataset, alpha = 0.2, color = "black") {
        fill = "continent"
    } + ggtitle("geom_polygon: 'data'")

    SimpleBatikView.show(
        p.toSpec(),
        DoubleVector(800.0, 500.0)
    )
}
