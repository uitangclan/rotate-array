fun main (){
    // var nums = intArrayOf(1,2,3,4,5,6,7)
    // var k = 3
    var nums = intArrayOf(1,2,3,4)
    var k = 2
    // val nums = intArrayOf(-1,-100,3,99)
    // val k = 2
    println(rotate(nums, k))
}

fun rotate(nums: IntArray, k: Int): Unit {
    var a = IntArray(nums.size) {0}
    for (i in nums.indices) {
        a[(i + k) % nums.size] = nums[i]
    }
    for (i in nums.indices) {
            nums[i] = a[i]
    }
}