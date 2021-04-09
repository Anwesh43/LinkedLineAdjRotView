package com.example.lineadjrotview

import android.view.View
import android.view.MotionEvent
import android.graphics.Paint
import android.graphics.Canvas
import android.graphics.Color
import android.app.Activity
import android.content.Context

val colors : Array<Int> = arrayOf(
    "#f44336",
    "#3F51B5",
    "#00C853",
    "#4A148C",
    "#AA00FF"
).map {
    Color.parseColor(it)
}.toTypedArray()
val parts : Int = 4
val scGap : Float = 0.02f / parts
val strokeFactor : Float = 90f
val sizeFactor : Float = 3.9f
val lSizeFactor : Float = 12.9f
val delay : Long = 20
val backColor : Int = Color.parseColor("#BDBDBD")