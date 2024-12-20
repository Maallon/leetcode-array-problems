package maallon

class ContainerWithMostWater {

    // Two Pointer Algorithm O(n)
    fun maxArea(height: IntArray): Int {
        if(height.size == 1){
            return height[0]
        }
        if(height.size == 2){
            return Integer.min(height[0], height[1])
        }

        var pointer1 = 0
        var pointer2 = height.size - 1
        var maxArea = 0

        while(pointer1 != pointer2){
            if(height[pointer1] >= height[pointer2]){
                maxArea = Integer.max(height[pointer2] * (pointer2 - pointer1), maxArea)
                pointer2 -= 1
            } else {
                maxArea = Integer.max(height[pointer1] * (pointer2 - pointer1), maxArea)
                pointer1 += 1
            }
        }
        return maxArea
    }

    //Brute Force O(n²)
//    fun maxArea(height: IntArray): Int {
//        if(height.size == 1){
//            return height[0]
//        }
//        if(height.size == 2){
//            return Integer.min(height[0], height[1])
//        }
//
//        var result = 0
//        for((i, iv) in height.withIndex()){
//            val height2 = height.sliceArray(i + 1 until height.size)
//            for((j, jv) in height2.withIndex()){
//                val y = Integer.min(iv, jv)
//                val x = j + 1
//                val calc = y * x
//                if(calc > result){
//                    result = calc
//                }
//            }
//        }
//        return result
//    }
}