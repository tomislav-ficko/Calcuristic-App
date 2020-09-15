package hr.ficko.calcuristic_app

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    val mInputData: InputDataModel = InputDataModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setOnClickListeners()
    }

    private fun setOnClickListeners() {
        all_clear.setOnClickListener(this)
        clear_entry.setOnClickListener(this)
        equals.setOnClickListener(this)

        percent.setOnClickListener(this)
        plus.setOnClickListener(this)
        minus.setOnClickListener(this)
        multiply.setOnClickListener(this)
        divide.setOnClickListener(this)

        zero.setOnClickListener(this)
        one.setOnClickListener(this)
        two.setOnClickListener(this)
        three.setOnClickListener(this)
        four.setOnClickListener(this)
        five.setOnClickListener(this)
        six.setOnClickListener(this)
        seven.setOnClickListener(this)
        eight.setOnClickListener(this)
        nine.setOnClickListener(this)
        comma.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {

        when (p0?.id) {
            R.id.zero -> mInputData.numberEntered(0)
            R.id.one -> mInputData.numberEntered(1)
            R.id.two -> mInputData.numberEntered(2)
            R.id.three -> mInputData.numberEntered(3)
            R.id.four -> mInputData.numberEntered(4)
            R.id.five -> mInputData.numberEntered(5)
            R.id.six -> mInputData.numberEntered(6)
            R.id.seven -> mInputData.numberEntered(7)
            R.id.eight -> mInputData.numberEntered(8)
            R.id.nine -> mInputData.numberEntered(9)

            R.id.comma -> mInputData.charEntered(",".first())

            R.id.percent -> mInputData.operatorEntered(Operator.PERCENT)
            R.id.plus -> mInputData.operatorEntered(Operator.PLUS)
            R.id.minus -> mInputData.operatorEntered(Operator.MINUS)
            R.id.multiply -> mInputData.operatorEntered(Operator.MULTIPLY)
            R.id.divide -> mInputData.operatorEntered(Operator.DIVIDE)

            R.id.all_clear -> mInputData.commandEntered(Command.ALL_CLEAR)
            R.id.clear_entry -> mInputData.commandEntered(Command.CLEAR_ENTRY)
            R.id.equals -> mInputData.commandEntered(Command.EQUALS)
        }

        entry_field.text = mInputData.currentEntry
    }
}
