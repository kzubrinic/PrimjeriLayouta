package hr.unidu.kz.primjerilayouta

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b = findViewById<Button>(R.id.gumbLinearniHor)
        // Linearni layout (horizontalni) se prikazuje korištenjem registriranog "listenera"
        b.setOnClickListener {
            linearniHorizontalni(it) // 'it' predstavlja View (u ovom slučaju gumb 'b')
        }
    }

    // Metode za otvaranje grid i constraint layouta su definirane deklarativno u XML datoteci
    fun grid(view: View) {
        val i = Intent(this, GridActivity::class.java)
        startActivity(i)
    }

    fun constraint(view: View) {
        val i = Intent(this, ConstraintActivity::class.java)
        startActivity(i)
    }

    fun linearniHorizontalni(view: View) {
        val i = Intent(this, LinearniActivity::class.java)
        startActivity(i)
    }
}