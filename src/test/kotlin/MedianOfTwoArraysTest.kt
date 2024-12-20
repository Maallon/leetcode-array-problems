import maallon.MedianOfTwoArrays
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MedianOfTwoArraysTest {
    private val medianOfTwoArrays = MedianOfTwoArrays()

    @Test
    fun test1() {
        val nums1 = intArrayOf(1, 3)
        val nums2 = intArrayOf(2)
        val result = medianOfTwoArrays.findMedianSortedArrays(nums1, nums2)
        assertEquals(2.0, result)
    }

    @Test
    fun test2(){
        val nums1 = intArrayOf(1, 2)
        val nums2 = intArrayOf(3, 4)
        val result = medianOfTwoArrays.findMedianSortedArrays(nums1, nums2)
        assertEquals(2.5, result)
    }
}