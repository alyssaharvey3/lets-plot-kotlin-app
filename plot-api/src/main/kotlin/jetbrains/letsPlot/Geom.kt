/*
 * Copyright (c) 2019. JetBrains s.r.o.
 * Use of this source code is governed by the MIT license that can be found in the LICENSE file.
 */

package jetbrains.letsPlot

import jetbrains.letsPlot.intern.GeomKind
import jetbrains.letsPlot.intern.layer.GeomOptions
import jetbrains.letsPlot.intern.layer.geom.*

/**
 * `Geom options` to pass as a value of `geom` parameter of `layer` functions like:
 *  lets_plot() + stat_density(..., geom = Pos.point(), ... )
 */
object Geom {
    val blank = GeomOptions(
        GeomKind.BLANK
    )

    @Suppress("ClassName")
    class point(
        override val x: Double? = null,
        override val y: Double? = null,
        override val alpha: Double? = null,
        override val color: Any? = null,
        override val fill: Any? = null,
        override val shape: Any? = null,
        override val size: Double? = null,
        override val stroke: Double? = null,
        mapping: PointMapping.() -> Unit = {}
    ) : PointAesthetics,
        GeomOptions(
            GeomKind.POINT,
            PointMapping().apply(mapping).seal()
        ) {
        override val parameters = this.seal()
    }

    @Suppress("ClassName")
    class path(
        override val x: Double? = null,
        override val y: Double? = null,
        override val alpha: Double? = null,
        override val color: Any? = null,
        override val linetype: Any? = null,
        override val size: Double? = null,
        override val speed: Double? = null,
        override val flow: Double? = null,
        mapping: PathMapping.() -> Unit = {}
    ) : PathAesthetics,
        GeomOptions(
            GeomKind.PATH,
            PathMapping().apply(mapping).seal()
        ) {
        override val parameters = this.seal()
    }

    @Suppress("ClassName")
    class area(
        override val x: Double? = null,
        override val y: Double? = null,
        override val alpha: Double? = null,
        override val color: Any? = null,
        override val fill: Any? = null,
        override val linetype: Any? = null,
        override val size: Double? = null,
        mapping: AreaMapping.() -> Unit = {}
    ) : AreaAesthetics,
        GeomOptions(
            GeomKind.AREA,
            AreaMapping().apply(mapping).seal()
        ) {
        override val parameters = this.seal()
    }

    @Suppress("ClassName")
    class histogram(
        override val x: Double? = null,
        override val y: Double? = null,
        override val alpha: Double? = null,
        override val color: Any? = null,
        override val fill: Any? = null,
        override val size: Double? = null,
        mapping: HistogramMapping.() -> Unit = {}
    ) : HistogramAesthetics,
        GeomOptions(
            GeomKind.HISTOGRAM,
            HistogramMapping().apply(mapping).seal()
        ) {
        override val parameters = this.seal()
    }

    @Suppress("ClassName")
    class line(
        override val x: Double? = null,
        override val y: Double? = null,
        override val alpha: Double? = null,
        override val color: Any? = null,
        override val linetype: Any? = null,
        override val size: Double? = null,
        mapping: LineMapping.() -> Unit = {}
    ) : LineAesthetics,
        GeomOptions(
            GeomKind.LINE,
            LineMapping().apply(mapping).seal()
        ) {
        override val parameters = this.seal()
    }

    @Suppress("ClassName")
    class bar(
        override val x: Double? = null,
        override val y: Double? = null,
        override val alpha: Double? = null,
        override val color: Any? = null,
        override val fill: Any? = null,
        override val width: Double? = null,
        override val size: Double? = null,
        mapping: BarMapping.() -> Unit = {}
    ) : BarAesthetics,
        GeomOptions(
            GeomKind.BAR,
            BarMapping().apply(mapping).seal()
        ) {
        override val parameters = this.seal()
    }

    @Suppress("ClassName")
    class tile(
        override val x: Double? = null,
        override val y: Double? = null,
        override val width: Double? = null,
        override val height: Double? = null,
        override val alpha: Double? = null,
        override val color: Any? = null,
        override val fill: Any? = null,
        override val linetype: Any? = null,
        override val size: Double? = null,
        mapping: TileMapping.() -> Unit = {}
    ) : TileAesthetics,
        GeomOptions(
            GeomKind.TILE,
            TileMapping().apply(mapping).seal()
        ) {
        override val parameters = this.seal()
    }

    @Suppress("ClassName")
    class raster(
        override val x: Double? = null,
        override val y: Double? = null,
        override val alpha: Double? = null,
        override val fill: Any? = null,
        mapping: RasterMapping.() -> Unit = {}
    ) : RasterAesthetics,
        GeomOptions(
            GeomKind.RASTER,
            RasterMapping().apply(mapping).seal()
        ) {
        override val parameters = this.seal()
    }

    @Suppress("ClassName", "SpellCheckingInspection")
    class abline(
        override val slope: Double? = null,
        override val intercept: Double? = null,
        override val alpha: Double? = null,
        override val color: Any? = null,
        override val linetype: Any? = null,
        override val size: Double? = null,
        mapping: ABLineMapping.() -> Unit = {}
    ) : ABLineAesthetics,
        GeomOptions(
            GeomKind.AB_LINE,
            ABLineMapping().apply(mapping).seal()
        ) {
        override val parameters = this.seal()
    }

    @Suppress("ClassName")
    class hline(
        @Suppress("SpellCheckingInspection")
        override val yintercept: Double? = null,
        override val alpha: Double? = null,
        override val color: Any? = null,
        override val linetype: Any? = null,
        override val size: Double? = null,
        mapping: HLineMapping.() -> Unit = {}
    ) : HLineAesthetics,
        GeomOptions(
            GeomKind.H_LINE,
            HLineMapping().apply(mapping).seal()
        ) {
        override val parameters = this.seal()
    }

    @Suppress("ClassName")
    class vline(
        @Suppress("SpellCheckingInspection")
        override val xintercept: Double? = null,
        override val alpha: Double? = null,
        override val color: Any? = null,
        override val linetype: Any? = null,
        override val size: Double? = null,
        mapping: VLineMapping.() -> Unit = {}
    ) : VLineAesthetics,
        GeomOptions(
            GeomKind.V_LINE,
            VLineMapping().apply(mapping).seal()
        ) {
        override val parameters = this.seal()
    }

    @Suppress("ClassName")
    class rect(
        override val xmin: Double? = null,
        override val xmax: Double? = null,
        override val ymin: Double? = null,
        override val ymax: Double? = null,
        override val alpha: Double? = null,
        override val color: Any? = null,
        override val linetype: Any? = null,
        override val size: Double? = null,
        override val fill: Any? = null,
        mapping: RectMapping.() -> Unit = {}
    ) : RectAesthetics,
        GeomOptions(
            GeomKind.RECT,
            RectMapping().apply(mapping).seal()
        ) {
        override val parameters = this.seal()
    }

    @Suppress("ClassName")
    class segment(
        override val x: Double? = null,
        override val y: Double? = null,
        override val xend: Double? = null,
        override val yend: Double? = null,
        override val alpha: Double? = null,
        override val color: Any? = null,
        override val linetype: Any? = null,
        override val size: Double? = null,
        override val speed: Double? = null,
        override val flow: Double? = null,
        mapping: SegmentMapping.() -> Unit = {}
    ) : SegmentAesthetics,
        GeomOptions(
            GeomKind.SEGMENT,
            SegmentMapping().apply(mapping).seal()
        ) {
        override val parameters = this.seal()
    }

    @Suppress("ClassName")
    class text(
        override val x: Double? = null,
        override val y: Double? = null,
        override val label: String? = null,
        override val alpha: Double? = null,
        override val color: Any? = null,
        override val size: Double? = null,
        override val family: String? = null,
        override val fontface: String? = null,
        override val hjust: Any? = null,
        override val vjust: Any? = null,
        override val angle: Double? = null,
        mapping: TextMapping.() -> Unit = {}
    ) : TextAesthetics,
        GeomOptions(
            GeomKind.TEXT,
            TextMapping().apply(mapping).seal()
        ) {
        override val parameters = this.seal()
    }

    @Suppress("ClassName")
    class boxplot(
        override val x: Double? = null,
        override val y: Double? = null,
        override val lower: Double? = null,
        override val middle: Double? = null,
        override val upper: Double? = null,
        override val ymin: Double? = null,
        override val ymax: Double? = null,
        override val outlierColor: Any? = null,
        override val outlierFill: Any? = null,
        override val outlierShape: Any? = null,
        override val outlierSize: Number? = null,
        override val fatten: Number? = null,
        override val alpha: Double? = null,
        override val color: Any? = null,
        override val fill: Any? = null,
        override val size: Double? = null,
        override val linetype: Any? = null,
        override val shape: Any? = null,
        override val width: Double? = null,
        mapping: BoxplotMapping.() -> Unit = {}
    ) : BoxplotAesthetics,
        BoxplotParameters,
        GeomOptions(
            GeomKind.BOX_PLOT,
            BoxplotMapping().apply(mapping).seal()
        ) {

        override val parameters = this.seal()

        override fun seal() = super<BoxplotAesthetics>.seal() +
                super<BoxplotParameters>.seal()
    }

    @Suppress("ClassName", "SpellCheckingInspection")
    class errorbar(
        override val x: Double? = null,
        override val ymin: Double? = null,
        override val ymax: Double? = null,
        override val width: Double? = null,
        override val alpha: Double? = null,
        override val color: Any? = null,
        override val linetype: Any? = null,
        override val size: Double? = null,
        mapping: ErrorBarMapping.() -> Unit = {}
    ) : ErrorBarAesthetics,
        GeomOptions(
            GeomKind.ERROR_BAR,
            ErrorBarMapping().apply(mapping).seal()
        ) {
        override val parameters = this.seal()
    }

    @Suppress("ClassName")
    class crossbar(
        override val x: Double? = null,
        override val ymin: Double? = null,
        override val ymax: Double? = null,
        override val middle: Double? = null,
        override val width: Double? = null,
        override val alpha: Double? = null,
        override val color: Any? = null,
        override val fill: Any? = null,
        override val linetype: Any? = null,
        override val shape: Any? = null,
        override val size: Any? = null,
        mapping: CrossBarMapping.() -> Unit = {}
    ) : CrossBarAesthetics,
        GeomOptions(
            GeomKind.CROSS_BAR,
            CrossBarMapping().apply(mapping).seal()
        ) {
        override val parameters = this.seal()
    }

    @Suppress("ClassName", "SpellCheckingInspection")
    class pointrange(
        override val x: Double? = null,
        override val y: Double? = null,
        override val ymin: Double? = null,
        override val ymax: Double? = null,
        override val alpha: Double? = null,
        override val color: Any? = null,
        override val fill: Any? = null,
        override val linetype: Any? = null,
        override val shape: Any? = null,
        override val size: Double? = null,
        mapping: PointRangeMapping.() -> Unit = {}
    ) : PointRangeAesthetics,
        GeomOptions(
            GeomKind.POINT_RANGE,
            PointRangeMapping().apply(mapping).seal()
        ) {
        override val parameters = this.seal()
    }

    @Suppress("ClassName", "SpellCheckingInspection")
    class linerange(
        override val x: Double? = null,
        override val ymin: Double? = null,
        override val ymax: Double? = null,
        override val alpha: Double? = null,
        override val color: Any? = null,
        override val linetype: Any? = null,
        override val size: Double? = null,
        mapping: LineRangeMapping.() -> Unit = {}
    ) : LineRangeAesthetics,
        GeomOptions(
            GeomKind.LINE_RANGE,
            LineRangeMapping().apply(mapping).seal()
        ) {
        override val parameters = this.seal()
    }

    @Suppress("ClassName")
    class ribbon(
        override val x: Double? = null,
        override val ymin: Double? = null,
        override val ymax: Double? = null,
        override val size: Double? = null,
        override val linetype: Any? = null,
        override val color: Any? = null,
        override val fill: Any? = null,
        override val alpha: Double? = null,
        mapping: RibbonMapping.() -> Unit = {}
    ) : RibbonAesthetics,
        GeomOptions(
            GeomKind.RIBBON,
            RibbonMapping().apply(mapping).seal()
        ) {
        override val parameters = this.seal()
    }

    @Suppress("ClassName")
    class polygon(
        override val x: Any? = null,
        override val y: Any? = null,
        override val size: Any? = null,
        override val linetype: Any? = null,
        override val color: Any? = null,
        override val fill: Any? = null,
        override val alpha: Any? = null,
        // TODO add map/map_join parameters support
        mapping: PolygonMapping.() -> Unit = {}
    ) : PolygonAesthetics,
        GeomOptions(
            GeomKind.POLYGON,
            PolygonMapping().apply(mapping).seal()
        ) {
        override val parameters = this.seal()
    }

    @Suppress("ClassName")
    class step(
        override val x: Double? = null,
        override val y: Double? = null,
        override val alpha: Double? = null,
        override val color: Any? = null,
        override val linetype: Any? = null,
        override val size: Double? = null,
        mapping: LineMapping.() -> Unit = {}
    ) : LineAesthetics,
        GeomOptions(
            GeomKind.STEP,
            LineMapping().apply(mapping).seal()
        ) {
        override val parameters = this.seal()
    }

    @Suppress("ClassName")
    class image(
        override val xmin: Any? = null,
        override val xmax: Any? = null,
        override val ymin: Any? = null,
        override val ymax: Any? = null,
        mapping: ImageMapping.() -> Unit = {}
    ) : ImageAesthetics,
        GeomOptions(
            GeomKind.IMAGE,
            ImageMapping().apply(mapping).seal()
        ) {
        override val parameters = this.seal()
    }
}