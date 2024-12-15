package maallon

class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map: HashMap<Int, Int> = HashMap()
        val result = IntArray(2)
        for((i, n) in nums.withIndex()){
            val complement = target - n
            val keys = map.filterValues { it == complement }.keys
            if(keys.isNotEmpty()){
                for(k in keys){
                    if(k != i){
                        result[0] = k
                        result[1] = i
                    }
                }
            } else {
                map[i] = n
            }
        }
        return result
    }

    // Brute Force Approach
//    fun twoSum(nums: IntArray, target: Int): IntArray {
//        val result = IntArray(2)
//        for((i, n) in nums.withIndex()){
//            var j = i + 1
//            while(j < nums.size){
//                if(n + nums[j] == target){
//                    result[0] = i
//                    result[1] = j
//                    return result
//                }
//                j += 1
//            }
//        }
//        return result
//    }
}