package ru.debian17.findme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.debian17.domain.Domain

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val d = Domain()
        d.test()

    }
}
