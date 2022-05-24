package kg.geektech.mouth7homework.domain.useCase

import kg.geektech.mouth7homework.domain.model.ShopItem
import kg.geektech.mouth7homework.domain.repository.ShopListRepository

class EditShopItemUseCase(private val shopEditRepository: ShopListRepository) {
    suspend fun editShopItem(shopItem: ShopItem) {
        shopEditRepository.editShopItem(shopItem)
    }
}