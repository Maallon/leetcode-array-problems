package maallon

class MedianOfTwoArrays {

    //only O(nlogn) insteaf of O(logn) which would be possible through binary search of both arrays without merging them.
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val combinedArray = nums1 + nums2
        combinedArray.sort()

        if(combinedArray.size % 2 == 1){
            return combinedArray[(combinedArray.size / 2)].toDouble()
        } else {
            val middle = (combinedArray.size / 2) - 1
            return (combinedArray[middle].toDouble() + combinedArray[middle + 1].toDouble()) / 2
        }

    }
}