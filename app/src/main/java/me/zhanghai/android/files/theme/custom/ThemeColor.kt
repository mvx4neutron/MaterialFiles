package me.zhanghai.android.files.theme.custom

import androidx.annotation.ColorRes
import me.zhanghai.android.files.R

enum class ThemeColor(
    @ColorRes val resourceId: Int,
    val displayName: String
) {
    COLOR_PRIMARY(R.color.color_primary, "Default / Material Blue"),
    MATERIAL_RED(R.color.material_red, "Material Red"),
    MATERIAL_PINK(R.color.material_pink, "Material Pink"),
    MATERIAL_PURPLE(R.color.material_purple, "Material Purple"),
    MATERIAL_DEEP_PURPLE(R.color.material_deep_purple, "Material Deep Purple"),
    MATERIAL_INDIGO(R.color.material_indigo, "Material Indigo"),
    MATERIAL_BLUE(R.color.material_blue, "Material Blue"),
    MATERIAL_LIGHT_BLUE(R.color.material_light_blue, "Material Light Blue"),
    MATERIAL_CYAN(R.color.material_cyan, "Material Cyan"),
    MATERIAL_TEAL(R.color.material_teal, "Material Teal"),
    MATERIAL_GREEN(R.color.material_green, "Material Green"),
    MATERIAL_LIGHT_GREEN(R.color.material_light_green, "Material Light Green"),
    MATERIAL_LIME(R.color.material_lime, "Material Lime"),
    MATERIAL_YELLOW(R.color.material_yellow, "Material Yellow"),
    MATERIAL_AMBER(R.color.material_amber, "Material Amber"),
    MATERIAL_ORANGE(R.color.material_orange, "Material Orange"),
    MATERIAL_DEEP_ORANGE(R.color.material_deep_orange, "Material Deep Orange"),
    MATERIAL_BROWN(R.color.material_brown, "Material Brown"),
    MATERIAL_GREY(R.color.material_grey, "Material Grey"),
    MATERIAL_BLUE_GREY(R.color.material_blue_grey, "Material Blue Grey"),

    DEEP_NEUTRAL_DARK(R.color.theme_deep_neutral_dark_accent, "Deep Neutral Dark — 96/100"),
    WARM_NIGHT(R.color.theme_warm_night_accent, "Warm Night — 97/100"),
    MUTED_AMBER(R.color.theme_muted_amber_accent, "Muted Amber — 95/100"),
    DARK_TERRACOTTA(R.color.theme_dark_terracotta_accent, "Dark Red / Terracotta — 93/100"),
    SOFT_SEPIA(R.color.theme_soft_sepia_accent, "Soft Sepia / Reading — 94/100"),
    SOFT_DAYLIGHT(R.color.theme_soft_daylight_accent, "Soft Daylight — 91/100"),
    AMOLED_MINIMAL(R.color.theme_amoled_minimal_accent, "AMOLED Minimal — 90/100")
}
