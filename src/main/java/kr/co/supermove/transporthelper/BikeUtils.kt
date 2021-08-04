package kr.co.supermove.transporthelper

import android.content.Context
import android.graphics.Color

object BikeUtils {
    fun getColor(context: Context, serviceName: String): Int {
        return Color.parseColor(BikeEnum.findByName(serviceName).color)
    }
}

enum class BikeEnum(val serviceName: String, val krName: String, val color: String, val imageResId: Int) {
    SEOUL("seoulbike", "따릉이", "#4cab6a", R.drawable.img_bike_seoulpublicbike),
    BEAM("elecle", "일레", "#744aff", R.drawable.img_bike_elecle),
    NONE("", "", "#ffffff", R.drawable.group_5);

    companion object {
        fun findByName(name: String): BikeEnum {
            return values().find { it.serviceName == name } ?: NONE
        }
    }
}