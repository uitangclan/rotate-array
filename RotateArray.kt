fun main (){
    var nums = intArrayOf(1,2,3,4,5,6,7)
    var k = 3
    // var nums = intArrayOf(1,2,3,4)
    // var k = 2
    // val nums = intArrayOf(-1,-100,3,99)
    // val k = 2
    println(rotate(nums, k))
}

fun rotate(nums: IntArray, k: Int): Unit {
    for (i in 1..k) {
        var this = nums[nums.size - 1]
        for (j in nums.indices) {
            var temp = nums[j]
            nums[j] = this 
            this = temp
        }
    }
}