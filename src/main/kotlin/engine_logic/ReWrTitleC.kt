package engine_logic

import java.io.File

//////////////////////////////////////////////////////////// Read/Write File for Boxes Title value 08
fun writeTiToFile8(ipTitle: String) {
    try {
        val file8 = File("$RWT_PATH/rwTi08.hdi")
        file8.parentFile?.mkdirs()
        file8.writeText(ipTitle)
        ipTitle08 = ipTitle // Updates the in-memory value
    } catch (e: Exception) { // Log the exception
        e.printStackTrace()
    }
}
fun readTiFile8(): String {
    return try {
        val file8 = File("$RWT_PATH/rwTi08.hdi").readText()
        file8
    } catch (e: Exception) {
        ""
    }
}
//////////////////////////////////////////////////////////// Read/Write File for Boxes IPs value 09
fun writeTiToFile9(ipTitle: String) {
    try {
        val file9 = File("$RWT_PATH/rwTi09.hdi")
        file9.parentFile?.mkdirs()
        file9.writeText(ipTitle)
        ipTitle09 = ipTitle // Updates the in-memory value
    } catch (e: Exception) { // Log the exception
        e.printStackTrace()
    }
}
fun readTiFile9(): String {
    return try {
        val file9 = File("$RWT_PATH/rwTi09.hdi").readText()
        file9
    } catch (e: Exception) {
        ""
    }
}
//////////////////////////////////////////////////////////// Read/Write File for IPs value, Boxes 10
fun writeTiToFile10(ipTitle: String) {
    try {
        val file10 = File("$RWT_PATH/rwTi10.hdi")
        file10.parentFile?.mkdirs()
        file10.writeText(ipTitle)
        ipTitle10 = ipTitle // Updates the in-memory value
    } catch (e: Exception) { // Log the exception
        e.printStackTrace()
    }
}
fun readTiFile10(): String {
    return try {
        val file10 = File("$RWT_PATH/rwTi10.hdi").readText()
        file10
    } catch (e: Exception) {
        ""
    }
}
//////////////////////////////////////////////////////////// Read/Write File for IPs value, Boxes 11
fun writeTiToFile11(ipTitle: String) {
    try {
        val file11 = File("$RWT_PATH/rwTi11.hdi")
        file11.parentFile?.mkdirs()
        file11.writeText(ipTitle)
        ipTitle11 = ipTitle // Updates the in-memory value
    } catch (e: Exception) { // Log the exception
        e.printStackTrace()
    }
}
fun readTiFile11(): String {
    return try {
        val file11 = File("$RWT_PATH/rwTi11.hdi").readText()
        file11
    } catch (e: Exception) {
        ""
    }
}