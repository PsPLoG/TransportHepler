package kr.co.supermove.transporthelper

enum class LocalAreaEnum(regionCode: Int, sido: Int, name: String, simpleName: String) {
    SEOUL(1100, 11, "서울특별시", "서울"),
    BUSAN(2100, 26, "부산광역시", "부산"),
    DAEGU(2200, 27, "대구광역시", "대구"),
    INCHEON(2300, 28, "인천광역시", "인천"),
    GWANGJU(2400, 29, "광주광역시", "광주"),
    DAEJEON(2500, 30, "대전광역시", "대전"),
    GYEONGGI(3100, 41, "경기도", "경기"),
    GANGWON(3200, 42, "강원도", "강원"),
    CHUNGCHEONG_BUKDO(3300, 43, "충청북도", "충북"),
    CHUNGCHEONG_NAMDO(3400, 44, "충청남도", "충남"),
    JEOLLA_BUKDO(3500, 45, "전라북도", "전북"),
    JEOLLA_NAMDO(3600, 46, "전라남도", "전남"),
    GYEONGSANG_BUKDO(3700, 47, "경상북도", "경북"),
    GYEONGSANG_NAMDO(3800, 48, "경상남도", "경남"),
    ULSAN(2600, 31, "울산광역시", "울산"),
    JESU(9111, 50, "제주시", "제주");
}