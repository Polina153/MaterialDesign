package com.example.materialdesign

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.floatingactionbutton.FloatingActionButton

class BottomAppBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_app_bar)

        setListeners()
    }

    private fun setListeners() {
        val bottomAppBar = findViewById<BottomAppBar>(R.id.bottom_app_bar)
        bottomAppBar.setNavigationOnClickListener {
            showToast("Drawer")
        }

        bottomAppBar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.to_home -> {
                    showToast("Home")
                    true
                }

                R.id.search -> {
                    showToast("Search")
                    true
                }

                R.id.delete -> {
                    showToast("Delete")
                    true
                }

                else -> {
                    showToast("Else")
                    true
                }
            }
        }

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { showToast("FAB") }
    }

    private fun showToast(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }
}