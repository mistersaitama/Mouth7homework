package kg.geektech.mouth7homework

import android.app.Application
import androidx.room.Room
import kg.geektech.mouth7homework.data.local.AppDataBase

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        db = Room.databaseBuilder(applicationContext, AppDataBase::class.java, "dataBase").fallbackToDestructiveMigration().build()
    }

    companion object {
        lateinit var db: AppDataBase
    }
}