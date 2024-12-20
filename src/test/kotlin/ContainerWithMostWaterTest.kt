import maallon.ContainerWithMostWater
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ContainerWithMostWaterTest {
    private val containerWithMostWater = ContainerWithMostWater()

    @Test
    fun test1(){
        val input = intArrayOf(1,8,6,2,5,4,8,3,7)
        val result = containerWithMostWater.maxArea(input)
        assertEquals(49, result)
    }

    @Test
    fun test2(){
        val input = intArrayOf(1,1)
        val result = containerWithMostWater.maxArea(input)
        assertEquals(1, result)
    }

    @Test
    fun test3(){
        val input = intArrayOf(4,3,2,1,4)
        val result = containerWithMostWater.maxArea(input)
        assertEquals(16, result)
    }
}