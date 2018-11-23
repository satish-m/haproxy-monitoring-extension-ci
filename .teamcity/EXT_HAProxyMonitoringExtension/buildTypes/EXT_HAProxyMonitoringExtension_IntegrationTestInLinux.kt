package EXT_ApacheMonitoringExtension.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

/**
 * @author Satish Muddam
 */
object EXT_HAProxyMonitoringExtension_IntegrationTestInLinux : BuildType({
    uuid = "6091990F-CF4F-4298-BED9-79C4E7E58A94"
    id = "EXT_HAProxyMonitoringExtension_IntegrationTestInLinux"
    name = "IntegrationTest in Linux"

    vcs {
        root(EXT_HAProxyMonitoringExtension.vcsRoots.EXT_HAProxyMonitoringExtension)

    }

    steps {
        maven {
            goals = "clean install"
            mavenVersion = defaultProvidedVersion()
            jdkHome = "%env.JDK_18%"
        }
    }

    dependencies {
        dependency(EXT_HAProxyMonitoringExtension_SetupInLinux) {
            snapshot {

            }
        }
    }

    triggers {
        vcs {
        }
    }
})