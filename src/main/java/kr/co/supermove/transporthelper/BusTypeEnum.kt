package kr.co.supermove.transporthelper


enum class BusTypeEnum(val type: Int, val busName: String, val color: String) {
    NORMAL(1, "일반", "#2CAA9F"),
    SEAT(2, "좌석", "#2B52B9"),
    TOWN(3, "마을버스", "#92D050"),
    DIRECT(4, "직행좌석", "#F41409"),
    AIRPORT(5, "공학버스", "#D29110"),
    LONG_EXPRESS(6, "간선급행", "#F41409"),
    OUTER(10, "외곽", "#43B1BD"),
    LONG(11, "간선", "#2B52B9"),
    SHORT(12, "지선", "#46A336"),
    CIRCUIT(13, "순환", "#FFC004"),
    SUBURBAN(14, "광역", "#F41409"),
    EXPRESS(15, "급행", "#F41409"),
    INTERCITY(22, "경기도 시외형버스", "#8F106D"),
    EXPRESS_LONG(26, "급행간선", "#2B52B9"),
    NONE(0, "일반", "#2CAA9F");

    companion object {
        @JvmStatic
        fun getBusTypeName(busType: Int): String {
            return values().find { busType == it.type }?.busName ?: NONE.busName
        }

        @JvmStatic
        fun getColor(busType: Int): String {
            return values().find { busType == it.type }?.color ?: NONE.color
        }
    }

}