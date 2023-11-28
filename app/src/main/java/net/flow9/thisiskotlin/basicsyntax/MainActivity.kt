package net.flow9.thisiskotlin.basicsyntax

import android.content.ClipData.Item
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.math.log
import java.time.DayOfWeek
import java.time.LocalDate


//Command + option + l
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        Log.v("BasicSyntax", "로그를 출력합니다. method = Log.v")
        Log.d("BasicSyntax", "로그를 출력합니다. method = Log.d")
        Log.i("BasicSyntax", "로그를 출력합니다. method = Log.i")
        Log.w("BasicSyntax", "로그를 출력합니다. method = Log.w")
        Log.e("BasicSyntax", "로그를 출력합니다. method = Log.e")

        var myName = "박상우"
        var myAge = 25
        //myAge = 25
        myAge = myAge + 1
        Log.d("BasicSyntax", "myName = $myName, myAge = $myAge")
        Log.i("BasicSyntax", "내 이름은 $myName 입니다, 내 나이는 ${myAge}살 입니다.")

        //if 조건문 연습 - 일치, 조건 충족하지 않아 로그를 출력하지 않음
        var myNumber = "1, 2, 3, 4, 5, 6"
        var thisWeekNumbers = "5, 6, 7, 8, 9, 10"
        if (myNumber == thisWeekNumbers){
            Log.d("Lotto","축하합니다. 당첨되었습니다!!")
        }else{
            Log.d("Lotto","다음 기회에!")
        }
        if (myNumber != thisWeekNumbers) {
            Log.d("Lotto", "같지 않을 경우 아쉬워요")
        }

        var a = 10
        var b = 1
        var bigger = a > b
        val answerYes: String = "네"
        val answerNo: String = "아니용"

        if (bigger == bigger) {
            Log.d("대답", "Q. a는 b보다 큽니까?   A. $answerYes")
        }else if(bigger != bigger) {
            Log.d("대답", "Q. a는 b보다 큽니까?   A. $answerNo")
        }else{
            Log.d("비교 연산자", "a는 b보다 큽니다. : $bigger")
        }



        var c = 11
        var d = 2
        var bigger2 = c !> d
        Log.d("비교 연산자 부정","a는 b보다 크지 않습니다.: $bigger2")

        var eraOfRyu = 2.32
        var eraOfDegrom = 2.43

        val era = if (eraOfRyu < eraOfDegrom) {
            Log.d("MLB_Result","2019 류현진이 디그롬을 이겼습니다.")
            eraOfRyu
        } else {
            Log.d("MLB_Result","2019 디그롬이 류현진을 이겼습니다.")
            eraOfDegrom
        }

        Log.d("MLB_Result","2019 MLB에서 가장 높은 ERA는 ${era}입니다.")


        var ageOfMichael = 19
        when (ageOfMichael) {
            in 10..19 -> {
                Log.d("when", "마이클은 10대 입니다.")
            }

            !in 10..19 -> {
                Log.d("when", "마이클은 10대가 아닙니다.")
            }

            else -> {
                Log.d("when", "마이클의 나이를 알 수 없습니다.")
            }
        }
        val date = LocalDate.now()
        val dayText: DayOfWeek = date.dayOfWeek

        when (dayText) {
            DayOfWeek.MONDAY -> Log.d("언제만나", "월요일엔 아마 바쁘지 않을까?")
            DayOfWeek.TUESDAY -> Log.d("언제만나", "화요일도 성급해 보이지 안 그래")
            DayOfWeek.WEDNESDAY -> Log.d("언제만나", "수요일은 뭔가 어정쩡한 느낌")
            DayOfWeek.THURSDAY -> Log.d("언제만나", "목요일은 그냥 내가 왠지 싫어")
            DayOfWeek.FRIDAY -> Log.d("언제만나", "우~ 이번주 금요일, 금요일에 시간 어때요")
            DayOfWeek.SATURDAY -> Log.d("언제만나", "기절")
            else -> Log.d("언제만나", "부활")
        }

        var phoneList = arrayOf("아이폰","갤럭시","픽셀","블랙베리","노키아")

        phoneList[0] = "애플의 아이폰"
        phoneList.set(1, "삼성의 갤럭시")

        Log.d("스마트폰","스마트폰의 종류는 ${phoneList[0]}, ${phoneList[1]}, ${phoneList[2]}등이 있습니다.")
        */

        /* 조건문 if 와 when을 사용한 Array 활용

        val date = LocalDate.now()
        val dayText: DayOfWeek = date.dayOfWeek
        //val dyArray = whatDay()
        var dyArray = 1
        //var dyArray : Int
        //dyArray = 0
        //val toDoList = Array(7)
        //val toDoList : String = Array(7)
        //val toDoList = Array(7, (Int -> T)) 적혀있는대로 했는데 안됨
        val toDoList = Array(7, { Item -> "" })
        //{Item -> ""} = 인덱스 내용을 String 공백으로 지정
        toDoList[0] = "원래 술 마시는 날"
        toDoList[1] = "화나서 술 마시는 날"
        toDoList[2] = "수수하게 술 마시는 날"
        toDoList[3] = "목 빠지게 술 마시는 날"
        toDoList[4] = "금방 만나 술 마시는 날"
        toDoList[5] = "토 나오게 술 마시는 날"
        toDoList[6] = "일 안해서 술 마시는 날"
        //컨트롤 알트 l

        /*
        //toDoList.set(dyArray, "공부나 해")
        //toDoList[dyArray] = "공부나 해"
        //dyArray가 여기서 값을 받으면 아래 조건문으로 변경해도 Array에 대치되지 않음
        //ex: 기본 drArray = 1로 지정되어 있기 때문에 여기서 두번째 인덱스인 화요일 텍스트를 가져오고 끝남
        */

        /*
        if (dayText == DayOfWeek.SUNDAY) {
        dyArray = 0
        } else if (dayText == DayOfWeek.MONDAY) {
        dyArray = 1
        } else if (dayText == DayOfWeek.TUESDAY) {
        dyArray = 2
        } else if (dayText == DayOfWeek.WEDNESDAY) {
        dyArray = 3
        } else if (dayText == DayOfWeek.THURSDAY) {
        dyArray = 4
        } else if (dayText == DayOfWeek.FRIDAY) {
        dyArray = 5
        } else if (dayText == DayOfWeek.SATURDAY) {
        dyArray = 6
        }
        */

        when (dayText) {
            DayOfWeek.MONDAY -> dyArray = 0
            DayOfWeek.TUESDAY -> dyArray = 1
            DayOfWeek.WEDNESDAY -> dyArray = 2
            DayOfWeek.THURSDAY -> dyArray = 3
            DayOfWeek.FRIDAY -> dyArray = 4
            DayOfWeek.SATURDAY -> dyArray = 5
            DayOfWeek.SUNDAY -> dyArray = 6
        }


        //toDoList.set(dyArray, "공부나 해")
        toDoList[dyArray] = "공부나 해"
        //dyArray는 여기서 조건문에 따른 인덱스 번호를 받고 로그로 출력한다


        Log.d(
            "이번주 계획",
            "월요일은 ${toDoList[0]}, 화요일은 ${toDoList[1]}, 수요일은 ${toDoList[2]}, 목요일은 ${toDoList[3]}, 금요일은 ${toDoList[4]}, 토요일은 ${toDoList[5]}, 일요일은 ${toDoList[6]}"
        ) //결론: Array set을 조건문 뒤로 보내야 한다
        */

        /*
        var textTest = Array(2)
        textTest[0] = "텍스트"
        textTest[1] = 1234
        textTest[2] = textTest.get[0]
        Log.d("스마트폰",textTest)

        // Log.d("day", "오늘은 ${dayText}입니다.")


        var c = 11
        var d = 2
        var bigger2 = c !> d
        Log.d("비교 연산자 부정", "a는 b보다 크지 않습니다.: $bigger2")

        var eraOfRyu = 2.32
        var eraOfDegrom = 2.43

        val era = if (eraOfRyu < eraOfDegrom) {
            Log.d("MLB_Result", "2019 류현진이 디그롬을 이겼습니다.")
            eraOfRyu
        } else {
            Log.d("MLB_Result", "2019 디그롬이 류현진을 이겼습니다.")
            eraOfDegrom
        }

        Log.d("MLB_Result", "2019 MLB에서 가장 높은 ERA는 ${era}입니다.")
        }
        }

        Log.d("비교 연산자", "a는 b보다 큽니다.: $bigger") // a는 b보다 큽니다.: true

        var a = 10
        var b = 1
        var bigger = a !> b
        Log.d("비교 연산자", "a는 b보다 큽니다.: $bigger") // a는 b보다 큽니다.: true


        */

        /* 알고리즘 1번, 두 수의 차
        fun solution(num1: Int, num2: Int): Int {
            //solution 펑션을 사용할 때 불러올 변수는 2개, num1 숫자 num2 숫자
            var answer = num1-num2
            //데이터 타입을 Int로 지정해 주지 않아도 기본값이 Int
            //answer를 리턴하기 전 불러온 변수 2개를 계산해 준다
            return answer
            //solution에 answer계산값을 리턴한다
        }
        Log.d("알고리즘 1번","더하기 계산 결과는 ${solution(1111,111)}입니다 ")
        */

        /* 알고리즘 2번, 두 수의 곱즘
        fun solution(num1: Int, num2: Int): Int {
            var answer: Int = num1*num2
            return answer
        }
        Log.d("알고리즘 2번","빼기 계산 결과는 ${solution(11,11)}입니다 ")
        */

        /* 알고리즘 3번, 몫 구하기
        fun solution(num1: Int, num2: Int): Int {
            var answer: Int = num1/num2
            return answer
        }
        Log.d("알고리즘 3번","나누기 계산 결과는 ${solution(100,5)}입니다 ")
        */

        /* 알고리즘 4번, 나이 출력 (출생년도)
        val date = LocalDate.now()
        val yearNow = date.year

        fun solution(age: Int): Int {
            var answer: Int = yearNow-age
            return answer
        }
        Log.d("알고리즘 4번","출생년도 출력 결과는 ${solution(25)}입니다 ")
        */

        /* 알고리즘 5번, 두 수 비교
        fun solution(num1: Int, num2: Int): Int {
            var answer: Int
            if(num1 != num2){
                answer = -1
            }else{
                answer = 1
            }
            return answer
        }
        Log.d("알고리즘 5번","숫자 비교 결과는 ${solution(22,22)}입니다 ")

        */

        /* 알고리즘 6번, 두 수의 합
        fun solution(num1: Int, num2: Int): Int {
        var answer: Int = num1+num2
        return answer
        }
        Log.d("알고리즘 6번","두 수의 합은 ${solution(1,1)}입니다 ")
        */

        /* 알고리즘 7번, 두 수의 나눔
        fun solution(num1: Int, num2: Int): Int {
            var answer : Int = (num1 * 1000) / num2
            return answer
        }
        Log.d("알고리즘 7번","두 수의 나눗셈은 ${solution(7,3)}입니다 ")
        */




    }
}