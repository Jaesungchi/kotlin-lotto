package lotto.constants

/**
 * Created by Jaesungchi on 2022.05.24..
 */
object Messages {
    const val WRITE_YOUR_MONEY = "구입금액을 입력해 주세요."
    const val BUY_AMOUNT_LOTTO = "수동으로 %s장, 자동으로 %s개를 구매했습니다."
    const val WRITE_WINNING_NUMBER = "지난 주 당첨 번호를 입력해 주세요."
    const val LOTTO_RESULT = "당첨 통계\n----------"
    const val CORRECT_OUTPUT = "%s개 일치 (%s원)- %s개"
    const val CORRECT_OUTPUT_FOR_SECOND = "5개 일치, 보너스볼 일치(30000000원)- %s개"
    const val PRINT_YIELD = "총 수익률은 %.2f입니다."
    const val WRITE_BONUS_NUMBER = "보너스 볼을 입력해 주세요."
    const val WRITE_MANUAL_COUNT = "수동으로 구매할 로또 수를 입력해 주세요."
    const val WRITE_MANUAL_LOTTO_NUMBER = "수동으로 구매할 번호를 입력해 주세요."
}

object ErrorMessages {
    const val NUMBER_SIZE_IS_INVALID = "로또 번호가 6개가 아닙니다."
    const val NUMBER_IS_OVER_OR_UNDER_BASE = "로또 번호가 1~45 사이의 숫자가 아닙니다."
    const val INPUT_IS_NULL_OR_BLANK = "입력은 빈칸이거나 NULL일 수 없습니다."
    const val INPUT_IS_NOT_NUMBER = "숫자가 아닙니다."
    const val BONUS_IS_DUPLICATE_WITH_WINNINGS = "보너스 숫자가 당첨숫자와 중복됩니다."
    const val MANUAL_LOTTO_COUNT_IS_OVER_MONEY = "수동로또 갯수가 소지금을 초과합니다."
}
