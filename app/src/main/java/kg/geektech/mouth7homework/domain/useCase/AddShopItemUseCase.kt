package kg.geektech.mouth7homework.domain.useCase

import kg.geektech.mouth7homework.domain.model.ShopItem
import kg.geektech.mouth7homework.domain.repository.ShopListRepository

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {
    suspend fun addShopItem(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)
    }
}