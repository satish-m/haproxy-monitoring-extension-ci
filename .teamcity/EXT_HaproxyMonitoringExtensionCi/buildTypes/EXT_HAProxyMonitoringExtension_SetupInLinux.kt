package EXT_HaproxyMonitoringExtensionCi.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.exec
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

/**
 * @author Satish Muddam
 */
object EXT_HAProxyMonitoringExtension_SetupInLinux : BuildType({
    uuid = "DBC304EC-ED89-441E-904E-F2971B7B5F18"
    id = "EXT_HAProxyMonitoringExtension_SetupInLinux"
    name = "Setup Linux Environment"

    vcs {
        root(EXT_HaproxyMonitoringExtensionCi.vcsRoots.EXT_HAProxyMonitoringExtension)

    }

    steps {
        exec {
            path = "make"
            arguments = "dockerRun"
        }

        //Waits for 5 minutes to send metrics to the controller
        exec {
            path = "make"
            arguments = "sleep"
        }
    }

    dependencies {
        dependency(EXT_HAProxyMonitoringExtension_CleanBuild) {
            snapshot {

            }
        }
    }

    triggers {
        vcs {
        }
    }
})