package filter

interface Criteria {

    fun meetCriteria(promotionList: List<Promotion>): List<Promotion>
}