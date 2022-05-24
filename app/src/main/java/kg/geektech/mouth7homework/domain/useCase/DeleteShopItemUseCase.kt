package kg.geektech.mouth7homework.domain.useCase

import kg.geektech.mouth7homework.domain.model.ShopItem
import kg.geektech.mouth7homework.domain.repository.ShopListRepository

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {
    suspend fun deleteShopItem(shopItem: ShopItem) {
        shopListRepository.deleteShopItem(shopItem)
    }
}