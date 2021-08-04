package kr.co.supermove.transporthelper

import android.content.Context
import android.graphics.Color
import android.view.View
import androidx.core.content.ContextCompat

object SubwayUtils {
    /**
     * 1    수도권 1호선
     * 2    수도권 2호선
     * 3    수도권 3호선
     * 4    수도권 4호선
     * 5    수도권 5호선
     * 6    수도권 6호선
     * 7    수도권 7호선
     * 8    수도권 8호선
     * 9    수도권 9호선
     * 100    분당선
     * 108    경춘선
     * 101    공항철도
     * 111    수인선
     * 112    경강선
     * 104    경의중앙선
     * 107    에버라인
     * 102    자기부상철도
     * 21    인천 1호선
     * 22    인천 2호선
     * 109    신분당선
     * 110    의정부경전철
     * 113    우이신설선
     * 114    서해선
     */

    @JvmStatic
    fun getMetroColor(c: Context, city: Int, no: Int): Int {
        when (city) {
            7000 -> {
                return ContextCompat.getColor(
                    c, when (no) {
                        71 -> R.color.busan_subway_1
                        72 -> R.color.busan_subway_2
                        73 -> R.color.busan_subway_3
                        74 -> R.color.busan_subway_4
                        78 -> R.color.busan_subway_donghea
                        79 -> R.color.busan_subway_gimhea
                        else -> R.color.busan_subway_1
                    }
                )
            }
            4000 -> {
                return ContextCompat.getColor(
                    c, when (no) {
                        41 -> R.color.deagu_subway_1
                        42 -> R.color.deagu_subway_2
                        43 -> R.color.deagu_subway_3
                        else -> R.color.deagu_subway_1
                    }
                )
            }
            5000 -> {
                return ContextCompat.getColor(
                    c, when (no) {
                        51 -> R.color.gwangju_subway_1
                        else -> R.color.gwangju_subway_1
                    }
                )
            }
            3000 -> {
                return ContextCompat.getColor(
                    c, when (no) {
                        31 -> R.color.deajeon_subway_1
                        else -> R.color.deajeon_subway_1
                    }
                )
            }
            else -> {
                return ContextCompat.getColor(
                    c, when (no) {
                        1 -> R.color.seoul_subway_1
                        2 -> R.color.seoul_subway_2
                        3 -> R.color.seoul_subway_3
                        4 -> R.color.seoul_subway_4
                        5 -> R.color.seoul_subway_5
                        6 -> R.color.seoul_subway_6
                        7 -> R.color.seoul_subway_7
                        8 -> R.color.seoul_subway_8
                        9 -> R.color.seoul_subway_9
                        100 -> R.color.bundang_subway
                        108 -> R.color.seoul_subway_kyongchun
                        101 -> R.color.seoul_subway_airport
                        111 -> R.color.seoul_subway_suin
                        112 -> R.color.seoul_subway_kyongkang
                        104 -> R.color.seoul_subway_kyongui_jungang
                        107 -> R.color.seoul_subway_everline
                        102 -> R.color.incheon_subway_mf
                        21 -> R.color.incheon_subway_1
                        22 -> R.color.incheon_subway_2
                        109 -> R.color.bundang_subway_new
                        110 -> R.color.uijeongbu_subway
                        113 -> R.color.seoul_subway_uisinseol
                        114 -> R.color.seoul_subway_seohae
                        31 -> R.color.deajeon_subway_1
                        41 -> R.color.deagu_subway_1
                        42 -> R.color.deagu_subway_2
                        43 -> R.color.deagu_subway_3
                        51 -> R.color.gwangju_subway_1
                        71 -> R.color.busan_subway_1
                        72 -> R.color.busan_subway_2
                        73 -> R.color.busan_subway_3
                        74 -> R.color.busan_subway_4
                        78 -> R.color.busan_subway_donghea
                        79 -> R.color.busan_subway_gimhea
                        else -> R.color.seoul_subway_everline
                    }
                )
            }
        }
    }

    @JvmStatic
    fun getMetroColor(c: View, no: Int): Int {
        return getMetroColor(c.context, no)
    }

    @JvmStatic
    fun getMetroColor(c: Context, no: Int): Int {
        return ContextCompat.getColor(
            c, when (no) {
                1 -> R.color.seoul_subway_1
                2 -> R.color.seoul_subway_2
                3 -> R.color.seoul_subway_3
                4 -> R.color.seoul_subway_4
                5 -> R.color.seoul_subway_5
                6 -> R.color.seoul_subway_6
                7 -> R.color.seoul_subway_7
                8 -> R.color.seoul_subway_8
                9 -> R.color.seoul_subway_9
                100 -> R.color.bundang_subway
                108 -> R.color.seoul_subway_kyongchun
                101 -> R.color.seoul_subway_airport
                111 -> R.color.seoul_subway_suin
                112 -> R.color.seoul_subway_kyongkang
                104 -> R.color.seoul_subway_kyongui_jungang
                107 -> R.color.seoul_subway_everline
                102 -> R.color.incheon_subway_mf
                21 -> R.color.incheon_subway_1
                22 -> R.color.incheon_subway_2
                109 -> R.color.bundang_subway_new
                110 -> R.color.uijeongbu_subway
                113 -> R.color.seoul_subway_uisinseol
                114 -> R.color.seoul_subway_seohae
                31 -> R.color.deajeon_subway_1
                41 -> R.color.deagu_subway_1
                42 -> R.color.deagu_subway_2
                43 -> R.color.deagu_subway_3
                51 -> R.color.gwangju_subway_1
                71 -> R.color.busan_subway_1
                72 -> R.color.busan_subway_2
                73 -> R.color.busan_subway_3
                74 -> R.color.busan_subway_4
                78 -> R.color.busan_subway_donghea
                79 -> R.color.busan_subway_gimhea
                -1 -> R.color.none
                else -> R.color.seoul_subway_everline
            }
        )
    }
//
//    @JvmStatic
//    fun getMetroColor(c: Context, no: Int): Int {
//        return ContextCompat.getColor(
//            c, when (no) {
//                1 -> #1D2984
//                2 -> #34AA39
//                3 -> #FC5C08
//                4 -> #278BD6
//                5 -> #7412D8
//                6 -> #A43C0C
//                7 -> #566111
//                8 -> #DC005B
//                9 -> #C2952D
//                100 -> #FEC629
//                108 -> #278955
//                101 -> #5893C6
//                111 -> #FEC629
//                112 -> R.color.seoul_subway_kyongkang
//                104 -> R.color.seoul_subway_kyongui_jungang
//                107 -> R.color.seoul_subway_everline
//                102 -> R.color.incheon_subway_mf
//                21 -> R.color.incheon_subway_1
//                22 -> R.color.incheon_subway_2
//                109 -> R.color.bundang_subway_new
//                110 -> R.color.uijeongbu_subway
//                113 -> R.color.seoul_subway_uisinseol
//                114 -> R.color.seoul_subway_seohae
//                31 -> R.color.deajeon_subway_1
//                41 -> R.color.deagu_subway_1
//                42 -> R.color.deagu_subway_2
//                43 -> R.color.deagu_subway_3
//                51 -> R.color.gwangju_subway_1
//                71 -> R.color.busan_subway_1
//                72 -> R.color.busan_subway_2
//                73 -> R.color.busan_subway_3
//                74 -> R.color.busan_subway_4
//                78 -> R.color.busan_subway_donghea
//                79 -> R.color.busan_subway_gimhea
//                -1 -> R.color.none
//                else -> R.color.seoul_subway_everline
//            }
//        )
//    }


    fun getMetroStationName(no: Int): String {
        return when (no) {
            1 -> "1"
            2 -> "2"
            3 -> "3"
            4 -> "4"
            5 -> "5"
            6 -> "6"
            7 -> "7"
            8 -> "8"
            9 -> "9"
            100 -> "수인분당"
            108 -> "경춘"
            101 -> "공항"
            111 -> "수인분당"
            112 -> "경강"
            104 -> "경의"
            107 -> "에버라인"
            102 -> "자기부상"
            21 -> "인천1"
            22 -> "인천2"
            109 -> "신분당"
            110 -> "의정부"
            113 -> "우이신설"
            114 -> "서해"
            31 -> "1"
            41 -> "1"
            42 -> "2"
            43 -> "3"
            51 -> "1"
            71 -> "1"
            72 -> "2"
            73 -> "3"
            74 -> "4"
            78 -> "동해"
            79 -> "경전철"
            else -> "서해"
        }
    }

    @JvmStatic
    fun getMetroLineName(no: Int?): String {
        return when (no) {
            1 -> "1호선"
            2 -> "2호선"
            3 -> "3호선"
            4 -> "4호선"
            5 -> "5호선"
            6 -> "6호선"
            7 -> "7호선"
            8 -> "8호선"
            9 -> "9호선"
            100 -> "수인분당선"
            108 -> "경춘선"
            101 -> "공항철도"
            111 -> "수인분당선"
            112 -> "경강선"
            104 -> "경의선"
            107 -> "에버라인"
            102 -> "자기부상"
            21 -> "인천1호선"
            22 -> "인천2호선"
            109 -> "신분당선"
            110 -> "의정부선"
            113 -> "우이신설선"
            114 -> "서해선"
            31 -> "1호선"
            41 -> "1호선"
            42 -> "2호선"
            43 -> "3호선"
            51 -> "1호선"
            71 -> "1호선"
            72 -> "2호선"
            73 -> "3호선"
            74 -> "4호선"
            78 -> "동해선"
            79 -> "경전철"
            else -> ""
        }
    }


    @JvmStatic
    fun getMetroLineNameDetail(no: Int?): String {
        return when (no) {
            1 -> "수도권 1호선"
            2 -> "수도권 2호선"
            3 -> "수도권 3호선"
            4 -> "수도권 4호선"
            5 -> "수도권 5호선"
            6 -> "수도권 6호선"
            7 -> "수도권 7호선"
            8 -> "수도권 8호선"
            9 -> "수도권 9호선"
            100 -> "수인분당선"
            108 -> "경춘선"
            101 -> "공항철도"
            111 -> "수인분당선"
            112 -> "경강선"
            104 -> "경의중앙선"
            107 -> "에버라인"
            102 -> "자기부상철도"
            21 -> "인천 1호선"
            22 -> "인천 2호선"
            109 -> "신분당선"
            110 -> "의정부경전철"
            113 -> "우이신설선"
            114 -> "서해선"
            else -> ""
        }
    }

    @JvmStatic
    fun getTrainColor(no: Int): Int {
        return Color.parseColor(
            when (no) {
                1 -> "#3556a7"
                2 -> "#a34ba1"
                3 -> "#f15747"
                4 -> "#429fd2"
                5 -> "#429fd2"
                6 -> "#a34ba1"
                7 -> "#a34ba1"
                8 -> "#7b4d6d"
                else -> "#3556a7"
            }
        )

    }

    @JvmStatic
    fun getTrainName(no: Int): String {
        return when (no) {
            1 -> "KTX"
            2 -> "새마을"
            3 -> "무궁화"
            4 -> "누리로"
            5 -> "통근"
            6 -> "ITX-새마을"
            7 -> "ITX-청춘"
            8 -> "SRT"
            else -> "KTX"
        }
    }
}