/*
 * Complete the 'checkMagazine' function below.
 *
 * The function accepts following parameters:
 *  1. STRING_ARRAY magazine
 *  2. STRING_ARRAY note
 */

 fun createHashTable(arr: Array<String>): HashMap<String, Int> {
    var hashTable = HashMap<String, Int>();

    for (value in arr) {
        var currentValue = hashTable.get(value);
        currentValue = if (currentValue == null)  0 else  currentValue;
        hashTable.set(value,  ++currentValue);
    }

    return hashTable;
 }

fun checkMagazine(magazine: Array<String>, note: Array<String>): Unit {
    if (magazine.size < note.size ) {
        println("No");
        return;
    }

    var hashTable = createHashTable(note);

    for (word in magazine) {
        var currentValue = hashTable.get(word);

        if (currentValue != null) {
            hashTable.set(word, --currentValue);
        }
    }

    for (value in hashTable.values) {
        if (value > 0) {
            println("No");
            return;
        }
    }

    println("Yes");
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val m = first_multiple_input[0].toInt()

    val n = first_multiple_input[1].toInt()

    val magazine = readLine()!!.trimEnd().split(" ").toTypedArray()

    val note = readLine()!!.trimEnd().split(" ").toTypedArray()

    checkMagazine(magazine, note)
}
