package kr.co.supermove.transporthelper

import android.content.Context
import android.graphics.Color

object ScooterUtils {
    fun getColor(context: Context, serviceName: String): Int {
        return Color.parseColor(ScooterEnum.findByName(serviceName).color)
    }
}

enum class ScooterEnum(val serviceName: String, val krName: String, val color: String, val imageResId: Int) {
    DART("dart", "다트", "#e6002d", R.drawable.img_scooter_dart),
    BEAM("beam", "빔", "#744AFF", R.drawable.img_scooter_beam),
    ALPACA("alpaca", "알파카", "#fe5500", R.drawable.img_scooter_alpaca),
    KICKS("kicks", "킥스", "#FFDBF6", R.drawable.img_scooter_kicks),
    MERCANEMATE("mercanemate", "메케인메이트", "#FB6648", R.drawable.img_scooter_mate),
    LIME("lime", "라임", "#00dd00", R.drawable.img_scooter_lime),
    AIRKICK("airkick", "에어킥", "#0BC3DE", R.drawable.img_scooter_airkic),
    SWING("swing", "스윙", "#ff6600", R.drawable.img_scooter_swing),
    FLOWERROAD("flowerroad", "플라워로드", "#f74242", R.drawable.img_scooter_flowerroad),
    HIKICK("hikick", "하이킥", "#03a9f4", R.drawable.img_scooter_hikick),
    WIND("wind", "윈드", "#fffa00", R.drawable.img_scooter_wind),///0c31,R.drawable.5e
    GCOOTER("gcooter", "지쿠터", "#00a743", R.drawable.img_scooter_gcooter),
    DEAR("deer", "디어", "#ffe800", R.drawable.img_scooter_deer),
    KICKGOING("kickgoing", "킥고잉", "#00c2ab", R.drawable.img_scooter_kickgoing),
    EVPASS("evpass", "이브이패스", "#ff5936", R.drawable.img_scooter_evpass),
    XINGXING("xingxing", "씽씽", "#ffd939", R.drawable.img_scooter_xingxing),
    SSOONG("ssoong", "쓩", "#24241e", R.drawable.group_5),
    NONE("", "", "#ffffff", R.drawable.group_5);

    companion object {
        fun findByName(name: String): ScooterEnum {
            return values().find { it.serviceName == name } ?: NONE
        }
    }
}