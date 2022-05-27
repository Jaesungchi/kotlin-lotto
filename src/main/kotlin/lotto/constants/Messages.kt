package lotto.constants

/**
 * Created by Jaesungchi on 2022.05.24..
 */
object Messages {
    const val WRITE_YOUR_MONEY = "구입금액을 입력해 주세요."
    const val BUY_AMOUNT_LOTTO = "개를 구매했습니다."
    const val WRITE_WINNING_NUMBER = "지난 주 당첨 번호를 입력해 주세요."
    const val LOTTO_RESULT = "당첨 통계\n----------"
    const val CORRECT_THREE = "3개 일치 (5000원)- %s개"
    const val CORRECT_FOUR = "4개 일치 (50000원)- %s개"
    const val CORRECT_FIVE = "5개 일치 (1500000원)- %s개"
    const val CORRECT_SIX = "6개 일치 (2000000000원)- %s개"
    const val PRINT_YIELD = "총 수익률은 %.2f입니다."

    object Error {
        const val CANNOT_DUPLICATE_NUMBER = "같은 번호를 넣을 수 없습니다."
        const val NUMBER_IS_OVER_OR_UNDER_BASE = "로또 번호가 1~45 사이의 숫자가 아닙니다."
        const val WINNING_NUMBER_IS_OVER_BASE = "로또 번호 갯수가 6개를 초과합니다."
        const val INPUT_IS_NULL_OR_BLANK = "입력은 빈칸이거나 NULL일 수 없습니다."
        const val INPUT_IS_NOT_NUMBER = "숫자가 아닙니다."
    }
}
