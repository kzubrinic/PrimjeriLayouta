package hr.unidu.kz.primjerilayouta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// Prva pomoćna aktivnost
class ConstraintActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint)
    }
}

// Druga pomoćna aktivnost
class GridActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)
    }
}

// Treća pomoćna aktivnost
class LinearniActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linearni)
    }
}