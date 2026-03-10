package hr.unidu.kz.primjerilayouta

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import hr.unidu.kz.primjerilayouta.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bind: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)

        // Postavljanje sadržaja preko korijena bindinga
        setContentView(bind.root)

        // Linearni layout (horizontalni) se prikazuje korištenjem registriranog "listenera"
        bind.gumbLinearniHor.setOnClickListener {
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