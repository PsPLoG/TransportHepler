package kr.co.supermove.transporthelper

import android.content.Context
import android.graphics.Color
import androidx.core.content.ContextCompat

/*
* 서울 간선, 지선, 마을, 순환, 광역, 심야,
* 인천 간선, 급행간선, 지선, 시내좌석, 시외좌석, 공항좌석, 광역, 공영, 강화,
* 경기도 시내일반, 일반좌석, 직행좌석, 간선급행, 경기순환, 굿모닝, 마을,
* 1    일반
* 2    좌석
* 3    마을버스
* 4    직행좌석
* 5    공항버스
* 6    간선급행
* 10    외곽
* 11    간선
* 12    지선
* 13    순환
* 14    광역
* 15    급행
* 22    경기도 시외형버스
* 26    급행간선
* */
object BusUtils {
    @JvmStatic
    fun getBusColor(bustype: Int): Int {
        return Color.parseColor(
            when (bustype) {
                1 -> "#2CAA9F"
                2 -> "#2B52B9"
                3 -> "#92D050"
                4 -> "#F41409"
                5 -> "#D29110"
                6 -> "#F41409"
                10 -> "#43B1BD"
                11 -> "#2B52B9"
                12 -> "#46A336"
                13 -> "#FFC004"
                14 -> "#F41409"
                15 -> "#F41409"
                22 -> "#8F106D"
                26 -> "#5112AB"
                29 -> "#2C2C2C"
                30 -> "#e94e53"
                else -> "#2B52B9"
            }
        )
    }

    @JvmStatic
    fun getBusColor(context: Context, bustype: Int): Int {
        return ContextCompat.getColor(
            context,
            when (bustype) {
                1 -> R.color.gyeonggi_bus_normal
                2 -> R.color.gyeonggi_bus_seat
                3 -> R.color.gyeonggi_bus_town
                4 -> R.color.gyeonggi_bus_direct_seat
                5 -> R.color.incheon_bus_airport_seat
                6 -> R.color.gyeonggi_bus_express_long
                10 -> R.color.bus_outer
                11 -> R.color.seoul_bus_long
                12 -> R.color.seoul_bus_short
                13 -> R.color.gyeonggi_bus_circuit
                14 -> R.color.gyeonggi_bus_express_long
                15 -> R.color.gyeonggi_bus_express_long
                22 -> R.color.gyeonggi_bus_intercity
                26 -> R.color.incheon_bus_long_express
                else -> R.color.none
            }
        )
    }

    @JvmStatic
    fun getBusColor(context: Context, bustype: Int, localName: String): Int {
        return ContextCompat.getColor(
            context,
            when (bustype) {
                1 -> R.color.gyeonggi_bus_normal
                2 -> R.color.gyeonggi_bus_seat
                3 -> when (localName) {
                    "서울" -> R.color.seoul_bus_town
                    else -> R.color.gyeonggi_bus_town
                }
                4 -> R.color.gyeonggi_bus_direct_seat
                5 -> R.color.incheon_bus_airport_seat
                6 -> R.color.gyeonggi_bus_express_long
                10 -> R.color.bus_outer
                11 -> when (localName) {
                    "인천" -> R.color.incheon_bus_long
                    else -> R.color.seoul_bus_long
                }
                12 -> when (localName) {
                    "인천" -> R.color.incheon_bus_short
                    else -> R.color.seoul_bus_short
                }
                13 -> R.color.gyeonggi_bus_circuit
                14 -> R.color.gyeonggi_bus_express_long
                15 -> R.color.gyeonggi_bus_express_long
                22 -> R.color.gyeonggi_bus_intercity
                26 -> R.color.incheon_bus_long_express
                else -> R.color.none
            }
        )
    }
}