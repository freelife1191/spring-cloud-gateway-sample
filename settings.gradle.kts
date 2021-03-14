rootProject.name = "spring-cloud-gateway-sample"

include("cart-service")
include("order-service")
include("gateway-server")
include("eureka-server")
include("config-server")

pluginManagement {
    val pluginVersions = mapOf(
        "org.jetbrains.kotlin" to "1.4.31",
        "org.jetbrains.kotlin.plugin" to "1.4.31",
        "org.springframework" to "2.3.9.RELEASE",
        "io.spring" to "1.0.11.RELEASE"
    )

    resolutionStrategy {
        eachPlugin {
            if (pluginVersions.containsKey(requested.id.namespace)) {
                useVersion(pluginVersions[requested.id.namespace])
            }
        }
    }
}

