@file:JvmName("KotlinClient")

package org.gradle.demo.api.evolution

private fun run(server: Server): String {
    server.testProperty = "lajos"
    return server.testProperty
}

fun main() {
    println(run(Server()))
}
