package com.psplog.transporthelpersample

data class TransportBusItem(
    val transportType: Int,
    val transportName: String,
    val transportBackgroundType: Int
) {
    companion object {
        const val SOLID_BACKGROUND = 0
        const val STROKE_BACKGROUND = 1
    }
}