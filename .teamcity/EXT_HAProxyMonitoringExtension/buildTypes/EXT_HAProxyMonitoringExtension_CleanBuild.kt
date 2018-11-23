package EXT_ApacheMonitoringExtension.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

/**
 * @author Satish Muddam
 */
object EXT_HAProxyMonitoringExtension_CleanBuild : BuildType({
    uuid = "0CBF8BE9-6E5D-457E-A3FD-D092D9B990D2"
    id = "EXT_HAProxyMonitoringExtension_CleanBuild"
    name = "CleanBuild"

    vcs {
        root(EXT_HAProxyMonitoringExtension.vcsRoots.EXT_HAProxyMonitoringExtension)
    }

    steps {
        maven {
            goals = "clean install -Pno-integration-tests"
            mavenVersion = defaultProvidedVersion()
            jdkHome = "%env.JDK_18%"
        }
    }

    triggers {
        vcs {
        }
    }

    artifactRules = """
       target/HAProxyMonitor-*.zip
    """.trimIndent()
})
