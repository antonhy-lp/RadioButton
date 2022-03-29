package mx.edu.tecmm.moviles.radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.view.View as View

class MainActivity : AppCompatActivity() {
    lateinit var edNum1: EditText
    lateinit var edNum2: EditText
    lateinit var rdSuma: RadioButton
    lateinit var rdResta: RadioButton
    lateinit var rdMultiplicar: RadioButton
    lateinit var rdDividir: RadioButton
    lateinit var lblresultado: TextView
    lateinit var MostrarRes: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edNum1 = findViewById(R.id.edNum1)
        edNum2 = findViewById(R.id.edNum2)
        rdSuma = findViewById(R.id.rdSuma)
        rdResta = findViewById(R.id.rdResta)
        rdDividir = findViewById(R.id.rdDividir)
        rdMultiplicar = findViewById(R.id.rdMultiplicar)
        lblresultado = findViewById(R.id.btCalcular)
        MostrarRes = findViewById(R.id.MostrarRes)
    }

    fun preciono(view: View) {
        var res: Int = 0
        val num1 = edNum1.text.toString().toInt()
        val num2 = edNum2.text.toString().toInt()
        if (rdSuma.isChecked)
            res = num1 + num2
            else if (rdResta.isChecked)
                res = num1 - num2
                else if (rdMultiplicar.isChecked)
                    res = num1 * num2
                    else if(rdDividir.isChecked)
                        res = num1  / num2
            MostrarRes.text = "El Resultado Es $res"

    }

}