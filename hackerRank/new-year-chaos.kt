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

fun minimumBribes(q: Array<Int>): Unit {
    var bribes = 0;

    for (i in (q.size-1) downTo 0 step 1) {
        if (q[i] == i+1) {
            continue;
        }


        if ((i-1 >=0) && (q[i-1] == i+1)) {
            var aux = q[i];
            q[i] = q[i-1];
            q[i-1] = aux;
            bribes ++;
        } else if ((i-2 >=0) && (q[i-2] == i+1)) {
            var aux = q[i-2];
            q[i-2] = q[i-1];
            q[i-1] = q[i];
            q[i] = aux;
            bribes += 2;
        } else {
            println("Too chaotic");
            return;
        }
    }

    println(bribes);
}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val n = readLine()!!.trim().toInt()

        val q = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

        minimumBribes(q)
    }
}
