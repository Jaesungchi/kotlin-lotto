package lotto.domain

import lotto.constants.ErrorMessages
import lotto.model.LottoResult
import lotto.model.LottoResults
import lotto.model.LottoTicket
import lotto.model.Prize

/**
 * 당첨 번호를 갖고, 당첨 여부를 알려주는 클래스.
 * Created by Jaesungchi on 2022.05.25..
 */
class LottoCompany(val winningTicket: LottoTicket, private val bonusNumber: Int) {
    init {
        require(bonusNumber in LottoTicketFactory.LOTTO_NUMBER_RANGE) { ErrorMessages.NUMBER_IS_OVER_OR_UNDER_BASE }
        require(!winningTicket.numbers.contains(bonusNumber)) { ErrorMessages.BONUS_IS_DUPLICATE_WITH_WINNINGS }
    }

    fun convertTicketsToLottoResults(tickets: List<LottoTicket>): LottoResults {
        return convertPrizeToLottoResult(tickets.map { findCorrectLotto(it) })
    }

    private fun findCorrectLotto(ticket: LottoTicket): Prize {
        val matchCounts = ticket.numbers.intersect(winningTicket.numbers.toSet()).size
        val isCorrectBonus = ticket.numbers.contains(bonusNumber)
        return Prize.of(matchCounts, isCorrectBonus)
    }

    private fun convertPrizeToLottoResult(prizes: List<Prize>): LottoResults {
        return LottoResults(prizes.groupBy { it }.map { LottoResult(it.key, it.value.size) })
    }

    companion object {
        fun of(stringWinningNumber: String, bonusNumber: Int): LottoCompany {
            val winningNumbers = stringWinningNumber.split(",").map {
                it.trim().toInt()
            }
            return of(winningNumbers, bonusNumber)
        }

        fun of(numberList: List<Int>, bonusNumber: Int): LottoCompany {
            return LottoCompany(LottoTicket.of(numberList), bonusNumber)
        }
    }
}
