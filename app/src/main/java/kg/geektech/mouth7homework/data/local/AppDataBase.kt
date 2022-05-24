package kg.geektech.mouth7homework.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import kg.geektech.mouth7homework.data.model.ShopItemDBModel

@Database(entities = [ShopItemDBModel::class], version = 1, exportSchema = false)
abstract class AppDataBase : RoomDatabase(){
    abstract fun shopItemDao(): ShopItemDao
}