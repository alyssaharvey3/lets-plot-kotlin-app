/*
 * Copyright (c) 2021. JetBrains s.r.o.
 * Use of this source code is governed by the MIT license that can be found in the LICENSE file.
 */

package naturalEarth

import org.jetbrains.letsPlot.commons.geometry.DoubleVector
import org.jetbrains.letsPlot.geom.geomPolygon
import org.jetbrains.letsPlot.intern.toSpec
import org.jetbrains.letsPlot.label.ggtitle
import org.jetbrains.letsPlot.letsPlot
import org.jetbrains.letsPlot.toolkit.geotools.toSpatialDataset

fun main() {
    // GeoTools
    val features = NaturalEarthShp.loadPolygon()

    // Lets-Plot
    val spatialDataset = features.toSpatialDataset(10)

    // Average temperatures
    val climateData = mapOf(
        "region" to listOf("Europe", "Asia", "North America", "Africa", "Australia", "Oceania"),
        "avg_temp" to listOf(8.6, 16.6, 11.7, 21.9, 14.9, 23.9)
    )
    val p = letsPlot() + geomPolygon(
        data = climateData,
        map = spatialDataset,
        mapJoin = "region" to "continent",
        color = "white"
    ) {
        fill = "avg_temp"
    } + ggtitle("geom_polygon: 'data', 'map', 'mapJoin': 'avg_temp' -> 'continent'.")

    SimpleBatikView.show(
        p.toSpec(),
        DoubleVector(800.0, 500.0)
    )
}
