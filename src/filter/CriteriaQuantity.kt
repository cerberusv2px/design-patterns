package filter

class CriteriaQuantity: Criteria {

    override fun meetCriteria(promotionList: List<Promotion>): List<Promotion> {
        return promotionList.filter {
            it.type == "QUANTITY"
        }
    }
}