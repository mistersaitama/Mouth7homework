package kg.geektech.mouth7homework.domain.useCase

import androidx.lifecycle.LiveData
import kg.geektech.mouth7homework.domain.model.ShopItem
import kg.geektech.mouth7homework.domain.repository.ShopListRepository

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopList(): LiveData<List<ShopItem>> {
        return shopListRepository.getShopList()
    }
}