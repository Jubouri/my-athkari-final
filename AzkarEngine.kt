
package com.example.azkar

object AzkarEngine {

    private val azkar = listOf(
        "سبحان الله",
        "الحمد لله",
        "الله أكبر",
        "لا إله إلا الله",
        "أستغفر الله",
        "لا حول ولا قوة إلا بالله"
    )

    fun next(last: String?): String {
        val pool = if (last == null) azkar else azkar.filter { it != last }
        return pool.shuffled().first()
    }
}
