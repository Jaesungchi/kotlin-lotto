package lotto.model

/**
 * 클래스에 대한 설명을 적어주세요.
 * Created by Jaesungchi on 2022.05.25..
 */

enum class Prize(val matchCount: Int, val reward: Int) {
    LOSER(0, 0),
    FIFTH(3, 5000),
    FOURTH(4, 500000),
    THIRD(5, 1500000),
    SECOND(5, 30000000),
    FIRST(6, 2000000000)
    ;

    companion object {
        fun of(matchCount: Int, isCorrectBonus: Boolean): Prize {
            if (isCorrectBonus && matchCount == SECOND.matchCount)
                return SECOND
            return values().find { it.matchCount == matchCount } ?: LOSER
        }
    }
}
