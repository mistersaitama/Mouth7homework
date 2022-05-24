package kg.geektech.mouth7homework.domain.useCase

import kg.geektech.mouth7homework.domain.model.ShopItem
import kg.geektech.mouth7homework.domain.repository.ShopListRepository

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {
    suspend fun getShopItem(shopItemId: Int): ShopItem {
        return shopListRepository.getShopItem(shopItemId)
    }
}