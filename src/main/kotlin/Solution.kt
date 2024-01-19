/**
 * 1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
 *
 *  1. 네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
 *  2. 세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)^2 점을 얻습니다.
 *  3. 주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
 *  4. 어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
 *
 * 5. 네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
 *
 *
 * 네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
 *
 */


class Solution {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        var answer: Int = 0
        val dice = intArrayOf(a, b, c, d)
        var groupedDice = dice.groupBy { it }
        groupedDice = groupedDice.toList().sortedBy { it.second.size }.toMap()
        when (groupedDice.size) {
            1 -> answer = 1111 * groupedDice.keys.first()
            2 -> {
                if (groupedDice[0]?.size == 1) {
                    answer = (10 * groupedDice.keys.last() + groupedDice.keys.first())
                    answer *= answer

                } else {
                    val p = groupedDice.values
                }
            }

            3 ->

        }

        return answer
    }
}

fun main() {

    Solution().solution(2, 2, 2, 2)//2222
    Solution().solution(4, 1, 4, 4)//1681
    Solution().solution(5, 3, 3, 6)//27

}