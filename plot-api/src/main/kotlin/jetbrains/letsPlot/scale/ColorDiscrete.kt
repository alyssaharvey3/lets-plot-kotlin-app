/*
 * Copyright (c) 2019. JetBrains s.r.o.
 * Use of this source code is governed by the MIT license that can be found in the LICENSE file.
 */

@file:Suppress("FunctionName")

package jetbrains.letsPlot.scale

import jetbrains.datalore.plot.base.Aes
import jetbrains.datalore.plot.config.Option
import jetbrains.letsPlot.intern.Options
import jetbrains.letsPlot.intern.Scale

/**
 * Qualitative color scale with evenly spaced hues for fill aesthetic.
 * Defaults to the Brewer 'Set2' palette (or 'Set3' if the categories count > 8)
 *
 * @param direction numeric
 *      Direction to travel around the color wheel, 1 = clockwise (default), -1=counter-clockwise
 * @param name string
 *      The name of the scale - used as the axis label or the legend title. If None, the default, the name of the scale
 *      is taken from the first mapping used for that aesthetic.
 * @param breaks list of data values
 *      A vector specifying values to display as breaks (ticks) on guides (axis)
 * @param labels list of strings
 *      A vector of labels (on ticks)
 * @param limits list of data values
 *      A vector specifying values to display with the scale and their order in guides (axis).
 */
fun scale_fill_discrete(
    direction: Int? = null,
    name: String? = null,
    breaks: List<Any>? = null,
    labels: List<String>? = null,
    limits: List<Any>? = null,
    naValue: Any? = null,
    guide: Any? = null
) = Scale(
    aesthetic = Aes.FILL,
    name = name,
    breaks = breaks,
    labels = labels,
    limits = limits,
    naValue = naValue,
    guide = guide,
    otherOptions = Options(
        mapOf(
            Option.Scale.DIRECTION to direction,
            Option.Scale.DISCRETE_DOMAIN to true
        )
    )
)

/**
 * Qualitative color scale with evenly spaced hues for color aesthetic.
 * Defaults to the Brewer 'Set2' palette (or 'Set3' if the categories count > 8)
 *
 * @param direction numeric
 *      Direction to travel around the color wheel, 1 = clockwise (default), -1=counter-clockwise
 * @param name string
 *      The name of the scale - used as the axis label or the legend title. If None, the default, the name of the scale
 *      is taken from the first mapping used for that aesthetic.
 * @param breaks list of data values
 *      A vector specifying values to display as breaks (ticks) on guides (axis)
 * @param labels list of strings
 *      A vector of labels (on ticks)
 * @param limits list of data values
 *      A vector specifying values to display with the scale and their order in guides (axis).
 */
fun scale_color_discrete(
    direction: Int? = null,
    name: String? = null,
    breaks: List<Any>? = null,
    labels: List<String>? = null,
    limits: List<Any>? = null,
    naValue: Any? = null,
    guide: Any? = null
) = Scale(
    aesthetic = Aes.COLOR,
    name = name,
    breaks = breaks,
    labels = labels,
    limits = limits,
    naValue = naValue,
    guide = guide,
    otherOptions = Options(
        mapOf(
            Option.Scale.DIRECTION to direction,
            Option.Scale.DISCRETE_DOMAIN to true
        )
    )
)
