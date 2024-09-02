package br.edu.utfpr.usandocomponentesvisuais

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var spCidade : Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spCidade = findViewById( R.id.spCidade )

        val cidades = listOf<String>( "Pato Branco", "Coronel Vivida", "Mariópolis", "Marmeleiro" )
        val adapter = ArrayAdapter<String> ( this, android.R.layout.simple_list_item_1, cidades )
        spCidade.adapter = adapter

        spCidade.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText( baseContext, spCidade.selectedItem.toString() + " selecionado", Toast.LENGTH_LONG ).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                //TODO("Not yet implemented")
            }

        }

    }

    fun btTestarComponenteOnClick(view: View) {
        Toast.makeText( this, spCidade.selectedItem.toString(), Toast.LENGTH_LONG ).show()
    }
}