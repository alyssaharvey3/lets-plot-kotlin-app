/*
 * Copyright (c) 2021. JetBrains s.r.o.
 * Use of this source code is governed by the MIT license that can be found in the LICENSE file.
 */

package jetbrains.letsPlot

import jetbrains.datalore.plot.builder.defaultTheme.values.ThemeOption
import jetbrains.datalore.plot.config.Option
import jetbrains.letsPlot.intern.OptionsMap
import jetbrains.letsPlot.intern.filterNonNullValues

/**
 * Use theme() to modify individual components of a theme,
 * allowing you to control the appearance of all non-data components of the plot.
 */
@Suppress("ClassName", "FunctionName")
class theme(
    line: Any? = null,
    rect: Any? = null,
    text: Any? = null,
    title: Any? = null,
    axis: Any? = null,

    axisTitle: Any? = null,
    axisTitleX: Any? = null,
    axisTitleY: Any? = null,

    axisText: Any? = null,
    axisTextX: Any? = null,
    axisTextY: Any? = null,

    axisTicks: Any? = null,
    axisTicksX: Any? = null,
    axisTicksY: Any? = null,

    axisTicksLength: Number? = null,
    axisTicksLengthX: Number? = null,
    axisTicksLengthY: Number? = null,

    axisLine: Any? = null,
    axisLineX: Any? = null,
    axisLineY: Any? = null,

    legendText: Any? = null,
    legendTitle: Any? = null,

    panelBackground: Any? = null,

    panelGrid: Any? = null,
    panelGridMajor: Any? = null,
    panelGridMinor: Any? = null,
    panelGridMajorX: Any? = null,
    panelGridMinorX: Any? = null,
    panelGridMajorY: Any? = null,
    panelGridMinorY: Any? = null,

    plotTitle: Any? = null,

    stripBackground: Any? = null,
    stripText: Any? = null,

    axisTooltip: Any? = null,
    axisTooltipX: Any? = null,
    axisTooltipY: Any? = null

) : OptionsMap(
    Option.Plot.THEME, mapOf(
        ThemeOption.LINE to line,
        ThemeOption.RECT to rect,
        ThemeOption.TEXT to text,
        ThemeOption.TITLE to title,
        ThemeOption.AXIS to axis,

        ThemeOption.AXIS_TITLE to axisTitle,
        ThemeOption.AXIS_TITLE_X to axisTitleX,
        ThemeOption.AXIS_TITLE_Y to axisTitleY,

        ThemeOption.AXIS_TEXT to axisText,
        ThemeOption.AXIS_TEXT_X to axisTextX,
        ThemeOption.AXIS_TEXT_Y to axisTextY,

        ThemeOption.AXIS_TICKS to axisTicks,
        ThemeOption.AXIS_TICKS_X to axisTicksX,
        ThemeOption.AXIS_TICKS_Y to axisTicksY,

        ThemeOption.AXIS_TICKS_LENGTH to axisTicksLength,
        ThemeOption.AXIS_TICKS_LENGTH_X to axisTicksLengthX,
        ThemeOption.AXIS_TICKS_LENGTH_Y to axisTicksLengthY,

        ThemeOption.AXIS_LINE to axisLine,
        ThemeOption.AXIS_LINE_X to axisLineX,
        ThemeOption.AXIS_LINE_Y to axisLineY,

        ThemeOption.LEGEND_TEXT to legendText,
        ThemeOption.LEGEND_TITLE to legendTitle,

        ThemeOption.PANEL_BKGR_RECT to panelBackground,

        ThemeOption.PANEL_GRID to panelGrid,
        ThemeOption.PANEL_GRID_MAJOR to panelGridMajor,
        ThemeOption.PANEL_GRID_MINOR to panelGridMinor,
        ThemeOption.PANEL_GRID_MAJOR_X to panelGridMajorX,
        ThemeOption.PANEL_GRID_MINOR_X to panelGridMinorX,
        ThemeOption.PANEL_GRID_MAJOR_Y to panelGridMajorY,
        ThemeOption.PANEL_GRID_MINOR_Y to panelGridMinorY,

        ThemeOption.PLOT_TITLE to plotTitle,

        ThemeOption.FACET_STRIP_BGR_RECT to stripBackground,
        ThemeOption.FACET_STRIP_TEXT to stripText,

        ThemeOption.AXIS_TOOLTIP to axisTooltip,
        ThemeOption.AXIS_TOOLTIP_X to axisTooltipX,
        ThemeOption.AXIS_TOOLTIP_Y to axisTooltipY
    )
        .filterNonNullValues()
        .toMutableMap()
) {

    private constructor(other: theme) : this() {
        (this.options as MutableMap<String, Any>).putAll(other.options)
    }

    private fun withOption(name: String, value: Any): theme {
        val newTheme = theme(this)
        (newTheme.options as MutableMap<String, Any>)[name] = value
        return newTheme
    }

    @Deprecated("Use: theme(axisTitle=\"blank\"")
    fun axisTitleBlank() = withOption(ThemeOption.AXIS_TITLE, VAL_ELEMENT_BLANK)

    @Deprecated("Use: theme(axisTitleX=\"blank\"")
    fun axisTitleXBlank() = withOption(ThemeOption.AXIS_TITLE_X, VAL_ELEMENT_BLANK)

    @Deprecated("Use: theme(axisTitleY=\"blank\"")
    fun axisTitleYBlank() = withOption(ThemeOption.AXIS_TITLE_Y, VAL_ELEMENT_BLANK)

    @Deprecated("Use: theme(axisText=\"blank\"")
    fun axisTextBlank() = withOption(ThemeOption.AXIS_TEXT, VAL_ELEMENT_BLANK)

    @Deprecated("Use: theme(axisTextX=\"blank\"")
    fun axisTextXBlank() = withOption(ThemeOption.AXIS_TEXT_X, VAL_ELEMENT_BLANK)

    @Deprecated("Use: theme(axisTextY=\"blank\"")
    fun axisTextYBlank() = withOption(ThemeOption.AXIS_TEXT_Y, VAL_ELEMENT_BLANK)

    @Deprecated("Use: theme(axisTicks=\"blank\"")
    fun axisTicksBlank() = withOption(ThemeOption.AXIS_TICKS, VAL_ELEMENT_BLANK)

    @Deprecated("Use: theme(axisTicksX=\"blank\"")
    fun axisTicksXBlank() = withOption(ThemeOption.AXIS_TICKS_X, VAL_ELEMENT_BLANK)

    @Deprecated("Use: theme(axisTicksY=\"blank\"")
    fun axisTicksYBlank() = withOption(ThemeOption.AXIS_TICKS_Y, VAL_ELEMENT_BLANK)

    @Deprecated("Use: theme(axisLine=\"blank\"")
    fun axisLineBlank() = withOption(ThemeOption.AXIS_LINE, VAL_ELEMENT_BLANK)

    @Deprecated("Use: theme(axisLineX=\"blank\"")
    fun axisLineXBlank() = withOption(ThemeOption.AXIS_LINE_X, VAL_ELEMENT_BLANK)

    @Deprecated("Use: theme(axisLineY=\"blank\"")
    fun axisLineYBlank() = withOption(ThemeOption.AXIS_LINE_Y, VAL_ELEMENT_BLANK)

    fun legendPositionNone() = withOption(ThemeOption.LEGEND_POSITION, VAL_LEGEND_POS_NONE)
    fun legendPositionLeft() = withOption(ThemeOption.LEGEND_POSITION, VAL_LEGEND_POS_LEFT)
    fun legendPositionRight() = withOption(ThemeOption.LEGEND_POSITION, VAL_LEGEND_POS_RIGHT)
    fun legendPositionBottom() = withOption(ThemeOption.LEGEND_POSITION, VAL_LEGEND_POS_BOTTOM)
    fun legendPositionTop() = withOption(ThemeOption.LEGEND_POSITION, VAL_LEGEND_POS_TOP)

    /**
     * Specifies the legend position relative to the plot drawing area.
     * Position (0, 0) corresponds to the left, lower corner of the plot.
     * Position (1, 1) corresponds to the right, upper corner of the plot.
     */
    @Suppress("SpellCheckingInspection")
    fun legendPosition(xpos: Number, ypos: Number): theme {
        return withOption(
            ThemeOption.LEGEND_POSITION,
            listOf(xpos, ypos)
        )
    }

    fun legendJustificationCenter() = withOption(ThemeOption.LEGEND_JUSTIFICATION, VAL_LEGEND_JUSTIFICATION_CENTER)

    /**
     * Specifies the anchor point for positioning legend inside plot.
     * Justification (0, 0) corresponds to the left, lower corner of the legend.
     * Justification (1, 1) corresponds to the right, upper corner of the legend.
     */
    fun legendJustification(xanchor: Number, yanchor: Number): theme {
        return withOption(
            ThemeOption.LEGEND_JUSTIFICATION,
            listOf(xanchor, yanchor)
        )
    }

    fun legendDirectionHorizontal() = withOption(ThemeOption.LEGEND_DIRECTION, VAL_LEGEND_DIRECTION_HORIZONTAL)
    fun legendDirectionVertical() = withOption(ThemeOption.LEGEND_DIRECTION, VAL_LEGEND_DIRECTION_VERTICAL)


    @Deprecated("", ReplaceWith("legendPositionNone()"))
    fun legendPosition_none() = legendPositionNone()

    @Deprecated("", ReplaceWith("legendPositionLeft()"))
    fun legendPosition_left() = legendPositionLeft()

    @Deprecated("", ReplaceWith("legendPositionRight()"))
    fun legendPosition_right() = legendPositionRight()

    @Deprecated("", ReplaceWith("legendPositionBottom()"))
    fun legendPosition_bottom() = legendPositionBottom()

    @Deprecated("", ReplaceWith("legendPositionTop()"))
    fun legendPosition_top() = legendPositionTop()

    @Deprecated("", ReplaceWith("legendJustificationCenter()"))
    fun legendJustification_center() = legendJustificationCenter()

    @Deprecated("", ReplaceWith("legendDirectionHorizontal()"))
    fun legendDirection_horizontal() = legendDirectionHorizontal()

    @Deprecated("", ReplaceWith("legendDirectionVertical()"))
    fun legendDirection_vertical() = legendDirectionVertical()

    companion object {
        private const val VAL_ELEMENT_BLANK = "blank"
        private const val VAL_LEGEND_POS_NONE = "none"
        private const val VAL_LEGEND_POS_LEFT = "left"
        private const val VAL_LEGEND_POS_RIGHT = "right"
        private const val VAL_LEGEND_POS_BOTTOM = "bottom"
        private const val VAL_LEGEND_POS_TOP = "top"
        private const val VAL_LEGEND_JUSTIFICATION_CENTER = "center"
        private const val VAL_LEGEND_DIRECTION_HORIZONTAL = "horizontal"
        private const val VAL_LEGEND_DIRECTION_VERTICAL = "vertical"
    }
}
