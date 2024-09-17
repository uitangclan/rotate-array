fun main (){
    var nums = intArrayOf(1,2,3,4,5,6,7)
    var k = 3
    // val nums = intArrayOf(-1,-100,3,99)
    // val k = 2
    println(rotate(nums, k))
}

fun rotate(nums: IntArray, k: Int): Unit {
    var shift = k % nums.size
    var count = 0
    var start = 0
    while (count < nums.size) {
        var curr = start
        var prev = nums[start]
        do {
            var next = (curr + shift) % nums.size
            var temp = nums[next]
            nums[next] = prev
            prev = temp
            curr = next
            count++    
        } while (start != curr)
        start++
    }
    println(nums.contentToString())
}