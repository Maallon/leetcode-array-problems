import maallon.TwoSum
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TwoSumTest {
    private val twoSum = TwoSum()

    @Test
    fun test1() {
        val input = intArrayOf(2,7,11,15)
        val target = 9
        val expectedResult = intArrayOf(0,1)
        val result = twoSum.twoSum(input, target)
        assertEquals(expectedResult[0], result[0])
        assertEquals(expectedResult[1], result[1])
    }

    @Test
    fun test2(){
        val input = intArrayOf(3,2,4)
        val target = 6
        val expectedResult = intArrayOf(1,2)
        val result = twoSum.twoSum(input, target)
        assertEquals(expectedResult[0], result[0])
        assertEquals(expectedResult[1], result[1])
    }

    @Test
    fun test3(){
        val input = intArrayOf(3,3)
        val target = 6
        val expectedResult = intArrayOf(0,1)
        val result = twoSum.twoSum(input, target)
        assertEquals(expectedResult[0], result[0])
        assertEquals(expectedResult[1], result[1])
    }
}