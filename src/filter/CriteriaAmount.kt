package filter

class CriteriaAmount: Criteria {
    override fun meetCriteria(promotionList: List<Promotion>): List<Promotion> {
        return promotionList.filter {
            it.type == "AMOUNT"
        }
    }
}