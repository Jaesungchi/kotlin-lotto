package lotto.view

import lotto.constants.Messages
import lotto.model.LottoResult
import lotto.model.LottoTicket
import lotto.model.Prize

/**
 * 출력을 위한 클래스
 * Created by Jaesungchi on 2022.05.25..
 */
object OutputView {
    private const val NOT_HAVE_TICKET_COUNT = 0

    fun printTicket(tickets: List<LottoTicket>) {
        println("${tickets.size}${Messages.BUY_AMOUNT_LOTTO}")
        tickets.forEach {
            println(it.numbers.toString())
        }
    }

    fun printLottoResult(lottoResults: List<LottoResult>) {
        println(Messages.LOTTO_RESULT)

        enumValues<Prize>().map { prize ->
            if (prize == Prize.LOSER_PLACE) return@map
            println(
                Messages.CORRECT_OUTPUT.format(
                    prize.matchCount,
                    prize.reward,
                    lottoResults.find { it.prize == prize }?.count ?: NOT_HAVE_TICKET_COUNT
                )
            )
        }
    }

    fun printYield(yields: Double) {
        println(Messages.PRINT_YIELD.format(yields))
    }
}
