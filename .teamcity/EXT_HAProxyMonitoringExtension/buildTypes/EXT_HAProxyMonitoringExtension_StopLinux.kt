package EXT_ApacheMonitoringExtension.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.exec
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

/**
 * @author Satish Muddam
 */
object EXT_HAProxyMonitoringExtension_StopLinux : BuildType({
    uuid = "5737DFBB-6F17-42B1-941B-E1D285207271"
    id = "EXT_HAProxyMonitoringExtension_StopLinux"
    name = "Stop Linux docker"

    vcs {
        root(EXT_HAProxyMonitoringExtension.vcsRoots.EXT_HAProxyMonitoringExtension)

    }

    steps {
        exec {
            path = "make"
            arguments = "dockerStop"
        }
    }

    dependencies {
        dependency(EXT_HAProxyMonitoringExtension_IntegrationTestInLinux) {
            snapshot {

            }
        }
    }

    triggers {
        vcs {
        }
    }
})