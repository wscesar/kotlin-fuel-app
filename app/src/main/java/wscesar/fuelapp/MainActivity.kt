package wscesar.fuelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun validateFields(view: View) {

        var isValid = true
        val gasPrice = inputGasPrice.text.toString()
        val ethanolPrice = inputAlcoholPrice.text.toString()

        if ( ethanolPrice === "" )
            isValid = false
        else if (  ethanolPrice === "" )
            isValid = false

        if ( isValid )
            calculate( ethanolPrice, gasPrice )
        else
            resultText.text = "Preencha os preços primeiro!"

    }

    private fun calculate(ethanolPrice: String, gasPrice: String) {

        val ethanolPrice = ethanolPrice.toDouble()
        val gasPrice = gasPrice.toDouble()
        val result = ethanolPrice / gasPrice

        if ( result >= 0.7 )
            resultText.text = "Melhor abastecer com Gasolina"
        else
            resultText.text = "Melhor abastecer com Alcool"

    }

}
