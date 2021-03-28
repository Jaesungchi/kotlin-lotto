package view

import domain.lotto.LottoNumbers
import domain.lotto.Lottos
import domain.money.Money
import domain.statistics.WinningStatistics

object WinningStatisticsView {
    fun print(statistics: WinningStatistics, lottos: Lottos, lottoPrice: Money) {
        printHeader()
        printCountsMatchedForAllCategories(lottos, statistics.winningNumbers)
        printRatioOfIncomeToExpenditure(statistics, lottoPrice)
    }

    private fun printHeader() {
        println("당첨 통계\n---------")
    }

    private fun printCountsMatchedForAllCategories(lottos: Lottos, winningNumbers: LottoNumbers) {
        lottos.matches(winningNumbers)
            .entries
            .sortedBy { (category) -> category }
            .forEach { (category, matchCount) ->
                println("${category.numberOfMatched}개 일치 (${category.prize.value}원)- ${matchCount}개")
            }
    }

    private fun printRatioOfIncomeToExpenditure(
        statistics: WinningStatistics,
        lottoPrice: Money
    ) {
        println("총 수익률은 ${statistics.calculateRatioOfIncomeToExpenditure(lottoPrice).value}입니다.")
    }
}
