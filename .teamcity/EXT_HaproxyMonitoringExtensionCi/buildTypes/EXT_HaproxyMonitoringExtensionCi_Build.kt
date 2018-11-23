package EXT_HaproxyMonitoringExtensionCi.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object EXT_HaproxyMonitoringExtensionCi_Build : BuildType({
    uuid = "e09f8881-21eb-4807-a7b4-cdfcc01988d1"
    id = "EXT_HaproxyMonitoringExtensionCi_Build"
    name = "Build"

    vcs {
        root(EXT_HaproxyMonitoringExtensionCi.vcsRoots.EXT_HaproxyMonitoringExtensionCi_HttpsGithubComSatishMHaproxyMonitoringExtension)

    }

    triggers {
        vcs {
        }
    }
})
