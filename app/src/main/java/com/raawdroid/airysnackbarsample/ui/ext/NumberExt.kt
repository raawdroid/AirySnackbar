package com.raawdroid.airysnackbarsample.ui.ext

import android.content.res.Resources
import android.util.TypedValue

val Number.px
    get() = TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        this.toFloat(),
        Resources.getSystem().displayMetrics
    )