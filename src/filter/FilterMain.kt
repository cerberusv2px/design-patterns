package filter

fun main() {

    val promotionList = mutableListOf<Promotion>()
    promotionList.add(Promotion("P1", "QUANTITY"))
    promotionList.add(Promotion("P2", "QUANTITY"))
    promotionList.add(Promotion("P3", "QUANTITY"))
    promotionList.add(Promotion("P4", "AMOUNT"))
    promotionList.add(Promotion("P5", "QUANTITY"))
    promotionList.add(Promotion("P6", "AMOUNT"))
    promotionList.add(Promotion("P7", "AMOUNT"))

    val amountCriteria = CriteriaAmount()
    println("Amount criteria: ${amountCriteria.meetCriteria(promotionList)}")

    val quantityCriteria = CriteriaQuantity()
    println("Quantity criteria: ${quantityCriteria.meetCriteria(promotionList)}")
}
