package com.example.simplygame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_game.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class GameActivity : AppCompatActivity() {
    var score: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        var leftValue: Int = Random.nextInt(0, 100)
        firstValueView.text = leftValue.toString()

        var rightValue: Int = Random.nextInt(0, 100)
        secondValueView.text = rightValue.toString()

        var trueAnswer: Int = leftValue * rightValue
        var wrongAnswer1: Int = Random.nextInt(0, 1000)
        var wrongAnswer2: Int = Random.nextInt(0, 1000)

        var choice: Int = Random.nextInt(1,3)

        when(choice){
            1 -> {
                leftAnswerButton.text = trueAnswer.toString()
                centralAnswerButton.text = wrongAnswer1.toString()
                rightAnswerButton.text = wrongAnswer2.toString()
            }
            2 -> {
                leftAnswerButton.text = wrongAnswer1.toString()
                centralAnswerButton.text = trueAnswer.toString()
                rightAnswerButton.text = wrongAnswer2.toString()
            }
            3 -> {
                leftAnswerButton.text = wrongAnswer1.toString()
                centralAnswerButton.text = wrongAnswer2.toString()
                rightAnswerButton.text = trueAnswer.toString()
            }
        }
    }

    fun drawAll(){
        var leftValue: Int = Random.nextInt(0, 100)
        firstValueView.text = leftValue.toString()

        var rightValue: Int = Random.nextInt(0, 100)
        secondValueView.text = rightValue.toString()

        var trueAnswer: Int = leftValue * rightValue
        var wrongAnswer1: Int = Random.nextInt(0, 1000)
        var wrongAnswer2: Int = Random.nextInt(0, 1000)

        var choice: Int = Random.nextInt(1,3)

        when(choice){
            1 -> {
                leftAnswerButton.text = trueAnswer.toString()
                centralAnswerButton.text = wrongAnswer1.toString()
                rightAnswerButton.text = wrongAnswer2.toString()
            }
            2 -> {
                leftAnswerButton.text = wrongAnswer1.toString()
                centralAnswerButton.text = trueAnswer.toString()
                rightAnswerButton.text = wrongAnswer2.toString()
            }
            3 -> {
                leftAnswerButton.text = wrongAnswer1.toString()
                centralAnswerButton.text = wrongAnswer2.toString()
                rightAnswerButton.text = trueAnswer.toString()
            }
        }
    }

    fun isAnswerLeftButton(view: View){
        var firstAnswer: Int = Integer.parseInt(leftAnswerButton.text.toString())

        var value1: Int = Integer.parseInt(firstValueView.text.toString())
        var value2: Int = Integer.parseInt(secondValueView.text.toString())

        var trueAnswer = value1 * value2

        if(firstAnswer == trueAnswer){
            val victory = Toast.makeText(this, "Yeah, it's right answer!", Toast.LENGTH_SHORT)
            victory.show()

            score++
            scoreView.text = "Score: " + score.toString()
        }else{
            val lose = Toast.makeText(this, "It's wrong answer(", Toast.LENGTH_SHORT)
            lose.show()

            score = 0
            scoreView.text = "Score: " + score.toString()
        }

        drawAll()
    }

    fun isAnswerCentralButton(view: View){
        var secondAnswer: Int = Integer.parseInt(centralAnswerButton.text.toString())

        var value1: Int = Integer.parseInt(firstValueView.text.toString())
        var value2: Int = Integer.parseInt(secondValueView.text.toString())

        var trueAnswer = value1 * value2

        if(secondAnswer == trueAnswer){
            val victory = Toast.makeText(this, "Yeah, it's right answer!", Toast.LENGTH_SHORT)
            victory.show()

            score++
            scoreView.text = "Score: " + score.toString()
        }else{
            val lose = Toast.makeText(this, "It's wrong answer(", Toast.LENGTH_SHORT)
            lose.show()

            score = 0
            scoreView.text = "Score: " + score.toString()
        }

        drawAll()
    }

    fun isAnswerRightButton(view: View){
        var thirdAnswer: Int = Integer.parseInt(rightAnswerButton.text.toString())

        var value1: Int = Integer.parseInt(firstValueView.text.toString())
        var value2: Int = Integer.parseInt(secondValueView.text.toString())

        var trueAnswer = value1 * value2
        if(thirdAnswer == trueAnswer){
            val victory = Toast.makeText(this, "Yeah, it's right answer!", Toast.LENGTH_SHORT)
            victory.show()

            score++
            scoreView.text = "Score: " + score.toString()
        }else{
            val lose = Toast.makeText(this, "It's wrong answer(", Toast.LENGTH_SHORT)
            lose.show()

            score = 0
            scoreView.text = "Score: " + score.toString()
        }

        drawAll()
    }

}
