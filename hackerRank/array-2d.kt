import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*
import kotlin.math.*

/*
 * Complete the 'hourglassSum' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun hourglassSum(arr: Array<Array<Int>>): Int {
    // Write your code here
    val size = arr.size
    var maxValue: Int? = null;
    for (outerIndex in arr.indices) {
        val inner = arr[outerIndex]
        val innerSize = inner.size;

        if ((outerIndex + 2) >= size) {
            break;
        }

        for (innerIndex in inner.indices) {
            if ((innerIndex + 2) >= innerSize) {
                break
            }

            val sum = arr[outerIndex][innerIndex] +
                    arr[outerIndex][innerIndex + 1] +
                    arr[outerIndex][innerIndex + 2] +
                    arr[outerIndex + 1][innerIndex + 1] +
                    arr[outerIndex + 2][innerIndex] +
                    arr[outerIndex + 2][innerIndex + 1] +
                    arr[outerIndex + 2][innerIndex + 2];

            if (maxValue === null) {
                maxValue = sum;
            } else {
                maxValue = max(maxValue, sum);
            }
        }
    }

    return maxValue!!;
}

fun main(args: Array<String>) {

    val arr = Array<Array<Int>>(6, { Array<Int>(6, { 0 }) })

    for (i in 0 until 6) {
        arr[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }

    val result = hourglassSum(arr)

    println(result)
}
